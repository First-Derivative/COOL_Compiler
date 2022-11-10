// Generated from /Users/NCC1701-C/cool/LCARS/src/ast/parser/ASTLexer.g4 by ANTLR 4.6
package ast.parser;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ASTLexer extends Lexer {
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
	public static final int STRING_MODE = 1;
	public static String[] modeNames = {
		"DEFAULT_MODE", "STRING_MODE"
	};

	public static final String[] ruleNames = {
		"TYPE", "ID", "IDENTIFIER", "INT_CONST", "LINENO", "PROGRAM", "CLASS", 
		"METHOD", "ATTR", "FORMAL", "BRANCH", "ASSIGN", "STATIC_DISPATCH", "DISPATCH", 
		"COND", "LOOP", "TYPCASE", "BLOCK", "LET", "PLUS", "SUB", "MUL", "DIVIDE", 
		"NEG", "LT", "EQ", "LEQ", "COMP", "INT", "STR", "BOOL", "NEW", "ISVOID", 
		"NO_EXPR", "NO_TYPE", "OBJECT", "COLON", "LPAREN", "RPAREN", "WHITESPACE", 
		"STRING_OPEN", "STR_CONST", "STRING_ESCAPE_SEQUENCE", "STRING_VALID_CHAR"
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


	    StringBuilder buf;


	public ASTLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "ASTLexer.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 4:
			LINENO_action((RuleContext)_localctx, actionIndex);
			break;
		case 40:
			STRING_OPEN_action((RuleContext)_localctx, actionIndex);
			break;
		case 41:
			STR_CONST_action((RuleContext)_localctx, actionIndex);
			break;
		case 42:
			STRING_ESCAPE_SEQUENCE_action((RuleContext)_localctx, actionIndex);
			break;
		case 43:
			STRING_VALID_CHAR_action((RuleContext)_localctx, actionIndex);
			break;
		}
	}
	private void LINENO_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0:
			 setText(getText().substring(1)); 
			break;
		}
	}
	private void STRING_OPEN_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 1:
			 buf = new StringBuilder(); 
			break;
		}
	}
	private void STR_CONST_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 2:

			        setText(buf.toString());
			    
			break;
		}
	}
	private void STRING_ESCAPE_SEQUENCE_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 3:
			 buf.append('\n'); 
			break;
		case 4:
			 buf.append('\t'); 
			break;
		case 5:
			 buf.append('\b'); 
			break;
		case 6:
			 buf.append('\f'); 
			break;
		case 7:
			 buf.append((char)Integer.parseInt(getText().substring(2), 16)); 
			break;
		case 8:
			 buf.append(getText().substring(1)); 
			break;
		}
	}
	private void STRING_VALID_CHAR_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 9:
			 buf.append(getText()); 
			break;
		}
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2*\u0185\b\1\b\1\4"+
		"\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n"+
		"\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\3\2\3\2\7\2_\n\2\f\2\16\2b\13\2\3\3\3\3\7\3f\n\3\f\3\16"+
		"\3i\13\3\3\4\3\4\3\5\6\5n\n\5\r\5\16\5o\3\6\3\6\6\6t\n\6\r\6\16\6u\3\6"+
		"\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\33"+
		"\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35"+
		"\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3 \3"+
		" \3 \3 \3 \3 \3!\3!\3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3#\3#\3#"+
		"\3#\3#\3#\3#\3#\3#\3$\3$\3$\3$\3$\3$\3$\3$\3$\3%\3%\3%\3%\3%\3%\3%\3%"+
		"\3&\3&\3\'\3\'\3(\3(\3)\3)\3)\3)\3*\3*\3*\3*\3*\3*\3+\3+\3+\3+\3+\3,\3"+
		",\3,\3,\3,\3,\3,\3,\3,\3,\3,\6,\u0176\n,\r,\16,\u0177\3,\3,\3,\5,\u017d"+
		"\n,\3,\3,\3-\3-\3-\3-\3-\2\2.\4\3\6\4\b\2\n\5\f\6\16\7\20\b\22\t\24\n"+
		"\26\13\30\f\32\r\34\16\36\17 \20\"\21$\22&\23(\24*\25,\26.\27\60\30\62"+
		"\31\64\32\66\338\34:\35<\36>\37@ B!D\"F#H$J%L&N\'P(R)T\2V*X\2Z\2\4\2\3"+
		"\7\3\2C\\\3\2c|\6\2\62;C\\aac|\3\2\62;\5\2\n\f\16\17\"\"\u018c\2\4\3\2"+
		"\2\2\2\6\3\2\2\2\2\n\3\2\2\2\2\f\3\2\2\2\2\16\3\2\2\2\2\20\3\2\2\2\2\22"+
		"\3\2\2\2\2\24\3\2\2\2\2\26\3\2\2\2\2\30\3\2\2\2\2\32\3\2\2\2\2\34\3\2"+
		"\2\2\2\36\3\2\2\2\2 \3\2\2\2\2\"\3\2\2\2\2$\3\2\2\2\2&\3\2\2\2\2(\3\2"+
		"\2\2\2*\3\2\2\2\2,\3\2\2\2\2.\3\2\2\2\2\60\3\2\2\2\2\62\3\2\2\2\2\64\3"+
		"\2\2\2\2\66\3\2\2\2\28\3\2\2\2\2:\3\2\2\2\2<\3\2\2\2\2>\3\2\2\2\2@\3\2"+
		"\2\2\2B\3\2\2\2\2D\3\2\2\2\2F\3\2\2\2\2H\3\2\2\2\2J\3\2\2\2\2L\3\2\2\2"+
		"\2N\3\2\2\2\2P\3\2\2\2\2R\3\2\2\2\2T\3\2\2\2\3V\3\2\2\2\3X\3\2\2\2\3Z"+
		"\3\2\2\2\4\\\3\2\2\2\6c\3\2\2\2\bj\3\2\2\2\nm\3\2\2\2\fq\3\2\2\2\16y\3"+
		"\2\2\2\20\u0082\3\2\2\2\22\u0089\3\2\2\2\24\u0091\3\2\2\2\26\u0097\3\2"+
		"\2\2\30\u009f\3\2\2\2\32\u00a7\3\2\2\2\34\u00af\3\2\2\2\36\u00c0\3\2\2"+
		"\2 \u00ca\3\2\2\2\"\u00d0\3\2\2\2$\u00d6\3\2\2\2&\u00df\3\2\2\2(\u00e6"+
		"\3\2\2\2*\u00eb\3\2\2\2,\u00f1\3\2\2\2.\u00f6\3\2\2\2\60\u00fb\3\2\2\2"+
		"\62\u0103\3\2\2\2\64\u0108\3\2\2\2\66\u010c\3\2\2\28\u0110\3\2\2\2:\u0115"+
		"\3\2\2\2<\u011b\3\2\2\2>\u0120\3\2\2\2@\u0128\3\2\2\2B\u012e\3\2\2\2D"+
		"\u0133\3\2\2\2F\u013b\3\2\2\2H\u0144\3\2\2\2J\u014d\3\2\2\2L\u0155\3\2"+
		"\2\2N\u0157\3\2\2\2P\u0159\3\2\2\2R\u015b\3\2\2\2T\u015f\3\2\2\2V\u0165"+
		"\3\2\2\2X\u016a\3\2\2\2Z\u0180\3\2\2\2\\`\t\2\2\2]_\5\b\4\2^]\3\2\2\2"+
		"_b\3\2\2\2`^\3\2\2\2`a\3\2\2\2a\5\3\2\2\2b`\3\2\2\2cg\t\3\2\2df\5\b\4"+
		"\2ed\3\2\2\2fi\3\2\2\2ge\3\2\2\2gh\3\2\2\2h\7\3\2\2\2ig\3\2\2\2jk\t\4"+
		"\2\2k\t\3\2\2\2ln\t\5\2\2ml\3\2\2\2no\3\2\2\2om\3\2\2\2op\3\2\2\2p\13"+
		"\3\2\2\2qs\7%\2\2rt\t\5\2\2sr\3\2\2\2tu\3\2\2\2us\3\2\2\2uv\3\2\2\2vw"+
		"\3\2\2\2wx\b\6\2\2x\r\3\2\2\2yz\7a\2\2z{\7r\2\2{|\7t\2\2|}\7q\2\2}~\7"+
		"i\2\2~\177\7t\2\2\177\u0080\7c\2\2\u0080\u0081\7o\2\2\u0081\17\3\2\2\2"+
		"\u0082\u0083\7a\2\2\u0083\u0084\7e\2\2\u0084\u0085\7n\2\2\u0085\u0086"+
		"\7c\2\2\u0086\u0087\7u\2\2\u0087\u0088\7u\2\2\u0088\21\3\2\2\2\u0089\u008a"+
		"\7a\2\2\u008a\u008b\7o\2\2\u008b\u008c\7g\2\2\u008c\u008d\7v\2\2\u008d"+
		"\u008e\7j\2\2\u008e\u008f\7q\2\2\u008f\u0090\7f\2\2\u0090\23\3\2\2\2\u0091"+
		"\u0092\7a\2\2\u0092\u0093\7c\2\2\u0093\u0094\7v\2\2\u0094\u0095\7v\2\2"+
		"\u0095\u0096\7t\2\2\u0096\25\3\2\2\2\u0097\u0098\7a\2\2\u0098\u0099\7"+
		"h\2\2\u0099\u009a\7q\2\2\u009a\u009b\7t\2\2\u009b\u009c\7o\2\2\u009c\u009d"+
		"\7c\2\2\u009d\u009e\7n\2\2\u009e\27\3\2\2\2\u009f\u00a0\7a\2\2\u00a0\u00a1"+
		"\7d\2\2\u00a1\u00a2\7t\2\2\u00a2\u00a3\7c\2\2\u00a3\u00a4\7p\2\2\u00a4"+
		"\u00a5\7e\2\2\u00a5\u00a6\7j\2\2\u00a6\31\3\2\2\2\u00a7\u00a8\7a\2\2\u00a8"+
		"\u00a9\7c\2\2\u00a9\u00aa\7u\2\2\u00aa\u00ab\7u\2\2\u00ab\u00ac\7k\2\2"+
		"\u00ac\u00ad\7i\2\2\u00ad\u00ae\7p\2\2\u00ae\33\3\2\2\2\u00af\u00b0\7"+
		"a\2\2\u00b0\u00b1\7u\2\2\u00b1\u00b2\7v\2\2\u00b2\u00b3\7c\2\2\u00b3\u00b4"+
		"\7v\2\2\u00b4\u00b5\7k\2\2\u00b5\u00b6\7e\2\2\u00b6\u00b7\7a\2\2\u00b7"+
		"\u00b8\7f\2\2\u00b8\u00b9\7k\2\2\u00b9\u00ba\7u\2\2\u00ba\u00bb\7r\2\2"+
		"\u00bb\u00bc\7c\2\2\u00bc\u00bd\7v\2\2\u00bd\u00be\7e\2\2\u00be\u00bf"+
		"\7j\2\2\u00bf\35\3\2\2\2\u00c0\u00c1\7a\2\2\u00c1\u00c2\7f\2\2\u00c2\u00c3"+
		"\7k\2\2\u00c3\u00c4\7u\2\2\u00c4\u00c5\7r\2\2\u00c5\u00c6\7c\2\2\u00c6"+
		"\u00c7\7v\2\2\u00c7\u00c8\7e\2\2\u00c8\u00c9\7j\2\2\u00c9\37\3\2\2\2\u00ca"+
		"\u00cb\7a\2\2\u00cb\u00cc\7e\2\2\u00cc\u00cd\7q\2\2\u00cd\u00ce\7p\2\2"+
		"\u00ce\u00cf\7f\2\2\u00cf!\3\2\2\2\u00d0\u00d1\7a\2\2\u00d1\u00d2\7n\2"+
		"\2\u00d2\u00d3\7q\2\2\u00d3\u00d4\7q\2\2\u00d4\u00d5\7r\2\2\u00d5#\3\2"+
		"\2\2\u00d6\u00d7\7a\2\2\u00d7\u00d8\7v\2\2\u00d8\u00d9\7{\2\2\u00d9\u00da"+
		"\7r\2\2\u00da\u00db\7e\2\2\u00db\u00dc\7c\2\2\u00dc\u00dd\7u\2\2\u00dd"+
		"\u00de\7g\2\2\u00de%\3\2\2\2\u00df\u00e0\7a\2\2\u00e0\u00e1\7d\2\2\u00e1"+
		"\u00e2\7n\2\2\u00e2\u00e3\7q\2\2\u00e3\u00e4\7e\2\2\u00e4\u00e5\7m\2\2"+
		"\u00e5\'\3\2\2\2\u00e6\u00e7\7a\2\2\u00e7\u00e8\7n\2\2\u00e8\u00e9\7g"+
		"\2\2\u00e9\u00ea\7v\2\2\u00ea)\3\2\2\2\u00eb\u00ec\7a\2\2\u00ec\u00ed"+
		"\7r\2\2\u00ed\u00ee\7n\2\2\u00ee\u00ef\7w\2\2\u00ef\u00f0\7u\2\2\u00f0"+
		"+\3\2\2\2\u00f1\u00f2\7a\2\2\u00f2\u00f3\7u\2\2\u00f3\u00f4\7w\2\2\u00f4"+
		"\u00f5\7d\2\2\u00f5-\3\2\2\2\u00f6\u00f7\7a\2\2\u00f7\u00f8\7o\2\2\u00f8"+
		"\u00f9\7w\2\2\u00f9\u00fa\7n\2\2\u00fa/\3\2\2\2\u00fb\u00fc\7a\2\2\u00fc"+
		"\u00fd\7f\2\2\u00fd\u00fe\7k\2\2\u00fe\u00ff\7x\2\2\u00ff\u0100\7k\2\2"+
		"\u0100\u0101\7f\2\2\u0101\u0102\7g\2\2\u0102\61\3\2\2\2\u0103\u0104\7"+
		"a\2\2\u0104\u0105\7p\2\2\u0105\u0106\7g\2\2\u0106\u0107\7i\2\2\u0107\63"+
		"\3\2\2\2\u0108\u0109\7a\2\2\u0109\u010a\7n\2\2\u010a\u010b\7v\2\2\u010b"+
		"\65\3\2\2\2\u010c\u010d\7a\2\2\u010d\u010e\7g\2\2\u010e\u010f\7s\2\2\u010f"+
		"\67\3\2\2\2\u0110\u0111\7a\2\2\u0111\u0112\7n\2\2\u0112\u0113\7g\2\2\u0113"+
		"\u0114\7s\2\2\u01149\3\2\2\2\u0115\u0116\7a\2\2\u0116\u0117\7e\2\2\u0117"+
		"\u0118\7q\2\2\u0118\u0119\7o\2\2\u0119\u011a\7r\2\2\u011a;\3\2\2\2\u011b"+
		"\u011c\7a\2\2\u011c\u011d\7k\2\2\u011d\u011e\7p\2\2\u011e\u011f\7v\2\2"+
		"\u011f=\3\2\2\2\u0120\u0121\7a\2\2\u0121\u0122\7u\2\2\u0122\u0123\7v\2"+
		"\2\u0123\u0124\7t\2\2\u0124\u0125\7k\2\2\u0125\u0126\7p\2\2\u0126\u0127"+
		"\7i\2\2\u0127?\3\2\2\2\u0128\u0129\7a\2\2\u0129\u012a\7d\2\2\u012a\u012b"+
		"\7q\2\2\u012b\u012c\7q\2\2\u012c\u012d\7n\2\2\u012dA\3\2\2\2\u012e\u012f"+
		"\7a\2\2\u012f\u0130\7p\2\2\u0130\u0131\7g\2\2\u0131\u0132\7y\2\2\u0132"+
		"C\3\2\2\2\u0133\u0134\7a\2\2\u0134\u0135\7k\2\2\u0135\u0136\7u\2\2\u0136"+
		"\u0137\7x\2\2\u0137\u0138\7q\2\2\u0138\u0139\7k\2\2\u0139\u013a\7f\2\2"+
		"\u013aE\3\2\2\2\u013b\u013c\7a\2\2\u013c\u013d\7p\2\2\u013d\u013e\7q\2"+
		"\2\u013e\u013f\7a\2\2\u013f\u0140\7g\2\2\u0140\u0141\7z\2\2\u0141\u0142"+
		"\7r\2\2\u0142\u0143\7t\2\2\u0143G\3\2\2\2\u0144\u0145\7a\2\2\u0145\u0146"+
		"\7p\2\2\u0146\u0147\7q\2\2\u0147\u0148\7a\2\2\u0148\u0149\7v\2\2\u0149"+
		"\u014a\7{\2\2\u014a\u014b\7r\2\2\u014b\u014c\7g\2\2\u014cI\3\2\2\2\u014d"+
		"\u014e\7a\2\2\u014e\u014f\7q\2\2\u014f\u0150\7d\2\2\u0150\u0151\7l\2\2"+
		"\u0151\u0152\7g\2\2\u0152\u0153\7e\2\2\u0153\u0154\7v\2\2\u0154K\3\2\2"+
		"\2\u0155\u0156\7<\2\2\u0156M\3\2\2\2\u0157\u0158\7*\2\2\u0158O\3\2\2\2"+
		"\u0159\u015a\7+\2\2\u015aQ\3\2\2\2\u015b\u015c\t\6\2\2\u015c\u015d\3\2"+
		"\2\2\u015d\u015e\b)\3\2\u015eS\3\2\2\2\u015f\u0160\7$\2\2\u0160\u0161"+
		"\b*\4\2\u0161\u0162\3\2\2\2\u0162\u0163\b*\5\2\u0163\u0164\b*\6\2\u0164"+
		"U\3\2\2\2\u0165\u0166\7$\2\2\u0166\u0167\b+\7\2\u0167\u0168\3\2\2\2\u0168"+
		"\u0169\b+\b\2\u0169W\3\2\2\2\u016a\u017c\7^\2\2\u016b\u016c\7p\2\2\u016c"+
		"\u017d\b,\t\2\u016d\u016e\7v\2\2\u016e\u017d\b,\n\2\u016f\u0170\7d\2\2"+
		"\u0170\u017d\b,\13\2\u0171\u0172\7h\2\2\u0172\u017d\b,\f\2\u0173\u0175"+
		"\7w\2\2\u0174\u0176\t\5\2\2\u0175\u0174\3\2\2\2\u0176\u0177\3\2\2\2\u0177"+
		"\u0175\3\2\2\2\u0177\u0178\3\2\2\2\u0178\u0179\3\2\2\2\u0179\u017d\b,"+
		"\r\2\u017a\u017b\13\2\2\2\u017b\u017d\b,\16\2\u017c\u016b\3\2\2\2\u017c"+
		"\u016d\3\2\2\2\u017c\u016f\3\2\2\2\u017c\u0171\3\2\2\2\u017c\u0173\3\2"+
		"\2\2\u017c\u017a\3\2\2\2\u017d\u017e\3\2\2\2\u017e\u017f\b,\5\2\u017f"+
		"Y\3\2\2\2\u0180\u0181\13\2\2\2\u0181\u0182\b-\17\2\u0182\u0183\3\2\2\2"+
		"\u0183\u0184\b-\5\2\u0184[\3\2\2\2\n\2\3`gou\u0177\u017c\20\3\6\2\b\2"+
		"\2\3*\3\5\2\2\7\3\2\3+\4\6\2\2\3,\5\3,\6\3,\7\3,\b\3,\t\3,\n\3-\13";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}