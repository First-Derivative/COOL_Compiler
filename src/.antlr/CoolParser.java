// Generated from /Users/NCC1701-C/cool/LCARS/src/CoolParser.g4 by ANTLR 4.8
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CoolParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		ERROR=1, SINGLE_LINE_COMMENT=2, UNMATCHED_COMMENT=3, BEGIN_COMMENT=4, 
		END_COMMENT=5, BEGIN_INNER_COMMENT=6, EOF_COMMENT=7, COMMENT_CONTENT=8, 
		NEW_INNER_COMMENT=9, INNER_COMMENT_EOF=10, INNER_COMMENT_EOF_SECOND=11, 
		CLOSE_INNER_COMMENT=12, INNER_COMMENT_CONTENT=13, PERIOD=14, COMMA=15, 
		AT=16, SEMICOLON=17, COLON=18, CURLY_OPEN=19, CURLY_CLOSE=20, PARENT_OPEN=21, 
		PARENT_CLOSE=22, PLUS_OPERATOR=23, MINUS_OPERATOR=24, MULT_OPERATOR=25, 
		DIV_OPERATOR=26, INT_COMPLEMENT_OPERATOR=27, LESS_OPERATOR=28, LESS_EQ_OPERATOR=29, 
		EQ_OPERATOR=30, ASSIGN_OPERATOR=31, RIGHTARROW=32, CLASS=33, ELSE=34, 
		FI=35, IF=36, IN=37, INHERITS=38, ISVOID=39, LET=40, LOOP=41, POOL=42, 
		THEN=43, WHILE=44, CASE=45, ESAC=46, NEW=47, OF=48, NOT=49, TRUE=50, FALSE=51, 
		INT_CONST=52, OBJECTID=53, TYPEID=54, WS=55, STRING_CONST=56, UNTERMINATED_STRING_CONST=57, 
		INCOMPLETE_STRING=58;
	public static final int
		RULE_program = 0, RULE_coolClass = 1, RULE_feature = 2, RULE_formal = 3, 
		RULE_branch = 4, RULE_letvars = 5, RULE_expr = 6, RULE_error = 7;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "coolClass", "feature", "formal", "branch", "letvars", "expr", 
			"error"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, "'.'", "','", "'@'", "';'", "':'", "'{'", "'}'", "'('", "')'", 
			"'+'", "'-'", "'*'", "'/'", "'~'", "'<'", "'<='", "'='", "'<-'", "'=>'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "ERROR", "SINGLE_LINE_COMMENT", "UNMATCHED_COMMENT", "BEGIN_COMMENT", 
			"END_COMMENT", "BEGIN_INNER_COMMENT", "EOF_COMMENT", "COMMENT_CONTENT", 
			"NEW_INNER_COMMENT", "INNER_COMMENT_EOF", "INNER_COMMENT_EOF_SECOND", 
			"CLOSE_INNER_COMMENT", "INNER_COMMENT_CONTENT", "PERIOD", "COMMA", "AT", 
			"SEMICOLON", "COLON", "CURLY_OPEN", "CURLY_CLOSE", "PARENT_OPEN", "PARENT_CLOSE", 
			"PLUS_OPERATOR", "MINUS_OPERATOR", "MULT_OPERATOR", "DIV_OPERATOR", "INT_COMPLEMENT_OPERATOR", 
			"LESS_OPERATOR", "LESS_EQ_OPERATOR", "EQ_OPERATOR", "ASSIGN_OPERATOR", 
			"RIGHTARROW", "CLASS", "ELSE", "FI", "IF", "IN", "INHERITS", "ISVOID", 
			"LET", "LOOP", "POOL", "THEN", "WHILE", "CASE", "ESAC", "NEW", "OF", 
			"NOT", "TRUE", "FALSE", "INT_CONST", "OBJECTID", "TYPEID", "WS", "STRING_CONST", 
			"UNTERMINATED_STRING_CONST", "INCOMPLETE_STRING"
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
	public String getGrammarFileName() { return "CoolParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public CoolParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(CoolParser.EOF, 0); }
		public List<CoolClassContext> coolClass() {
			return getRuleContexts(CoolClassContext.class);
		}
		public CoolClassContext coolClass(int i) {
			return getRuleContext(CoolClassContext.class,i);
		}
		public List<TerminalNode> SEMICOLON() { return getTokens(CoolParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(CoolParser.SEMICOLON, i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(19); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(16);
				coolClass();
				setState(17);
				match(SEMICOLON);
				}
				}
				setState(21); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==CLASS );
			setState(23);
			match(EOF);
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

	public static class CoolClassContext extends ParserRuleContext {
		public TerminalNode CLASS() { return getToken(CoolParser.CLASS, 0); }
		public List<TerminalNode> TYPEID() { return getTokens(CoolParser.TYPEID); }
		public TerminalNode TYPEID(int i) {
			return getToken(CoolParser.TYPEID, i);
		}
		public TerminalNode CURLY_OPEN() { return getToken(CoolParser.CURLY_OPEN, 0); }
		public TerminalNode CURLY_CLOSE() { return getToken(CoolParser.CURLY_CLOSE, 0); }
		public TerminalNode INHERITS() { return getToken(CoolParser.INHERITS, 0); }
		public List<FeatureContext> feature() {
			return getRuleContexts(FeatureContext.class);
		}
		public FeatureContext feature(int i) {
			return getRuleContext(FeatureContext.class,i);
		}
		public List<TerminalNode> SEMICOLON() { return getTokens(CoolParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(CoolParser.SEMICOLON, i);
		}
		public CoolClassContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_coolClass; }
	}

	public final CoolClassContext coolClass() throws RecognitionException {
		CoolClassContext _localctx = new CoolClassContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_coolClass);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(25);
			match(CLASS);
			setState(26);
			match(TYPEID);
			setState(29);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==INHERITS) {
				{
				setState(27);
				match(INHERITS);
				setState(28);
				match(TYPEID);
				}
			}

			setState(31);
			match(CURLY_OPEN);
			setState(37);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OBJECTID) {
				{
				{
				setState(32);
				feature();
				setState(33);
				match(SEMICOLON);
				}
				}
				setState(39);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(40);
			match(CURLY_CLOSE);
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

	public static class FeatureContext extends ParserRuleContext {
		public TerminalNode OBJECTID() { return getToken(CoolParser.OBJECTID, 0); }
		public TerminalNode PARENT_OPEN() { return getToken(CoolParser.PARENT_OPEN, 0); }
		public TerminalNode PARENT_CLOSE() { return getToken(CoolParser.PARENT_CLOSE, 0); }
		public TerminalNode COLON() { return getToken(CoolParser.COLON, 0); }
		public TerminalNode TYPEID() { return getToken(CoolParser.TYPEID, 0); }
		public TerminalNode CURLY_OPEN() { return getToken(CoolParser.CURLY_OPEN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode CURLY_CLOSE() { return getToken(CoolParser.CURLY_CLOSE, 0); }
		public List<FormalContext> formal() {
			return getRuleContexts(FormalContext.class);
		}
		public FormalContext formal(int i) {
			return getRuleContext(FormalContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(CoolParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CoolParser.COMMA, i);
		}
		public TerminalNode ASSIGN_OPERATOR() { return getToken(CoolParser.ASSIGN_OPERATOR, 0); }
		public FeatureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_feature; }
	}

	public final FeatureContext feature() throws RecognitionException {
		FeatureContext _localctx = new FeatureContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_feature);
		int _la;
		try {
			setState(68);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(42);
				match(OBJECTID);
				setState(43);
				match(PARENT_OPEN);
				setState(52);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OBJECTID) {
					{
					setState(44);
					formal();
					setState(49);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(45);
						match(COMMA);
						setState(46);
						formal();
						}
						}
						setState(51);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(54);
				match(PARENT_CLOSE);
				setState(55);
				match(COLON);
				setState(56);
				match(TYPEID);
				setState(57);
				match(CURLY_OPEN);
				setState(58);
				expr(0);
				setState(59);
				match(CURLY_CLOSE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(61);
				match(OBJECTID);
				setState(62);
				match(COLON);
				setState(63);
				match(TYPEID);
				setState(66);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ASSIGN_OPERATOR) {
					{
					setState(64);
					match(ASSIGN_OPERATOR);
					setState(65);
					expr(0);
					}
				}

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

	public static class FormalContext extends ParserRuleContext {
		public TerminalNode OBJECTID() { return getToken(CoolParser.OBJECTID, 0); }
		public TerminalNode COLON() { return getToken(CoolParser.COLON, 0); }
		public TerminalNode TYPEID() { return getToken(CoolParser.TYPEID, 0); }
		public FormalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formal; }
	}

	public final FormalContext formal() throws RecognitionException {
		FormalContext _localctx = new FormalContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_formal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(70);
			match(OBJECTID);
			setState(71);
			match(COLON);
			setState(72);
			match(TYPEID);
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

	public static class BranchContext extends ParserRuleContext {
		public TerminalNode OBJECTID() { return getToken(CoolParser.OBJECTID, 0); }
		public TerminalNode COLON() { return getToken(CoolParser.COLON, 0); }
		public TerminalNode TYPEID() { return getToken(CoolParser.TYPEID, 0); }
		public TerminalNode RIGHTARROW() { return getToken(CoolParser.RIGHTARROW, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(CoolParser.SEMICOLON, 0); }
		public BranchContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_branch; }
	}

	public final BranchContext branch() throws RecognitionException {
		BranchContext _localctx = new BranchContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_branch);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(74);
			match(OBJECTID);
			setState(75);
			match(COLON);
			setState(76);
			match(TYPEID);
			setState(77);
			match(RIGHTARROW);
			setState(78);
			expr(0);
			setState(79);
			match(SEMICOLON);
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

	public static class LetvarsContext extends ParserRuleContext {
		public TerminalNode OBJECTID() { return getToken(CoolParser.OBJECTID, 0); }
		public TerminalNode COLON() { return getToken(CoolParser.COLON, 0); }
		public TerminalNode TYPEID() { return getToken(CoolParser.TYPEID, 0); }
		public TerminalNode ASSIGN_OPERATOR() { return getToken(CoolParser.ASSIGN_OPERATOR, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public LetvarsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_letvars; }
	}

	public final LetvarsContext letvars() throws RecognitionException {
		LetvarsContext _localctx = new LetvarsContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_letvars);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(81);
			match(OBJECTID);
			setState(82);
			match(COLON);
			setState(83);
			match(TYPEID);
			setState(86);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN_OPERATOR) {
				{
				setState(84);
				match(ASSIGN_OPERATOR);
				setState(85);
				expr(0);
				}
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

	public static class ExprContext extends ParserRuleContext {
		public TerminalNode OBJECTID() { return getToken(CoolParser.OBJECTID, 0); }
		public TerminalNode PARENT_OPEN() { return getToken(CoolParser.PARENT_OPEN, 0); }
		public TerminalNode PARENT_CLOSE() { return getToken(CoolParser.PARENT_CLOSE, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(CoolParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CoolParser.COMMA, i);
		}
		public TerminalNode IF() { return getToken(CoolParser.IF, 0); }
		public TerminalNode THEN() { return getToken(CoolParser.THEN, 0); }
		public TerminalNode ELSE() { return getToken(CoolParser.ELSE, 0); }
		public TerminalNode FI() { return getToken(CoolParser.FI, 0); }
		public TerminalNode WHILE() { return getToken(CoolParser.WHILE, 0); }
		public TerminalNode LOOP() { return getToken(CoolParser.LOOP, 0); }
		public TerminalNode POOL() { return getToken(CoolParser.POOL, 0); }
		public TerminalNode CURLY_OPEN() { return getToken(CoolParser.CURLY_OPEN, 0); }
		public TerminalNode CURLY_CLOSE() { return getToken(CoolParser.CURLY_CLOSE, 0); }
		public List<TerminalNode> SEMICOLON() { return getTokens(CoolParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(CoolParser.SEMICOLON, i);
		}
		public TerminalNode CASE() { return getToken(CoolParser.CASE, 0); }
		public TerminalNode OF() { return getToken(CoolParser.OF, 0); }
		public TerminalNode ESAC() { return getToken(CoolParser.ESAC, 0); }
		public List<BranchContext> branch() {
			return getRuleContexts(BranchContext.class);
		}
		public BranchContext branch(int i) {
			return getRuleContext(BranchContext.class,i);
		}
		public TerminalNode NEW() { return getToken(CoolParser.NEW, 0); }
		public TerminalNode TYPEID() { return getToken(CoolParser.TYPEID, 0); }
		public TerminalNode ISVOID() { return getToken(CoolParser.ISVOID, 0); }
		public TerminalNode INT_COMPLEMENT_OPERATOR() { return getToken(CoolParser.INT_COMPLEMENT_OPERATOR, 0); }
		public TerminalNode NOT() { return getToken(CoolParser.NOT, 0); }
		public TerminalNode INT_CONST() { return getToken(CoolParser.INT_CONST, 0); }
		public TerminalNode STRING_CONST() { return getToken(CoolParser.STRING_CONST, 0); }
		public TerminalNode TRUE() { return getToken(CoolParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(CoolParser.FALSE, 0); }
		public TerminalNode ASSIGN_OPERATOR() { return getToken(CoolParser.ASSIGN_OPERATOR, 0); }
		public TerminalNode LET() { return getToken(CoolParser.LET, 0); }
		public List<LetvarsContext> letvars() {
			return getRuleContexts(LetvarsContext.class);
		}
		public LetvarsContext letvars(int i) {
			return getRuleContext(LetvarsContext.class,i);
		}
		public TerminalNode IN() { return getToken(CoolParser.IN, 0); }
		public TerminalNode DIV_OPERATOR() { return getToken(CoolParser.DIV_OPERATOR, 0); }
		public TerminalNode MULT_OPERATOR() { return getToken(CoolParser.MULT_OPERATOR, 0); }
		public TerminalNode PLUS_OPERATOR() { return getToken(CoolParser.PLUS_OPERATOR, 0); }
		public TerminalNode MINUS_OPERATOR() { return getToken(CoolParser.MINUS_OPERATOR, 0); }
		public TerminalNode LESS_OPERATOR() { return getToken(CoolParser.LESS_OPERATOR, 0); }
		public TerminalNode LESS_EQ_OPERATOR() { return getToken(CoolParser.LESS_EQ_OPERATOR, 0); }
		public TerminalNode EQ_OPERATOR() { return getToken(CoolParser.EQ_OPERATOR, 0); }
		public TerminalNode PERIOD() { return getToken(CoolParser.PERIOD, 0); }
		public TerminalNode AT() { return getToken(CoolParser.AT, 0); }
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 12;
		enterRecursionRule(_localctx, 12, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(168);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				{
				setState(89);
				match(OBJECTID);
				setState(90);
				match(PARENT_OPEN);
				setState(99);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CURLY_OPEN) | (1L << PARENT_OPEN) | (1L << INT_COMPLEMENT_OPERATOR) | (1L << IF) | (1L << ISVOID) | (1L << LET) | (1L << WHILE) | (1L << CASE) | (1L << NEW) | (1L << NOT) | (1L << TRUE) | (1L << FALSE) | (1L << INT_CONST) | (1L << OBJECTID) | (1L << STRING_CONST))) != 0)) {
					{
					setState(91);
					expr(0);
					setState(96);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(92);
						match(COMMA);
						setState(93);
						expr(0);
						}
						}
						setState(98);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(101);
				match(PARENT_CLOSE);
				}
				break;
			case 2:
				{
				setState(102);
				match(IF);
				setState(103);
				expr(0);
				setState(104);
				match(THEN);
				setState(105);
				expr(0);
				setState(106);
				match(ELSE);
				setState(107);
				expr(0);
				setState(108);
				match(FI);
				}
				break;
			case 3:
				{
				setState(110);
				match(WHILE);
				setState(111);
				expr(0);
				setState(112);
				match(LOOP);
				setState(113);
				expr(0);
				setState(114);
				match(POOL);
				}
				break;
			case 4:
				{
				setState(116);
				match(CURLY_OPEN);
				setState(120); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(117);
					expr(0);
					setState(118);
					match(SEMICOLON);
					}
					}
					setState(122); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CURLY_OPEN) | (1L << PARENT_OPEN) | (1L << INT_COMPLEMENT_OPERATOR) | (1L << IF) | (1L << ISVOID) | (1L << LET) | (1L << WHILE) | (1L << CASE) | (1L << NEW) | (1L << NOT) | (1L << TRUE) | (1L << FALSE) | (1L << INT_CONST) | (1L << OBJECTID) | (1L << STRING_CONST))) != 0) );
				setState(124);
				match(CURLY_CLOSE);
				}
				break;
			case 5:
				{
				setState(126);
				match(CASE);
				setState(127);
				expr(0);
				setState(128);
				match(OF);
				setState(130); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(129);
					branch();
					}
					}
					setState(132); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==OBJECTID );
				setState(134);
				match(ESAC);
				}
				break;
			case 6:
				{
				setState(136);
				match(NEW);
				setState(137);
				match(TYPEID);
				}
				break;
			case 7:
				{
				setState(138);
				match(ISVOID);
				setState(139);
				expr(18);
				}
				break;
			case 8:
				{
				setState(140);
				match(INT_COMPLEMENT_OPERATOR);
				setState(141);
				expr(15);
				}
				break;
			case 9:
				{
				setState(142);
				match(NOT);
				setState(143);
				expr(9);
				}
				break;
			case 10:
				{
				setState(144);
				match(PARENT_OPEN);
				setState(145);
				expr(0);
				setState(146);
				match(PARENT_CLOSE);
				}
				break;
			case 11:
				{
				setState(148);
				match(OBJECTID);
				}
				break;
			case 12:
				{
				setState(149);
				match(INT_CONST);
				}
				break;
			case 13:
				{
				setState(150);
				match(STRING_CONST);
				}
				break;
			case 14:
				{
				setState(151);
				match(TRUE);
				}
				break;
			case 15:
				{
				setState(152);
				match(FALSE);
				}
				break;
			case 16:
				{
				setState(153);
				match(OBJECTID);
				setState(154);
				match(ASSIGN_OPERATOR);
				setState(155);
				expr(2);
				}
				break;
			case 17:
				{
				setState(156);
				match(LET);
				setState(157);
				letvars();
				setState(162);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(158);
					match(COMMA);
					setState(159);
					letvars();
					}
					}
					setState(164);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(165);
				match(IN);
				setState(166);
				expr(1);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(227);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(225);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(170);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(171);
						match(DIV_OPERATOR);
						setState(172);
						expr(18);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(173);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(174);
						match(MULT_OPERATOR);
						setState(175);
						expr(17);
						}
						break;
					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(176);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(177);
						match(PLUS_OPERATOR);
						setState(178);
						expr(15);
						}
						break;
					case 4:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(179);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(180);
						match(MINUS_OPERATOR);
						setState(181);
						expr(14);
						}
						break;
					case 5:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(182);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(183);
						match(LESS_OPERATOR);
						setState(184);
						expr(13);
						}
						break;
					case 6:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(185);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(186);
						match(LESS_EQ_OPERATOR);
						setState(187);
						expr(12);
						}
						break;
					case 7:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(188);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(189);
						match(EQ_OPERATOR);
						setState(190);
						expr(11);
						}
						break;
					case 8:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(191);
						if (!(precpred(_ctx, 26))) throw new FailedPredicateException(this, "precpred(_ctx, 26)");
						setState(194);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==AT) {
							{
							setState(192);
							match(AT);
							setState(193);
							match(TYPEID);
							}
						}

						setState(196);
						match(PERIOD);
						setState(197);
						match(OBJECTID);
						setState(198);
						match(PARENT_OPEN);
						setState(207);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CURLY_OPEN) | (1L << PARENT_OPEN) | (1L << INT_COMPLEMENT_OPERATOR) | (1L << IF) | (1L << ISVOID) | (1L << LET) | (1L << WHILE) | (1L << CASE) | (1L << NEW) | (1L << NOT) | (1L << TRUE) | (1L << FALSE) | (1L << INT_CONST) | (1L << OBJECTID) | (1L << STRING_CONST))) != 0)) {
							{
							setState(199);
							expr(0);
							setState(204);
							_errHandler.sync(this);
							_la = _input.LA(1);
							while (_la==COMMA) {
								{
								{
								setState(200);
								match(COMMA);
								setState(201);
								expr(0);
								}
								}
								setState(206);
								_errHandler.sync(this);
								_la = _input.LA(1);
							}
							}
						}

						setState(209);
						match(PARENT_CLOSE);
						}
						break;
					case 9:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(210);
						if (!(precpred(_ctx, 24))) throw new FailedPredicateException(this, "precpred(_ctx, 24)");
						setState(211);
						match(PERIOD);
						setState(212);
						match(OBJECTID);
						setState(213);
						match(PARENT_OPEN);
						setState(222);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CURLY_OPEN) | (1L << PARENT_OPEN) | (1L << INT_COMPLEMENT_OPERATOR) | (1L << IF) | (1L << ISVOID) | (1L << LET) | (1L << WHILE) | (1L << CASE) | (1L << NEW) | (1L << NOT) | (1L << TRUE) | (1L << FALSE) | (1L << INT_CONST) | (1L << OBJECTID) | (1L << STRING_CONST))) != 0)) {
							{
							setState(214);
							expr(0);
							setState(219);
							_errHandler.sync(this);
							_la = _input.LA(1);
							while (_la==COMMA) {
								{
								{
								setState(215);
								match(COMMA);
								setState(216);
								expr(0);
								}
								}
								setState(221);
								_errHandler.sync(this);
								_la = _input.LA(1);
							}
							}
						}

						setState(224);
						match(PARENT_CLOSE);
						}
						break;
					}
					} 
				}
				setState(229);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ErrorContext extends ParserRuleContext {
		public TerminalNode ERROR() { return getToken(CoolParser.ERROR, 0); }
		public ErrorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_error; }
	}

	public final ErrorContext error() throws RecognitionException {
		ErrorContext _localctx = new ErrorContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_error);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(230);
			match(ERROR);
			 Utilities.lexError(); 
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 6:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 17);
		case 1:
			return precpred(_ctx, 16);
		case 2:
			return precpred(_ctx, 14);
		case 3:
			return precpred(_ctx, 13);
		case 4:
			return precpred(_ctx, 12);
		case 5:
			return precpred(_ctx, 11);
		case 6:
			return precpred(_ctx, 10);
		case 7:
			return precpred(_ctx, 26);
		case 8:
			return precpred(_ctx, 24);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3<\u00ec\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\3\2\3\2\3\2\6\2"+
		"\26\n\2\r\2\16\2\27\3\2\3\2\3\3\3\3\3\3\3\3\5\3 \n\3\3\3\3\3\3\3\3\3\7"+
		"\3&\n\3\f\3\16\3)\13\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\7\4\62\n\4\f\4\16\4"+
		"\65\13\4\5\4\67\n\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5"+
		"\4E\n\4\5\4G\n\4\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3"+
		"\7\3\7\3\7\5\7Y\n\7\3\b\3\b\3\b\3\b\3\b\3\b\7\ba\n\b\f\b\16\bd\13\b\5"+
		"\bf\n\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\6\b{\n\b\r\b\16\b|\3\b\3\b\3\b\3\b\3\b\3\b\6\b\u0085\n"+
		"\b\r\b\16\b\u0086\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\7\b\u00a3\n\b\f\b"+
		"\16\b\u00a6\13\b\3\b\3\b\3\b\5\b\u00ab\n\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5"+
		"\b\u00c5\n\b\3\b\3\b\3\b\3\b\3\b\3\b\7\b\u00cd\n\b\f\b\16\b\u00d0\13\b"+
		"\5\b\u00d2\n\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\7\b\u00dc\n\b\f\b\16\b"+
		"\u00df\13\b\5\b\u00e1\n\b\3\b\7\b\u00e4\n\b\f\b\16\b\u00e7\13\b\3\t\3"+
		"\t\3\t\3\t\2\3\16\n\2\4\6\b\n\f\16\20\2\2\2\u010e\2\25\3\2\2\2\4\33\3"+
		"\2\2\2\6F\3\2\2\2\bH\3\2\2\2\nL\3\2\2\2\fS\3\2\2\2\16\u00aa\3\2\2\2\20"+
		"\u00e8\3\2\2\2\22\23\5\4\3\2\23\24\7\23\2\2\24\26\3\2\2\2\25\22\3\2\2"+
		"\2\26\27\3\2\2\2\27\25\3\2\2\2\27\30\3\2\2\2\30\31\3\2\2\2\31\32\7\2\2"+
		"\3\32\3\3\2\2\2\33\34\7#\2\2\34\37\78\2\2\35\36\7(\2\2\36 \78\2\2\37\35"+
		"\3\2\2\2\37 \3\2\2\2 !\3\2\2\2!\'\7\25\2\2\"#\5\6\4\2#$\7\23\2\2$&\3\2"+
		"\2\2%\"\3\2\2\2&)\3\2\2\2\'%\3\2\2\2\'(\3\2\2\2(*\3\2\2\2)\'\3\2\2\2*"+
		"+\7\26\2\2+\5\3\2\2\2,-\7\67\2\2-\66\7\27\2\2.\63\5\b\5\2/\60\7\21\2\2"+
		"\60\62\5\b\5\2\61/\3\2\2\2\62\65\3\2\2\2\63\61\3\2\2\2\63\64\3\2\2\2\64"+
		"\67\3\2\2\2\65\63\3\2\2\2\66.\3\2\2\2\66\67\3\2\2\2\678\3\2\2\289\7\30"+
		"\2\29:\7\24\2\2:;\78\2\2;<\7\25\2\2<=\5\16\b\2=>\7\26\2\2>G\3\2\2\2?@"+
		"\7\67\2\2@A\7\24\2\2AD\78\2\2BC\7!\2\2CE\5\16\b\2DB\3\2\2\2DE\3\2\2\2"+
		"EG\3\2\2\2F,\3\2\2\2F?\3\2\2\2G\7\3\2\2\2HI\7\67\2\2IJ\7\24\2\2JK\78\2"+
		"\2K\t\3\2\2\2LM\7\67\2\2MN\7\24\2\2NO\78\2\2OP\7\"\2\2PQ\5\16\b\2QR\7"+
		"\23\2\2R\13\3\2\2\2ST\7\67\2\2TU\7\24\2\2UX\78\2\2VW\7!\2\2WY\5\16\b\2"+
		"XV\3\2\2\2XY\3\2\2\2Y\r\3\2\2\2Z[\b\b\1\2[\\\7\67\2\2\\e\7\27\2\2]b\5"+
		"\16\b\2^_\7\21\2\2_a\5\16\b\2`^\3\2\2\2ad\3\2\2\2b`\3\2\2\2bc\3\2\2\2"+
		"cf\3\2\2\2db\3\2\2\2e]\3\2\2\2ef\3\2\2\2fg\3\2\2\2g\u00ab\7\30\2\2hi\7"+
		"&\2\2ij\5\16\b\2jk\7-\2\2kl\5\16\b\2lm\7$\2\2mn\5\16\b\2no\7%\2\2o\u00ab"+
		"\3\2\2\2pq\7.\2\2qr\5\16\b\2rs\7+\2\2st\5\16\b\2tu\7,\2\2u\u00ab\3\2\2"+
		"\2vz\7\25\2\2wx\5\16\b\2xy\7\23\2\2y{\3\2\2\2zw\3\2\2\2{|\3\2\2\2|z\3"+
		"\2\2\2|}\3\2\2\2}~\3\2\2\2~\177\7\26\2\2\177\u00ab\3\2\2\2\u0080\u0081"+
		"\7/\2\2\u0081\u0082\5\16\b\2\u0082\u0084\7\62\2\2\u0083\u0085\5\n\6\2"+
		"\u0084\u0083\3\2\2\2\u0085\u0086\3\2\2\2\u0086\u0084\3\2\2\2\u0086\u0087"+
		"\3\2\2\2\u0087\u0088\3\2\2\2\u0088\u0089\7\60\2\2\u0089\u00ab\3\2\2\2"+
		"\u008a\u008b\7\61\2\2\u008b\u00ab\78\2\2\u008c\u008d\7)\2\2\u008d\u00ab"+
		"\5\16\b\24\u008e\u008f\7\35\2\2\u008f\u00ab\5\16\b\21\u0090\u0091\7\63"+
		"\2\2\u0091\u00ab\5\16\b\13\u0092\u0093\7\27\2\2\u0093\u0094\5\16\b\2\u0094"+
		"\u0095\7\30\2\2\u0095\u00ab\3\2\2\2\u0096\u00ab\7\67\2\2\u0097\u00ab\7"+
		"\66\2\2\u0098\u00ab\7:\2\2\u0099\u00ab\7\64\2\2\u009a\u00ab\7\65\2\2\u009b"+
		"\u009c\7\67\2\2\u009c\u009d\7!\2\2\u009d\u00ab\5\16\b\4\u009e\u009f\7"+
		"*\2\2\u009f\u00a4\5\f\7\2\u00a0\u00a1\7\21\2\2\u00a1\u00a3\5\f\7\2\u00a2"+
		"\u00a0\3\2\2\2\u00a3\u00a6\3\2\2\2\u00a4\u00a2\3\2\2\2\u00a4\u00a5\3\2"+
		"\2\2\u00a5\u00a7\3\2\2\2\u00a6\u00a4\3\2\2\2\u00a7\u00a8\7\'\2\2\u00a8"+
		"\u00a9\5\16\b\3\u00a9\u00ab\3\2\2\2\u00aaZ\3\2\2\2\u00aah\3\2\2\2\u00aa"+
		"p\3\2\2\2\u00aav\3\2\2\2\u00aa\u0080\3\2\2\2\u00aa\u008a\3\2\2\2\u00aa"+
		"\u008c\3\2\2\2\u00aa\u008e\3\2\2\2\u00aa\u0090\3\2\2\2\u00aa\u0092\3\2"+
		"\2\2\u00aa\u0096\3\2\2\2\u00aa\u0097\3\2\2\2\u00aa\u0098\3\2\2\2\u00aa"+
		"\u0099\3\2\2\2\u00aa\u009a\3\2\2\2\u00aa\u009b\3\2\2\2\u00aa\u009e\3\2"+
		"\2\2\u00ab\u00e5\3\2\2\2\u00ac\u00ad\f\23\2\2\u00ad\u00ae\7\34\2\2\u00ae"+
		"\u00e4\5\16\b\24\u00af\u00b0\f\22\2\2\u00b0\u00b1\7\33\2\2\u00b1\u00e4"+
		"\5\16\b\23\u00b2\u00b3\f\20\2\2\u00b3\u00b4\7\31\2\2\u00b4\u00e4\5\16"+
		"\b\21\u00b5\u00b6\f\17\2\2\u00b6\u00b7\7\32\2\2\u00b7\u00e4\5\16\b\20"+
		"\u00b8\u00b9\f\16\2\2\u00b9\u00ba\7\36\2\2\u00ba\u00e4\5\16\b\17\u00bb"+
		"\u00bc\f\r\2\2\u00bc\u00bd\7\37\2\2\u00bd\u00e4\5\16\b\16\u00be\u00bf"+
		"\f\f\2\2\u00bf\u00c0\7 \2\2\u00c0\u00e4\5\16\b\r\u00c1\u00c4\f\34\2\2"+
		"\u00c2\u00c3\7\22\2\2\u00c3\u00c5\78\2\2\u00c4\u00c2\3\2\2\2\u00c4\u00c5"+
		"\3\2\2\2\u00c5\u00c6\3\2\2\2\u00c6\u00c7\7\20\2\2\u00c7\u00c8\7\67\2\2"+
		"\u00c8\u00d1\7\27\2\2\u00c9\u00ce\5\16\b\2\u00ca\u00cb\7\21\2\2\u00cb"+
		"\u00cd\5\16\b\2\u00cc\u00ca\3\2\2\2\u00cd\u00d0\3\2\2\2\u00ce\u00cc\3"+
		"\2\2\2\u00ce\u00cf\3\2\2\2\u00cf\u00d2\3\2\2\2\u00d0\u00ce\3\2\2\2\u00d1"+
		"\u00c9\3\2\2\2\u00d1\u00d2\3\2\2\2\u00d2\u00d3\3\2\2\2\u00d3\u00e4\7\30"+
		"\2\2\u00d4\u00d5\f\32\2\2\u00d5\u00d6\7\20\2\2\u00d6\u00d7\7\67\2\2\u00d7"+
		"\u00e0\7\27\2\2\u00d8\u00dd\5\16\b\2\u00d9\u00da\7\21\2\2\u00da\u00dc"+
		"\5\16\b\2\u00db\u00d9\3\2\2\2\u00dc\u00df\3\2\2\2\u00dd\u00db\3\2\2\2"+
		"\u00dd\u00de\3\2\2\2\u00de\u00e1\3\2\2\2\u00df\u00dd\3\2\2\2\u00e0\u00d8"+
		"\3\2\2\2\u00e0\u00e1\3\2\2\2\u00e1\u00e2\3\2\2\2\u00e2\u00e4\7\30\2\2"+
		"\u00e3\u00ac\3\2\2\2\u00e3\u00af\3\2\2\2\u00e3\u00b2\3\2\2\2\u00e3\u00b5"+
		"\3\2\2\2\u00e3\u00b8\3\2\2\2\u00e3\u00bb\3\2\2\2\u00e3\u00be\3\2\2\2\u00e3"+
		"\u00c1\3\2\2\2\u00e3\u00d4\3\2\2\2\u00e4\u00e7\3\2\2\2\u00e5\u00e3\3\2"+
		"\2\2\u00e5\u00e6\3\2\2\2\u00e6\17\3\2\2\2\u00e7\u00e5\3\2\2\2\u00e8\u00e9"+
		"\7\3\2\2\u00e9\u00ea\b\t\1\2\u00ea\21\3\2\2\2\27\27\37\'\63\66DFXbe|\u0086"+
		"\u00a4\u00aa\u00c4\u00ce\u00d1\u00dd\u00e0\u00e3\u00e5";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}