// Generated from /Users/benjamin/Documents/uni/Year3/Compilers/distro/src/CoolLexer.g4 by ANTLR 4.8
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CoolLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		SINGLE_LINE_COMMENT=1, MULTI_LINE_COMMENT=2, PERIOD=3, COMMA=4, AT=5, 
		SEMICOLON=6, COLON=7, CURLY_OPEN=8, CURLY_CLOSE=9, PARENT_OPEN=10, PARENT_CLOSE=11, 
		PLUS_OPERATOR=12, MINUS_OPERATOR=13, MULT_OPERATOR=14, DIV_OPERATOR=15, 
		INT_COMPLEMENT_OPERATOR=16, LESS_OPERATOR=17, LESS_EQ_OPERATOR=18, EQ_OPERATOR=19, 
		ASSIGN_OPERATOR=20, RIGHTARROW=21, KEYWORD=22, STRING_CONST=23, INT_CONST=24, 
		IDENTIFIER=25, WS=26, ERROR=27;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"SINGLE_LINE_COMMENT", "MULTI_LINE_COMMENT", "PERIOD", "COMMA", "AT", 
			"SEMICOLON", "COLON", "CURLY_OPEN", "CURLY_CLOSE", "PARENT_OPEN", "PARENT_CLOSE", 
			"PLUS_OPERATOR", "MINUS_OPERATOR", "MULT_OPERATOR", "DIV_OPERATOR", "INT_COMPLEMENT_OPERATOR", 
			"LESS_OPERATOR", "LESS_EQ_OPERATOR", "EQ_OPERATOR", "ASSIGN_OPERATOR", 
			"RIGHTARROW", "DIGIT", "LETTER", "LETTER_", "ESCAPE_CHARACTERS", "CLASS", 
			"ELSE", "FI", "IF", "IN", "INHERITS", "ISVOID", "LET", "LOOP", "POOL", 
			"THEN", "WHILE", "CASE", "ESAC", "NEW", "OF", "NOT", "TRUE", "FALSE", 
			"KEYWORD", "STRING_CONST", "INT_CONST", "IDENTIFIER", "WS", "ERROR"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, "'.'", "','", "'@'", "';'", "':'", "'{'", "'}'", "'('", 
			"')'", "'+'", "'-'", "'*'", "'/'", "'~'", "'<'", "'<='", "'='", "'<-'", 
			"'=>'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "SINGLE_LINE_COMMENT", "MULTI_LINE_COMMENT", "PERIOD", "COMMA", 
			"AT", "SEMICOLON", "COLON", "CURLY_OPEN", "CURLY_CLOSE", "PARENT_OPEN", 
			"PARENT_CLOSE", "PLUS_OPERATOR", "MINUS_OPERATOR", "MULT_OPERATOR", "DIV_OPERATOR", 
			"INT_COMPLEMENT_OPERATOR", "LESS_OPERATOR", "LESS_EQ_OPERATOR", "EQ_OPERATOR", 
			"ASSIGN_OPERATOR", "RIGHTARROW", "KEYWORD", "STRING_CONST", "INT_CONST", 
			"IDENTIFIER", "WS", "ERROR"
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


	public CoolLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "CoolLexer.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\35\u0154\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\3\2"+
		"\3\2\3\2\3\2\7\2l\n\2\f\2\16\2o\13\2\3\2\5\2r\n\2\3\2\3\2\3\2\3\2\3\3"+
		"\3\3\3\3\3\3\7\3|\n\3\f\3\16\3\177\13\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3"+
		"\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3"+
		"\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\23\3"+
		"\24\3\24\3\25\3\25\3\25\3\26\3\26\3\26\3\27\6\27\u00b0\n\27\r\27\16\27"+
		"\u00b1\3\30\3\30\3\31\3\31\5\31\u00b8\n\31\3\32\3\32\3\33\3\33\3\33\3"+
		"\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\36\3\36\3\36\3"+
		"\37\3\37\3\37\3 \3 \3 \3 \3 \3 \3 \3 \3 \3!\3!\3!\3!\3!\3!\3!\3\"\3\""+
		"\3\"\3\"\3#\3#\3#\3#\3#\3$\3$\3$\3$\3$\3%\3%\3%\3%\3%\3&\3&\3&\3&\3&\3"+
		"&\3\'\3\'\3\'\3\'\3\'\3(\3(\3(\3(\3(\3)\3)\3)\3)\3*\3*\3*\3+\3+\3+\3+"+
		"\3,\3,\3,\3,\3,\3-\3-\3-\3-\3-\3-\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3."+
		"\3.\3.\3.\3.\3.\3.\3.\5.\u012c\n.\3/\3/\3/\3/\3/\3/\3/\5/\u0135\n/\3/"+
		"\7/\u0138\n/\f/\16/\u013b\13/\3/\3/\3\60\5\60\u0140\n\60\3\60\3\60\3\61"+
		"\3\61\3\61\7\61\u0147\n\61\f\61\16\61\u014a\13\61\3\62\6\62\u014d\n\62"+
		"\r\62\16\62\u014e\3\62\3\62\3\63\3\63\3}\2\64\3\3\5\4\7\5\t\6\13\7\r\b"+
		"\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26"+
		"+\27-\2/\2\61\2\63\2\65\2\67\29\2;\2=\2?\2A\2C\2E\2G\2I\2K\2M\2O\2Q\2"+
		"S\2U\2W\2Y\2[\30]\31_\32a\33c\34e\35\3\2\32\4\2\f\f\17\17\3\2\62;\4\2"+
		"C\\c|\6\2\n\f\16\17$$^^\4\2EEee\4\2NNnn\4\2CCcc\4\2UUuu\4\2GGgg\4\2HH"+
		"hh\4\2KKkk\4\2PPpp\4\2JJjj\4\2TTtt\4\2VVvv\4\2XXxx\4\2QQqq\4\2FFff\4\2"+
		"RRrr\4\2YYyy\4\2WWww\4\2\13\13^^\6\2\13\f\17\17$$^^\5\2\13\r\17\17\"\""+
		"\2\u015c\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2"+
		"\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27"+
		"\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2"+
		"\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2[\3\2\2\2"+
		"\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\3g\3\2\2\2\5w"+
		"\3\2\2\2\7\u0085\3\2\2\2\t\u0087\3\2\2\2\13\u0089\3\2\2\2\r\u008b\3\2"+
		"\2\2\17\u008d\3\2\2\2\21\u008f\3\2\2\2\23\u0091\3\2\2\2\25\u0093\3\2\2"+
		"\2\27\u0095\3\2\2\2\31\u0097\3\2\2\2\33\u0099\3\2\2\2\35\u009b\3\2\2\2"+
		"\37\u009d\3\2\2\2!\u009f\3\2\2\2#\u00a1\3\2\2\2%\u00a3\3\2\2\2\'\u00a6"+
		"\3\2\2\2)\u00a8\3\2\2\2+\u00ab\3\2\2\2-\u00af\3\2\2\2/\u00b3\3\2\2\2\61"+
		"\u00b7\3\2\2\2\63\u00b9\3\2\2\2\65\u00bb\3\2\2\2\67\u00c1\3\2\2\29\u00c6"+
		"\3\2\2\2;\u00c9\3\2\2\2=\u00cc\3\2\2\2?\u00cf\3\2\2\2A\u00d8\3\2\2\2C"+
		"\u00df\3\2\2\2E\u00e3\3\2\2\2G\u00e8\3\2\2\2I\u00ed\3\2\2\2K\u00f2\3\2"+
		"\2\2M\u00f8\3\2\2\2O\u00fd\3\2\2\2Q\u0102\3\2\2\2S\u0106\3\2\2\2U\u0109"+
		"\3\2\2\2W\u010d\3\2\2\2Y\u0112\3\2\2\2[\u012b\3\2\2\2]\u012d\3\2\2\2_"+
		"\u013f\3\2\2\2a\u0143\3\2\2\2c\u014c\3\2\2\2e\u0152\3\2\2\2gh\7/\2\2h"+
		"i\7/\2\2im\3\2\2\2jl\n\2\2\2kj\3\2\2\2lo\3\2\2\2mk\3\2\2\2mn\3\2\2\2n"+
		"q\3\2\2\2om\3\2\2\2pr\7\17\2\2qp\3\2\2\2qr\3\2\2\2rs\3\2\2\2st\7\f\2\2"+
		"tu\3\2\2\2uv\b\2\2\2v\4\3\2\2\2wx\7*\2\2xy\7,\2\2y}\3\2\2\2z|\13\2\2\2"+
		"{z\3\2\2\2|\177\3\2\2\2}~\3\2\2\2}{\3\2\2\2~\u0080\3\2\2\2\177}\3\2\2"+
		"\2\u0080\u0081\7,\2\2\u0081\u0082\7+\2\2\u0082\u0083\3\2\2\2\u0083\u0084"+
		"\b\3\2\2\u0084\6\3\2\2\2\u0085\u0086\7\60\2\2\u0086\b\3\2\2\2\u0087\u0088"+
		"\7.\2\2\u0088\n\3\2\2\2\u0089\u008a\7B\2\2\u008a\f\3\2\2\2\u008b\u008c"+
		"\7=\2\2\u008c\16\3\2\2\2\u008d\u008e\7<\2\2\u008e\20\3\2\2\2\u008f\u0090"+
		"\7}\2\2\u0090\22\3\2\2\2\u0091\u0092\7\177\2\2\u0092\24\3\2\2\2\u0093"+
		"\u0094\7*\2\2\u0094\26\3\2\2\2\u0095\u0096\7+\2\2\u0096\30\3\2\2\2\u0097"+
		"\u0098\7-\2\2\u0098\32\3\2\2\2\u0099\u009a\7/\2\2\u009a\34\3\2\2\2\u009b"+
		"\u009c\7,\2\2\u009c\36\3\2\2\2\u009d\u009e\7\61\2\2\u009e \3\2\2\2\u009f"+
		"\u00a0\7\u0080\2\2\u00a0\"\3\2\2\2\u00a1\u00a2\7>\2\2\u00a2$\3\2\2\2\u00a3"+
		"\u00a4\7>\2\2\u00a4\u00a5\7?\2\2\u00a5&\3\2\2\2\u00a6\u00a7\7?\2\2\u00a7"+
		"(\3\2\2\2\u00a8\u00a9\7>\2\2\u00a9\u00aa\7/\2\2\u00aa*\3\2\2\2\u00ab\u00ac"+
		"\7?\2\2\u00ac\u00ad\7@\2\2\u00ad,\3\2\2\2\u00ae\u00b0\t\3\2\2\u00af\u00ae"+
		"\3\2\2\2\u00b0\u00b1\3\2\2\2\u00b1\u00af\3\2\2\2\u00b1\u00b2\3\2\2\2\u00b2"+
		".\3\2\2\2\u00b3\u00b4\t\4\2\2\u00b4\60\3\2\2\2\u00b5\u00b8\5/\30\2\u00b6"+
		"\u00b8\7a\2\2\u00b7\u00b5\3\2\2\2\u00b7\u00b6\3\2\2\2\u00b8\62\3\2\2\2"+
		"\u00b9\u00ba\t\5\2\2\u00ba\64\3\2\2\2\u00bb\u00bc\t\6\2\2\u00bc\u00bd"+
		"\t\7\2\2\u00bd\u00be\t\b\2\2\u00be\u00bf\t\t\2\2\u00bf\u00c0\t\t\2\2\u00c0"+
		"\66\3\2\2\2\u00c1\u00c2\t\n\2\2\u00c2\u00c3\t\7\2\2\u00c3\u00c4\t\t\2"+
		"\2\u00c4\u00c5\t\n\2\2\u00c58\3\2\2\2\u00c6\u00c7\t\13\2\2\u00c7\u00c8"+
		"\t\f\2\2\u00c8:\3\2\2\2\u00c9\u00ca\t\f\2\2\u00ca\u00cb\t\13\2\2\u00cb"+
		"<\3\2\2\2\u00cc\u00cd\t\f\2\2\u00cd\u00ce\t\r\2\2\u00ce>\3\2\2\2\u00cf"+
		"\u00d0\t\f\2\2\u00d0\u00d1\t\r\2\2\u00d1\u00d2\t\16\2\2\u00d2\u00d3\t"+
		"\n\2\2\u00d3\u00d4\t\17\2\2\u00d4\u00d5\t\f\2\2\u00d5\u00d6\t\20\2\2\u00d6"+
		"\u00d7\t\t\2\2\u00d7@\3\2\2\2\u00d8\u00d9\t\f\2\2\u00d9\u00da\t\t\2\2"+
		"\u00da\u00db\t\21\2\2\u00db\u00dc\t\22\2\2\u00dc\u00dd\t\f\2\2\u00dd\u00de"+
		"\t\23\2\2\u00deB\3\2\2\2\u00df\u00e0\t\7\2\2\u00e0\u00e1\t\n\2\2\u00e1"+
		"\u00e2\t\20\2\2\u00e2D\3\2\2\2\u00e3\u00e4\t\7\2\2\u00e4\u00e5\t\22\2"+
		"\2\u00e5\u00e6\t\22\2\2\u00e6\u00e7\t\24\2\2\u00e7F\3\2\2\2\u00e8\u00e9"+
		"\t\24\2\2\u00e9\u00ea\t\22\2\2\u00ea\u00eb\t\22\2\2\u00eb\u00ec\t\7\2"+
		"\2\u00ecH\3\2\2\2\u00ed\u00ee\t\20\2\2\u00ee\u00ef\t\16\2\2\u00ef\u00f0"+
		"\t\n\2\2\u00f0\u00f1\t\r\2\2\u00f1J\3\2\2\2\u00f2\u00f3\t\25\2\2\u00f3"+
		"\u00f4\t\16\2\2\u00f4\u00f5\t\f\2\2\u00f5\u00f6\t\7\2\2\u00f6\u00f7\t"+
		"\n\2\2\u00f7L\3\2\2\2\u00f8\u00f9\t\6\2\2\u00f9\u00fa\t\b\2\2\u00fa\u00fb"+
		"\t\t\2\2\u00fb\u00fc\t\n\2\2\u00fcN\3\2\2\2\u00fd\u00fe\t\n\2\2\u00fe"+
		"\u00ff\t\t\2\2\u00ff\u0100\t\b\2\2\u0100\u0101\t\6\2\2\u0101P\3\2\2\2"+
		"\u0102\u0103\t\r\2\2\u0103\u0104\t\n\2\2\u0104\u0105\t\25\2\2\u0105R\3"+
		"\2\2\2\u0106\u0107\t\22\2\2\u0107\u0108\t\13\2\2\u0108T\3\2\2\2\u0109"+
		"\u010a\t\r\2\2\u010a\u010b\t\22\2\2\u010b\u010c\t\20\2\2\u010cV\3\2\2"+
		"\2\u010d\u010e\7v\2\2\u010e\u010f\t\17\2\2\u010f\u0110\t\26\2\2\u0110"+
		"\u0111\t\n\2\2\u0111X\3\2\2\2\u0112\u0113\7h\2\2\u0113\u0114\t\b\2\2\u0114"+
		"\u0115\t\7\2\2\u0115\u0116\t\t\2\2\u0116\u0117\t\n\2\2\u0117Z\3\2\2\2"+
		"\u0118\u012c\5\65\33\2\u0119\u012c\5\67\34\2\u011a\u012c\59\35\2\u011b"+
		"\u012c\5;\36\2\u011c\u012c\5=\37\2\u011d\u012c\5? \2\u011e\u012c\5A!\2"+
		"\u011f\u012c\5C\"\2\u0120\u012c\5E#\2\u0121\u012c\5G$\2\u0122\u012c\5"+
		"I%\2\u0123\u012c\5K&\2\u0124\u012c\5M\'\2\u0125\u012c\5O(\2\u0126\u012c"+
		"\5Q)\2\u0127\u012c\5S*\2\u0128\u012c\5U+\2\u0129\u012c\5W,\2\u012a\u012c"+
		"\5Y-\2\u012b\u0118\3\2\2\2\u012b\u0119\3\2\2\2\u012b\u011a\3\2\2\2\u012b"+
		"\u011b\3\2\2\2\u012b\u011c\3\2\2\2\u012b\u011d\3\2\2\2\u012b\u011e\3\2"+
		"\2\2\u012b\u011f\3\2\2\2\u012b\u0120\3\2\2\2\u012b\u0121\3\2\2\2\u012b"+
		"\u0122\3\2\2\2\u012b\u0123\3\2\2\2\u012b\u0124\3\2\2\2\u012b\u0125\3\2"+
		"\2\2\u012b\u0126\3\2\2\2\u012b\u0127\3\2\2\2\u012b\u0128\3\2\2\2\u012b"+
		"\u0129\3\2\2\2\u012b\u012a\3\2\2\2\u012c\\\3\2\2\2\u012d\u0139\7$\2\2"+
		"\u012e\u0134\7^\2\2\u012f\u0135\t\27\2\2\u0130\u0131\7\17\2\2\u0131\u0135"+
		"\7\f\2\2\u0132\u0135\t\2\2\2\u0133\u0135\3\2\2\2\u0134\u012f\3\2\2\2\u0134"+
		"\u0130\3\2\2\2\u0134\u0132\3\2\2\2\u0134\u0133\3\2\2\2\u0135\u0138\3\2"+
		"\2\2\u0136\u0138\n\30\2\2\u0137\u012e\3\2\2\2\u0137\u0136\3\2\2\2\u0138"+
		"\u013b\3\2\2\2\u0139\u0137\3\2\2\2\u0139\u013a\3\2\2\2\u013a\u013c\3\2"+
		"\2\2\u013b\u0139\3\2\2\2\u013c\u013d\7$\2\2\u013d^\3\2\2\2\u013e\u0140"+
		"\7/\2\2\u013f\u013e\3\2\2\2\u013f\u0140\3\2\2\2\u0140\u0141\3\2\2\2\u0141"+
		"\u0142\5-\27\2\u0142`\3\2\2\2\u0143\u0148\5/\30\2\u0144\u0147\5\61\31"+
		"\2\u0145\u0147\5-\27\2\u0146\u0144\3\2\2\2\u0146\u0145\3\2\2\2\u0147\u014a"+
		"\3\2\2\2\u0148\u0146\3\2\2\2\u0148\u0149\3\2\2\2\u0149b\3\2\2\2\u014a"+
		"\u0148\3\2\2\2\u014b\u014d\t\31\2\2\u014c\u014b\3\2\2\2\u014d\u014e\3"+
		"\2\2\2\u014e\u014c\3\2\2\2\u014e\u014f\3\2\2\2\u014f\u0150\3\2\2\2\u0150"+
		"\u0151\b\62\2\2\u0151d\3\2\2\2\u0152\u0153\13\2\2\2\u0153f\3\2\2\2\20"+
		"\2mq}\u00b1\u00b7\u012b\u0134\u0137\u0139\u013f\u0146\u0148\u014e\3\b"+
		"\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}