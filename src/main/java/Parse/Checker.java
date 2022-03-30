package Parse;

import Antlr.G71BaseListener;
import Antlr.G71Parser;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Class to type check and calculate flow entries and variable offsets.
 */
public class Checker extends G71BaseListener {

    private Result result = new Result();
    private List<String> errors = new LinkedList<>();


    @Override
    public void enterBlock(G71Parser.BlockContext ctx) {
        String function = result.getFunction(ctx);
        if (function != null && result.getFunction(ctx.parent) != null) {
            result.openScope(function);
        }
        int threadNr = result.getThreadNr(ctx);
        result.openScope(threadNr);
    }

    @Override
    public void exitBlock(G71Parser.BlockContext ctx) {
        String function = result.getFunction(ctx);
        if (function != null && result.getFunction(ctx.parent) != null) {
            result.closeScope(function);
        }
        int threadNr = result.getThreadNr(ctx);
        result.closeScope(threadNr);

    }


    @Override
    public void exitTrueExpr(G71Parser.TrueExprContext ctx) {
        setType(ctx, Type.BOOL);
    }

    @Override
    public void exitFalseExpr(G71Parser.FalseExprContext ctx) {
        setType(ctx, Type.BOOL);
    }

    @Override
    public void exitNumExpr(G71Parser.NumExprContext ctx) {
        setType(ctx, Type.INT);
    }


    @Override
    public void exitNotExpr(G71Parser.NotExprContext ctx) {
        checkType(ctx.expr(), Type.BOOL);
        setType(ctx, Type.BOOL);
    }


    @Override
    public void exitNegExpr(G71Parser.NegExprContext ctx) {
        checkType(ctx.expr(), Type.INT);
        setType(ctx, Type.INT);
    }

    @Override
    public void exitCompExpr(G71Parser.CompExprContext ctx) {
        checkType(ctx.expr(0), Type.INT);
        checkType(ctx.expr(1), Type.INT);
        setType(ctx, Type.BOOL);
    }

    @Override
    public void exitEqExpr(G71Parser.EqExprContext ctx) {
        Type RHS = getType(ctx.expr(1));
        checkType(ctx.expr(0), RHS);
        setType(ctx, Type.BOOL);
    }

    @Override
    public void exitFuncExpr(G71Parser.FuncExprContext ctx) {
        String function = ctx.ID().getText();
        Type type = result.getFunctionType(function);
        int threadNr = result.getThreadNr(ctx);
        String currentFunction = result.getFunction(ctx);
        //Calculation of jump distance
        int functionSize = result.getContextOffSet(currentFunction, threadNr);
        result.setJumpDistance(ctx, functionSize);
        setType(ctx, type);
    }

    @Override
    public void exitMulExpr(G71Parser.MulExprContext ctx) {
        checkType(ctx.expr(0), Type.INT);
        checkType(ctx.expr(1), Type.INT);
        setType(ctx, Type.INT);
    }

    @Override
    public void exitAddExpr(G71Parser.AddExprContext ctx) {
        checkType(ctx.expr(0), Type.INT);
        checkType(ctx.expr(1), Type.INT);
        setType(ctx, Type.INT);
    }


    @Override
    public void exitBoolExpr(G71Parser.BoolExprContext ctx) {
        checkType(ctx.expr(0), Type.BOOL);
        checkType(ctx.expr(1), Type.BOOL);
        setType(ctx, Type.BOOL);
    }


    @Override
    public void exitParExpr(G71Parser.ParExprContext ctx) {
        setType(ctx, getType(ctx.expr()));
    }

    @Override
    public void exitIdExpr(G71Parser.IdExprContext ctx) {
        int threadNr = result.getThreadNr(ctx);
        String id = ctx.ID().getText();
        String function = result.getFunction(ctx);
        Type type = result.type(id, threadNr, function);
        int offset;

        if (type == null) {
            //Check on global scope
            type = result.globalType(id);
            result.addGlobalContext(ctx);
            if (type == null) {
                //Id not found
                addError(ctx, ctx.ID().getText() + " is not declared");
                return;
            }
            offset = result.globalOffset(id);
        } else {
            offset = result.offset(id, threadNr, function);
        }
        setType(ctx.ID(), type);
        boolean stopped = false;
        for (G71Parser.ExprDimensionContext ignored : ctx.exprDimension()) {
            if (stopped) {
                addError(ctx, "More dimensions are used than declared");
            }
            if (type instanceof Type.Arr)
                type = ((Type.Arr) type).getElemType();
            //Check again if
            if (!(type instanceof Type.Arr))
                stopped = true;
        }
        setType(ctx, type);
        result.setOffset(ctx, offset);
    }

