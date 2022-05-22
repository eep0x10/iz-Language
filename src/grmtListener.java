// Generated from grmt.g4 by ANTLR 4.10.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link grmtParser}.
 */
public interface grmtListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link grmtParser#init}.
	 * @param ctx the parse tree
	 */
	void enterInit(grmtParser.InitContext ctx);
	/**
	 * Exit a parse tree produced by {@link grmtParser#init}.
	 * @param ctx the parse tree
	 */
	void exitInit(grmtParser.InitContext ctx);
	/**
	 * Enter a parse tree produced by {@link grmtParser#ifthen}.
	 * @param ctx the parse tree
	 */
	void enterIfthen(grmtParser.IfthenContext ctx);
	/**
	 * Exit a parse tree produced by {@link grmtParser#ifthen}.
	 * @param ctx the parse tree
	 */
	void exitIfthen(grmtParser.IfthenContext ctx);
	/**
	 * Enter a parse tree produced by {@link grmtParser#condicao}.
	 * @param ctx the parse tree
	 */
	void enterCondicao(grmtParser.CondicaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link grmtParser#condicao}.
	 * @param ctx the parse tree
	 */
	void exitCondicao(grmtParser.CondicaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link grmtParser#op_logc}.
	 * @param ctx the parse tree
	 */
	void enterOp_logc(grmtParser.Op_logcContext ctx);
	/**
	 * Exit a parse tree produced by {@link grmtParser#op_logc}.
	 * @param ctx the parse tree
	 */
	void exitOp_logc(grmtParser.Op_logcContext ctx);
	/**
	 * Enter a parse tree produced by {@link grmtParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(grmtParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link grmtParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(grmtParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link grmtParser#id}.
	 * @param ctx the parse tree
	 */
	void enterId(grmtParser.IdContext ctx);
	/**
	 * Exit a parse tree produced by {@link grmtParser#id}.
	 * @param ctx the parse tree
	 */
	void exitId(grmtParser.IdContext ctx);
	/**
	 * Enter a parse tree produced by {@link grmtParser#num}.
	 * @param ctx the parse tree
	 */
	void enterNum(grmtParser.NumContext ctx);
	/**
	 * Exit a parse tree produced by {@link grmtParser#num}.
	 * @param ctx the parse tree
	 */
	void exitNum(grmtParser.NumContext ctx);
}