import java.util.HashMap;

public class izCustomListener extends izBaseListener {
	HashMap<String, Integer> variableMap = new HashMap<String, Integer>();

	@Override
	public void exitShow(izParser.ShowContext ctx) {
	    if(ctx.INT() != null){
	      System.out.println(ctx.INT().getText());
	    }
	    else if(ctx.VAR() != null){
	      System.out.println(this.variableMap.get(ctx.VAR().getText()));
	    }
	}

	@Override
	public void exitLet(izParser.LetContext ctx) {
	     this.variableMap.put(ctx.VAR().getText(),    
	     Integer.parseInt(ctx.INT().getText()));
	 }
}
