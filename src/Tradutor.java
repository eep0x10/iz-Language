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
}