// Generated from C:/Users/long2/Desktop/Compiler/src/main/java/Antlr\G71.g4 by ANTLR 4.9.1
package Antlr;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link G71Parser}.
 */
public interface G71Listener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link G71Parser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(G71Parser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link G71Parser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(G71Parser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link G71Parser#mainProg}.
	 * @param ctx the parse tree
	 */
	void enterMainProg(G71Parser.MainProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link G71Parser#mainProg}.
	 * @param ctx the parse tree
	 */
	void exitMainProg(G71Parser.MainProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link G71Parser#function}.
	 * @param ctx the parse tree
	 */
	void enterFunction(G71Parser.FunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link G71Parser#function}.
	 * @param ctx the parse tree
	 */
	void exitFunction(G71Parser.FunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link G71Parser#globalDecl}.
	 * @param ctx the parse tree
	 */
	void enterGlobalDecl(G71Parser.GlobalDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link G71Parser#globalDecl}.
	 * @param ctx the parse tree
	 */
	void exitGlobalDecl(G71Parser.GlobalDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link G71Parser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(G71Parser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link G71Parser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(G71Parser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link G71Parser#parBlock}.
	 * @param ctx the parse tree
	 */
	void enterParBlock(G71Parser.ParBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link G71Parser#parBlock}.
	 * @param ctx the parse tree
	 */
	void exitParBlock(G71Parser.ParBlockContext ctx);
	/**
	 * Enter a parse tree produced by the {@code assStat}
	 * labeled alternative in {@link G71Parser#stat}.
	 * @param ctx the parse tree
	 */
	void enterAssStat(G71Parser.AssStatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code assStat}
	 * labeled alternative in {@link G71Parser#stat}.
	 * @param ctx the parse tree
	 */
	void exitAssStat(G71Parser.AssStatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code declStat}
	 * labeled alternative in {@link G71Parser#stat}.
	 * @param ctx the parse tree
	 */
	void enterDeclStat(G71Parser.DeclStatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code declStat}
	 * labeled alternative in {@link G71Parser#stat}.
	 * @param ctx the parse tree
	 */
	void exitDeclStat(G71Parser.DeclStatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parallelStat}
	 * labeled alternative in {@link G71Parser#stat}.
	 * @param ctx the parse tree
	 */
	void enterParallelStat(G71Parser.ParallelStatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parallelStat}
	 * labeled alternative in {@link G71Parser#stat}.
	 * @param ctx the parse tree
	 */
	void exitParallelStat(G71Parser.ParallelStatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code lockStat}
	 * labeled alternative in {@link G71Parser#stat}.
	 * @param ctx the parse tree
	 */
	void enterLockStat(G71Parser.LockStatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code lockStat}
	 * labeled alternative in {@link G71Parser#stat}.
	 * @param ctx the parse tree
	 */
	void exitLockStat(G71Parser.LockStatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code unlockStat}
	 * labeled alternative in {@link G71Parser#stat}.
	 * @param ctx the parse tree
	 */
	void enterUnlockStat(G71Parser.UnlockStatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code unlockStat}
	 * labeled alternative in {@link G71Parser#stat}.
	 * @param ctx the parse tree
	 */
	void exitUnlockStat(G71Parser.UnlockStatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ifStat}
	 * labeled alternative in {@link G71Parser#stat}.
	 * @param ctx the parse tree
	 */
	void enterIfStat(G71Parser.IfStatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ifStat}
	 * labeled alternative in {@link G71Parser#stat}.
	 * @param ctx the parse tree
	 */
	void exitIfStat(G71Parser.IfStatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code whileStat}
	 * labeled alternative in {@link G71Parser#stat}.
	 * @param ctx the parse tree
	 */
	void enterWhileStat(G71Parser.WhileStatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code whileStat}
	 * labeled alternative in {@link G71Parser#stat}.
	 * @param ctx the parse tree
	 */
	void exitWhileStat(G71Parser.WhileStatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code outStat}
	 * labeled alternative in {@link G71Parser#stat}.
	 * @param ctx the parse tree
	 */
	void enterOutStat(G71Parser.OutStatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code outStat}
	 * labeled alternative in {@link G71Parser#stat}.
	 * @param ctx the parse tree
	 */
	void exitOutStat(G71Parser.OutStatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code returnStat}
	 * labeled alternative in {@link G71Parser#stat}.
	 * @param ctx the parse tree
	 */
	void enterReturnStat(G71Parser.ReturnStatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code returnStat}
	 * labeled alternative in {@link G71Parser#stat}.
	 * @param ctx the parse tree
	 */
	void exitReturnStat(G71Parser.ReturnStatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprStat}
	 * labeled alternative in {@link G71Parser#stat}.
	 * @param ctx the parse tree
	 */
	void enterExprStat(G71Parser.ExprStatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprStat}
	 * labeled alternative in {@link G71Parser#stat}.
	 * @param ctx the parse tree
	 */
	void exitExprStat(G71Parser.ExprStatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code blockStat}
	 * labeled alternative in {@link G71Parser#stat}.
	 * @param ctx the parse tree
	 */
	void enterBlockStat(G71Parser.BlockStatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code blockStat}
	 * labeled alternative in {@link G71Parser#stat}.
	 * @param ctx the parse tree
	 */
	void exitBlockStat(G71Parser.BlockStatContext ctx);
	/**
	 * Enter a parse tree produced by {@link G71Parser#params}.
	 * @param ctx the parse tree
	 */
	void enterParams(G71Parser.ParamsContext ctx);
	/**
	 * Exit a parse tree produced by {@link G71Parser#params}.
	 * @param ctx the parse tree
	 */
	void exitParams(G71Parser.ParamsContext ctx);
	/**
	 * Enter a parse tree produced by {@link G71Parser#dimension}.
	 * @param ctx the parse tree
	 */
	void enterDimension(G71Parser.DimensionContext ctx);
	/**
	 * Exit a parse tree produced by {@link G71Parser#dimension}.
	 * @param ctx the parse tree
	 */
	void exitDimension(G71Parser.DimensionContext ctx);
	/**
	 * Enter a parse tree produced by {@link G71Parser#exprDimension}.
	 * @param ctx the parse tree
	 */
	void enterExprDimension(G71Parser.ExprDimensionContext ctx);
	/**
	 * Exit a parse tree produced by {@link G71Parser#exprDimension}.
	 * @param ctx the parse tree
	 */
	void exitExprDimension(G71Parser.ExprDimensionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code funcExpr}
	 * labeled alternative in {@link G71Parser#expr}.
	 * @param ctx the parse tree
	 */
	void enterFuncExpr(G71Parser.FuncExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code funcExpr}
	 * labeled alternative in {@link G71Parser#expr}.
	 * @param ctx the parse tree
	 */
	void exitFuncExpr(G71Parser.FuncExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code arrayExpr}
	 * labeled alternative in {@link G71Parser#expr}.
	 * @param ctx the parse tree
	 */
	void enterArrayExpr(G71Parser.ArrayExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code arrayExpr}
	 * labeled alternative in {@link G71Parser#expr}.
	 * @param ctx the parse tree
	 */
	void exitArrayExpr(G71Parser.ArrayExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code trueExpr}
	 * labeled alternative in {@link G71Parser#expr}.
	 * @param ctx the parse tree
	 */
	void enterTrueExpr(G71Parser.TrueExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code trueExpr}
	 * labeled alternative in {@link G71Parser#expr}.
	 * @param ctx the parse tree
	 */
	void exitTrueExpr(G71Parser.TrueExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code numExpr}
	 * labeled alternative in {@link G71Parser#expr}.
	 * @param ctx the parse tree
	 */
	void enterNumExpr(G71Parser.NumExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code numExpr}
	 * labeled alternative in {@link G71Parser#expr}.
	 * @param ctx the parse tree
	 */
	void exitNumExpr(G71Parser.NumExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parExpr}
	 * labeled alternative in {@link G71Parser#expr}.
	 * @param ctx the parse tree
	 */
	void enterParExpr(G71Parser.ParExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parExpr}
	 * labeled alternative in {@link G71Parser#expr}.
	 * @param ctx the parse tree
	 */
	void exitParExpr(G71Parser.ParExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code eqExpr}
	 * labeled alternative in {@link G71Parser#expr}.
	 * @param ctx the parse tree
	 */
	void enterEqExpr(G71Parser.EqExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code eqExpr}
	 * labeled alternative in {@link G71Parser#expr}.
	 * @param ctx the parse tree
	 */
	void exitEqExpr(G71Parser.EqExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code notExpr}
	 * labeled alternative in {@link G71Parser#expr}.
	 * @param ctx the parse tree
	 */
	void enterNotExpr(G71Parser.NotExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code notExpr}
	 * labeled alternative in {@link G71Parser#expr}.
	 * @param ctx the parse tree
	 */
	void exitNotExpr(G71Parser.NotExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code addExpr}
	 * labeled alternative in {@link G71Parser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAddExpr(G71Parser.AddExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code addExpr}
	 * labeled alternative in {@link G71Parser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAddExpr(G71Parser.AddExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code negExpr}
	 * labeled alternative in {@link G71Parser#expr}.
	 * @param ctx the parse tree
	 */
	void enterNegExpr(G71Parser.NegExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code negExpr}
	 * labeled alternative in {@link G71Parser#expr}.
	 * @param ctx the parse tree
	 */
	void exitNegExpr(G71Parser.NegExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code compExpr}
	 * labeled alternative in {@link G71Parser#expr}.
	 * @param ctx the parse tree
	 */
	void enterCompExpr(G71Parser.CompExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code compExpr}
	 * labeled alternative in {@link G71Parser#expr}.
	 * @param ctx the parse tree
	 */
	void exitCompExpr(G71Parser.CompExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code mulExpr}
	 * labeled alternative in {@link G71Parser#expr}.
	 * @param ctx the parse tree
	 */
	void enterMulExpr(G71Parser.MulExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code mulExpr}
	 * labeled alternative in {@link G71Parser#expr}.
	 * @param ctx the parse tree
	 */
	void exitMulExpr(G71Parser.MulExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code falseExpr}
	 * labeled alternative in {@link G71Parser#expr}.
	 * @param ctx the parse tree
	 */
	void enterFalseExpr(G71Parser.FalseExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code falseExpr}
	 * labeled alternative in {@link G71Parser#expr}.
	 * @param ctx the parse tree
	 */
	void exitFalseExpr(G71Parser.FalseExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code boolExpr}
	 * labeled alternative in {@link G71Parser#expr}.
	 * @param ctx the parse tree
	 */
	void enterBoolExpr(G71Parser.BoolExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code boolExpr}
	 * labeled alternative in {@link G71Parser#expr}.
	 * @param ctx the parse tree
	 */
	void exitBoolExpr(G71Parser.BoolExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code idExpr}
	 * labeled alternative in {@link G71Parser#expr}.
	 * @param ctx the parse tree
	 */
	void enterIdExpr(G71Parser.IdExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code idExpr}
	 * labeled alternative in {@link G71Parser#expr}.
	 * @param ctx the parse tree
	 */
	void exitIdExpr(G71Parser.IdExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link G71Parser#paramMap}.
	 * @param ctx the parse tree
	 */
	void enterParamMap(G71Parser.ParamMapContext ctx);
	/**
	 * Exit a parse tree produced by {@link G71Parser#paramMap}.
	 * @param ctx the parse tree
	 */
	void exitParamMap(G71Parser.ParamMapContext ctx);
	/**
	 * Enter a parse tree produced by {@link G71Parser#addOp}.
	 * @param ctx the parse tree
	 */
	void enterAddOp(G71Parser.AddOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link G71Parser#addOp}.
	 * @param ctx the parse tree
	 */
	void exitAddOp(G71Parser.AddOpContext ctx);
	/**
	 * Enter a parse tree produced by {@link G71Parser#mulOp}.
	 * @param ctx the parse tree
	 */
	void enterMulOp(G71Parser.MulOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link G71Parser#mulOp}.
	 * @param ctx the parse tree
	 */
	void exitMulOp(G71Parser.MulOpContext ctx);
	/**
	 * Enter a parse tree produced by {@link G71Parser#booleanOp}.
	 * @param ctx the parse tree
	 */
	void enterBooleanOp(G71Parser.BooleanOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link G71Parser#booleanOp}.
	 * @param ctx the parse tree
	 */
	void exitBooleanOp(G71Parser.BooleanOpContext ctx);
	/**
	 * Enter a parse tree produced by {@link G71Parser#compOp}.
	 * @param ctx the parse tree
	 */
	void enterCompOp(G71Parser.CompOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link G71Parser#compOp}.
	 * @param ctx the parse tree
	 */
	void exitCompOp(G71Parser.CompOpContext ctx);
	/**
	 * Enter a parse tree produced by {@link G71Parser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(G71Parser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link G71Parser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(G71Parser.TypeContext ctx);
}