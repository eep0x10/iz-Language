public class Tradutor extends grmtBaseListener{
	// Iniciar programa
	@Override
	public void enterInit(grmtParser.InitContext ctx){
		System.out.println("public class Code (");
		System.out.println("import java.util.Scanner;");
		System.out.println("public static void main(String[] arg){");
		System.out.println("Scanner myObj = new Scanner(System.in);");
			
	}
	@Override
	public void exitInit(grmtParser.InitContext ctx){
		System.out.println("}");
		System.out.println("}");

}
	@Override public void enterPrint(grmtParser.PrintContext ctx){
		System.out.println("System.out.println(");
	}
	@Override public void exitPrint(grmtParser.PrintContext ctx){
		System.out.println(");");
	}
	@Override public void enterInput(grmtParser.InputContext ctx){
		System.out.println(" myObj.nextLine();");
	}
	//@Override public void exitInput(grmtParser.InputContext ctx){
	//	
	//}
	// IF, While, For
	// if ... }
	@Override public void enterIfthen(grmtParser.IfthenContext ctx) { 
		System.out.println("if");
	}
	@Override public void exitIfthen(grmtParser.IfthenContext ctx) { 		
		System.out.println("}\n}");
	}
	// while ... }
	@Override public void enterWhilethen(grmtParser.WhilethenContext ctx) { 
		System.out.println("while");
	}
	@Override public void exitWhilethen(grmtParser.WhilethenContext ctx) { 
		System.out.println("}\n}");
	}
	// for ... }
	@Override public void enterForthen(grmtParser.ForthenContext ctx) { 
		System.out.println("for");
	}
	@Override public void exitForthen(grmtParser.ForthenContext ctx) { 
		System.out.println("}\n}");
	}

	// ... { ... ;
	@Override  public void enterExpressao(grmtParser.ExpressaoContext ctx) {
    System.out.println("{");
	}
  	@Override public void exitExpressao(grmtParser.ExpressaoContext ctx) {
    System.out.println(";");
	}

	// Comparar
	// ... (...)
	@Override public void enterComp(grmtParser.CompContext ctx) { 
		System.out.println("(");
	}
	@Override public void exitComp(grmtParser.CompContext ctx) { 
		System.out.println(")");
	}
	// ( ... > ... )
	@Override public void enterOp_comp(grmtParser.Op_compContext ctx) { 
		System.out.println(" " + ctx.getText() + " ");
	}
	//@Override public void exitOp_comp(grmtParser.Op_compContext ctx) { 
	//	System.out.println();
	//}

	// Calc
	//@Override public void enterCalc(grmtParser.CalcContext ctx) { 
	//	System.out.println("");
	//}
	//@Override public void exitCalc(grmtParser.CalcContext ctx) { 
	//	System.out.println("");
	//}
	@Override public void enterOp_calc(grmtParser.Op_calcContext ctx) { 
		System.out.println(" " + ctx.getText() + " ");
	}
	//@Override public void exitOp_calc(grmtParser.Op_calcContext ctx) { 
	//	System.out.println();
	//}
	
	// Atribuir
	// ... = ...
	@Override public void enterAtrib(grmtParser.AtribContext ctx) { 
		System.out.println(" " + ctx.getText() + " ");
	}
	//@Override public void exitAtrib(grmtParser.AtribContext ctx) { 
	//	System.out.println();
	//}


	// Number + All Var Types -> Printa valor enviado
	//@Override public void enterNumber(grmtParser.NumberContext ctx) { 
	//	System.out.println("");
	//}
	//@Override public void exitNumber(grmtParser.NumberContext ctx) { 
	//	System.out.println("");
	//}
	//@Override public void enterVar_types(grmtParser.Var_typesContext ctx) { 
	//	System.out.println("");
	//}
	//@Override public void exitVar_types(grmtParser.Var_typesContext ctx) { 
	//	System.out.println("");
	//}


	// Tipos de variáveis
	//@Override public void enterBool(grmtParser.BoolContext ctx) { 
	//	System.out.println("");
	//}
	@Override public void exitBool(grmtParser.BoolContext ctx) { 
		System.out.println(ctx.BOOL_EXPR().getText());
	}
	//@Override public void enterId(grmtParser.IdContext ctx) { 
	//	System.out.println("");
	//}
	@Override public void exitId(grmtParser.IdContext ctx) { 
		System.out.println(ctx.ID_EXPR().getText());
	}
	//@Override public void enterStr(grmtParser.StrContext ctx) { 
	//	System.out.println("");
	//}
	@Override public void exitStr(grmtParser.StrContext ctx) { 
		System.out.println(ctx.STR().getText());
	}
	//@Override public void enterNum(grmtParser.NumContext ctx) { 
	//	System.out.println("");
	//}
	@Override public void exitNum(grmtParser.NumContext ctx) { 
		System.out.println(ctx.NUM_EXPR().getText());
	}
	//@Override public void enterFlt(grmtParser.FltContext ctx) { 
	//	System.out.println("");
	//}
	@Override public void exitFlt(grmtParser.FltContext ctx) {
		System.out.println(ctx.FLT_EXPR().getText());
	 }
	
}
/*
ctx = valore recebido
enter = if (
exit = ) { 
exit tokens = printar valor
*/