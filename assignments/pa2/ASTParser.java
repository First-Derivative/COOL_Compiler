// Generated from /Users/NCC1701-C/cool/LCARS/src/ast/parser/ASTParser.g4 by ANTLR 4.6
package ast.parser;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ASTParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.6", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		TYPE=1, ID=2, INT_CONST=3, LINENO=4, PROGRAM=5, CLASS=6, METHOD=7, ATTR=8, 
		FORMAL=9, BRANCH=10, ASSIGN=11, STATIC_DISPATCH=12, DISPATCH=13, COND=14, 
		LOOP=15, TYPCASE=16, BLOCK=17, LET=18, PLUS=19, SUB=20, MUL=21, DIVIDE=22, 
		NEG=23, LT=24, EQ=25, LEQ=26, COMP=27, INT=28, STR=29, BOOL=30, NEW=31, 
		ISVOID=32, NO_EXPR=33, NO_TYPE=34, OBJECT=35, COLON=36, LPAREN=37, RPAREN=38, 
		WHITESPACE=39, STR_CONST=40;
	public static final int
		RULE_program = 0, RULE_coolClass = 1, RULE_feature = 2, RULE_method = 3, 
		RULE_attr = 4, RULE_formal = 5, RULE_expr = 6, RULE_expr_aux = 7, RULE_simplecase = 8, 
		RULE_type = 9, RULE_id = 10;
	public static final String[] ruleNames = {
		"program", "coolClass", "feature", "method", "attr", "formal", "expr", 
		"expr_aux", "simplecase", "type", "id"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, null, null, "'_program'", "'_class'", "'_method'", "'_attr'", 
		"'_formal'", "'_branch'", "'_assign'", "'_static_dispatch'", "'_dispatch'", 
		"'_cond'", "'_loop'", "'_typcase'", "'_block'", "'_let'", "'_plus'", "'_sub'", 
		"'_mul'", "'_divide'", "'_neg'", "'_lt'", "'_eq'", "'_leq'", "'_comp'", 
		"'_int'", "'_string'", "'_bool'", "'_new'", "'_isvoid'", "'_no_expr'", 
		"'_no_type'", "'_object'", "':'", "'('", "')'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "TYPE", "ID", "INT_CONST", "LINENO", "PROGRAM", "CLASS", "METHOD", 
		"ATTR", "FORMAL", "BRANCH", "ASSIGN", "STATIC_DISPATCH", "DISPATCH", "COND", 
		"LOOP", "TYPCASE", "BLOCK", "LET", "PLUS", "SUB", "MUL", "DIVIDE", "NEG", 
		"LT", "EQ", "LEQ", "COMP", "INT", "STR", "BOOL", "NEW", "ISVOID", "NO_EXPR", 
		"NO_TYPE", "OBJECT", "COLON", "LPAREN", "RPAREN", "WHITESPACE", "STR_CONST"
	};
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
	public String getGrammarFileName() { return "ASTParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ASTParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode LINENO() { return getToken(ASTParser.LINENO, 0); }
		public TerminalNode PROGRAM() { return getToken(ASTParser.PROGRAM, 0); }
		public TerminalNode EOF() { return getToken(ASTParser.EOF, 0); }
		public List<CoolClassContext> coolClass() {
			return getRuleContexts(CoolClassContext.class);
		}
		public CoolClassContext coolClass(int i) {
			return getRuleContext(CoolClassContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ASTParserListener ) ((ASTParserListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ASTParserListener ) ((ASTParserListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ASTParserVisitor ) return ((ASTParserVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(22);
			match(LINENO);
			setState(23);
			match(PROGRAM);
			setState(25); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(24);
				coolClass();
				}
				}
				setState(27); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==LINENO );
			setState(29);
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
		public TerminalNode LINENO() { return getToken(ASTParser.LINENO, 0); }
		public TerminalNode CLASS() { return getToken(ASTParser.CLASS, 0); }
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public TerminalNode STR_CONST() { return getToken(ASTParser.STR_CONST, 0); }
		public TerminalNode LPAREN() { return getToken(ASTParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(ASTParser.RPAREN, 0); }
		public List<FeatureContext> feature() {
			return getRuleContexts(FeatureContext.class);
		}
		public FeatureContext feature(int i) {
			return getRuleContext(FeatureContext.class,i);
		}
		public CoolClassContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_coolClass; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ASTParserListener ) ((ASTParserListener)listener).enterCoolClass(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ASTParserListener ) ((ASTParserListener)listener).exitCoolClass(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ASTParserVisitor ) return ((ASTParserVisitor<? extends T>)visitor).visitCoolClass(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CoolClassContext coolClass() throws RecognitionException {
		CoolClassContext _localctx = new CoolClassContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_coolClass);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(31);
			match(LINENO);
			setState(32);
			match(CLASS);
			setState(33);
			type();
			setState(34);
			type();
			setState(35);
			match(STR_CONST);
			setState(36);
			match(LPAREN);
			setState(40);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LINENO) {
				{
				{
				setState(37);
				feature();
				}
				}
				setState(42);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(43);
			match(RPAREN);
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
		public AttrContext attr() {
			return getRuleContext(AttrContext.class,0);
		}
		public MethodContext method() {
			return getRuleContext(MethodContext.class,0);
		}
		public FeatureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_feature; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ASTParserListener ) ((ASTParserListener)listener).enterFeature(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ASTParserListener ) ((ASTParserListener)listener).exitFeature(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ASTParserVisitor ) return ((ASTParserVisitor<? extends T>)visitor).visitFeature(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FeatureContext feature() throws RecognitionException {
		FeatureContext _localctx = new FeatureContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_feature);
		try {
			setState(47);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(45);
				attr();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(46);
				method();
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

	public static class MethodContext extends ParserRuleContext {
		public TerminalNode LINENO() { return getToken(ASTParser.LINENO, 0); }
		public TerminalNode METHOD() { return getToken(ASTParser.METHOD, 0); }
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<FormalContext> formal() {
			return getRuleContexts(FormalContext.class);
		}
		public FormalContext formal(int i) {
			return getRuleContext(FormalContext.class,i);
		}
		public MethodContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_method; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ASTParserListener ) ((ASTParserListener)listener).enterMethod(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ASTParserListener ) ((ASTParserListener)listener).exitMethod(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ASTParserVisitor ) return ((ASTParserVisitor<? extends T>)visitor).visitMethod(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodContext method() throws RecognitionException {
		MethodContext _localctx = new MethodContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_method);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(49);
			match(LINENO);
			setState(50);
			match(METHOD);
			setState(51);
			id();
			setState(55);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LINENO) {
				{
				{
				setState(52);
				formal();
				}
				}
				setState(57);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(58);
			type();
			setState(59);
			expr();
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

	public static class AttrContext extends ParserRuleContext {
		public TerminalNode LINENO() { return getToken(ASTParser.LINENO, 0); }
		public TerminalNode ATTR() { return getToken(ASTParser.ATTR, 0); }
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public AttrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ASTParserListener ) ((ASTParserListener)listener).enterAttr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ASTParserListener ) ((ASTParserListener)listener).exitAttr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ASTParserVisitor ) return ((ASTParserVisitor<? extends T>)visitor).visitAttr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttrContext attr() throws RecognitionException {
		AttrContext _localctx = new AttrContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_attr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(61);
			match(LINENO);
			setState(62);
			match(ATTR);
			setState(63);
			id();
			setState(64);
			type();
			setState(65);
			expr();
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
		public TerminalNode LINENO() { return getToken(ASTParser.LINENO, 0); }
		public TerminalNode FORMAL() { return getToken(ASTParser.FORMAL, 0); }
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public FormalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ASTParserListener ) ((ASTParserListener)listener).enterFormal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ASTParserListener ) ((ASTParserListener)listener).exitFormal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ASTParserVisitor ) return ((ASTParserVisitor<? extends T>)visitor).visitFormal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FormalContext formal() throws RecognitionException {
		FormalContext _localctx = new FormalContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_formal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(67);
			match(LINENO);
			setState(68);
			match(FORMAL);
			setState(69);
			id();
			setState(70);
			type();
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
		public Expr_auxContext expr_aux() {
			return getRuleContext(Expr_auxContext.class,0);
		}
		public TerminalNode COLON() { return getToken(ASTParser.COLON, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode NO_TYPE() { return getToken(ASTParser.NO_TYPE, 0); }
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ASTParserListener ) ((ASTParserListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ASTParserListener ) ((ASTParserListener)listener).exitExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ASTParserVisitor ) return ((ASTParserVisitor<? extends T>)visitor).visitExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_expr);
		try {
			setState(80);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(72);
				expr_aux();
				setState(73);
				match(COLON);
				setState(74);
				type();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(76);
				expr_aux();
				setState(77);
				match(COLON);
				setState(78);
				match(NO_TYPE);
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

	public static class Expr_auxContext extends ParserRuleContext {
		public Expr_auxContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_aux; }
	 
		public Expr_auxContext() { }
		public void copyFrom(Expr_auxContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class LoopContext extends Expr_auxContext {
		public TerminalNode LINENO() { return getToken(ASTParser.LINENO, 0); }
		public TerminalNode LOOP() { return getToken(ASTParser.LOOP, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public LoopContext(Expr_auxContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ASTParserListener ) ((ASTParserListener)listener).enterLoop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ASTParserListener ) ((ASTParserListener)listener).exitLoop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ASTParserVisitor ) return ((ASTParserVisitor<? extends T>)visitor).visitLoop(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NewContext extends Expr_auxContext {
		public TerminalNode LINENO() { return getToken(ASTParser.LINENO, 0); }
		public TerminalNode NEW() { return getToken(ASTParser.NEW, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public NewContext(Expr_auxContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ASTParserListener ) ((ASTParserListener)listener).enterNew(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ASTParserListener ) ((ASTParserListener)listener).exitNew(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ASTParserVisitor ) return ((ASTParserVisitor<? extends T>)visitor).visitNew(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NoExprContext extends Expr_auxContext {
		public TerminalNode LINENO() { return getToken(ASTParser.LINENO, 0); }
		public TerminalNode NO_EXPR() { return getToken(ASTParser.NO_EXPR, 0); }
		public NoExprContext(Expr_auxContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ASTParserListener ) ((ASTParserListener)listener).enterNoExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ASTParserListener ) ((ASTParserListener)listener).exitNoExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ASTParserVisitor ) return ((ASTParserVisitor<? extends T>)visitor).visitNoExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CondContext extends Expr_auxContext {
		public TerminalNode LINENO() { return getToken(ASTParser.LINENO, 0); }
		public TerminalNode COND() { return getToken(ASTParser.COND, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public CondContext(Expr_auxContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ASTParserListener ) ((ASTParserListener)listener).enterCond(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ASTParserListener ) ((ASTParserListener)listener).exitCond(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ASTParserVisitor ) return ((ASTParserVisitor<? extends T>)visitor).visitCond(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IsvoidContext extends Expr_auxContext {
		public TerminalNode LINENO() { return getToken(ASTParser.LINENO, 0); }
		public TerminalNode ISVOID() { return getToken(ASTParser.ISVOID, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public IsvoidContext(Expr_auxContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ASTParserListener ) ((ASTParserListener)listener).enterIsvoid(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ASTParserListener ) ((ASTParserListener)listener).exitIsvoid(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ASTParserVisitor ) return ((ASTParserVisitor<? extends T>)visitor).visitIsvoid(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StaticDispatchContext extends Expr_auxContext {
		public TerminalNode LINENO() { return getToken(ASTParser.LINENO, 0); }
		public TerminalNode STATIC_DISPATCH() { return getToken(ASTParser.STATIC_DISPATCH, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(ASTParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(ASTParser.RPAREN, 0); }
		public StaticDispatchContext(Expr_auxContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ASTParserListener ) ((ASTParserListener)listener).enterStaticDispatch(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ASTParserListener ) ((ASTParserListener)listener).exitStaticDispatch(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ASTParserVisitor ) return ((ASTParserVisitor<? extends T>)visitor).visitStaticDispatch(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ConstStrContext extends Expr_auxContext {
		public TerminalNode LINENO() { return getToken(ASTParser.LINENO, 0); }
		public TerminalNode STR() { return getToken(ASTParser.STR, 0); }
		public TerminalNode STR_CONST() { return getToken(ASTParser.STR_CONST, 0); }
		public ConstStrContext(Expr_auxContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ASTParserListener ) ((ASTParserListener)listener).enterConstStr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ASTParserListener ) ((ASTParserListener)listener).exitConstStr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ASTParserVisitor ) return ((ASTParserVisitor<? extends T>)visitor).visitConstStr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ConstIntContext extends Expr_auxContext {
		public TerminalNode LINENO() { return getToken(ASTParser.LINENO, 0); }
		public TerminalNode INT() { return getToken(ASTParser.INT, 0); }
		public TerminalNode INT_CONST() { return getToken(ASTParser.INT_CONST, 0); }
		public ConstIntContext(Expr_auxContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ASTParserListener ) ((ASTParserListener)listener).enterConstInt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ASTParserListener ) ((ASTParserListener)listener).exitConstInt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ASTParserVisitor ) return ((ASTParserVisitor<? extends T>)visitor).visitConstInt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CaseContext extends Expr_auxContext {
		public TerminalNode LINENO() { return getToken(ASTParser.LINENO, 0); }
		public TerminalNode TYPCASE() { return getToken(ASTParser.TYPCASE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<SimplecaseContext> simplecase() {
			return getRuleContexts(SimplecaseContext.class);
		}
		public SimplecaseContext simplecase(int i) {
			return getRuleContext(SimplecaseContext.class,i);
		}
		public CaseContext(Expr_auxContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ASTParserListener ) ((ASTParserListener)listener).enterCase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ASTParserListener ) ((ASTParserListener)listener).exitCase(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ASTParserVisitor ) return ((ASTParserVisitor<? extends T>)visitor).visitCase(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class UnopContext extends Expr_auxContext {
		public TerminalNode LINENO() { return getToken(ASTParser.LINENO, 0); }
		public TerminalNode NEG() { return getToken(ASTParser.NEG, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode COMP() { return getToken(ASTParser.COMP, 0); }
		public UnopContext(Expr_auxContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ASTParserListener ) ((ASTParserListener)listener).enterUnop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ASTParserListener ) ((ASTParserListener)listener).exitUnop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ASTParserVisitor ) return ((ASTParserVisitor<? extends T>)visitor).visitUnop(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ConstBoolContext extends Expr_auxContext {
		public TerminalNode LINENO() { return getToken(ASTParser.LINENO, 0); }
		public TerminalNode BOOL() { return getToken(ASTParser.BOOL, 0); }
		public TerminalNode INT_CONST() { return getToken(ASTParser.INT_CONST, 0); }
		public ConstBoolContext(Expr_auxContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ASTParserListener ) ((ASTParserListener)listener).enterConstBool(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ASTParserListener ) ((ASTParserListener)listener).exitConstBool(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ASTParserVisitor ) return ((ASTParserVisitor<? extends T>)visitor).visitConstBool(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ObjContext extends Expr_auxContext {
		public TerminalNode LINENO() { return getToken(ASTParser.LINENO, 0); }
		public TerminalNode OBJECT() { return getToken(ASTParser.OBJECT, 0); }
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public ObjContext(Expr_auxContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ASTParserListener ) ((ASTParserListener)listener).enterObj(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ASTParserListener ) ((ASTParserListener)listener).exitObj(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ASTParserVisitor ) return ((ASTParserVisitor<? extends T>)visitor).visitObj(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BlockContext extends Expr_auxContext {
		public TerminalNode LINENO() { return getToken(ASTParser.LINENO, 0); }
		public TerminalNode BLOCK() { return getToken(ASTParser.BLOCK, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public BlockContext(Expr_auxContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ASTParserListener ) ((ASTParserListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ASTParserListener ) ((ASTParserListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ASTParserVisitor ) return ((ASTParserVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AssignContext extends Expr_auxContext {
		public TerminalNode LINENO() { return getToken(ASTParser.LINENO, 0); }
		public TerminalNode ASSIGN() { return getToken(ASTParser.ASSIGN, 0); }
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public AssignContext(Expr_auxContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ASTParserListener ) ((ASTParserListener)listener).enterAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ASTParserListener ) ((ASTParserListener)listener).exitAssign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ASTParserVisitor ) return ((ASTParserVisitor<? extends T>)visitor).visitAssign(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DynamicDispatchContext extends Expr_auxContext {
		public TerminalNode LINENO() { return getToken(ASTParser.LINENO, 0); }
		public TerminalNode DISPATCH() { return getToken(ASTParser.DISPATCH, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(ASTParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(ASTParser.RPAREN, 0); }
		public DynamicDispatchContext(Expr_auxContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ASTParserListener ) ((ASTParserListener)listener).enterDynamicDispatch(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ASTParserListener ) ((ASTParserListener)listener).exitDynamicDispatch(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ASTParserVisitor ) return ((ASTParserVisitor<? extends T>)visitor).visitDynamicDispatch(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LetContext extends Expr_auxContext {
		public TerminalNode LINENO() { return getToken(ASTParser.LINENO, 0); }
		public TerminalNode LET() { return getToken(ASTParser.LET, 0); }
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public LetContext(Expr_auxContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ASTParserListener ) ((ASTParserListener)listener).enterLet(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ASTParserListener ) ((ASTParserListener)listener).exitLet(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ASTParserVisitor ) return ((ASTParserVisitor<? extends T>)visitor).visitLet(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BinopContext extends Expr_auxContext {
		public TerminalNode LINENO() { return getToken(ASTParser.LINENO, 0); }
		public TerminalNode PLUS() { return getToken(ASTParser.PLUS, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode SUB() { return getToken(ASTParser.SUB, 0); }
		public TerminalNode MUL() { return getToken(ASTParser.MUL, 0); }
		public TerminalNode DIVIDE() { return getToken(ASTParser.DIVIDE, 0); }
		public TerminalNode LT() { return getToken(ASTParser.LT, 0); }
		public TerminalNode EQ() { return getToken(ASTParser.EQ, 0); }
		public TerminalNode LEQ() { return getToken(ASTParser.LEQ, 0); }
		public BinopContext(Expr_auxContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ASTParserListener ) ((ASTParserListener)listener).enterBinop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ASTParserListener ) ((ASTParserListener)listener).exitBinop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ASTParserVisitor ) return ((ASTParserVisitor<? extends T>)visitor).visitBinop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr_auxContext expr_aux() throws RecognitionException {
		Expr_auxContext _localctx = new Expr_auxContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_expr_aux);
		int _la;
		try {
			setState(208);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				_localctx = new AssignContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(82);
				match(LINENO);
				setState(83);
				match(ASSIGN);
				setState(84);
				id();
				setState(85);
				expr();
				}
				break;
			case 2:
				_localctx = new StaticDispatchContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(87);
				match(LINENO);
				setState(88);
				match(STATIC_DISPATCH);
				setState(89);
				expr();
				setState(90);
				type();
				setState(91);
				id();
				setState(92);
				match(LPAREN);
				setState(96);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LINENO) {
					{
					{
					setState(93);
					expr();
					}
					}
					setState(98);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(99);
				match(RPAREN);
				}
				break;
			case 3:
				_localctx = new DynamicDispatchContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(101);
				match(LINENO);
				setState(102);
				match(DISPATCH);
				setState(103);
				expr();
				setState(104);
				id();
				setState(105);
				match(LPAREN);
				setState(109);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LINENO) {
					{
					{
					setState(106);
					expr();
					}
					}
					setState(111);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(112);
				match(RPAREN);
				}
				break;
			case 4:
				_localctx = new CondContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(114);
				match(LINENO);
				setState(115);
				match(COND);
				setState(116);
				expr();
				setState(117);
				expr();
				setState(118);
				expr();
				}
				break;
			case 5:
				_localctx = new LoopContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(120);
				match(LINENO);
				setState(121);
				match(LOOP);
				setState(122);
				expr();
				setState(123);
				expr();
				}
				break;
			case 6:
				_localctx = new BlockContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(125);
				match(LINENO);
				setState(126);
				match(BLOCK);
				setState(128); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(127);
					expr();
					}
					}
					setState(130); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==LINENO );
				}
				break;
			case 7:
				_localctx = new LetContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(132);
				match(LINENO);
				setState(133);
				match(LET);
				setState(134);
				id();
				setState(135);
				type();
				setState(136);
				expr();
				setState(137);
				expr();
				}
				break;
			case 8:
				_localctx = new CaseContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(139);
				match(LINENO);
				setState(140);
				match(TYPCASE);
				setState(141);
				expr();
				setState(143); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(142);
					simplecase();
					}
					}
					setState(145); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==LINENO );
				}
				break;
			case 9:
				_localctx = new NewContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(147);
				match(LINENO);
				setState(148);
				match(NEW);
				setState(149);
				type();
				}
				break;
			case 10:
				_localctx = new IsvoidContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(150);
				match(LINENO);
				setState(151);
				match(ISVOID);
				setState(152);
				expr();
				}
				break;
			case 11:
				_localctx = new BinopContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(153);
				match(LINENO);
				setState(154);
				match(PLUS);
				setState(155);
				expr();
				setState(156);
				expr();
				}
				break;
			case 12:
				_localctx = new BinopContext(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(158);
				match(LINENO);
				setState(159);
				match(SUB);
				setState(160);
				expr();
				setState(161);
				expr();
				}
				break;
			case 13:
				_localctx = new BinopContext(_localctx);
				enterOuterAlt(_localctx, 13);
				{
				setState(163);
				match(LINENO);
				setState(164);
				match(MUL);
				setState(165);
				expr();
				setState(166);
				expr();
				}
				break;
			case 14:
				_localctx = new BinopContext(_localctx);
				enterOuterAlt(_localctx, 14);
				{
				setState(168);
				match(LINENO);
				setState(169);
				match(DIVIDE);
				setState(170);
				expr();
				setState(171);
				expr();
				}
				break;
			case 15:
				_localctx = new UnopContext(_localctx);
				enterOuterAlt(_localctx, 15);
				{
				setState(173);
				match(LINENO);
				setState(174);
				match(NEG);
				setState(175);
				expr();
				}
				break;
			case 16:
				_localctx = new BinopContext(_localctx);
				enterOuterAlt(_localctx, 16);
				{
				setState(176);
				match(LINENO);
				setState(177);
				match(LT);
				setState(178);
				expr();
				setState(179);
				expr();
				}
				break;
			case 17:
				_localctx = new BinopContext(_localctx);
				enterOuterAlt(_localctx, 17);
				{
				setState(181);
				match(LINENO);
				setState(182);
				match(EQ);
				setState(183);
				expr();
				setState(184);
				expr();
				}
				break;
			case 18:
				_localctx = new BinopContext(_localctx);
				enterOuterAlt(_localctx, 18);
				{
				setState(186);
				match(LINENO);
				setState(187);
				match(LEQ);
				setState(188);
				expr();
				setState(189);
				expr();
				}
				break;
			case 19:
				_localctx = new UnopContext(_localctx);
				enterOuterAlt(_localctx, 19);
				{
				setState(191);
				match(LINENO);
				setState(192);
				match(COMP);
				setState(193);
				expr();
				}
				break;
			case 20:
				_localctx = new ConstIntContext(_localctx);
				enterOuterAlt(_localctx, 20);
				{
				setState(194);
				match(LINENO);
				setState(195);
				match(INT);
				setState(196);
				match(INT_CONST);
				}
				break;
			case 21:
				_localctx = new ConstStrContext(_localctx);
				enterOuterAlt(_localctx, 21);
				{
				setState(197);
				match(LINENO);
				setState(198);
				match(STR);
				setState(199);
				match(STR_CONST);
				}
				break;
			case 22:
				_localctx = new ConstBoolContext(_localctx);
				enterOuterAlt(_localctx, 22);
				{
				setState(200);
				match(LINENO);
				setState(201);
				match(BOOL);
				setState(202);
				match(INT_CONST);
				}
				break;
			case 23:
				_localctx = new ObjContext(_localctx);
				enterOuterAlt(_localctx, 23);
				{
				setState(203);
				match(LINENO);
				setState(204);
				match(OBJECT);
				setState(205);
				id();
				}
				break;
			case 24:
				_localctx = new NoExprContext(_localctx);
				enterOuterAlt(_localctx, 24);
				{
				setState(206);
				match(LINENO);
				setState(207);
				match(NO_EXPR);
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

	public static class SimplecaseContext extends ParserRuleContext {
		public TerminalNode LINENO() { return getToken(ASTParser.LINENO, 0); }
		public TerminalNode BRANCH() { return getToken(ASTParser.BRANCH, 0); }
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public SimplecaseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simplecase; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ASTParserListener ) ((ASTParserListener)listener).enterSimplecase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ASTParserListener ) ((ASTParserListener)listener).exitSimplecase(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ASTParserVisitor ) return ((ASTParserVisitor<? extends T>)visitor).visitSimplecase(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SimplecaseContext simplecase() throws RecognitionException {
		SimplecaseContext _localctx = new SimplecaseContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_simplecase);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(210);
			match(LINENO);
			setState(211);
			match(BRANCH);
			setState(212);
			id();
			setState(213);
			type();
			setState(214);
			expr();
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

	public static class TypeContext extends ParserRuleContext {
		public TerminalNode TYPE() { return getToken(ASTParser.TYPE, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ASTParserListener ) ((ASTParserListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ASTParserListener ) ((ASTParserListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ASTParserVisitor ) return ((ASTParserVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(216);
			match(TYPE);
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
		public TerminalNode ID() { return getToken(ASTParser.ID, 0); }
		public IdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_id; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ASTParserListener ) ((ASTParserListener)listener).enterId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ASTParserListener ) ((ASTParserListener)listener).exitId(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ASTParserVisitor ) return ((ASTParserVisitor<? extends T>)visitor).visitId(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdContext id() throws RecognitionException {
		IdContext _localctx = new IdContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_id);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(218);
			match(ID);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3*\u00df\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\3\2\3\2\3\2\6\2\34\n\2\r\2\16\2\35\3\2\3\2\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\7\3)\n\3\f\3\16\3,\13\3\3\3\3\3\3\4\3\4\5\4\62\n\4\3\5\3"+
		"\5\3\5\3\5\7\58\n\5\f\5\16\5;\13\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\bS\n\b\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\7\ta\n\t\f\t\16\td\13\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\7\tn\n\t\f\t\16\tq\13\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\6\t\u0083\n\t\r\t\16\t\u0084"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\6\t\u0092\n\t\r\t\16\t\u0093"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u00d3\n\t\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\13\3\13\3\f\3\f\3\f\2\2\r\2\4\6\b\n\f\16\20\22\24\26\2\2\u00f3\2"+
		"\30\3\2\2\2\4!\3\2\2\2\6\61\3\2\2\2\b\63\3\2\2\2\n?\3\2\2\2\fE\3\2\2\2"+
		"\16R\3\2\2\2\20\u00d2\3\2\2\2\22\u00d4\3\2\2\2\24\u00da\3\2\2\2\26\u00dc"+
		"\3\2\2\2\30\31\7\6\2\2\31\33\7\7\2\2\32\34\5\4\3\2\33\32\3\2\2\2\34\35"+
		"\3\2\2\2\35\33\3\2\2\2\35\36\3\2\2\2\36\37\3\2\2\2\37 \7\2\2\3 \3\3\2"+
		"\2\2!\"\7\6\2\2\"#\7\b\2\2#$\5\24\13\2$%\5\24\13\2%&\7*\2\2&*\7\'\2\2"+
		"\')\5\6\4\2(\'\3\2\2\2),\3\2\2\2*(\3\2\2\2*+\3\2\2\2+-\3\2\2\2,*\3\2\2"+
		"\2-.\7(\2\2.\5\3\2\2\2/\62\5\n\6\2\60\62\5\b\5\2\61/\3\2\2\2\61\60\3\2"+
		"\2\2\62\7\3\2\2\2\63\64\7\6\2\2\64\65\7\t\2\2\659\5\26\f\2\668\5\f\7\2"+
		"\67\66\3\2\2\28;\3\2\2\29\67\3\2\2\29:\3\2\2\2:<\3\2\2\2;9\3\2\2\2<=\5"+
		"\24\13\2=>\5\16\b\2>\t\3\2\2\2?@\7\6\2\2@A\7\n\2\2AB\5\26\f\2BC\5\24\13"+
		"\2CD\5\16\b\2D\13\3\2\2\2EF\7\6\2\2FG\7\13\2\2GH\5\26\f\2HI\5\24\13\2"+
		"I\r\3\2\2\2JK\5\20\t\2KL\7&\2\2LM\5\24\13\2MS\3\2\2\2NO\5\20\t\2OP\7&"+
		"\2\2PQ\7$\2\2QS\3\2\2\2RJ\3\2\2\2RN\3\2\2\2S\17\3\2\2\2TU\7\6\2\2UV\7"+
		"\r\2\2VW\5\26\f\2WX\5\16\b\2X\u00d3\3\2\2\2YZ\7\6\2\2Z[\7\16\2\2[\\\5"+
		"\16\b\2\\]\5\24\13\2]^\5\26\f\2^b\7\'\2\2_a\5\16\b\2`_\3\2\2\2ad\3\2\2"+
		"\2b`\3\2\2\2bc\3\2\2\2ce\3\2\2\2db\3\2\2\2ef\7(\2\2f\u00d3\3\2\2\2gh\7"+
		"\6\2\2hi\7\17\2\2ij\5\16\b\2jk\5\26\f\2ko\7\'\2\2ln\5\16\b\2ml\3\2\2\2"+
		"nq\3\2\2\2om\3\2\2\2op\3\2\2\2pr\3\2\2\2qo\3\2\2\2rs\7(\2\2s\u00d3\3\2"+
		"\2\2tu\7\6\2\2uv\7\20\2\2vw\5\16\b\2wx\5\16\b\2xy\5\16\b\2y\u00d3\3\2"+
		"\2\2z{\7\6\2\2{|\7\21\2\2|}\5\16\b\2}~\5\16\b\2~\u00d3\3\2\2\2\177\u0080"+
		"\7\6\2\2\u0080\u0082\7\23\2\2\u0081\u0083\5\16\b\2\u0082\u0081\3\2\2\2"+
		"\u0083\u0084\3\2\2\2\u0084\u0082\3\2\2\2\u0084\u0085\3\2\2\2\u0085\u00d3"+
		"\3\2\2\2\u0086\u0087\7\6\2\2\u0087\u0088\7\24\2\2\u0088\u0089\5\26\f\2"+
		"\u0089\u008a\5\24\13\2\u008a\u008b\5\16\b\2\u008b\u008c\5\16\b\2\u008c"+
		"\u00d3\3\2\2\2\u008d\u008e\7\6\2\2\u008e\u008f\7\22\2\2\u008f\u0091\5"+
		"\16\b\2\u0090\u0092\5\22\n\2\u0091\u0090\3\2\2\2\u0092\u0093\3\2\2\2\u0093"+
		"\u0091\3\2\2\2\u0093\u0094\3\2\2\2\u0094\u00d3\3\2\2\2\u0095\u0096\7\6"+
		"\2\2\u0096\u0097\7!\2\2\u0097\u00d3\5\24\13\2\u0098\u0099\7\6\2\2\u0099"+
		"\u009a\7\"\2\2\u009a\u00d3\5\16\b\2\u009b\u009c\7\6\2\2\u009c\u009d\7"+
		"\25\2\2\u009d\u009e\5\16\b\2\u009e\u009f\5\16\b\2\u009f\u00d3\3\2\2\2"+
		"\u00a0\u00a1\7\6\2\2\u00a1\u00a2\7\26\2\2\u00a2\u00a3\5\16\b\2\u00a3\u00a4"+
		"\5\16\b\2\u00a4\u00d3\3\2\2\2\u00a5\u00a6\7\6\2\2\u00a6\u00a7\7\27\2\2"+
		"\u00a7\u00a8\5\16\b\2\u00a8\u00a9\5\16\b\2\u00a9\u00d3\3\2\2\2\u00aa\u00ab"+
		"\7\6\2\2\u00ab\u00ac\7\30\2\2\u00ac\u00ad\5\16\b\2\u00ad\u00ae\5\16\b"+
		"\2\u00ae\u00d3\3\2\2\2\u00af\u00b0\7\6\2\2\u00b0\u00b1\7\31\2\2\u00b1"+
		"\u00d3\5\16\b\2\u00b2\u00b3\7\6\2\2\u00b3\u00b4\7\32\2\2\u00b4\u00b5\5"+
		"\16\b\2\u00b5\u00b6\5\16\b\2\u00b6\u00d3\3\2\2\2\u00b7\u00b8\7\6\2\2\u00b8"+
		"\u00b9\7\33\2\2\u00b9\u00ba\5\16\b\2\u00ba\u00bb\5\16\b\2\u00bb\u00d3"+
		"\3\2\2\2\u00bc\u00bd\7\6\2\2\u00bd\u00be\7\34\2\2\u00be\u00bf\5\16\b\2"+
		"\u00bf\u00c0\5\16\b\2\u00c0\u00d3\3\2\2\2\u00c1\u00c2\7\6\2\2\u00c2\u00c3"+
		"\7\35\2\2\u00c3\u00d3\5\16\b\2\u00c4\u00c5\7\6\2\2\u00c5\u00c6\7\36\2"+
		"\2\u00c6\u00d3\7\5\2\2\u00c7\u00c8\7\6\2\2\u00c8\u00c9\7\37\2\2\u00c9"+
		"\u00d3\7*\2\2\u00ca\u00cb\7\6\2\2\u00cb\u00cc\7 \2\2\u00cc\u00d3\7\5\2"+
		"\2\u00cd\u00ce\7\6\2\2\u00ce\u00cf\7%\2\2\u00cf\u00d3\5\26\f\2\u00d0\u00d1"+
		"\7\6\2\2\u00d1\u00d3\7#\2\2\u00d2T\3\2\2\2\u00d2Y\3\2\2\2\u00d2g\3\2\2"+
		"\2\u00d2t\3\2\2\2\u00d2z\3\2\2\2\u00d2\177\3\2\2\2\u00d2\u0086\3\2\2\2"+
		"\u00d2\u008d\3\2\2\2\u00d2\u0095\3\2\2\2\u00d2\u0098\3\2\2\2\u00d2\u009b"+
		"\3\2\2\2\u00d2\u00a0\3\2\2\2\u00d2\u00a5\3\2\2\2\u00d2\u00aa\3\2\2\2\u00d2"+
		"\u00af\3\2\2\2\u00d2\u00b2\3\2\2\2\u00d2\u00b7\3\2\2\2\u00d2\u00bc\3\2"+
		"\2\2\u00d2\u00c1\3\2\2\2\u00d2\u00c4\3\2\2\2\u00d2\u00c7\3\2\2\2\u00d2"+
		"\u00ca\3\2\2\2\u00d2\u00cd\3\2\2\2\u00d2\u00d0\3\2\2\2\u00d3\21\3\2\2"+
		"\2\u00d4\u00d5\7\6\2\2\u00d5\u00d6\7\f\2\2\u00d6\u00d7\5\26\f\2\u00d7"+
		"\u00d8\5\24\13\2\u00d8\u00d9\5\16\b\2\u00d9\23\3\2\2\2\u00da\u00db\7\3"+
		"\2\2\u00db\25\3\2\2\2\u00dc\u00dd\7\4\2\2\u00dd\27\3\2\2\2\f\35*\619R"+
		"bo\u0084\u0093\u00d2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}