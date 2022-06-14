// Generated from grmt.g4 by ANTLR 4.10.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class grmtParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.10.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, BOOL_EXPR=20, ID_EXPR=21, NUM_EXPR=22, FLT_EXPR=23, 
		Ws=24;
	public static final int
		RULE_init = 0, RULE_print = 1, RULE_input = 2, RULE_ifthen = 3, RULE_else = 4, 
		RULE_whilethen = 5, RULE_forthen = 6, RULE_forcomp = 7, RULE_add_min = 8, 
		RULE_p_virg = 9, RULE_expressao = 10, RULE_comp = 11, RULE_op_comp = 12, 
		RULE_calc = 13, RULE_op_calc = 14, RULE_atrib = 15, RULE_op_atrib = 16, 
		RULE_number = 17, RULE_var_types = 18, RULE_bool = 19, RULE_id = 20, RULE_str = 21, 
		RULE_num = 22, RULE_flt = 23;
	private static String[] makeRuleNames() {
		return new String[] {
			"init", "print", "input", "ifthen", "else", "whilethen", "forthen", "forcomp", 
			"add_min", "p_virg", "expressao", "comp", "op_comp", "calc", "op_calc", 
			"atrib", "op_atrib", "number", "var_types", "bool", "id", "str", "num", 
			"flt"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'print'", "'input'", "'if'", "'else'", "'while'", "'for'", "'+'", 
			"'-'", "';'", "'then'", "'>'", "'<'", "'<='", "'>='", "'=='", "'!='", 
			"'*'", "'/'", "'='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, "BOOL_EXPR", "ID_EXPR", 
			"NUM_EXPR", "FLT_EXPR", "Ws"
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

	@Override
	public String getGrammarFileName() { return "grmt.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public grmtParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class InitContext extends ParserRuleContext {
		public List<IfthenContext> ifthen() {
			return getRuleContexts(IfthenContext.class);
		}
		public IfthenContext ifthen(int i) {
			return getRuleContext(IfthenContext.class,i);
		}
		public List<WhilethenContext> whilethen() {
			return getRuleContexts(WhilethenContext.class);
		}
		public WhilethenContext whilethen(int i) {
			return getRuleContext(WhilethenContext.class,i);
		}
		public List<ForthenContext> forthen() {
			return getRuleContexts(ForthenContext.class);
		}
		public ForthenContext forthen(int i) {
			return getRuleContext(ForthenContext.class,i);
		}
		public List<AtribContext> atrib() {
			return getRuleContexts(AtribContext.class);
		}
		public AtribContext atrib(int i) {
			return getRuleContext(AtribContext.class,i);
		}
		public List<CalcContext> calc() {
			return getRuleContexts(CalcContext.class);
		}
		public CalcContext calc(int i) {
			return getRuleContext(CalcContext.class,i);
		}
		public List<CompContext> comp() {
			return getRuleContexts(CompContext.class);
		}
		public CompContext comp(int i) {
			return getRuleContext(CompContext.class,i);
		}
		public List<PrintContext> print() {
			return getRuleContexts(PrintContext.class);
		}
		public PrintContext print(int i) {
			return getRuleContext(PrintContext.class,i);
		}
		public List<ElseContext> else_() {
			return getRuleContexts(ElseContext.class);
		}
		public ElseContext else_(int i) {
			return getRuleContext(ElseContext.class,i);
		}
		public InitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_init; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grmtListener ) ((grmtListener)listener).enterInit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grmtListener ) ((grmtListener)listener).exitInit(this);
		}
	}

	public final InitContext init() throws RecognitionException {
		InitContext _localctx = new InitContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_init);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(58);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << ID_EXPR) | (1L << NUM_EXPR) | (1L << FLT_EXPR))) != 0)) {
				{
				setState(56);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
				case 1:
					{
					setState(48);
					ifthen();
					}
					break;
				case 2:
					{
					setState(49);
					whilethen();
					}
					break;
				case 3:
					{
					setState(50);
					forthen();
					}
					break;
				case 4:
					{
					setState(51);
					atrib();
					}
					break;
				case 5:
					{
					setState(52);
					calc();
					}
					break;
				case 6:
					{
					setState(53);
					comp();
					}
					break;
				case 7:
					{
					setState(54);
					print();
					}
					break;
				case 8:
					{
					setState(55);
					else_();
					}
					break;
				}
				}
				setState(60);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrintContext extends ParserRuleContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public PrintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grmtListener ) ((grmtListener)listener).enterPrint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grmtListener ) ((grmtListener)listener).exitPrint(this);
		}
	}

	public final PrintContext print() throws RecognitionException {
		PrintContext _localctx = new PrintContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_print);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(61);
			match(T__0);
			setState(62);
			id();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InputContext extends ParserRuleContext {
		public InputContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_input; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grmtListener ) ((grmtListener)listener).enterInput(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grmtListener ) ((grmtListener)listener).exitInput(this);
		}
	}

	public final InputContext input() throws RecognitionException {
		InputContext _localctx = new InputContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_input);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(64);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IfthenContext extends ParserRuleContext {
		public CompContext comp() {
			return getRuleContext(CompContext.class,0);
		}
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public IfthenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifthen; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grmtListener ) ((grmtListener)listener).enterIfthen(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grmtListener ) ((grmtListener)listener).exitIfthen(this);
		}
	}

	public final IfthenContext ifthen() throws RecognitionException {
		IfthenContext _localctx = new IfthenContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_ifthen);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(66);
			match(T__2);
			setState(67);
			comp();
			setState(68);
			expressao();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElseContext extends ParserRuleContext {
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public ElseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_else; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grmtListener ) ((grmtListener)listener).enterElse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grmtListener ) ((grmtListener)listener).exitElse(this);
		}
	}

	public final ElseContext else_() throws RecognitionException {
		ElseContext _localctx = new ElseContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_else);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(70);
			match(T__3);
			setState(71);
			expressao();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WhilethenContext extends ParserRuleContext {
		public CompContext comp() {
			return getRuleContext(CompContext.class,0);
		}
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public WhilethenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whilethen; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grmtListener ) ((grmtListener)listener).enterWhilethen(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grmtListener ) ((grmtListener)listener).exitWhilethen(this);
		}
	}

	public final WhilethenContext whilethen() throws RecognitionException {
		WhilethenContext _localctx = new WhilethenContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_whilethen);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(73);
			match(T__4);
			setState(74);
			comp();
			setState(75);
			expressao();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForthenContext extends ParserRuleContext {
		public ForcompContext forcomp() {
			return getRuleContext(ForcompContext.class,0);
		}
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public ForthenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forthen; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grmtListener ) ((grmtListener)listener).enterForthen(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grmtListener ) ((grmtListener)listener).exitForthen(this);
		}
	}

	public final ForthenContext forthen() throws RecognitionException {
		ForthenContext _localctx = new ForthenContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_forthen);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(77);
			match(T__5);
			setState(78);
			forcomp();
			setState(79);
			expressao();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForcompContext extends ParserRuleContext {
		public List<IdContext> id() {
			return getRuleContexts(IdContext.class);
		}
		public IdContext id(int i) {
			return getRuleContext(IdContext.class,i);
		}
		public Op_atribContext op_atrib() {
			return getRuleContext(Op_atribContext.class,0);
		}
		public List<P_virgContext> p_virg() {
			return getRuleContexts(P_virgContext.class);
		}
		public P_virgContext p_virg(int i) {
			return getRuleContext(P_virgContext.class,i);
		}
		public Op_compContext op_comp() {
			return getRuleContext(Op_compContext.class,0);
		}
		public List<Add_minContext> add_min() {
			return getRuleContexts(Add_minContext.class);
		}
		public Add_minContext add_min(int i) {
			return getRuleContext(Add_minContext.class,i);
		}
		public Var_typesContext var_types() {
			return getRuleContext(Var_typesContext.class,0);
		}
		public CalcContext calc() {
			return getRuleContext(CalcContext.class,0);
		}
		public InputContext input() {
			return getRuleContext(InputContext.class,0);
		}
		public List<NumberContext> number() {
			return getRuleContexts(NumberContext.class);
		}
		public NumberContext number(int i) {
			return getRuleContext(NumberContext.class,i);
		}
		public ForcompContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forcomp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grmtListener ) ((grmtListener)listener).enterForcomp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grmtListener ) ((grmtListener)listener).exitForcomp(this);
		}
	}

	public final ForcompContext forcomp() throws RecognitionException {
		ForcompContext _localctx = new ForcompContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_forcomp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(81);
			id();
			setState(82);
			op_atrib();
			setState(86);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				setState(83);
				var_types();
				}
				break;
			case 2:
				{
				setState(84);
				calc();
				}
				break;
			case 3:
				{
				setState(85);
				input();
				}
				break;
			}
			setState(88);
			p_virg();
			setState(91);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUM_EXPR:
			case FLT_EXPR:
				{
				setState(89);
				number();
				}
				break;
			case ID_EXPR:
				{
				setState(90);
				id();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(93);
			op_comp();
			setState(96);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUM_EXPR:
			case FLT_EXPR:
				{
				setState(94);
				number();
				}
				break;
			case ID_EXPR:
				{
				setState(95);
				id();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(98);
			p_virg();
			{
			setState(99);
			id();
			}
			setState(100);
			add_min();
			setState(101);
			add_min();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Add_minContext extends ParserRuleContext {
		public Add_minContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_add_min; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grmtListener ) ((grmtListener)listener).enterAdd_min(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grmtListener ) ((grmtListener)listener).exitAdd_min(this);
		}
	}

	public final Add_minContext add_min() throws RecognitionException {
		Add_minContext _localctx = new Add_minContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_add_min);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(103);
			_la = _input.LA(1);
			if ( !(_la==T__6 || _la==T__7) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class P_virgContext extends ParserRuleContext {
		public P_virgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_p_virg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grmtListener ) ((grmtListener)listener).enterP_virg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grmtListener ) ((grmtListener)listener).exitP_virg(this);
		}
	}

	public final P_virgContext p_virg() throws RecognitionException {
		P_virgContext _localctx = new P_virgContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_p_virg);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(105);
			match(T__8);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressaoContext extends ParserRuleContext {
		public List<PrintContext> print() {
			return getRuleContexts(PrintContext.class);
		}
		public PrintContext print(int i) {
			return getRuleContext(PrintContext.class,i);
		}
		public List<AtribContext> atrib() {
			return getRuleContexts(AtribContext.class);
		}
		public AtribContext atrib(int i) {
			return getRuleContext(AtribContext.class,i);
		}
		public List<IfthenContext> ifthen() {
			return getRuleContexts(IfthenContext.class);
		}
		public IfthenContext ifthen(int i) {
			return getRuleContext(IfthenContext.class,i);
		}
		public List<WhilethenContext> whilethen() {
			return getRuleContexts(WhilethenContext.class);
		}
		public WhilethenContext whilethen(int i) {
			return getRuleContext(WhilethenContext.class,i);
		}
		public List<ForthenContext> forthen() {
			return getRuleContexts(ForthenContext.class);
		}
		public ForthenContext forthen(int i) {
			return getRuleContext(ForthenContext.class,i);
		}
		public List<CalcContext> calc() {
			return getRuleContexts(CalcContext.class);
		}
		public CalcContext calc(int i) {
			return getRuleContext(CalcContext.class,i);
		}
		public List<CompContext> comp() {
			return getRuleContexts(CompContext.class);
		}
		public CompContext comp(int i) {
			return getRuleContext(CompContext.class,i);
		}
		public ExpressaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grmtListener ) ((grmtListener)listener).enterExpressao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grmtListener ) ((grmtListener)listener).exitExpressao(this);
		}
	}

	public final ExpressaoContext expressao() throws RecognitionException {
		ExpressaoContext _localctx = new ExpressaoContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_expressao);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(107);
			match(T__9);
			setState(117);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(115);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
					case 1:
						{
						setState(108);
						print();
						}
						break;
					case 2:
						{
						setState(109);
						atrib();
						}
						break;
					case 3:
						{
						setState(110);
						ifthen();
						}
						break;
					case 4:
						{
						setState(111);
						whilethen();
						}
						break;
					case 5:
						{
						setState(112);
						forthen();
						}
						break;
					case 6:
						{
						setState(113);
						calc();
						}
						break;
					case 7:
						{
						setState(114);
						comp();
						}
						break;
					}
					} 
				}
				setState(119);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CompContext extends ParserRuleContext {
		public Op_compContext op_comp() {
			return getRuleContext(Op_compContext.class,0);
		}
		public List<NumberContext> number() {
			return getRuleContexts(NumberContext.class);
		}
		public NumberContext number(int i) {
			return getRuleContext(NumberContext.class,i);
		}
		public List<IdContext> id() {
			return getRuleContexts(IdContext.class);
		}
		public IdContext id(int i) {
			return getRuleContext(IdContext.class,i);
		}
		public CompContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grmtListener ) ((grmtListener)listener).enterComp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grmtListener ) ((grmtListener)listener).exitComp(this);
		}
	}

	public final CompContext comp() throws RecognitionException {
		CompContext _localctx = new CompContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_comp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(122);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUM_EXPR:
			case FLT_EXPR:
				{
				setState(120);
				number();
				}
				break;
			case ID_EXPR:
				{
				setState(121);
				id();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(124);
			op_comp();
			setState(127);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUM_EXPR:
			case FLT_EXPR:
				{
				setState(125);
				number();
				}
				break;
			case ID_EXPR:
				{
				setState(126);
				id();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Op_compContext extends ParserRuleContext {
		public Op_compContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op_comp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grmtListener ) ((grmtListener)listener).enterOp_comp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grmtListener ) ((grmtListener)listener).exitOp_comp(this);
		}
	}

	public final Op_compContext op_comp() throws RecognitionException {
		Op_compContext _localctx = new Op_compContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_op_comp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(129);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CalcContext extends ParserRuleContext {
		public Op_calcContext op_calc() {
			return getRuleContext(Op_calcContext.class,0);
		}
		public List<NumberContext> number() {
			return getRuleContexts(NumberContext.class);
		}
		public NumberContext number(int i) {
			return getRuleContext(NumberContext.class,i);
		}
		public List<IdContext> id() {
			return getRuleContexts(IdContext.class);
		}
		public IdContext id(int i) {
			return getRuleContext(IdContext.class,i);
		}
		public CalcContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_calc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grmtListener ) ((grmtListener)listener).enterCalc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grmtListener ) ((grmtListener)listener).exitCalc(this);
		}
	}

	public final CalcContext calc() throws RecognitionException {
		CalcContext _localctx = new CalcContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_calc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(133);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUM_EXPR:
			case FLT_EXPR:
				{
				setState(131);
				number();
				}
				break;
			case ID_EXPR:
				{
				setState(132);
				id();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(135);
			op_calc();
			setState(138);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUM_EXPR:
			case FLT_EXPR:
				{
				setState(136);
				number();
				}
				break;
			case ID_EXPR:
				{
				setState(137);
				id();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Op_calcContext extends ParserRuleContext {
		public Op_calcContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op_calc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grmtListener ) ((grmtListener)listener).enterOp_calc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grmtListener ) ((grmtListener)listener).exitOp_calc(this);
		}
	}

	public final Op_calcContext op_calc() throws RecognitionException {
		Op_calcContext _localctx = new Op_calcContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_op_calc);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(140);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__7) | (1L << T__16) | (1L << T__17))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AtribContext extends ParserRuleContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public Op_atribContext op_atrib() {
			return getRuleContext(Op_atribContext.class,0);
		}
		public Var_typesContext var_types() {
			return getRuleContext(Var_typesContext.class,0);
		}
		public CalcContext calc() {
			return getRuleContext(CalcContext.class,0);
		}
		public InputContext input() {
			return getRuleContext(InputContext.class,0);
		}
		public AtribContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atrib; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grmtListener ) ((grmtListener)listener).enterAtrib(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grmtListener ) ((grmtListener)listener).exitAtrib(this);
		}
	}

	public final AtribContext atrib() throws RecognitionException {
		AtribContext _localctx = new AtribContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_atrib);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(142);
			id();
			setState(143);
			op_atrib();
			setState(147);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				setState(144);
				var_types();
				}
				break;
			case 2:
				{
				setState(145);
				calc();
				}
				break;
			case 3:
				{
				setState(146);
				input();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Op_atribContext extends ParserRuleContext {
		public Op_atribContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op_atrib; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grmtListener ) ((grmtListener)listener).enterOp_atrib(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grmtListener ) ((grmtListener)listener).exitOp_atrib(this);
		}
	}

	public final Op_atribContext op_atrib() throws RecognitionException {
		Op_atribContext _localctx = new Op_atribContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_op_atrib);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(149);
			match(T__18);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NumberContext extends ParserRuleContext {
		public NumContext num() {
			return getRuleContext(NumContext.class,0);
		}
		public FltContext flt() {
			return getRuleContext(FltContext.class,0);
		}
		public NumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grmtListener ) ((grmtListener)listener).enterNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grmtListener ) ((grmtListener)listener).exitNumber(this);
		}
	}

	public final NumberContext number() throws RecognitionException {
		NumberContext _localctx = new NumberContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_number);
		try {
			setState(153);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUM_EXPR:
				enterOuterAlt(_localctx, 1);
				{
				setState(151);
				num();
				}
				break;
			case FLT_EXPR:
				enterOuterAlt(_localctx, 2);
				{
				setState(152);
				flt();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Var_typesContext extends ParserRuleContext {
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public StrContext str() {
			return getRuleContext(StrContext.class,0);
		}
		public BoolContext bool() {
			return getRuleContext(BoolContext.class,0);
		}
		public Var_typesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_types; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grmtListener ) ((grmtListener)listener).enterVar_types(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grmtListener ) ((grmtListener)listener).exitVar_types(this);
		}
	}

	public final Var_typesContext var_types() throws RecognitionException {
		Var_typesContext _localctx = new Var_typesContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_var_types);
		try {
			setState(158);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUM_EXPR:
			case FLT_EXPR:
				enterOuterAlt(_localctx, 1);
				{
				setState(155);
				number();
				}
				break;
			case ID_EXPR:
				enterOuterAlt(_localctx, 2);
				{
				setState(156);
				str();
				}
				break;
			case BOOL_EXPR:
				enterOuterAlt(_localctx, 3);
				{
				setState(157);
				bool();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BoolContext extends ParserRuleContext {
		public TerminalNode BOOL_EXPR() { return getToken(grmtParser.BOOL_EXPR, 0); }
		public BoolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grmtListener ) ((grmtListener)listener).enterBool(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grmtListener ) ((grmtListener)listener).exitBool(this);
		}
	}

	public final BoolContext bool() throws RecognitionException {
		BoolContext _localctx = new BoolContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_bool);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(160);
			match(BOOL_EXPR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdContext extends ParserRuleContext {
		public TerminalNode ID_EXPR() { return getToken(grmtParser.ID_EXPR, 0); }
		public IdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_id; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grmtListener ) ((grmtListener)listener).enterId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grmtListener ) ((grmtListener)listener).exitId(this);
		}
	}

	public final IdContext id() throws RecognitionException {
		IdContext _localctx = new IdContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_id);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(162);
			match(ID_EXPR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StrContext extends ParserRuleContext {
		public TerminalNode ID_EXPR() { return getToken(grmtParser.ID_EXPR, 0); }
		public StrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_str; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grmtListener ) ((grmtListener)listener).enterStr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grmtListener ) ((grmtListener)listener).exitStr(this);
		}
	}

	public final StrContext str() throws RecognitionException {
		StrContext _localctx = new StrContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_str);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(164);
			match(ID_EXPR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NumContext extends ParserRuleContext {
		public TerminalNode NUM_EXPR() { return getToken(grmtParser.NUM_EXPR, 0); }
		public NumContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_num; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grmtListener ) ((grmtListener)listener).enterNum(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grmtListener ) ((grmtListener)listener).exitNum(this);
		}
	}

	public final NumContext num() throws RecognitionException {
		NumContext _localctx = new NumContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_num);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(166);
			match(NUM_EXPR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FltContext extends ParserRuleContext {
		public TerminalNode FLT_EXPR() { return getToken(grmtParser.FLT_EXPR, 0); }
		public FltContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_flt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grmtListener ) ((grmtListener)listener).enterFlt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grmtListener ) ((grmtListener)listener).exitFlt(this);
		}
	}

	public final FltContext flt() throws RecognitionException {
		FltContext _localctx = new FltContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_flt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(168);
			match(FLT_EXPR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u0018\u00ab\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007"+
		"\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007"+
		"\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007"+
		"\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0005\u00009\b\u0000\n\u0000\f\u0000<\t\u0000\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003"+
		"\u0007W\b\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007\\\b\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007a\b\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001"+
		"\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0005\nt\b\n\n\n\f\nw\t\n\u0001\u000b\u0001\u000b\u0003\u000b{\b\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0003\u000b\u0080\b\u000b\u0001\f"+
		"\u0001\f\u0001\r\u0001\r\u0003\r\u0086\b\r\u0001\r\u0001\r\u0001\r\u0003"+
		"\r\u008b\b\r\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0003\u000f\u0094\b\u000f\u0001\u0010\u0001\u0010"+
		"\u0001\u0011\u0001\u0011\u0003\u0011\u009a\b\u0011\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0003\u0012\u009f\b\u0012\u0001\u0013\u0001\u0013\u0001\u0014"+
		"\u0001\u0014\u0001\u0015\u0001\u0015\u0001\u0016\u0001\u0016\u0001\u0017"+
		"\u0001\u0017\u0001\u0017\u0000\u0000\u0018\u0000\u0002\u0004\u0006\b\n"+
		"\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.\u0000"+
		"\u0003\u0001\u0000\u0007\b\u0001\u0000\u000b\u0010\u0002\u0000\u0007\b"+
		"\u0011\u0012\u00ae\u0000:\u0001\u0000\u0000\u0000\u0002=\u0001\u0000\u0000"+
		"\u0000\u0004@\u0001\u0000\u0000\u0000\u0006B\u0001\u0000\u0000\u0000\b"+
		"F\u0001\u0000\u0000\u0000\nI\u0001\u0000\u0000\u0000\fM\u0001\u0000\u0000"+
		"\u0000\u000eQ\u0001\u0000\u0000\u0000\u0010g\u0001\u0000\u0000\u0000\u0012"+
		"i\u0001\u0000\u0000\u0000\u0014k\u0001\u0000\u0000\u0000\u0016z\u0001"+
		"\u0000\u0000\u0000\u0018\u0081\u0001\u0000\u0000\u0000\u001a\u0085\u0001"+
		"\u0000\u0000\u0000\u001c\u008c\u0001\u0000\u0000\u0000\u001e\u008e\u0001"+
		"\u0000\u0000\u0000 \u0095\u0001\u0000\u0000\u0000\"\u0099\u0001\u0000"+
		"\u0000\u0000$\u009e\u0001\u0000\u0000\u0000&\u00a0\u0001\u0000\u0000\u0000"+
		"(\u00a2\u0001\u0000\u0000\u0000*\u00a4\u0001\u0000\u0000\u0000,\u00a6"+
		"\u0001\u0000\u0000\u0000.\u00a8\u0001\u0000\u0000\u000009\u0003\u0006"+
		"\u0003\u000019\u0003\n\u0005\u000029\u0003\f\u0006\u000039\u0003\u001e"+
		"\u000f\u000049\u0003\u001a\r\u000059\u0003\u0016\u000b\u000069\u0003\u0002"+
		"\u0001\u000079\u0003\b\u0004\u000080\u0001\u0000\u0000\u000081\u0001\u0000"+
		"\u0000\u000082\u0001\u0000\u0000\u000083\u0001\u0000\u0000\u000084\u0001"+
		"\u0000\u0000\u000085\u0001\u0000\u0000\u000086\u0001\u0000\u0000\u0000"+
		"87\u0001\u0000\u0000\u00009<\u0001\u0000\u0000\u0000:8\u0001\u0000\u0000"+
		"\u0000:;\u0001\u0000\u0000\u0000;\u0001\u0001\u0000\u0000\u0000<:\u0001"+
		"\u0000\u0000\u0000=>\u0005\u0001\u0000\u0000>?\u0003(\u0014\u0000?\u0003"+
		"\u0001\u0000\u0000\u0000@A\u0005\u0002\u0000\u0000A\u0005\u0001\u0000"+
		"\u0000\u0000BC\u0005\u0003\u0000\u0000CD\u0003\u0016\u000b\u0000DE\u0003"+
		"\u0014\n\u0000E\u0007\u0001\u0000\u0000\u0000FG\u0005\u0004\u0000\u0000"+
		"GH\u0003\u0014\n\u0000H\t\u0001\u0000\u0000\u0000IJ\u0005\u0005\u0000"+
		"\u0000JK\u0003\u0016\u000b\u0000KL\u0003\u0014\n\u0000L\u000b\u0001\u0000"+
		"\u0000\u0000MN\u0005\u0006\u0000\u0000NO\u0003\u000e\u0007\u0000OP\u0003"+
		"\u0014\n\u0000P\r\u0001\u0000\u0000\u0000QR\u0003(\u0014\u0000RV\u0003"+
		" \u0010\u0000SW\u0003$\u0012\u0000TW\u0003\u001a\r\u0000UW\u0003\u0004"+
		"\u0002\u0000VS\u0001\u0000\u0000\u0000VT\u0001\u0000\u0000\u0000VU\u0001"+
		"\u0000\u0000\u0000WX\u0001\u0000\u0000\u0000X[\u0003\u0012\t\u0000Y\\"+
		"\u0003\"\u0011\u0000Z\\\u0003(\u0014\u0000[Y\u0001\u0000\u0000\u0000["+
		"Z\u0001\u0000\u0000\u0000\\]\u0001\u0000\u0000\u0000]`\u0003\u0018\f\u0000"+
		"^a\u0003\"\u0011\u0000_a\u0003(\u0014\u0000`^\u0001\u0000\u0000\u0000"+
		"`_\u0001\u0000\u0000\u0000ab\u0001\u0000\u0000\u0000bc\u0003\u0012\t\u0000"+
		"cd\u0003(\u0014\u0000de\u0003\u0010\b\u0000ef\u0003\u0010\b\u0000f\u000f"+
		"\u0001\u0000\u0000\u0000gh\u0007\u0000\u0000\u0000h\u0011\u0001\u0000"+
		"\u0000\u0000ij\u0005\t\u0000\u0000j\u0013\u0001\u0000\u0000\u0000ku\u0005"+
		"\n\u0000\u0000lt\u0003\u0002\u0001\u0000mt\u0003\u001e\u000f\u0000nt\u0003"+
		"\u0006\u0003\u0000ot\u0003\n\u0005\u0000pt\u0003\f\u0006\u0000qt\u0003"+
		"\u001a\r\u0000rt\u0003\u0016\u000b\u0000sl\u0001\u0000\u0000\u0000sm\u0001"+
		"\u0000\u0000\u0000sn\u0001\u0000\u0000\u0000so\u0001\u0000\u0000\u0000"+
		"sp\u0001\u0000\u0000\u0000sq\u0001\u0000\u0000\u0000sr\u0001\u0000\u0000"+
		"\u0000tw\u0001\u0000\u0000\u0000us\u0001\u0000\u0000\u0000uv\u0001\u0000"+
		"\u0000\u0000v\u0015\u0001\u0000\u0000\u0000wu\u0001\u0000\u0000\u0000"+
		"x{\u0003\"\u0011\u0000y{\u0003(\u0014\u0000zx\u0001\u0000\u0000\u0000"+
		"zy\u0001\u0000\u0000\u0000{|\u0001\u0000\u0000\u0000|\u007f\u0003\u0018"+
		"\f\u0000}\u0080\u0003\"\u0011\u0000~\u0080\u0003(\u0014\u0000\u007f}\u0001"+
		"\u0000\u0000\u0000\u007f~\u0001\u0000\u0000\u0000\u0080\u0017\u0001\u0000"+
		"\u0000\u0000\u0081\u0082\u0007\u0001\u0000\u0000\u0082\u0019\u0001\u0000"+
		"\u0000\u0000\u0083\u0086\u0003\"\u0011\u0000\u0084\u0086\u0003(\u0014"+
		"\u0000\u0085\u0083\u0001\u0000\u0000\u0000\u0085\u0084\u0001\u0000\u0000"+
		"\u0000\u0086\u0087\u0001\u0000\u0000\u0000\u0087\u008a\u0003\u001c\u000e"+
		"\u0000\u0088\u008b\u0003\"\u0011\u0000\u0089\u008b\u0003(\u0014\u0000"+
		"\u008a\u0088\u0001\u0000\u0000\u0000\u008a\u0089\u0001\u0000\u0000\u0000"+
		"\u008b\u001b\u0001\u0000\u0000\u0000\u008c\u008d\u0007\u0002\u0000\u0000"+
		"\u008d\u001d\u0001\u0000\u0000\u0000\u008e\u008f\u0003(\u0014\u0000\u008f"+
		"\u0093\u0003 \u0010\u0000\u0090\u0094\u0003$\u0012\u0000\u0091\u0094\u0003"+
		"\u001a\r\u0000\u0092\u0094\u0003\u0004\u0002\u0000\u0093\u0090\u0001\u0000"+
		"\u0000\u0000\u0093\u0091\u0001\u0000\u0000\u0000\u0093\u0092\u0001\u0000"+
		"\u0000\u0000\u0094\u001f\u0001\u0000\u0000\u0000\u0095\u0096\u0005\u0013"+
		"\u0000\u0000\u0096!\u0001\u0000\u0000\u0000\u0097\u009a\u0003,\u0016\u0000"+
		"\u0098\u009a\u0003.\u0017\u0000\u0099\u0097\u0001\u0000\u0000\u0000\u0099"+
		"\u0098\u0001\u0000\u0000\u0000\u009a#\u0001\u0000\u0000\u0000\u009b\u009f"+
		"\u0003\"\u0011\u0000\u009c\u009f\u0003*\u0015\u0000\u009d\u009f\u0003"+
		"&\u0013\u0000\u009e\u009b\u0001\u0000\u0000\u0000\u009e\u009c\u0001\u0000"+
		"\u0000\u0000\u009e\u009d\u0001\u0000\u0000\u0000\u009f%\u0001\u0000\u0000"+
		"\u0000\u00a0\u00a1\u0005\u0014\u0000\u0000\u00a1\'\u0001\u0000\u0000\u0000"+
		"\u00a2\u00a3\u0005\u0015\u0000\u0000\u00a3)\u0001\u0000\u0000\u0000\u00a4"+
		"\u00a5\u0005\u0015\u0000\u0000\u00a5+\u0001\u0000\u0000\u0000\u00a6\u00a7"+
		"\u0005\u0016\u0000\u0000\u00a7-\u0001\u0000\u0000\u0000\u00a8\u00a9\u0005"+
		"\u0017\u0000\u0000\u00a9/\u0001\u0000\u0000\u0000\u000e8:V[`suz\u007f"+
		"\u0085\u008a\u0093\u0099\u009e";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}