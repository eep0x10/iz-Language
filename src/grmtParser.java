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
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, BOOL_EXPR=17, 
		ID_EXPR=18, NUM_EXPR=19, FLT_EXPR=20, Ws=21;
	public static final int
		RULE_init = 0, RULE_ifthen = 1, RULE_whilethen = 2, RULE_forthen = 3, 
		RULE_comp = 4, RULE_op_comp = 5, RULE_calc = 6, RULE_op_calc = 7, RULE_atrib = 8, 
		RULE_number = 9, RULE_var_types = 10, RULE_bool = 11, RULE_id = 12, RULE_str = 13, 
		RULE_num = 14, RULE_flt = 15;
	private static String[] makeRuleNames() {
		return new String[] {
			"init", "ifthen", "whilethen", "forthen", "comp", "op_comp", "calc", 
			"op_calc", "atrib", "number", "var_types", "bool", "id", "str", "num", 
			"flt"
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
		public IfthenContext ifthen() {
			return getRuleContext(IfthenContext.class,0);
		}
		public WhilethenContext whilethen() {
			return getRuleContext(WhilethenContext.class,0);
		}
		public ForthenContext forthen() {
			return getRuleContext(ForthenContext.class,0);
		}
		public AtribContext atrib() {
			return getRuleContext(AtribContext.class,0);
		}
		public CalcContext calc() {
			return getRuleContext(CalcContext.class,0);
		}
		public CompContext comp() {
			return getRuleContext(CompContext.class,0);
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
		try {
			setState(38);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(32);
				ifthen();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(33);
				whilethen();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(34);
				forthen();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(35);
				atrib();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(36);
				calc();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(37);
				comp();
				}
				break;
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
		public AtribContext atrib() {
			return getRuleContext(AtribContext.class,0);
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
		enterRule(_localctx, 2, RULE_ifthen);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(40);
			match(T__0);
			setState(41);
			comp();
			setState(42);
			match(T__1);
			setState(43);
			atrib();
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
		public AtribContext atrib() {
			return getRuleContext(AtribContext.class,0);
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
		enterRule(_localctx, 4, RULE_whilethen);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(45);
			match(T__2);
			setState(46);
			comp();
			setState(47);
			match(T__1);
			setState(48);
			atrib();
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
		public List<CompContext> comp() {
			return getRuleContexts(CompContext.class);
		}
		public CompContext comp(int i) {
			return getRuleContext(CompContext.class,i);
		}
		public AtribContext atrib() {
			return getRuleContext(AtribContext.class,0);
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
		enterRule(_localctx, 6, RULE_forthen);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(50);
			match(T__3);
			setState(51);
			comp();
			setState(52);
			match(T__4);
			setState(56);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NUM_EXPR || _la==FLT_EXPR) {
				{
				{
				setState(53);
				comp();
				}
				}
				setState(58);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(59);
			match(T__1);
			setState(60);
			atrib();
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
		public List<NumberContext> number() {
			return getRuleContexts(NumberContext.class);
		}
		public NumberContext number(int i) {
			return getRuleContext(NumberContext.class,i);
		}
		public Op_compContext op_comp() {
			return getRuleContext(Op_compContext.class,0);
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
		enterRule(_localctx, 8, RULE_comp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(62);
			number();
			setState(63);
			op_comp();
			setState(64);
			number();
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
		enterRule(_localctx, 10, RULE_op_comp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(66);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10))) != 0)) ) {
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
		public List<NumberContext> number() {
			return getRuleContexts(NumberContext.class);
		}
		public NumberContext number(int i) {
			return getRuleContext(NumberContext.class,i);
		}
		public Op_calcContext op_calc() {
			return getRuleContext(Op_calcContext.class,0);
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
		enterRule(_localctx, 12, RULE_calc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(68);
			number();
			setState(69);
			op_calc();
			setState(70);
			number();
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
		enterRule(_localctx, 14, RULE_op_calc);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(72);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14))) != 0)) ) {
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
		public Var_typesContext var_types() {
			return getRuleContext(Var_typesContext.class,0);
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
		enterRule(_localctx, 16, RULE_atrib);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(74);
			id();
			setState(75);
			match(T__15);
			setState(76);
			var_types();
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
		enterRule(_localctx, 18, RULE_number);
		try {
			setState(80);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUM_EXPR:
				enterOuterAlt(_localctx, 1);
				{
				setState(78);
				num();
				}
				break;
			case FLT_EXPR:
				enterOuterAlt(_localctx, 2);
				{
				setState(79);
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
		enterRule(_localctx, 20, RULE_var_types);
		try {
			setState(85);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUM_EXPR:
			case FLT_EXPR:
				enterOuterAlt(_localctx, 1);
				{
				setState(82);
				number();
				}
				break;
			case ID_EXPR:
				enterOuterAlt(_localctx, 2);
				{
				setState(83);
				str();
				}
				break;
			case BOOL_EXPR:
				enterOuterAlt(_localctx, 3);
				{
				setState(84);
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
		enterRule(_localctx, 22, RULE_bool);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(87);
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
		enterRule(_localctx, 24, RULE_id);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(89);
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
		enterRule(_localctx, 26, RULE_str);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(91);
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
		enterRule(_localctx, 28, RULE_num);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(93);
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
		enterRule(_localctx, 30, RULE_flt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(95);
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
		"\u0004\u0001\u0015b\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0003\u0000\'\b\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0005\u00037\b\u0003"+
		"\n\u0003\f\u0003:\t\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\t\u0001\t\u0003\tQ\b\t\u0001\n\u0001\n\u0001"+
		"\n\u0003\nV\b\n\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\r\u0001"+
		"\r\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0000\u0000"+
		"\u0010\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018"+
		"\u001a\u001c\u001e\u0000\u0002\u0001\u0000\u0006\u000b\u0001\u0000\f\u000f"+
		"Z\u0000&\u0001\u0000\u0000\u0000\u0002(\u0001\u0000\u0000\u0000\u0004"+
		"-\u0001\u0000\u0000\u0000\u00062\u0001\u0000\u0000\u0000\b>\u0001\u0000"+
		"\u0000\u0000\nB\u0001\u0000\u0000\u0000\fD\u0001\u0000\u0000\u0000\u000e"+
		"H\u0001\u0000\u0000\u0000\u0010J\u0001\u0000\u0000\u0000\u0012P\u0001"+
		"\u0000\u0000\u0000\u0014U\u0001\u0000\u0000\u0000\u0016W\u0001\u0000\u0000"+
		"\u0000\u0018Y\u0001\u0000\u0000\u0000\u001a[\u0001\u0000\u0000\u0000\u001c"+
		"]\u0001\u0000\u0000\u0000\u001e_\u0001\u0000\u0000\u0000 \'\u0003\u0002"+
		"\u0001\u0000!\'\u0003\u0004\u0002\u0000\"\'\u0003\u0006\u0003\u0000#\'"+
		"\u0003\u0010\b\u0000$\'\u0003\f\u0006\u0000%\'\u0003\b\u0004\u0000& \u0001"+
		"\u0000\u0000\u0000&!\u0001\u0000\u0000\u0000&\"\u0001\u0000\u0000\u0000"+
		"&#\u0001\u0000\u0000\u0000&$\u0001\u0000\u0000\u0000&%\u0001\u0000\u0000"+
		"\u0000\'\u0001\u0001\u0000\u0000\u0000()\u0005\u0001\u0000\u0000)*\u0003"+
		"\b\u0004\u0000*+\u0005\u0002\u0000\u0000+,\u0003\u0010\b\u0000,\u0003"+
		"\u0001\u0000\u0000\u0000-.\u0005\u0003\u0000\u0000./\u0003\b\u0004\u0000"+
		"/0\u0005\u0002\u0000\u000001\u0003\u0010\b\u00001\u0005\u0001\u0000\u0000"+
		"\u000023\u0005\u0004\u0000\u000034\u0003\b\u0004\u000048\u0005\u0005\u0000"+
		"\u000057\u0003\b\u0004\u000065\u0001\u0000\u0000\u00007:\u0001\u0000\u0000"+
		"\u000086\u0001\u0000\u0000\u000089\u0001\u0000\u0000\u00009;\u0001\u0000"+
		"\u0000\u0000:8\u0001\u0000\u0000\u0000;<\u0005\u0002\u0000\u0000<=\u0003"+
		"\u0010\b\u0000=\u0007\u0001\u0000\u0000\u0000>?\u0003\u0012\t\u0000?@"+
		"\u0003\n\u0005\u0000@A\u0003\u0012\t\u0000A\t\u0001\u0000\u0000\u0000"+
		"BC\u0007\u0000\u0000\u0000C\u000b\u0001\u0000\u0000\u0000DE\u0003\u0012"+
		"\t\u0000EF\u0003\u000e\u0007\u0000FG\u0003\u0012\t\u0000G\r\u0001\u0000"+
		"\u0000\u0000HI\u0007\u0001\u0000\u0000I\u000f\u0001\u0000\u0000\u0000"+
		"JK\u0003\u0018\f\u0000KL\u0005\u0010\u0000\u0000LM\u0003\u0014\n\u0000"+
		"M\u0011\u0001\u0000\u0000\u0000NQ\u0003\u001c\u000e\u0000OQ\u0003\u001e"+
		"\u000f\u0000PN\u0001\u0000\u0000\u0000PO\u0001\u0000\u0000\u0000Q\u0013"+
		"\u0001\u0000\u0000\u0000RV\u0003\u0012\t\u0000SV\u0003\u001a\r\u0000T"+
		"V\u0003\u0016\u000b\u0000UR\u0001\u0000\u0000\u0000US\u0001\u0000\u0000"+
		"\u0000UT\u0001\u0000\u0000\u0000V\u0015\u0001\u0000\u0000\u0000WX\u0005"+
		"\u0011\u0000\u0000X\u0017\u0001\u0000\u0000\u0000YZ\u0005\u0012\u0000"+
		"\u0000Z\u0019\u0001\u0000\u0000\u0000[\\\u0005\u0012\u0000\u0000\\\u001b"+
		"\u0001\u0000\u0000\u0000]^\u0005\u0013\u0000\u0000^\u001d\u0001\u0000"+
		"\u0000\u0000_`\u0005\u0014\u0000\u0000`\u001f\u0001\u0000\u0000\u0000"+
		"\u0004&8PU";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}