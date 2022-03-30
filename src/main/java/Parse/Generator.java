package Parse;

import Antlr.G71BaseVisitor;
import Antlr.G71Lexer;
import Antlr.G71Parser;
import Antlr.G71Parser.*;
import Exceptions.ErrorListener;
import Exceptions.ParseException;
import Model.*;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeProperty;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static Model.AddrImmDI.NUMIO;
import static Model.AddrImmDI.Type.*;
import static Model.Num.*;
import static Model.OpCode.*;
import static Model.Operator.ADD;
import static Model.Operator.AND;
import static Model.Operator.EQUAL;
import static Model.Operator.GT;
import static Model.Operator.GTE;
import static Model.Operator.LT;
import static Model.Operator.LTE;
import static Model.Operator.MUL;
import static Model.Operator.NEQ;
import static Model.Operator.OR;
import static Model.Operator.SUB;
import static Model.Operator.*;
import static Model.Target.Type.*;

public class Generator extends G71BaseVisitor<Integer> {
    /**
     * Association of expression and target nodes to memory.
     */
    private final ParseTreeProperty<Integer> mem;
    /**
     * The list of the programs, each program represents a thread
     */
    private final List<Program> programs;

    /**
     * The result from the elaboration
     */
    private Result result;

    /**
     * Counter of the memory used for expr
     */
    private int tempMemCount;

    public static final int WAITBEGINZONE = 80;
    public static final int WAITENDZONE = 90;
    public static final int LOCKZONE = 70;


    public Generator() {
        programs = new ArrayList<>();
        mem = new ParseTreeProperty<>();
        tempMemCount = 0;
    }


    @Override
    public Integer visitBlock(BlockContext ctx) {
        Program prog = myProgram(ctx);
        int line = prog.size();
        super.visitBlock(ctx);
        return line;
    }


    @Override
    public Integer visitAssStat(AssStatContext ctx) {

        Program prog = myProgram(ctx);
        int size = result.getType(ctx.expr()).size();
        int offSet = result.getOffset(ctx.ID());
        int line = visit(ctx.expr());
        OpCode op;
        emit(prog, Load, new AddrImmDI(ImmValue, offSet), r_1);
        if (result.isGlobal(ctx.ID())) {
            op = WriteInstr;
        } else {
            emit(prog, Compute, Operator.ADD, R_ARP, r_1, r_1); //Add the arp if it is not global
            op = Store;
        }
        adjustOffSet(prog, ctx.exprDimension(), ctx.ID());
        for (int i = 0; i < size; i++) {
            memToReg(prog, mem(ctx.expr()) + i, r_2);

            emit(prog, op, r_2, new AddrImmDI(IndAddr, r_1.getContent()));
            emit(prog, Load, new AddrImmDI(ImmValue, 1), r_3);
            emit(prog, Compute, Operator.ADD, r_3, r_1, r_1);
        }
        return line;
    }


    @Override
    public Integer visitNegExpr(NegExprContext ctx) {
        return handlePrefixOp(myProgram(ctx), ctx.expr(), SUB, mem(ctx));
    }

    @Override
    public Integer visitNotExpr(NotExprContext ctx) {
        return handlePrefixOp(myProgram(ctx), ctx.expr(), EQUAL, mem(ctx));
    }


    @Override
    public Integer visitIfStat(IfStatContext ctx) {
        Program prog = myProgram(ctx);
        int firstLine = visit(ctx.expr());
        int line = emit(prog, Nop);//fake branch line for the later jump
        if (ctx.block(1) != null) {
            visit(ctx.block(1));
        }
        int line1 = emit(prog, Nop); // fake jump line
        int thenLine = visit(ctx.block(0)); //then part
        int fakeLine = prog.size();
        int memLocation = mem(ctx.expr());
        memToReg(prog, memLocation, r_1);
        Op condition = simplifiedOp(Branch, r_1, new Target(Abs, thenLine));
        Op jump = simplifiedOp(Jump, new Target(Abs, fakeLine));
        setLine(prog, line, condition);
        setLine(prog, line1, jump);
        return firstLine;
    }

