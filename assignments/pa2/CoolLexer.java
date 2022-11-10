// Generated from /Users/NCC1701-C/cool/LCARS/src/CoolLexer.g4 by ANTLR 4.6
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
	static { RuntimeMetaData.checkVersion("4.6", RuntimeMetaData.VERSION); }

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
	public static final int COMMENT_MODE = 1;
	public static final int INNER_COMMENT = 2;
	public static String[] modeNames = {
		"DEFAULT_MODE", "COMMENT_MODE", "INNER_COMMENT"
	};

	public static final String[] ruleNames = {
		"SINGLE_LINE_COMMENT", "UNMATCHED_COMMENT", "BEGIN_COMMENT", "END_COMMENT", 
		"BEGIN_INNER_COMMENT", "EOF_COMMENT", "COMMENT_CONTENT", "NEW_INNER_COMMENT", 
		"INNER_COMMENT_EOF", "INNER_COMMENT_EOF_SECOND", "CLOSE_INNER_COMMENT", 
		"INNER_COMMENT_CONTENT", "PERIOD", "COMMA", "AT", "SEMICOLON", "COLON", 
		"CURLY_OPEN", "CURLY_CLOSE", "PARENT_OPEN", "PARENT_CLOSE", "PLUS_OPERATOR", 
		"MINUS_OPERATOR", "MULT_OPERATOR", "DIV_OPERATOR", "INT_COMPLEMENT_OPERATOR", 
		"LESS_OPERATOR", "LESS_EQ_OPERATOR", "EQ_OPERATOR", "ASSIGN_OPERATOR", 
		"RIGHTARROW", "DIGIT", "LETTER", "LETTER_", "CLASS", "ELSE", "FI", "IF", 
		"IN", "INHERITS", "ISVOID", "LET", "LOOP", "POOL", "THEN", "WHILE", "CASE", 
		"ESAC", "NEW", "OF", "NOT", "TRUE", "FALSE", "INT_CONST", "OBJECTID", 
		"TYPEID", "WS", "STRING_CONST", "UNTERMINATED_STRING_CONST", "INCOMPLETE_STRING", 
		"ERROR"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, "'.'", "','", "'@'", "';'", "':'", "'{'", "'}'", "'('", "')'", 
		"'+'", "'-'", "'*'", "'/'", "'~'", "'<'", "'<='", "'='", "'<-'", "'=>'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "ERROR", "SINGLE_LINE_COMMENT", "UNMATCHED_COMMENT", "BEGIN_COMMENT", 
		"END_COMMENT", "BEGIN_INNER_COMMENT", "EOF_COMMENT", "COMMENT_CONTENT", 
		"NEW_INNER_COMMENT", "INNER_COMMENT_EOF", "INNER_COMMENT_EOF_SECOND", 
		"CLOSE_INNER_COMMENT", "INNER_COMMENT_CONTENT", "PERIOD", "COMMA", "AT", 
		"SEMICOLON", "COLON", "CURLY_OPEN", "CURLY_CLOSE", "PARENT_OPEN", "PARENT_CLOSE", 
		"PLUS_OPERATOR", "MINUS_OPERATOR", "MULT_OPERATOR", "DIV_OPERATOR", "INT_COMPLEMENT_OPERATOR", 
		"LESS_OPERATOR", "LESS_EQ_OPERATOR", "EQ_OPERATOR", "ASSIGN_OPERATOR", 
		"RIGHTARROW", "CLASS", "ELSE", "FI", "IF", "IN", "INHERITS", "ISVOID", 
		"LET", "LOOP", "POOL", "THEN", "WHILE", "CASE", "ESAC", "NEW", "OF", "NOT", 
		"TRUE", "FALSE", "INT_CONST", "OBJECTID", "TYPEID", "WS", "STRING_CONST", 
		"UNTERMINATED_STRING_CONST", "INCOMPLETE_STRING"
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


		public void createError(String text) { 
			setText(text);
			setType(ERROR);
		}

	  public void checkString(String text) {
			StringBuilder buf = new StringBuilder(0);

			for(int i = 0; i < text.length(); i++) {
				if (text.charAt(i) == '\\' && text.charAt(i+1) == '\000') {
					createError("String contains escaped null character.");
					return;
				} else if (text.charAt(i) == '\000') {
					createError("String contains null character.");
					return;
				} else if(text.charAt(i) == '\\') {
					if(text.charAt(i+1) == 'n') {
						buf.append('\n');
					} else if(text.charAt(i+1) == 'f') {
						buf.append('\f');
					} else if(text.charAt(i+1) == 't') {
						buf.append('\t');
					} else if(text.charAt(i+1) == 'b') {
						buf.append('\t');
					} else if(text.charAt(i+1) == '\"') {
						buf.append('\"');
					} else if(text.charAt(i+1) == '\\') {
						buf.append('\\');
					} else {
						buf.append(text.charAt(i+1));
					}
					i++;
				} else {
					buf.append(text.charAt(i));
				}
			}

			String bufString = buf.toString();
			if(bufString.length() - 2 > 1024) {
				createError("String constant too long");
				return;
			}

			setText(
				bufString.substring(
					1, bufString.length()-1
				)
			);
			return;
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
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 1:
			UNMATCHED_COMMENT_action((RuleContext)_localctx, actionIndex);
			break;
		case 5:
			EOF_COMMENT_action((RuleContext)_localctx, actionIndex);
			break;
		case 8:
			INNER_COMMENT_EOF_action((RuleContext)_localctx, actionIndex);
			break;
		case 9:
			INNER_COMMENT_EOF_SECOND_action((RuleContext)_localctx, actionIndex);
			break;
		case 57:
			STRING_CONST_action((RuleContext)_localctx, actionIndex);
			break;
		case 58:
			UNTERMINATED_STRING_CONST_action((RuleContext)_localctx, actionIndex);
			break;
		case 59:
			INCOMPLETE_STRING_action((RuleContext)_localctx, actionIndex);
			break;
		}
	}
	private void UNMATCHED_COMMENT_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0:
			 createError("Unmatched *)"); 
			break;
		}
	}
	private void EOF_COMMENT_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 1:
			 createError("EOF in comment"); 
			break;
		}
	}
	private void INNER_COMMENT_EOF_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 2:
			 createError("EOF in comment"); 
			break;
		}
	}
	private void INNER_COMMENT_EOF_SECOND_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 3:
			 createError("EOF in comment"); 
			break;
		}
	}
	private void STRING_CONST_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 4:
			 checkString(getText()); 
			break;
		}
	}
	private void UNTERMINATED_STRING_CONST_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 5:
			 
				String text = getText();

				for (int i=0; i<text.length(); i++) {
					if (text.charAt(i) == '\\' && i + 1 < text.length() - 1) {
						if (text.charAt(i+1) == '\000') {
							createError("String contains escaped null character.");
							return;
						}
					} else if (text.charAt(i) == '\000') {
						createError("String contains null character.");
						return; 
					}
				}
				
				createError("Unterminated string constant"); 

			break;
		}
	}
	private void INCOMPLETE_STRING_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 6:
				createError("EOF in string constant"); 
			break;
		}
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2<\u018d\b\1\b\1\b"+
		"\1\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n"+
		"\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21"+
		"\4\22\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30"+
		"\4\31\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37"+
		"\4 \t \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t"+
		"*\4+\t+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63"+
		"\4\64\t\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t"+
		"<\4=\t=\4>\t>\3\2\3\2\3\2\3\2\7\2\u0084\n\2\f\2\16\2\u0087\13\2\3\2\5"+
		"\2\u008a\n\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\b\3\b\3\b"+
		"\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3"+
		"\13\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3"+
		"\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3"+
		"\27\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\35\3"+
		"\36\3\36\3\37\3\37\3\37\3 \3 \3 \3!\6!\u00f1\n!\r!\16!\u00f2\3\"\3\"\3"+
		"#\3#\5#\u00f9\n#\3$\3$\3$\3$\3$\3$\3%\3%\3%\3%\3%\3&\3&\3&\3\'\3\'\3\'"+
		"\3(\3(\3(\3)\3)\3)\3)\3)\3)\3)\3)\3)\3*\3*\3*\3*\3*\3*\3*\3+\3+\3+\3+"+
		"\3,\3,\3,\3,\3,\3-\3-\3-\3-\3-\3.\3.\3.\3.\3.\3/\3/\3/\3/\3/\3/\3\60\3"+
		"\60\3\60\3\60\3\60\3\61\3\61\3\61\3\61\3\61\3\62\3\62\3\62\3\62\3\63\3"+
		"\63\3\63\3\64\3\64\3\64\3\64\3\65\3\65\3\65\3\65\3\65\3\66\3\66\3\66\3"+
		"\66\3\66\3\66\3\67\3\67\38\38\38\78\u015d\n8\f8\168\u0160\138\39\39\3"+
		"9\79\u0165\n9\f9\169\u0168\139\3:\6:\u016b\n:\r:\16:\u016c\3:\3:\3;\3"+
		";\3;\3;\3<\3<\3<\3<\7<\u0179\n<\f<\16<\u017c\13<\3<\3<\3=\3=\3=\3=\7="+
		"\u0184\n=\f=\16=\u0187\13=\3=\3=\3=\3>\3>\3\u0085\2?\5\4\7\5\t\6\13\7"+
		"\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25"+
		")\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C\2E\2G\2I#K$M"+
		"%O&Q\'S(U)W*Y+[,]-_.a/c\60e\61g\62i\63k\64m\65o\66q\67s8u9w:y;{<}\3\5"+
		"\2\3\4\32\4\3\f\f\17\17\3\2\62;\4\2C\\c|\4\2EEee\4\2NNnn\4\2CCcc\4\2U"+
		"Uuu\4\2GGgg\4\2HHhh\4\2KKkk\4\2PPpp\4\2JJjj\4\2TTtt\4\2VVvv\4\2XXxx\4"+
		"\2QQqq\4\2FFff\4\2RRrr\4\2YYyy\4\2WWww\3\2c|\3\2C\\\4\2\13\17\"\"\5\2"+
		"\f\f$$^^\u0193\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\35\3\2\2\2\2\37\3"+
		"\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2"+
		"\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67"+
		"\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2I\3\2"+
		"\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2"+
		"\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c"+
		"\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2"+
		"\2\2\2q\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2\2w\3\2\2\2\2y\3\2\2\2\2{\3\2\2\2"+
		"\2}\3\2\2\2\3\13\3\2\2\2\3\r\3\2\2\2\3\17\3\2\2\2\3\21\3\2\2\2\4\23\3"+
		"\2\2\2\4\25\3\2\2\2\4\27\3\2\2\2\4\31\3\2\2\2\4\33\3\2\2\2\5\177\3\2\2"+
		"\2\7\u008d\3\2\2\2\t\u0092\3\2\2\2\13\u0098\3\2\2\2\r\u009e\3\2\2\2\17"+
		"\u00a4\3\2\2\2\21\u00a8\3\2\2\2\23\u00ac\3\2\2\2\25\u00b2\3\2\2\2\27\u00b8"+
		"\3\2\2\2\31\u00bc\3\2\2\2\33\u00c2\3\2\2\2\35\u00c6\3\2\2\2\37\u00c8\3"+
		"\2\2\2!\u00ca\3\2\2\2#\u00cc\3\2\2\2%\u00ce\3\2\2\2\'\u00d0\3\2\2\2)\u00d2"+
		"\3\2\2\2+\u00d4\3\2\2\2-\u00d6\3\2\2\2/\u00d8\3\2\2\2\61\u00da\3\2\2\2"+
		"\63\u00dc\3\2\2\2\65\u00de\3\2\2\2\67\u00e0\3\2\2\29\u00e2\3\2\2\2;\u00e4"+
		"\3\2\2\2=\u00e7\3\2\2\2?\u00e9\3\2\2\2A\u00ec\3\2\2\2C\u00f0\3\2\2\2E"+
		"\u00f4\3\2\2\2G\u00f8\3\2\2\2I\u00fa\3\2\2\2K\u0100\3\2\2\2M\u0105\3\2"+
		"\2\2O\u0108\3\2\2\2Q\u010b\3\2\2\2S\u010e\3\2\2\2U\u0117\3\2\2\2W\u011e"+
		"\3\2\2\2Y\u0122\3\2\2\2[\u0127\3\2\2\2]\u012c\3\2\2\2_\u0131\3\2\2\2a"+
		"\u0137\3\2\2\2c\u013c\3\2\2\2e\u0141\3\2\2\2g\u0145\3\2\2\2i\u0148\3\2"+
		"\2\2k\u014c\3\2\2\2m\u0151\3\2\2\2o\u0157\3\2\2\2q\u0159\3\2\2\2s\u0161"+
		"\3\2\2\2u\u016a\3\2\2\2w\u0170\3\2\2\2y\u0174\3\2\2\2{\u017f\3\2\2\2}"+
		"\u018b\3\2\2\2\177\u0080\7/\2\2\u0080\u0081\7/\2\2\u0081\u0085\3\2\2\2"+
		"\u0082\u0084\13\2\2\2\u0083\u0082\3\2\2\2\u0084\u0087\3\2\2\2\u0085\u0086"+
		"\3\2\2\2\u0085\u0083\3\2\2\2\u0086\u0089\3\2\2\2\u0087\u0085\3\2\2\2\u0088"+
		"\u008a\t\2\2\2\u0089\u0088\3\2\2\2\u008a\u008b\3\2\2\2\u008b\u008c\b\2"+
		"\2\2\u008c\6\3\2\2\2\u008d\u008e\7,\2\2\u008e\u008f\7+\2\2\u008f\u0090"+
		"\3\2\2\2\u0090\u0091\b\3\3\2\u0091\b\3\2\2\2\u0092\u0093\7*\2\2\u0093"+
		"\u0094\7,\2\2\u0094\u0095\3\2\2\2\u0095\u0096\b\4\2\2\u0096\u0097\b\4"+
		"\4\2\u0097\n\3\2\2\2\u0098\u0099\7,\2\2\u0099\u009a\7+\2\2\u009a\u009b"+
		"\3\2\2\2\u009b\u009c\b\5\2\2\u009c\u009d\b\5\5\2\u009d\f\3\2\2\2\u009e"+
		"\u009f\7*\2\2\u009f\u00a0\7,\2\2\u00a0\u00a1\3\2\2\2\u00a1\u00a2\b\6\2"+
		"\2\u00a2\u00a3\b\6\6\2\u00a3\16\3\2\2\2\u00a4\u00a5\13\2\2\2\u00a5\u00a6"+
		"\7\2\2\3\u00a6\u00a7\b\7\7\2\u00a7\20\3\2\2\2\u00a8\u00a9\13\2\2\2\u00a9"+
		"\u00aa\3\2\2\2\u00aa\u00ab\b\b\2\2\u00ab\22\3\2\2\2\u00ac\u00ad\7*\2\2"+
		"\u00ad\u00ae\7,\2\2\u00ae\u00af\3\2\2\2\u00af\u00b0\b\t\6\2\u00b0\u00b1"+
		"\b\t\2\2\u00b1\24\3\2\2\2\u00b2\u00b3\7,\2\2\u00b3\u00b4\7+\2\2\u00b4"+
		"\u00b5\3\2\2\2\u00b5\u00b6\7\2\2\3\u00b6\u00b7\b\n\b\2\u00b7\26\3\2\2"+
		"\2\u00b8\u00b9\13\2\2\2\u00b9\u00ba\7\2\2\3\u00ba\u00bb\b\13\t\2\u00bb"+
		"\30\3\2\2\2\u00bc\u00bd\7,\2\2\u00bd\u00be\7+\2\2\u00be\u00bf\3\2\2\2"+
		"\u00bf\u00c0\b\f\5\2\u00c0\u00c1\b\f\2\2\u00c1\32\3\2\2\2\u00c2\u00c3"+
		"\13\2\2\2\u00c3\u00c4\3\2\2\2\u00c4\u00c5\b\r\2\2\u00c5\34\3\2\2\2\u00c6"+
		"\u00c7\7\60\2\2\u00c7\36\3\2\2\2\u00c8\u00c9\7.\2\2\u00c9 \3\2\2\2\u00ca"+
		"\u00cb\7B\2\2\u00cb\"\3\2\2\2\u00cc\u00cd\7=\2\2\u00cd$\3\2\2\2\u00ce"+
		"\u00cf\7<\2\2\u00cf&\3\2\2\2\u00d0\u00d1\7}\2\2\u00d1(\3\2\2\2\u00d2\u00d3"+
		"\7\177\2\2\u00d3*\3\2\2\2\u00d4\u00d5\7*\2\2\u00d5,\3\2\2\2\u00d6\u00d7"+
		"\7+\2\2\u00d7.\3\2\2\2\u00d8\u00d9\7-\2\2\u00d9\60\3\2\2\2\u00da\u00db"+
		"\7/\2\2\u00db\62\3\2\2\2\u00dc\u00dd\7,\2\2\u00dd\64\3\2\2\2\u00de\u00df"+
		"\7\61\2\2\u00df\66\3\2\2\2\u00e0\u00e1\7\u0080\2\2\u00e18\3\2\2\2\u00e2"+
		"\u00e3\7>\2\2\u00e3:\3\2\2\2\u00e4\u00e5\7>\2\2\u00e5\u00e6\7?\2\2\u00e6"+
		"<\3\2\2\2\u00e7\u00e8\7?\2\2\u00e8>\3\2\2\2\u00e9\u00ea\7>\2\2\u00ea\u00eb"+
		"\7/\2\2\u00eb@\3\2\2\2\u00ec\u00ed\7?\2\2\u00ed\u00ee\7@\2\2\u00eeB\3"+
		"\2\2\2\u00ef\u00f1\t\3\2\2\u00f0\u00ef\3\2\2\2\u00f1\u00f2\3\2\2\2\u00f2"+
		"\u00f0\3\2\2\2\u00f2\u00f3\3\2\2\2\u00f3D\3\2\2\2\u00f4\u00f5\t\4\2\2"+
		"\u00f5F\3\2\2\2\u00f6\u00f9\5E\"\2\u00f7\u00f9\7a\2\2\u00f8\u00f6\3\2"+
		"\2\2\u00f8\u00f7\3\2\2\2\u00f9H\3\2\2\2\u00fa\u00fb\t\5\2\2\u00fb\u00fc"+
		"\t\6\2\2\u00fc\u00fd\t\7\2\2\u00fd\u00fe\t\b\2\2\u00fe\u00ff\t\b\2\2\u00ff"+
		"J\3\2\2\2\u0100\u0101\t\t\2\2\u0101\u0102\t\6\2\2\u0102\u0103\t\b\2\2"+
		"\u0103\u0104\t\t\2\2\u0104L\3\2\2\2\u0105\u0106\t\n\2\2\u0106\u0107\t"+
		"\13\2\2\u0107N\3\2\2\2\u0108\u0109\t\13\2\2\u0109\u010a\t\n\2\2\u010a"+
		"P\3\2\2\2\u010b\u010c\t\13\2\2\u010c\u010d\t\f\2\2\u010dR\3\2\2\2\u010e"+
		"\u010f\t\13\2\2\u010f\u0110\t\f\2\2\u0110\u0111\t\r\2\2\u0111\u0112\t"+
		"\t\2\2\u0112\u0113\t\16\2\2\u0113\u0114\t\13\2\2\u0114\u0115\t\17\2\2"+
		"\u0115\u0116\t\b\2\2\u0116T\3\2\2\2\u0117\u0118\t\13\2\2\u0118\u0119\t"+
		"\b\2\2\u0119\u011a\t\20\2\2\u011a\u011b\t\21\2\2\u011b\u011c\t\13\2\2"+
		"\u011c\u011d\t\22\2\2\u011dV\3\2\2\2\u011e\u011f\t\6\2\2\u011f\u0120\t"+
		"\t\2\2\u0120\u0121\t\17\2\2\u0121X\3\2\2\2\u0122\u0123\t\6\2\2\u0123\u0124"+
		"\t\21\2\2\u0124\u0125\t\21\2\2\u0125\u0126\t\23\2\2\u0126Z\3\2\2\2\u0127"+
		"\u0128\t\23\2\2\u0128\u0129\t\21\2\2\u0129\u012a\t\21\2\2\u012a\u012b"+
		"\t\6\2\2\u012b\\\3\2\2\2\u012c\u012d\t\17\2\2\u012d\u012e\t\r\2\2\u012e"+
		"\u012f\t\t\2\2\u012f\u0130\t\f\2\2\u0130^\3\2\2\2\u0131\u0132\t\24\2\2"+
		"\u0132\u0133\t\r\2\2\u0133\u0134\t\13\2\2\u0134\u0135\t\6\2\2\u0135\u0136"+
		"\t\t\2\2\u0136`\3\2\2\2\u0137\u0138\t\5\2\2\u0138\u0139\t\7\2\2\u0139"+
		"\u013a\t\b\2\2\u013a\u013b\t\t\2\2\u013bb\3\2\2\2\u013c\u013d\t\t\2\2"+
		"\u013d\u013e\t\b\2\2\u013e\u013f\t\7\2\2\u013f\u0140\t\5\2\2\u0140d\3"+
		"\2\2\2\u0141\u0142\t\f\2\2\u0142\u0143\t\t\2\2\u0143\u0144\t\24\2\2\u0144"+
		"f\3\2\2\2\u0145\u0146\t\21\2\2\u0146\u0147\t\n\2\2\u0147h\3\2\2\2\u0148"+
		"\u0149\t\f\2\2\u0149\u014a\t\21\2\2\u014a\u014b\t\17\2\2\u014bj\3\2\2"+
		"\2\u014c\u014d\7v\2\2\u014d\u014e\t\16\2\2\u014e\u014f\t\25\2\2\u014f"+
		"\u0150\t\t\2\2\u0150l\3\2\2\2\u0151\u0152\7h\2\2\u0152\u0153\t\7\2\2\u0153"+
		"\u0154\t\6\2\2\u0154\u0155\t\b\2\2\u0155\u0156\t\t\2\2\u0156n\3\2\2\2"+
		"\u0157\u0158\5C!\2\u0158p\3\2\2\2\u0159\u015e\t\26\2\2\u015a\u015d\5G"+
		"#\2\u015b\u015d\5C!\2\u015c\u015a\3\2\2\2\u015c\u015b\3\2\2\2\u015d\u0160"+
		"\3\2\2\2\u015e\u015c\3\2\2\2\u015e\u015f\3\2\2\2\u015fr\3\2\2\2\u0160"+
		"\u015e\3\2\2\2\u0161\u0166\t\27\2\2\u0162\u0165\5G#\2\u0163\u0165\5C!"+
		"\2\u0164\u0162\3\2\2\2\u0164\u0163\3\2\2\2\u0165\u0168\3\2\2\2\u0166\u0164"+
		"\3\2\2\2\u0166\u0167\3\2\2\2\u0167t\3\2\2\2\u0168\u0166\3\2\2\2\u0169"+
		"\u016b\t\30\2\2\u016a\u0169\3\2\2\2\u016b\u016c\3\2\2\2\u016c\u016a\3"+
		"\2\2\2\u016c\u016d\3\2\2\2\u016d\u016e\3\2\2\2\u016e\u016f\b:\2\2\u016f"+
		"v\3\2\2\2\u0170\u0171\5y<\2\u0171\u0172\7$\2\2\u0172\u0173\b;\n\2\u0173"+
		"x\3\2\2\2\u0174\u017a\7$\2\2\u0175\u0179\n\31\2\2\u0176\u0177\7^\2\2\u0177"+
		"\u0179\13\2\2\2\u0178\u0175\3\2\2\2\u0178\u0176\3\2\2\2\u0179\u017c\3"+
		"\2\2\2\u017a\u0178\3\2\2\2\u017a\u017b\3\2\2\2\u017b\u017d\3\2\2\2\u017c"+
		"\u017a\3\2\2\2\u017d\u017e\b<\13\2\u017ez\3\2\2\2\u017f\u0185\7$\2\2\u0180"+
		"\u0184\n\31\2\2\u0181\u0182\7^\2\2\u0182\u0184\13\2\2\2\u0183\u0180\3"+
		"\2\2\2\u0183\u0181\3\2\2\2\u0184\u0187\3\2\2\2\u0185\u0183\3\2\2\2\u0185"+
		"\u0186\3\2\2\2\u0186\u0188\3\2\2\2\u0187\u0185\3\2\2\2\u0188\u0189\7\2"+
		"\2\3\u0189\u018a\b=\f\2\u018a|\3\2\2\2\u018b\u018c\13\2\2\2\u018c~\3\2"+
		"\2\2\22\2\3\4\u0085\u0089\u00f2\u00f8\u015c\u015e\u0164\u0166\u016c\u0178"+
		"\u017a\u0183\u0185\r\b\2\2\3\3\2\7\3\2\6\2\2\7\4\2\3\7\3\3\n\4\3\13\5"+
		"\3;\6\3<\7\3=\b";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}