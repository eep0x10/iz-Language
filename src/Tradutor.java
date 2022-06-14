import java.util.ArrayList;
import java.util.List;

public class Tradutor extends grmtBaseListener{
	// Iniciar programa
	@Override
	public void enterInit(grmtParser.InitContext ctx){
		System.out.println("import java.util.Scanner;");
		System.out.println("public class Main {");		
		System.out.println("public static void main(String[] arg){");
		System.out.println("Scanner myObj = new Scanner(System.in);");
			
	}
	@Override
	public void exitInit(grmtParser.InitContext ctx){
		System.out.println("}");
		System.out.println("}");

}
	@Override public void enterPrint(grmtParser.PrintContext ctx){		
		System.out.print("System.out.println(");
	}
	@Override public void exitPrint(grmtParser.PrintContext ctx){
		System.out.println(");");
	}
	@Override public void enterInput(grmtParser.InputContext ctx){
		System.out.print(" myObj.nextLine()");
	}
	//@Override public void exitInput(grmtParser.InputContext ctx){
	//	
	//}
	// IF, While, For
	// if ... }
	@Override public void enterIfthen(grmtParser.IfthenContext ctx) { 
		System.out.print("if");
	}
	@Override public void exitIfthen(grmtParser.IfthenContext ctx) { 		
		System.out.print("}\n");
	}
	@Override public void enterElse(grmtParser.ElseContext ctx) { 
		System.out.print("else ");
	}
	@Override public void exitElse(grmtParser.ElseContext ctx) { 		
		System.out.print("}\n");	
	}
	
	// while ... }
	@Override public void enterWhilethen(grmtParser.WhilethenContext ctx) { 
		System.out.print("while");
	}
	@Override public void exitWhilethen(grmtParser.WhilethenContext ctx) { 
		System.out.print("}\n");
	}
	// for ... }
	@Override public void enterForthen(grmtParser.ForthenContext ctx) { 
		System.out.print("for");
	}
	@Override public void exitForthen(grmtParser.ForthenContext ctx) { 
		System.out.print("}\n");
	}
	@Override public void enterForcomp(grmtParser.ForcompContext ctx) { 
		System.out.print("(");
	}
	@Override public void exitForcomp(grmtParser.ForcompContext ctx) { 
		System.out.print(")");
	}
	@Override public void exitP_virg(grmtParser.P_virgContext ctx) { 
		System.out.print(";");
	}

	//@Override public void enterAdd_min(grmtParser.Add_minContext ctx) { 
	//	System.out.print(ctx.getText());
	//}
	@Override public void exitAdd_min(grmtParser.Add_minContext ctx) { 
		System.out.print(ctx.getText());
	}
	// ... { ... ;
	@Override  public void enterExpressao(grmtParser.ExpressaoContext ctx) {
    System.out.print("{");
	}
  	@Override public void exitExpressao(grmtParser.ExpressaoContext ctx) {
    System.out.print("\n");
	}

	// Comparar
	// ... (...)
	@Override public void enterComp(grmtParser.CompContext ctx) { 
		System.out.print("(");
	}
	@Override public void exitComp(grmtParser.CompContext ctx) { 
		System.out.print(")");
	}
	// ( ... > ... )
	@Override public void enterOp_comp(grmtParser.Op_compContext ctx) { 
		System.out.print(" " + ctx.getText() + " ");
	}
	//@Override public void exitOp_comp(grmtParser.Op_compContext ctx) { 
	//	System.out.print();
	//}

	// Calc
	//@Override public void enterCalc(grmtParser.CalcContext ctx) { 
	//	System.out.print("");
	//}
	//@Override public void exitCalc(grmtParser.CalcContext ctx) { 
	//	System.out.print("");
	//}
	@Override public void enterOp_calc(grmtParser.Op_calcContext ctx) { 
		System.out.print(" " + ctx.getText() + " ");
	}
	//@Override public void exitOp_calc(grmtParser.Op_calcContext ctx) { 
	//	System.out.print();
	//}
	
	// Atribuir
	// ... = ...
	@Override public void enterOp_atrib(grmtParser.Op_atribContext ctx) { 
		System.out.print(" = ");
	}
	@Override public void enterAtrib(grmtParser.AtribContext ctx) { 
	System.out.print("");	
	}
	@Override public void exitAtrib(grmtParser.AtribContext ctx) { 
		System.out.println(";");
	}


	// Number + All Var Types -> Printa valor enviado
	//@Override public void enterNumber(grmtParser.NumberContext ctx) { 
	//	System.out.print("");
	//}
	//@Override public void exitNumber(grmtParser.NumberContext ctx) { 
	//	System.out.print("");
	//}
	//@Override public void enterVar_types(grmtParser.Var_typesContext ctx) { 
	//	System.out.print("");
	//}
	//@Override public void exitVar_types(grmtParser.Var_typesContext ctx) { 
	//	System.out.print("");
	//}


	// Tipos de variáveis
	//@Override public void enterBool(grmtParser.BoolContext ctx) { 
	//	System.out.print("");
	//}
	@Override public void exitBool(grmtParser.BoolContext ctx) { 
		System.out.print(ctx.BOOL_EXPR().getText());
	}
	
	//Lista de variaveis ja declaradas
	List<String> list = new ArrayList<String>();
	@Override public void enterId(grmtParser.IdContext ctx) {
		
		String id = ctx.ID_EXPR().getText();
		if (!list.contains(id)) {
			System.out.print("var ");
			list.add(ctx.ID_EXPR().getText());
		}
	}

	@Override public void exitId(grmtParser.IdContext ctx) { 
		System.out.print(ctx.ID_EXPR().getText());
	}
	//@Override public void enterStr(grmtParser.StrContext ctx) { 
	//	
	//}
	@Override public void exitStr(grmtParser.StrContext ctx) { 
		String id2 = ctx.ID_EXPR().getText();		
		if (!list.contains(id2)) {
			System.out.print('"'+ctx.ID_EXPR().getText()+'"');			
		}
		else{
			System.out.print(ctx.ID_EXPR().getText());
		}
		
	}
	//@Override public void enterNum(grmtParser.NumContext ctx) { 
	//	System.out.print("");
	//}
	@Override public void exitNum(grmtParser.NumContext ctx) { 
		System.out.print(ctx.NUM_EXPR().getText());
	}
	//@Override public void enterFlt(grmtParser.FltContext ctx) { 
	//	System.out.print("");
	//}
	@Override public void exitFlt(grmtParser.FltContext ctx) {
		System.out.print(ctx.FLT_EXPR().getText());
	 }
	
}
/*
ctx = valore recebido
enter = if (
exit = ) { 
exit tokens = printar valor
*/