    @Override
    public Integer visitWhileStat(WhileStatContext ctx) {
        Program prog = myProgram(ctx);
        int firstLine = visit(ctx.expr());
        int memLocation = mem(ctx.expr());
        memToReg(prog, memLocation, r_1);
        emit(prog, Branch, r_1, new Target(Rel, 2));//fake line for the later branch
        int line = emit(prog, Nop);
        visit(ctx.block());
        emit(prog, Jump, new Target(Abs, firstLine));
        Op condition = simplifiedOp(Jump, new Target(Abs, prog.size()));
        setLine(prog, line, condition);
        return firstLine;
    }


    @Override
    public Integer visitParExpr(ParExprContext ctx) {
        int line = visit(ctx.expr());
        mem.put(ctx, mem(ctx.expr()));
        return line;
    }

    @Override
    public Integer visitTrueExpr(TrueExprContext ctx) {
        Program prog = myProgram(ctx);
        int firstLine = prog.size();
        emit(prog, Load, new AddrImmDI(ImmValue, 1), r_1);
        regToMem(prog, mem(ctx), r_1);
        return firstLine;
    }

    @Override
    public Integer visitFalseExpr(FalseExprContext ctx) {
        Program prog = myProgram(ctx);
        int firstLine = prog.size();
        emit(prog, Load, new AddrImmDI(ImmValue, 0), r_1);
        regToMem(prog, mem(ctx), r_1);
        return firstLine;
    }

    @Override
    public Integer visitIdExpr(IdExprContext ctx) {
        Program prog = myProgram(ctx);
        int offSet = result.getOffset(ctx);
        int firstLine = prog.size();
        int size = result.getType(ctx).size();
        emit(prog, Load, new AddrImmDI(ImmValue, offSet), r_1);
        if (!result.isGlobal(ctx)) {
            emit(prog, Compute, Operator.ADD, R_ARP, r_1, r_1);
        }
        //in case of it has some suffix dimension e.g.[2] in a[2], then emit the code to find the right offset
        adjustOffSet(prog, ctx.exprDimension(), ctx.ID());

        //Fetch the memory of the expr by looping, it should work for all size but usually one
        for (int i = 0; i < size; i++) {
            if (result.isGlobal(ctx)) {
                emit(prog, ReadInstr, new AddrImmDI(IndAddr, r_1.getContent()));
                emit(prog, Receive, r_2);
            } else {
                emit(prog, Load, new AddrImmDI(IndAddr, r_1.getContent()), r_2);
            }
            emit(prog, Load, new AddrImmDI(ImmValue, 1), r_3);
            emit(prog, Compute, Operator.ADD, r_3, r_1, r_1);
            int memLocation = mem(ctx);
            regToMem(prog, memLocation + i, r_2);
        }
        return firstLine;
    }


    @Override
    public Integer visitMainProg(MainProgContext ctx) {
        Program prog = myProgram(ctx);
        int firstLine = prog.size();
        prog.setOpAt(0, simplifiedOp(Jump, new Target(Abs, firstLine)));
        addI(prog, R_EXPR_MEM_POINT, 50);
        for (Program other : programs) {
            if (other == prog) continue;
            //Copy the functions declared to all program, this allows us to run function on thread
            other.copyFromOther(prog);
        }
        super.visitMainProg(ctx);
        return firstLine;
    }

    @Override
    public Integer visitNumExpr(NumExprContext ctx) {
        Program prog = myProgram(ctx);
        int value = Integer.parseInt(ctx.getText());
        int line = emit(prog, Load, new AddrImmDI(ImmValue, value), r_1);
        regToMem(prog, mem(ctx), r_1);
        return line;
    }