    @Override
    public void exitReturnStat(G71Parser.ReturnStatContext ctx) {
        String function = result.getFunction(ctx);
        if (function == null) {
            addError(ctx, "Return can only be used inside a function");
        }
        Type functionType = result.getFunctionType(function);
        if (ctx.expr() != null)
            checkType(ctx.expr(), functionType);
        else {
            checkType(Type.VOID, functionType, ctx);
        }
        result.addReturnedFunction(function);


    }

    @Override
    public void exitExprDimension(G71Parser.ExprDimensionContext ctx) {
        checkType(ctx.expr(), Type.INT);
    }

    @Override
    public void exitAssStat(G71Parser.AssStatContext ctx) {
        String id = ctx.ID().getText();
        Type RHS = getType(ctx.expr());
        String function = result.getFunction(ctx);
        int threadNr = result.getThreadNr(ctx);
        Type LHS = result.type(id, threadNr, function);
        Integer offset = result.offset(id, threadNr, function);
        if (LHS == null) {
            LHS = result.globalType(id);
            offset = result.globalOffset(id);
            result.addGlobalContext(ctx.ID());

        }
        if (LHS == null) {
            addError(ctx, ctx.ID().getText() + " is not declared");
            return;
        }
        result.setType(ctx.ID(), LHS);
        for (G71Parser.ExprDimensionContext ignored : ctx.exprDimension()) {
            if (LHS instanceof Type.Arr)
                LHS = ((Type.Arr) LHS).getElemType();
        }
        checkType(LHS, RHS, ctx);
        result.setType(ctx, LHS);
        result.setOffset(ctx.ID(), offset);
    }

    /**
     * Get the type from the type context e.g. [2][3]int
     * @param ctx type context
     * @return the type of the type context
     */
    public Type typeFromCtx(G71Parser.TypeContext ctx) {
        String t = ctx.getText();
        Type type;
        switch (t) {
            case "int" -> type = Type.INT;
            case "boolean" -> type = Type.BOOL;
            default -> {
                int dimension = Integer.parseInt(ctx.dimension().NUM().getText());
                type = new Type.Arr(typeFromCtx(ctx.type()), dimension);
            }
        }

        return type;
    }

    @Override
    public void exitLockStat(G71Parser.LockStatContext ctx) {
        int threadNr = result.getThreadNr(ctx);
        if (threadNr == 0) {
            addError(ctx, "Cannot lock in the main context");
        }
    }

    @Override
    public void exitUnlockStat(G71Parser.UnlockStatContext ctx) {
        int threadNr = result.getThreadNr(ctx);
        if (threadNr == 0) {
            addError(ctx, "Cannot lock in the main context");
        }
    }

    @Override
    public void exitParamMap(G71Parser.ParamMapContext ctx) {
        String function = ((G71Parser.FuncExprContext) ctx.getParent()).ID().getText();
        String id = ctx.ID().getText();

        Type paramType = result.type(id, 0, function);
        if (paramType == null) {
            addError(ctx, ctx.ID().getText() + " is not in the function declaration");
            return;
        }
        Integer offset = result.offset(id, 0, function);
        checkType(ctx.expr(), paramType);
        setType(ctx, paramType);
        result.setOffset(ctx.ID(), offset);
    }

    @Override
    public void exitArrayExpr(G71Parser.ArrayExprContext ctx) {
        result.newContents(ctx);
        Type childType = null;
        //Visit children
        for (G71Parser.ExprContext expr : ctx.expr()) {
            Type exprType = getType(expr);
            result.addContents(ctx, expr);
            if (childType == null) {
                childType = exprType;
            } else {
                checkType(expr, childType);
            }
        }
        Type.Arr arr = new Type.Arr(childType, ctx.expr().size());
        setType(ctx, arr);


    }

    @Override
    public void exitDeclStat(G71Parser.DeclStatContext ctx) {
        String relatedFunction = result.getFunction(ctx);
        int threadNr = result.getThreadNr(ctx);
        Type type = typeFromCtx(ctx.type());
        String id = ctx.ID().getText();

        if (!result.put(id, type, threadNr, relatedFunction)) {
            addError(ctx, ctx.ID().getText() + " is already declared");
        }

    }

