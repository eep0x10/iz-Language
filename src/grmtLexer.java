// Generated from grmt.g4 by ANTLR 4.10.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class grmtLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.10.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, BOOL_EXPR=17, 
		ID_EXPR=18, NUM_EXPR=19, FLT_EXPR=20, Ws=21;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "ID_LETTER", 
			"DIGIT", "BOOL_EXPR", "ID_EXPR", "NUM_EXPR", "FLT_EXPR", "Ws"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'if'", "'then'", "'while'", "'for'", "'&'", "'>'", "'<'", "'<='", 
			"'>='", "'=='", "'!='", "'+'", "'-'", "'*'", "'/'", "'='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, "BOOL_EXPR", "ID_EXPR", "NUM_EXPR", "FLT_EXPR", 
			"Ws"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}


	public grmtLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "grmt.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\u0004\u0000\u0015\u0093\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011"+
		"\u0002\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014"+
		"\u0002\u0015\u0007\u0015\u0002\u0016\u0007\u0016\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004"+
		"\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\n\u0001"+
		"\n\u0001\n\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\r\u0001\r\u0001"+
		"\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u0010\u0003\u0010_\b"+
		"\u0010\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0003"+
		"\u0012l\b\u0012\u0001\u0013\u0005\u0013o\b\u0013\n\u0013\f\u0013r\t\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0005\u0013w\b\u0013\n\u0013\f\u0013"+
		"z\t\u0013\u0001\u0014\u0004\u0014}\b\u0014\u000b\u0014\f\u0014~\u0001"+
		"\u0015\u0005\u0015\u0082\b\u0015\n\u0015\f\u0015\u0085\t\u0015\u0001\u0015"+
		"\u0001\u0015\u0004\u0015\u0089\b\u0015\u000b\u0015\f\u0015\u008a\u0001"+
		"\u0016\u0004\u0016\u008e\b\u0016\u000b\u0016\f\u0016\u008f\u0001\u0016"+
		"\u0001\u0016\u0000\u0000\u0017\u0001\u0001\u0003\u0002\u0005\u0003\u0007"+
		"\u0004\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b"+
		"\u0017\f\u0019\r\u001b\u000e\u001d\u000f\u001f\u0010!\u0000#\u0000%\u0011"+
		"\'\u0012)\u0013+\u0014-\u0015\u0001\u0000\u0004\u0003\u0000AZ__az\u0001"+
		"\u000009\u0001\u0000..\u0003\u0000\t\n\r\r  \u0098\u0000\u0001\u0001\u0000"+
		"\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000"+
		"\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000"+
		"\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000"+
		"\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000"+
		"\u0000\u0013\u0001\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000\u0000"+
		"\u0000\u0017\u0001\u0000\u0000\u0000\u0000\u0019\u0001\u0000\u0000\u0000"+
		"\u0000\u001b\u0001\u0000\u0000\u0000\u0000\u001d\u0001\u0000\u0000\u0000"+
		"\u0000\u001f\u0001\u0000\u0000\u0000\u0000%\u0001\u0000\u0000\u0000\u0000"+
		"\'\u0001\u0000\u0000\u0000\u0000)\u0001\u0000\u0000\u0000\u0000+\u0001"+
		"\u0000\u0000\u0000\u0000-\u0001\u0000\u0000\u0000\u0001/\u0001\u0000\u0000"+
		"\u0000\u00032\u0001\u0000\u0000\u0000\u00057\u0001\u0000\u0000\u0000\u0007"+
		"=\u0001\u0000\u0000\u0000\tA\u0001\u0000\u0000\u0000\u000bC\u0001\u0000"+
		"\u0000\u0000\rE\u0001\u0000\u0000\u0000\u000fG\u0001\u0000\u0000\u0000"+
		"\u0011J\u0001\u0000\u0000\u0000\u0013M\u0001\u0000\u0000\u0000\u0015P"+
		"\u0001\u0000\u0000\u0000\u0017S\u0001\u0000\u0000\u0000\u0019U\u0001\u0000"+
		"\u0000\u0000\u001bW\u0001\u0000\u0000\u0000\u001dY\u0001\u0000\u0000\u0000"+
		"\u001f[\u0001\u0000\u0000\u0000!^\u0001\u0000\u0000\u0000#`\u0001\u0000"+
		"\u0000\u0000%k\u0001\u0000\u0000\u0000\'p\u0001\u0000\u0000\u0000)|\u0001"+
		"\u0000\u0000\u0000+\u0083\u0001\u0000\u0000\u0000-\u008d\u0001\u0000\u0000"+
		"\u0000/0\u0005i\u0000\u000001\u0005f\u0000\u00001\u0002\u0001\u0000\u0000"+
		"\u000023\u0005t\u0000\u000034\u0005h\u0000\u000045\u0005e\u0000\u0000"+
		"56\u0005n\u0000\u00006\u0004\u0001\u0000\u0000\u000078\u0005w\u0000\u0000"+
		"89\u0005h\u0000\u00009:\u0005i\u0000\u0000:;\u0005l\u0000\u0000;<\u0005"+
		"e\u0000\u0000<\u0006\u0001\u0000\u0000\u0000=>\u0005f\u0000\u0000>?\u0005"+
		"o\u0000\u0000?@\u0005r\u0000\u0000@\b\u0001\u0000\u0000\u0000AB\u0005"+
		"&\u0000\u0000B\n\u0001\u0000\u0000\u0000CD\u0005>\u0000\u0000D\f\u0001"+
		"\u0000\u0000\u0000EF\u0005<\u0000\u0000F\u000e\u0001\u0000\u0000\u0000"+
		"GH\u0005<\u0000\u0000HI\u0005=\u0000\u0000I\u0010\u0001\u0000\u0000\u0000"+
		"JK\u0005>\u0000\u0000KL\u0005=\u0000\u0000L\u0012\u0001\u0000\u0000\u0000"+
		"MN\u0005=\u0000\u0000NO\u0005=\u0000\u0000O\u0014\u0001\u0000\u0000\u0000"+
		"PQ\u0005!\u0000\u0000QR\u0005=\u0000\u0000R\u0016\u0001\u0000\u0000\u0000"+
		"ST\u0005+\u0000\u0000T\u0018\u0001\u0000\u0000\u0000UV\u0005-\u0000\u0000"+
		"V\u001a\u0001\u0000\u0000\u0000WX\u0005*\u0000\u0000X\u001c\u0001\u0000"+
		"\u0000\u0000YZ\u0005/\u0000\u0000Z\u001e\u0001\u0000\u0000\u0000[\\\u0005"+
		"=\u0000\u0000\\ \u0001\u0000\u0000\u0000]_\u0007\u0000\u0000\u0000^]\u0001"+
		"\u0000\u0000\u0000_\"\u0001\u0000\u0000\u0000`a\u0007\u0001\u0000\u0000"+
		"a$\u0001\u0000\u0000\u0000bc\u0005t\u0000\u0000cd\u0005r\u0000\u0000d"+
		"e\u0005u\u0000\u0000el\u0005e\u0000\u0000fg\u0005f\u0000\u0000gh\u0005"+
		"a\u0000\u0000hi\u0005l\u0000\u0000ij\u0005s\u0000\u0000jl\u0005e\u0000"+
		"\u0000kb\u0001\u0000\u0000\u0000kf\u0001\u0000\u0000\u0000l&\u0001\u0000"+
		"\u0000\u0000mo\u0003#\u0011\u0000nm\u0001\u0000\u0000\u0000or\u0001\u0000"+
		"\u0000\u0000pn\u0001\u0000\u0000\u0000pq\u0001\u0000\u0000\u0000qs\u0001"+
		"\u0000\u0000\u0000rp\u0001\u0000\u0000\u0000sx\u0003!\u0010\u0000tw\u0003"+
		"!\u0010\u0000uw\u0003#\u0011\u0000vt\u0001\u0000\u0000\u0000vu\u0001\u0000"+
		"\u0000\u0000wz\u0001\u0000\u0000\u0000xv\u0001\u0000\u0000\u0000xy\u0001"+
		"\u0000\u0000\u0000y(\u0001\u0000\u0000\u0000zx\u0001\u0000\u0000\u0000"+
		"{}\u0003#\u0011\u0000|{\u0001\u0000\u0000\u0000}~\u0001\u0000\u0000\u0000"+
		"~|\u0001\u0000\u0000\u0000~\u007f\u0001\u0000\u0000\u0000\u007f*\u0001"+
		"\u0000\u0000\u0000\u0080\u0082\u0003#\u0011\u0000\u0081\u0080\u0001\u0000"+
		"\u0000\u0000\u0082\u0085\u0001\u0000\u0000\u0000\u0083\u0081\u0001\u0000"+
		"\u0000\u0000\u0083\u0084\u0001\u0000\u0000\u0000\u0084\u0088\u0001\u0000"+
		"\u0000\u0000\u0085\u0083\u0001\u0000\u0000\u0000\u0086\u0087\u0007\u0002"+
		"\u0000\u0000\u0087\u0089\u0003#\u0011\u0000\u0088\u0086\u0001\u0000\u0000"+
		"\u0000\u0089\u008a\u0001\u0000\u0000\u0000\u008a\u0088\u0001\u0000\u0000"+
		"\u0000\u008a\u008b\u0001\u0000\u0000\u0000\u008b,\u0001\u0000\u0000\u0000"+
		"\u008c\u008e\u0007\u0003\u0000\u0000\u008d\u008c\u0001\u0000\u0000\u0000"+
		"\u008e\u008f\u0001\u0000\u0000\u0000\u008f\u008d\u0001\u0000\u0000\u0000"+
		"\u008f\u0090\u0001\u0000\u0000\u0000\u0090\u0091\u0001\u0000\u0000\u0000"+
		"\u0091\u0092\u0006\u0016\u0000\u0000\u0092.\u0001\u0000\u0000\u0000\n"+
		"\u0000^kpvx~\u0083\u008a\u008f\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}