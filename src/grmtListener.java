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
	 * Enter a parse tree produced by {@link grmtParser#print}.
	 * @param ctx the parse tree
	 */
	void enterPrint(grmtParser.PrintContext ctx);
	/**
	 * Exit a parse tree produced by {@link grmtParser#print}.
	 * @param ctx the parse tree
	 */
	void exitPrint(grmtParser.PrintContext ctx);
	/**
	 * Enter a parse tree produced by {@link grmtParser#input}.
	 * @param ctx the parse tree
	 */
	void enterInput(grmtParser.InputContext ctx);
	/**
	 * Exit a parse tree produced by {@link grmtParser#input}.
	 * @param ctx the parse tree
	 */
	void exitInput(grmtParser.InputContext ctx);
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
	 * Enter a parse tree produced by {@link grmtParser#else}.
	 * @param ctx the parse tree
	 */
	void enterElse(grmtParser.ElseContext ctx);
	/**
	 * Exit a parse tree produced by {@link grmtParser#else}.
	 * @param ctx the parse tree
	 */
	void exitElse(grmtParser.ElseContext ctx);
	/**
	 * Enter a parse tree produced by {@link grmtParser#whilethen}.
	 * @param ctx the parse tree
	 */
	void enterWhilethen(grmtParser.WhilethenContext ctx);
	/**
	 * Exit a parse tree produced by {@link grmtParser#whilethen}.
	 * @param ctx the parse tree
	 */
	void exitWhilethen(grmtParser.WhilethenContext ctx);
	/**
	 * Enter a parse tree produced by {@link grmtParser#forthen}.
	 * @param ctx the parse tree
	 */
	void enterForthen(grmtParser.ForthenContext ctx);
	/**
	 * Exit a parse tree produced by {@link grmtParser#forthen}.
	 * @param ctx the parse tree
	 */
	void exitForthen(grmtParser.ForthenContext ctx);
	/**
	 * Enter a parse tree produced by {@link grmtParser#forcomp}.
	 * @param ctx the parse tree
	 */
	void enterForcomp(grmtParser.ForcompContext ctx);
	/**
	 * Exit a parse tree produced by {@link grmtParser#forcomp}.
	 * @param ctx the parse tree
	 */
	void exitForcomp(grmtParser.ForcompContext ctx);
	/**
	 * Enter a parse tree produced by {@link grmtParser#add_min}.
	 * @param ctx the parse tree
	 */
	void enterAdd_min(grmtParser.Add_minContext ctx);
	/**
	 * Exit a parse tree produced by {@link grmtParser#add_min}.
	 * @param ctx the parse tree
	 */
	void exitAdd_min(grmtParser.Add_minContext ctx);
	/**
	 * Enter a parse tree produced by {@link grmtParser#p_virg}.
	 * @param ctx the parse tree
	 */
	void enterP_virg(grmtParser.P_virgContext ctx);
	/**
	 * Exit a parse tree produced by {@link grmtParser#p_virg}.
	 * @param ctx the parse tree
	 */
	void exitP_virg(grmtParser.P_virgContext ctx);
	/**
	 * Enter a parse tree produced by {@link grmtParser#expressao}.
	 * @param ctx the parse tree
	 */
	void enterExpressao(grmtParser.ExpressaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link grmtParser#expressao}.
	 * @param ctx the parse tree
	 */
	void exitExpressao(grmtParser.ExpressaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link grmtParser#comp}.
	 * @param ctx the parse tree
	 */
	void enterComp(grmtParser.CompContext ctx);
	/**
	 * Exit a parse tree produced by {@link grmtParser#comp}.
	 * @param ctx the parse tree
	 */
	void exitComp(grmtParser.CompContext ctx);
	/**
	 * Enter a parse tree produced by {@link grmtParser#op_comp}.
	 * @param ctx the parse tree
	 */
	void enterOp_comp(grmtParser.Op_compContext ctx);
	/**
	 * Exit a parse tree produced by {@link grmtParser#op_comp}.
	 * @param ctx the parse tree
	 */
	void exitOp_comp(grmtParser.Op_compContext ctx);
	/**
	 * Enter a parse tree produced by {@link grmtParser#calc}.
	 * @param ctx the parse tree
	 */
	void enterCalc(grmtParser.CalcContext ctx);
	/**
	 * Exit a parse tree produced by {@link grmtParser#calc}.
	 * @param ctx the parse tree
	 */
	void exitCalc(grmtParser.CalcContext ctx);
	/**
	 * Enter a parse tree produced by {@link grmtParser#op_calc}.
	 * @param ctx the parse tree
	 */
	void enterOp_calc(grmtParser.Op_calcContext ctx);
	/**
	 * Exit a parse tree produced by {@link grmtParser#op_calc}.
	 * @param ctx the parse tree
	 */
	void exitOp_calc(grmtParser.Op_calcContext ctx);
	/**
	 * Enter a parse tree produced by {@link grmtParser#atrib}.
	 * @param ctx the parse tree
	 */
	void enterAtrib(grmtParser.AtribContext ctx);
	/**
	 * Exit a parse tree produced by {@link grmtParser#atrib}.
	 * @param ctx the parse tree
	 */
	void exitAtrib(grmtParser.AtribContext ctx);
	/**
	 * Enter a parse tree produced by {@link grmtParser#op_atrib}.
	 * @param ctx the parse tree
	 */
	void enterOp_atrib(grmtParser.Op_atribContext ctx);
	/**
	 * Exit a parse tree produced by {@link grmtParser#op_atrib}.
	 * @param ctx the parse tree
	 */
	void exitOp_atrib(grmtParser.Op_atribContext ctx);
	/**
	 * Enter a parse tree produced by {@link grmtParser#number}.
	 * @param ctx the parse tree
	 */
	void enterNumber(grmtParser.NumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link grmtParser#number}.
	 * @param ctx the parse tree
	 */
	void exitNumber(grmtParser.NumberContext ctx);
	/**
	 * Enter a parse tree produced by {@link grmtParser#var_types}.
	 * @param ctx the parse tree
	 */
	void enterVar_types(grmtParser.Var_typesContext ctx);
	/**
	 * Exit a parse tree produced by {@link grmtParser#var_types}.
	 * @param ctx the parse tree
	 */
	void exitVar_types(grmtParser.Var_typesContext ctx);
	/**
	 * Enter a parse tree produced by {@link grmtParser#bool}.
	 * @param ctx the parse tree
	 */
	void enterBool(grmtParser.BoolContext ctx);
	/**
	 * Exit a parse tree produced by {@link grmtParser#bool}.
	 * @param ctx the parse tree
	 */
	void exitBool(grmtParser.BoolContext ctx);
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
	 * Enter a parse tree produced by {@link grmtParser#str}.
	 * @param ctx the parse tree
	 */
	void enterStr(grmtParser.StrContext ctx);
	/**
	 * Exit a parse tree produced by {@link grmtParser#str}.
	 * @param ctx the parse tree
	 */
	void exitStr(grmtParser.StrContext ctx);
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
	/**
	 * Enter a parse tree produced by {@link grmtParser#flt}.
	 * @param ctx the parse tree
	 */
	void enterFlt(grmtParser.FltContext ctx);
	/**
	 * Exit a parse tree produced by {@link grmtParser#flt}.
	 * @param ctx the parse tree
	 */
	void exitFlt(grmtParser.FltContext ctx);
}