    @Override
    public Integer visitReturnStat(ReturnStatContext ctx) {
        Program prog = myProgram(ctx);
        int firstLine = prog.size();
        if (ctx.expr() != null) {
            visit(ctx.expr());
            memToReg(prog, mem(ctx.expr()), r_2);
            copyReg(prog, R_ARP, r_1);
            addI(prog, r_1, -1);//return value
            emit(prog, Store, r_2, new AddrImmDI(IndAddr, r_1.getContent()));
        }

        copyReg(prog, R_ARP, r_1);
        addI(prog, r_1, -2); //Load the return address

        emit(prog, Load, new AddrImmDI(IndAddr, r_1.getContent()), R_RETURN_ADDRESS);
        emit(prog, Jump, new Target(Ind, R_RETURN_ADDRESS.getContent()));
        return firstLine;
    }

    @Override
    public Integer visitFunction(FunctionContext ctx) {
        Program prog = myProgram(ctx);
        String functionName = ctx.ID().getText();
        int firstLine = prog.size();
        result.setStartLine(functionName, firstLine);
        super.visitFunction(ctx);
        return firstLine;
    }

    @Override
    public Integer visitFuncExpr(FuncExprContext ctx) {
        Program prog = myProgram(ctx);
        int firstLine = prog.size();
        String function = ctx.ID().getText();
        int jumpDistance = result.getJumpDistance(ctx);
        int functionStartLine = result.getLine(function);
        for (ParamMapContext param : ctx.paramMap()) {
            visit(param.expr());
        }
        addI(prog, R_ARP, jumpDistance + 2);
        copyReg(prog, R_ARP, r_1);
        addI(prog, r_1, -2);
        int returnAddressLine = emit(prog, Nop);
        emit(prog, Store, R_RETURN_ADDRESS, new AddrImmDI(IndAddr, r_1.getContent()));
        for (ParamMapContext param : ctx.paramMap()) {
            int offSet = result.getOffset(param.ID());
            int size = result.getType(param).size();
            for (int i = 0; i < size; i++) {
                emit(prog, Load, new AddrImmDI(ImmValue, offSet + i), r_2);
                emit(prog, Compute, Operator.ADD, r_2, R_ARP, r_2);
                memToReg(prog, mem(param.expr()) + i, r_1);
                emit(prog, Store, r_1, new AddrImmDI(IndAddr, r_2.getContent()));

            }
        }
        addI(prog, R_EXPR_MEM_POINT, tempMemCount);
        emit(prog, Jump, new Target(Abs, functionStartLine));
        Op returnAdd = simplifiedOp(Load, new AddrImmDI(ImmValue, prog.size()), R_RETURN_ADDRESS);
        prog.setOpAt(returnAddressLine, returnAdd);
        copyReg(prog, R_ARP, r_1);
        addI(prog, r_1, -1);
        emit(prog, Load, new AddrImmDI(IndAddr, r_1.getContent()), r_1);
        addI(prog, R_ARP, -jumpDistance - 2);
        addI(prog, R_EXPR_MEM_POINT, -tempMemCount);
        if (result.getFunctionType(function) != null)
            regToMem(prog, mem(ctx), r_1);
        return firstLine;
    }


    @Override
    public Integer visitParBlock(ParBlockContext ctx) {
        Program prog = myProgram(ctx);
        int firstLine = emit(prog, ReadInstr, new AddrImmDI(DirAddr, result.getThreadNr(ctx) + WAITBEGINZONE));
        waitForSignal(prog, firstLine);
        visit(ctx.block());
        emit(prog, Load, new AddrImmDI(ImmValue, 1), r_1);
        emit(prog, WriteInstr, r_1, new AddrImmDI(DirAddr, result.getThreadNr(ctx) + WAITENDZONE));
        return firstLine;
    }

    @Override
    public Integer visitParallelStat(ParallelStatContext ctx) {
        Program prog = myProgram(ctx);
        int firstLine = prog.size();
        for (ParseTree subCtx : ctx.parBlock()) {
            emit(prog, Load, new AddrImmDI(ImmValue, 1), r_1);
            emit(prog, WriteInstr, r_1, new AddrImmDI(DirAddr, result.getThreadNr(subCtx) + WAITBEGINZONE));
        }

        for (ParseTree subCtx : ctx.parBlock()) {
            visit(subCtx);
            int whileLine = emit(prog, ReadInstr, new AddrImmDI(DirAddr, result.getThreadNr(subCtx) + WAITENDZONE));
            waitForSignal(prog, whileLine);
        }
        return firstLine;
    }


