// Generated from iz.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link izParser}.
 */
public interface izListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link izParser#init}.
	 * @param ctx the parse tree
	 */
	void enterInit(izParser.InitContext ctx);
	/**
	 * Exit a parse tree produced by {@link izParser#init}.
	 * @param ctx the parse tree
	 */
	void exitInit(izParser.InitContext ctx);
	/**
	 * Enter a parse tree produced by {@link izParser#comando}.
	 * @param ctx the parse tree
	 */
	void enterComando(izParser.ComandoContext ctx);
	/**
	 * Exit a parse tree produced by {@link izParser#comando}.
	 * @param ctx the parse tree
	 */
	void exitComando(izParser.ComandoContext ctx);
	/**
	 * Enter a parse tree produced by {@link izParser#tipo}.
	 * @param ctx the parse tree
	 */
	void enterTipo(izParser.TipoContext ctx);
	/**
	 * Exit a parse tree produced by {@link izParser#tipo}.
	 * @param ctx the parse tree
	 */
	void exitTipo(izParser.TipoContext ctx);
	/**
	 * Enter a parse tree produced by {@link izParser#let}.
	 * @param ctx the parse tree
	 */
	void enterLet(izParser.LetContext ctx);
	/**
	 * Exit a parse tree produced by {@link izParser#let}.
	 * @param ctx the parse tree
	 */
	void exitLet(izParser.LetContext ctx);
	/**
	 * Enter a parse tree produced by {@link izParser#show}.
	 * @param ctx the parse tree
	 */
	void enterShow(izParser.ShowContext ctx);
	/**
	 * Exit a parse tree produced by {@link izParser#show}.
	 * @param ctx the parse tree
	 */
	void exitShow(izParser.ShowContext ctx);
}