    @Override
    public void exitGlobalDecl(G71Parser.GlobalDeclContext ctx) {
        Type type = typeFromCtx(ctx.type());
        String id = ctx.ID().getText();
        if (!result.globalPut(id, type)) {
            addError(ctx, ctx.ID().getText() + " is already declared");
        }

    }

    @Override
    public void enterParBlock(G71Parser.ParBlockContext ctx) {
        int threadNr = result.newThread();
        int parentThread = result.getThreadNr(ctx.parent);
        result.setParent(threadNr, parentThread);
        result.putThreadNr(ctx, threadNr);
    }

    @Override
    public void enterFunction(G71Parser.FunctionContext ctx) {
        String functionName = ctx.ID().getText();
        result.newFunction(functionName);
        result.setFunction(ctx.block(), functionName);
        G71Parser.ParamsContext paramsContext = ctx.params();
        List<String> ids = new ArrayList<>();
        List<Type> types = new ArrayList<>();
        if (ctx.type() != null) {
            Type functionType = typeFromCtx(ctx.type());
            result.putFunctionType(functionName, functionType);
        } else {
            //Set the function to type Void for better manament
            result.putFunctionType(functionName, Type.VOID);

        }
        if (paramsContext != null) {
            for (ParseTree idCtx : paramsContext.ID()) {
                ids.add(idCtx.getText());
            }

            for (G71Parser.TypeContext typeCtx : paramsContext.type()) {
                types.add(typeFromCtx(typeCtx));
            }
        }

        if (!result.putParam(functionName, ids, types))
            addError(ctx, " duplicate variables");

    }

    @Override
    public void exitFunction(G71Parser.FunctionContext ctx) {
        String function = ctx.ID().getText();
        if (!result.hasReturnStatement(function)) {
            addError(ctx, " function doesnt not return");
        }
    }

    @Override
    public void enterEveryRule(ParserRuleContext ctx) { //Set the inheritance rule of function and threadNr
        int threadNr = 0;
        if (ctx.parent != null) {
            Integer threadNrFrom = result.getThreadNr(ctx.parent);
            String parentFunction = result.getFunction(ctx.parent);

            if (threadNrFrom != null) {
                threadNr = threadNrFrom;
            }

            if (parentFunction != null) {
                result.setFunction(ctx, parentFunction);
            }

        }
        result.putThreadNr(ctx, threadNr);
    }


    @Override
    public void exitIfStat(G71Parser.IfStatContext ctx) {
        checkType(ctx.expr(), Type.BOOL);
    }

    @Override
    public void exitWhileStat(G71Parser.WhileStatContext ctx) {
        checkType(ctx.expr(), Type.BOOL);
    }


    /**
     * Set the type of the node
     *
     * @param node node to be set
     * @param type Type of the node
     */
    private void setType(ParseTree node, Type type) {
        result.setType(node, type);
    }

    /**
     * Get the type of the node
     *
     * @return the type of the node
     */
    private Type getType(ParseTree node) {
        return result.getType(node);
    }

    /**
     * Compare the type and check them
     * @param actual the actual type
     * @param expected the expected type
     * @param node current context, used for setting error
     */
    private void checkType(Type actual, Type expected, ParserRuleContext node) {
        if (actual == null || !actual.equals(expected)) {
            addError(node, "Expected type '%s' but found '%s'", expected, actual);
        }
    }

    /**
     * Check of the node is in the given type
     * @param node current context
     * @param expected expected type
     */
    private void checkType(ParserRuleContext node, Type expected) {
        Type actual = getType(node);
        checkType(actual, expected, node);
    }


    /**
     *
     * Get the errors from elaboration phase
     */
    public List<String> getErrors() {
        return errors;
    }

    /**
     * Check if the program has errors
     */
    public boolean hasErrors() {
        return !getErrors().isEmpty();
    }

    /**
     * Add error to the program
     * @param node context of error
     * @param message error message
     */
    private void addError(ParserRuleContext node, String message,
                          Object... args) {
        addError(node.getStart(), message, args);
    }

    private void addError(Token token, String message, Object... args) {
        int line = token.getLine();
        int column = token.getCharPositionInLine();
        message = String.format(message, args);
        message = String.format("Line %d:%d - %s", line, column, message);
        errors.add(message + "\n");
    }

    /**
     * Run the result
     * @param tree root of the parse tree
     * @return the result of the elaboration phase
     */
    public Result check(ParseTree tree) {
        result = new Result();
        errors = new ArrayList<>();
        new ParseTreeWalker().walk(this, tree);
        return result;
    }


}