    @Override
    public Integer visitLockStat(LockStatContext ctx) {
        Program prog = myProgram(ctx);
        int threadNr = result.getThreadNr(ctx);
        int parentThread = result.getParent(threadNr);
        int firstLine = emit(prog, TestAndSet, new AddrImmDI(DirAddr, parentThread + LOCKZONE));
        emit(prog, Receive, r_1);
        emit(prog, Compute, EQUAL, r_1, ZERO, r_1);
        emit(prog, Branch, r_1, new Target(Abs, firstLine));
        return firstLine;
    }

    @Override
    public Integer visitArrayExpr(ArrayExprContext ctx) {
        Program prog = myProgram(ctx);
        int line = prog.size();
        int i = 0;
        for (ExprContext expr : result.getContents(ctx)) {
            visit(expr);
            memToReg(prog, mem(expr), r_1);
            regToMem(prog, mem(ctx) + i, r_1);
            i++;
        }
        return line;
    }

    @Override
    public Integer visitUnlockStat(UnlockStatContext ctx) {
        Program prog = myProgram(ctx);
        int threadNr = result.getThreadNr(ctx);
        int parentThread = result.getParent(threadNr);
        return emit(prog, WriteInstr, ZERO, new AddrImmDI(DirAddr, parentThread + LOCKZONE));
    }


    @Override
    public Integer visitBoolExpr(BoolExprContext ctx) {
        Program prog = myProgram(ctx);
        int firstLine = prog.size();
        String opS = ctx.booleanOp().getText();

        Operator op = switch (opS) {
            case "&" -> AND;
            case "|" -> OR;
            default -> XOR;
        };
        emitExpr(ctx.expr(0), ctx.expr(1), op);
        regToMem(prog, mem(ctx), r_1);
        return firstLine;
    }


    @Override
    public Integer visitCompExpr(CompExprContext ctx) {
        Program prog = myProgram(ctx);
        int firstLine = prog.size();
        String opS = ctx.compOp().getText();
        Operator op = switch (opS) {
            case "!=" -> NEQ;
            case ">" -> GT;
            case ">=" -> GTE;
            case "<" -> LT;
            default -> LTE;
        };
        emitExpr(ctx.expr(0), ctx.expr(1), op);
        regToMem(prog, mem(ctx), r_1);
        return firstLine;

    }

    @Override
    public Integer visitAddExpr(AddExprContext ctx) {
        Program prog = myProgram(ctx);
        int firstLine = prog.size();

        String opS = ctx.addOp().getText();
        Operator op;
        if ("+".equals(opS)) {
            op = ADD;
        } else {
            op = SUB;
        }
        emitExpr(ctx.expr(0), ctx.expr(1), op);
        regToMem(prog, mem(ctx), r_1);
        return firstLine;
    }

    @Override
    public Integer visitEqExpr(EqExprContext ctx) {
        Program prog = myProgram(ctx);
        int firstLine = prog.size();
        visit(ctx.expr(0));
        visit(ctx.expr(1));

        int size = result.getType(ctx.expr(0)).size();
        int memLocation0 = mem(ctx.expr(0));
        int memLocation1 = mem(ctx.expr(1));
        emit(prog, Load, new AddrImmDI(ImmValue, 1), r_2);

        for (int i = 0; i < size; i++) {
            memToReg(prog, memLocation0 + i, r_1);
            memToReg(prog, memLocation1 + i, r_3);
            emit(prog, Compute, EQUAL, r_1, r_3, r_1);
            emit(prog, Compute, AND, r_1, r_2, r_2);
        }

        regToMem(prog, mem(ctx), r_2);
        return firstLine;
    }

    @Override
    public Integer visitMulExpr(MulExprContext ctx) {
        Program prog = myProgram(ctx);
        int firstLine = prog.size();
        emitExpr(ctx.expr(0), ctx.expr(1), MUL);
        regToMem(prog, mem(ctx), r_1);
        return firstLine;
    }

