import java.io.IOException;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

public class Main{
	public static void main (String[] args) throws IOException{
		
		//Fazer Leitura codigo
		CharStream input = CharStreams.fromStream(System.in);
		
		//Instancia o analisador lexico
		grmtLexer lexer = new grmtLexer (input);
		
		//Gerar os tokens
		CommonTokenStream tokens = new CommonTokenStream(lexer);

		//Instanciar o parser
		grmtParser parser = new grmtParser(tokens);

		ParseTree tree = parser.init();

		Tradutor tradutor = new Tradutor();

		ParseTreeWalker walker = new ParseTreeWalker();
		walker.walk(tradutor, tree);


	}
}