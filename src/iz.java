import java.io.FileInputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;

@SuppressWarnings( "deprecation" )
public class iz {

    
    public static void main(String[] args) {
        try {
            CharStream charStream = (CharStream) new ANTLRFileStream("test.iz");
	    //CharStream charStream = CharStreams.fromFileName("test.iz");
            izLexer lexer = new izLexer(charStream);
            izParser parser = new izParser(new CommonTokenStream(lexer));
            parser.addParseListener(new izCustomListener());
            parser.init();
        } catch (IOException ex) {
            Logger.getLogger(iz.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
    
}