    @Override
    public Integer visitOutStat(OutStatContext ctx) {
        Program prog = myProgram(ctx);
        int line = visit(ctx.expr());
        int size = result.getType(ctx.expr()).size();
        int memLocation = mem(ctx.expr());
        for (int i = 0; i < size; i++) {
            memToReg(prog, memLocation + i, r_1);
            emit(prog, WriteInstr, r_1, NUMIO);
        }

        return line;
    }

    /**
     * Compute the real offset of the variable with given dimension and load that to r_1
     * e.g. compute the offset of d[i*3+3] from d
     *
     * @param prog                  the thread that call this
     * @param exprDimensionContexts the dimension of the simpleArray in form expr e.g. [i*3+3]
     * @param id                    the simpleArray variable
     */
    private void adjustOffSet(Program prog, List<ExprDimensionContext> exprDimensionContexts, TerminalNode id) {
        if (exprDimensionContexts.size() > 0) {
            int addition = newMem(1);
            regToMem(prog, addition, r_1);
            int multiplier;
            Type.Arr originalType = (Type.Arr) result.getType(id);
            Type subType = originalType.getElemType();
            for (ExprDimensionContext subCtx : exprDimensionContexts) {
                visit(subCtx.expr());
                if (subType instanceof Type.Arr) {
                    multiplier = subType.size();
                    subType = ((Type.Arr) subType).getElemType();
                } else {
                    multiplier = 1;
                }
                memToReg(prog, mem(subCtx.expr()), r_2);
                memToReg(prog, addition, r_1);
                emit(prog, Load, new AddrImmDI(ImmValue, multiplier), r_3);
                emit(prog, Compute, Operator.MUL, r_2, r_3, r_2);
                emit(prog, Compute, Operator.ADD, r_1, r_2, r_1);
                regToMem(prog, addition, r_1);
            }
        }
    }

    /**
     * Emit the operations that have the program wait until the signal is set, this is used in parend and parbegin where parent threads
     * and its children need to wait for others before continue.
     *
     * @param prog      current program
     * @param firstLine the line that the thread goes back if the signal is not set
     */
    private void waitForSignal(Program prog, int firstLine) {
        emit(prog, Receive, r_1);
        emit(prog, Load, new AddrImmDI(ImmValue, 1), r_2);
        emit(prog, Compute, XOR, r_1, r_2, r_1);
        emit(prog, Branch, r_1, new Target(Abs, firstLine));
    }

    /**
     * Compute and store the expression
     *
     * @param program current program
     * @param expr    the suffix expr (2) of (-2)
     * @param op      Either Sub(in case Minus) or Equal(in case Not), it will used with zero as a second parameter
     * @param mem     the memory of the entire expression e.g. (-2)
     * @return the firstLine of the execution
     */
    private Integer handlePrefixOp(Program program, ExprContext expr, Operator op, Integer mem) {
        int firstLine = program.size();
        visit(expr);
        memToReg(program, mem(expr), r_1);
        emit(program, Compute, op, ZERO, r_1, r_1);
        regToMem(program, mem, r_1);
        return firstLine;
    }

    /**
     * Add a value to the given register
     *
     * @param value the amount to be added
     */
    public void addI(Program prog, Num reg, int value) {
        emit(prog, Load, new AddrImmDI(ImmValue, value), r_3);
        emit(prog, Compute, Operator.ADD, reg, r_3, reg);
    }

    /**
     * Copy the value of one register to the other
     */
    public void copyReg(Program prog, Num from, Num to) {
        emit(prog, Compute, Operator.ADD, from, ZERO, to);
    }

    /**
     * create a new Op with a given opcode and arguments
     *
     * @return new Op
     */
    public Op simplifiedOp(OpCode opCode, Operand... args) {
        return new Op(opCode, args);
    }

    /**
     * Emit the binary computation and store it into r_1
     *
     * @param op binary operator
     */
    public void emitExpr(ExprContext leftExprCtx, ExprContext rightExprCtx, Operator op) {
        Program prog = myProgram(leftExprCtx);
        visit(leftExprCtx);
        visit(rightExprCtx);
        int leftExpr = mem(leftExprCtx);
        int rightExpr = mem(rightExprCtx);
        memToReg(prog, leftExpr, r_1);
        memToReg(prog, rightExpr, r_2);
        emit(prog, Compute, op, r_1, r_2, r_1);
    }


