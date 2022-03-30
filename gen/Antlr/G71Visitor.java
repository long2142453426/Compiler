// Generated from C:/Users/long2/Desktop/Compiler/src/main/java/Antlr\G71.g4 by ANTLR 4.9.1
package Antlr;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link G71Parser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface G71Visitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link G71Parser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(G71Parser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link G71Parser#mainProg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMainProg(G71Parser.MainProgContext ctx);
	/**
	 * Visit a parse tree produced by {@link G71Parser#function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction(G71Parser.FunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link G71Parser#globalDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGlobalDecl(G71Parser.GlobalDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link G71Parser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(G71Parser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link G71Parser#parBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParBlock(G71Parser.ParBlockContext ctx);
	/**
	 * Visit a parse tree produced by the {@code assStat}
	 * labeled alternative in {@link G71Parser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssStat(G71Parser.AssStatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code declStat}
	 * labeled alternative in {@link G71Parser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclStat(G71Parser.DeclStatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code parallelStat}
	 * labeled alternative in {@link G71Parser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParallelStat(G71Parser.ParallelStatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code lockStat}
	 * labeled alternative in {@link G71Parser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLockStat(G71Parser.LockStatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code unlockStat}
	 * labeled alternative in {@link G71Parser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnlockStat(G71Parser.UnlockStatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ifStat}
	 * labeled alternative in {@link G71Parser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStat(G71Parser.IfStatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code whileStat}
	 * labeled alternative in {@link G71Parser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileStat(G71Parser.WhileStatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code outStat}
	 * labeled alternative in {@link G71Parser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOutStat(G71Parser.OutStatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code returnStat}
	 * labeled alternative in {@link G71Parser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnStat(G71Parser.ReturnStatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprStat}
	 * labeled alternative in {@link G71Parser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprStat(G71Parser.ExprStatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code blockStat}
	 * labeled alternative in {@link G71Parser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockStat(G71Parser.BlockStatContext ctx);
	/**
	 * Visit a parse tree produced by {@link G71Parser#params}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParams(G71Parser.ParamsContext ctx);
	/**
	 * Visit a parse tree produced by {@link G71Parser#dimension}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDimension(G71Parser.DimensionContext ctx);
	/**
	 * Visit a parse tree produced by {@link G71Parser#exprDimension}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprDimension(G71Parser.ExprDimensionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code funcExpr}
	 * labeled alternative in {@link G71Parser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncExpr(G71Parser.FuncExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arrayExpr}
	 * labeled alternative in {@link G71Parser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayExpr(G71Parser.ArrayExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code trueExpr}
	 * labeled alternative in {@link G71Parser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrueExpr(G71Parser.TrueExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code numExpr}
	 * labeled alternative in {@link G71Parser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumExpr(G71Parser.NumExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code parExpr}
	 * labeled alternative in {@link G71Parser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParExpr(G71Parser.ParExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code eqExpr}
	 * labeled alternative in {@link G71Parser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqExpr(G71Parser.EqExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code notExpr}
	 * labeled alternative in {@link G71Parser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotExpr(G71Parser.NotExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code addExpr}
	 * labeled alternative in {@link G71Parser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddExpr(G71Parser.AddExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code negExpr}
	 * labeled alternative in {@link G71Parser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNegExpr(G71Parser.NegExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code compExpr}
	 * labeled alternative in {@link G71Parser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompExpr(G71Parser.CompExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code mulExpr}
	 * labeled alternative in {@link G71Parser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMulExpr(G71Parser.MulExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code falseExpr}
	 * labeled alternative in {@link G71Parser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFalseExpr(G71Parser.FalseExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code boolExpr}
	 * labeled alternative in {@link G71Parser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolExpr(G71Parser.BoolExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code idExpr}
	 * labeled alternative in {@link G71Parser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdExpr(G71Parser.IdExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link G71Parser#paramMap}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParamMap(G71Parser.ParamMapContext ctx);
	/**
	 * Visit a parse tree produced by {@link G71Parser#addOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddOp(G71Parser.AddOpContext ctx);
	/**
	 * Visit a parse tree produced by {@link G71Parser#mulOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMulOp(G71Parser.MulOpContext ctx);
	/**
	 * Visit a parse tree produced by {@link G71Parser#booleanOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanOp(G71Parser.BooleanOpContext ctx);
	/**
	 * Visit a parse tree produced by {@link G71Parser#compOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompOp(G71Parser.CompOpContext ctx);
	/**
	 * Visit a parse tree produced by {@link G71Parser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(G71Parser.TypeContext ctx);
}