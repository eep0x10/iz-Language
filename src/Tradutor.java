public class Tradutor extends grmtBaseListener{
	@Override
	public void enterInit(grmtParser.InitContext ctx){
		System.out.println("public class Code (");
		System.out.println("public static void main(String[] arg){");
			
	}
	@Override
	public void exitInit(grmtParser.InitContext ctx){
		System.out.println("}");
		System.out.println("}");

}
	@Override public void enterIfthen(grmtParser.IfthenContext ctx) { 
	}
	@Override public void exitIfthen(grmtParser.IfthenContext ctx) { 
	}
	@Override public void enterWhilethen(grmtParser.WhilethenContext ctx) { 
	}
	@Override public void exitWhilethen(grmtParser.WhilethenContext ctx) { 
	}
	@Override public void enterForthen(grmtParser.ForthenContext ctx) { 
	}
	@Override public void exitForthen(grmtParser.ForthenContext ctx) { 
	}
	@Override public void enterComp(grmtParser.CompContext ctx) { 
	}
	@Override public void exitComp(grmtParser.CompContext ctx) { 
	}
	@Override public void enterOp_comp(grmtParser.Op_compContext ctx) { 
	}
	@Override public void exitOp_comp(grmtParser.Op_compContext ctx) { 
	}
	@Override public void enterCalc(grmtParser.CalcContext ctx) { 
	}
	@Override public void exitCalc(grmtParser.CalcContext ctx) { 
	}
	@Override public void enterOp_calc(grmtParser.Op_calcContext ctx) { 
	}
	@Override public void exitOp_calc(grmtParser.Op_calcContext ctx) { 
	}
	@Override public void enterAtrib(grmtParser.AtribContext ctx) { 
	}
	@Override public void exitAtrib(grmtParser.AtribContext ctx) { 
	}
	@Override public void enterNumber(grmtParser.NumberContext ctx) { 
	}
	@Override public void exitNumber(grmtParser.NumberContext ctx) { 
	}
	@Override public void enterVar_types(grmtParser.Var_typesContext ctx) { 
	}
	@Override public void exitVar_types(grmtParser.Var_typesContext ctx) { 
	}
	@Override public void enterBool(grmtParser.BoolContext ctx) { 
	}
	@Override public void exitBool(grmtParser.BoolContext ctx) { 
	}
	@Override public void enterId(grmtParser.IdContext ctx) { 
	}
	@Override public void exitId(grmtParser.IdContext ctx) { 
	}
	@Override public void enterStr(grmtParser.StrContext ctx) { 
	}
	@Override public void exitStr(grmtParser.StrContext ctx) { 
	}
	@Override public void enterNum(grmtParser.NumContext ctx) { 
	}
	@Override public void exitNum(grmtParser.NumContext ctx) { 
	}
	@Override public void enterFlt(grmtParser.FltContext ctx) { 
	}
	@Override public void exitFlt(grmtParser.FltContext ctx) { }
	@Override public void enterEveryRule(ParserRuleContext ctx) { }
	@Override public void exitEveryRule(ParserRuleContext ctx) { }
	@Override public void visitTerminal(TerminalNode node) { }
	@Override public void visitErrorNode(ErrorNode node) { }
}
/*
ctx = valore recebido
enter = if (
exit = ) { 
exit tokens = printar valor
*/