    /**
     * Emit a operation with given opcode and operands
     *
     * @return the order of the operation in the program
     */
    public int emit(Program prog, OpCode opCode, Operand... args) {
        prog.addInstr(new Op(opCode, args));
        return prog.size() - 1;
    }

    /**
     * increase new newMem and return the current memory
     *
     * @param size the size to be increased
     */
    public Integer newMem(int size) {
        int oldMemCount = tempMemCount;
        tempMemCount += size;
        return oldMemCount;
    }


    /**
     * Get the memory location associated to an expr if the expr is not
     * associated to any memory, add a new one
     */
    private Integer mem(ExprContext node) {
        Integer memLocation = mem.get(node);
        if (memLocation == null) {
            int size = result.getType(node).size();
            int newLocation = newMem(size);
            mem.put(node, newLocation);
            return newLocation;
        }
        return memLocation;
    }

    /**
     * Change the line of the program to new
     *
     * @param prog the program
     * @param line the line that the operation is changed
     * @param op   the new operation
     */
    public void setLine(Program prog, int line, Op op) {
        prog.setOpAt(line, op);
    }

    public ParseTree parse(String filePath) throws IOException, ParseException {
        return parse(CharStreams.fromFileName(filePath));
    }


    /**
     * get a program(thread) associated to the node
     *
     * @return a program(thread) associated to the node
     */
    private Program myProgram(ParseTree ctx) {
        int threadNr = result.getThreadNr(ctx);
        return programs.get(threadNr);
    }


    /**
     * Load the value of the memory address to the register
     *
     * @param prog current program
     * @param addr address of the memory
     * @param reg  register
     */
    public void memToReg(Program prog, int addr, Num reg) {
        emit(prog, Load, new AddrImmDI(ImmValue, addr), reg);
        emit(prog, Compute, Operator.ADD, reg, R_EXPR_MEM_POINT, reg);
        emit(prog, Load, new AddrImmDI(IndAddr, reg.getContent()), reg);
    }

    /**
     * Load the value of the register to the memory address
     *
     * @param prog current program
     * @param addr address of the memory
     * @param reg  register
     */
    public void regToMem(Program prog, int addr, Num reg) {
        emit(prog, Load, new AddrImmDI(ImmValue, addr), r_3);
        emit(prog, Compute, Operator.ADD, r_3, R_EXPR_MEM_POINT, r_3);
        emit(prog, Store, reg, new AddrImmDI(IndAddr, r_3.getContent()));
    }

    /**
     * Generate
     *
     * @param filePath path to the file
     * @return the list of programs the represent the haskell program
     * @throws IOException    file not found
     * @throws ParseException it throws when there is an error in parsing and elaboration phase
     */
    public List<Program> generate(String filePath) throws IOException, ParseException {
        Checker checker = new Checker();
        ParseTree tree = parse(filePath);
        result = checker.check(tree);
        if (checker.hasErrors()) {
            throw new ParseException(checker.getErrors());
        }
        for (int i = 0; i <= result.getNrOfThreads(); i++) {
            Program prog = new Program(i);
            emit(prog, Nop);
            programs.add(prog);
        }
        tree.accept(this);
        for (Program prog : programs) {
            emit(prog, EndProg);
        }
        return programs;
    }

    private ParseTree parse(CharStream chars) throws ParseException {
        ErrorListener listener = new ErrorListener();
        Lexer lexer = new G71Lexer(chars);
        lexer.removeErrorListeners();
        lexer.addErrorListener(listener);
        TokenStream tokens = new CommonTokenStream(lexer);
        G71Parser parser = new G71Parser(tokens);
        parser.removeErrorListeners();
        parser.addErrorListener(listener);
        ParseTree parseTree = parser.program();
        listener.throwException();
        return parseTree;
    }

}
