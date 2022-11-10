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
		NEW_INNER_COMMENT=9, INNER_COMMENT_EOF=10, CLOSE_INNER_COMMENT=11, INNER_COMMENT_CONTENT=12, 
		PERIOD=13, COMMA=14, AT=15, SEMICOLON=16, COLON=17, CURLY_OPEN=18, CURLY_CLOSE=19, 
		PARENT_OPEN=20, PARENT_CLOSE=21, PLUS_OPERATOR=22, MINUS_OPERATOR=23, 
		MULT_OPERATOR=24, DIV_OPERATOR=25, INT_COMPLEMENT_OPERATOR=26, LESS_OPERATOR=27, 
		LESS_EQ_OPERATOR=28, EQ_OPERATOR=29, ASSIGN_OPERATOR=30, RIGHTARROW=31, 
		CLASS=32, ELSE=33, FI=34, IF=35, IN=36, INHERITS=37, ISVOID=38, LET=39, 
		LOOP=40, POOL=41, THEN=42, WHILE=43, CASE=44, ESAC=45, NEW=46, OF=47, 
		NOT=48, TRUE=49, FALSE=50, INT_CONST=51, OBJECTID=52, TYPEID=53, WS=54, 
		STRING_CONST=55, INCOMPLETE_STRING=56;
	public static final int COMMENT_MODE = 1;
	public static final int INNER_COMMENT = 2;
	public static String[] modeNames = {
		"DEFAULT_MODE", "COMMENT_MODE", "INNER_COMMENT"
	};

	public static final String[] ruleNames = {
		"SINGLE_LINE_COMMENT", "UNMATCHED_COMMENT", "BEGIN_COMMENT", "END_COMMENT", 
		"BEGIN_INNER_COMMENT", "EOF_COMMENT", "COMMENT_CONTENT", "NEW_INNER_COMMENT", 
		"INNER_COMMENT_EOF", "CLOSE_INNER_COMMENT", "INNER_COMMENT_CONTENT", "PERIOD", 
		"COMMA", "AT", "SEMICOLON", "COLON", "CURLY_OPEN", "CURLY_CLOSE", "PARENT_OPEN", 
		"PARENT_CLOSE", "PLUS_OPERATOR", "MINUS_OPERATOR", "MULT_OPERATOR", "DIV_OPERATOR", 
		"INT_COMPLEMENT_OPERATOR", "LESS_OPERATOR", "LESS_EQ_OPERATOR", "EQ_OPERATOR", 
		"ASSIGN_OPERATOR", "RIGHTARROW", "DIGIT", "LETTER", "LETTER_", "CLASS", 
		"ELSE", "FI", "IF", "IN", "INHERITS", "ISVOID", "LET", "LOOP", "POOL", 
		"THEN", "WHILE", "CASE", "ESAC", "NEW", "OF", "NOT", "TRUE", "FALSE", 
		"INT_CONST", "OBJECTID", "TYPEID", "WS", "STRING_CONST", "INCOMPLETE_STRING", 
		"ERROR"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, "'.'", "','", "'@'", "';'", "':'", "'{'", "'}'", "'('", "')'", "'+'", 
		"'-'", "'*'", "'/'", "'~'", "'<'", "'<='", "'='", "'<-'", "'=>'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "ERROR", "SINGLE_LINE_COMMENT", "UNMATCHED_COMMENT", "BEGIN_COMMENT", 
		"END_COMMENT", "BEGIN_INNER_COMMENT", "EOF_COMMENT", "COMMENT_CONTENT", 
		"NEW_INNER_COMMENT", "INNER_COMMENT_EOF", "CLOSE_INNER_COMMENT", "INNER_COMMENT_CONTENT", 
		"PERIOD", "COMMA", "AT", "SEMICOLON", "COLON", "CURLY_OPEN", "CURLY_CLOSE", 
		"PARENT_OPEN", "PARENT_CLOSE", "PLUS_OPERATOR", "MINUS_OPERATOR", "MULT_OPERATOR", 
		"DIV_OPERATOR", "INT_COMPLEMENT_OPERATOR", "LESS_OPERATOR", "LESS_EQ_OPERATOR", 
		"EQ_OPERATOR", "ASSIGN_OPERATOR", "RIGHTARROW", "CLASS", "ELSE", "FI", 
		"IF", "IN", "INHERITS", "ISVOID", "LET", "LOOP", "POOL", "THEN", "WHILE", 
		"CASE", "ESAC", "NEW", "OF", "NOT", "TRUE", "FALSE", "INT_CONST", "OBJECTID", 
		"TYPEID", "WS", "STRING_CONST", "INCOMPLETE_STRING"
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
				// IDK IF WE NEED THIS FIRST CHECK
				if (text.charAt(i) == '\\' && text.charAt(i+1) == '\000') {
					createError("String contains escaped null character.");
					return;
				} else if (text.charAt(i) == '\000') {
					createError("String contains null character.");
					return;
				} else if (text.charAt(i) == '\n') {
					createError("Unterminated string constant");
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
		case 56:
			STRING_CONST_action((RuleContext)_localctx, actionIndex);
			break;
		case 57:
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
	private void STRING_CONST_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 3:
			 checkString(getText()); 
			break;
		}
	}
	private void INCOMPLETE_STRING_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 4:

				String text = getText();

				for (int i=0; i<text.length(); i++) {
					if (text.charAt(i) == '\000') {
						createError("String contains null character.");
						return; 
					}
					
					if (text.charAt(i) == '\n' && (i != text.length() - 1)) {
						createError("Unterminated string constant");
						return; 
					}
				}
				
				createError("EOF in string constant"); 

			break;
		}
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2:\u0187\b\1\b\1\b"+
		"\1\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n"+
		"\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21"+
		"\4\22\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30"+
		"\4\31\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37"+
		"\4 \t \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t"+
		"*\4+\t+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63"+
		"\4\64\t\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t"+
		"<\3\2\3\2\3\2\3\2\7\2\u0080\n\2\f\2\16\2\u0083\13\2\3\2\5\2\u0086\n\2"+
		"\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\f\3\f\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22"+
		"\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31"+
		"\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\34\3\35\3\35\3\36\3\36\3\36\3\37"+
		"\3\37\3\37\3 \6 \u00e9\n \r \16 \u00ea\3!\3!\3\"\3\"\5\"\u00f1\n\"\3#"+
		"\3#\3#\3#\3#\3#\3$\3$\3$\3$\3$\3%\3%\3%\3&\3&\3&\3\'\3\'\3\'\3(\3(\3("+
		"\3(\3(\3(\3(\3(\3(\3)\3)\3)\3)\3)\3)\3)\3*\3*\3*\3*\3+\3+\3+\3+\3+\3,"+
		"\3,\3,\3,\3,\3-\3-\3-\3-\3-\3.\3.\3.\3.\3.\3.\3/\3/\3/\3/\3/\3\60\3\60"+
		"\3\60\3\60\3\60\3\61\3\61\3\61\3\61\3\62\3\62\3\62\3\63\3\63\3\63\3\63"+
		"\3\64\3\64\3\64\3\64\3\64\3\65\3\65\3\65\3\65\3\65\3\65\3\66\5\66\u0151"+
		"\n\66\3\66\3\66\3\67\3\67\3\67\7\67\u0158\n\67\f\67\16\67\u015b\13\67"+
		"\38\38\38\78\u0160\n8\f8\168\u0163\138\39\69\u0166\n9\r9\169\u0167\39"+
		"\39\3:\3:\3:\3:\7:\u0170\n:\f:\16:\u0173\13:\3:\3:\3:\3;\3;\3;\3;\3;\3"+
		";\7;\u017e\n;\f;\16;\u0181\13;\3;\3;\3;\3<\3<\4\u0081\u0171\2=\5\4\7\5"+
		"\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23"+
		"%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\2C\2E\2"+
		"G\"I#K$M%O&Q\'S(U)W*Y+[,]-_.a/c\60e\61g\62i\63k\64m\65o\66q\67s8u9w:y"+
		"\3\5\2\3\4\32\4\3\f\f\17\17\3\2\62;\4\2C\\c|\4\2EEee\4\2NNnn\4\2CCcc\4"+
		"\2UUuu\4\2GGgg\4\2HHhh\4\2KKkk\4\2PPpp\4\2JJjj\4\2TTtt\4\2VVvv\4\2XXx"+
		"x\4\2QQqq\4\2FFff\4\2RRrr\4\2YYyy\4\2WWww\3\2c|\3\2C\\\4\2\13\17\"\"\4"+
		"\2$$^^\u0190\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\33\3\2\2\2\2\35\3\2"+
		"\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2"+
		"\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3"+
		"\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2G\3\2"+
		"\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2"+
		"\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a"+
		"\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2"+
		"\2\2\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2\2w\3\2\2\2\2y\3\2\2\2"+
		"\3\13\3\2\2\2\3\r\3\2\2\2\3\17\3\2\2\2\3\21\3\2\2\2\4\23\3\2\2\2\4\25"+
		"\3\2\2\2\4\27\3\2\2\2\4\31\3\2\2\2\5{\3\2\2\2\7\u0089\3\2\2\2\t\u008e"+
		"\3\2\2\2\13\u0094\3\2\2\2\r\u009a\3\2\2\2\17\u00a0\3\2\2\2\21\u00a4\3"+
		"\2\2\2\23\u00a8\3\2\2\2\25\u00ae\3\2\2\2\27\u00b4\3\2\2\2\31\u00ba\3\2"+
		"\2\2\33\u00be\3\2\2\2\35\u00c0\3\2\2\2\37\u00c2\3\2\2\2!\u00c4\3\2\2\2"+
		"#\u00c6\3\2\2\2%\u00c8\3\2\2\2\'\u00ca\3\2\2\2)\u00cc\3\2\2\2+\u00ce\3"+
		"\2\2\2-\u00d0\3\2\2\2/\u00d2\3\2\2\2\61\u00d4\3\2\2\2\63\u00d6\3\2\2\2"+
		"\65\u00d8\3\2\2\2\67\u00da\3\2\2\29\u00dc\3\2\2\2;\u00df\3\2\2\2=\u00e1"+
		"\3\2\2\2?\u00e4\3\2\2\2A\u00e8\3\2\2\2C\u00ec\3\2\2\2E\u00f0\3\2\2\2G"+
		"\u00f2\3\2\2\2I\u00f8\3\2\2\2K\u00fd\3\2\2\2M\u0100\3\2\2\2O\u0103\3\2"+
		"\2\2Q\u0106\3\2\2\2S\u010f\3\2\2\2U\u0116\3\2\2\2W\u011a\3\2\2\2Y\u011f"+
		"\3\2\2\2[\u0124\3\2\2\2]\u0129\3\2\2\2_\u012f\3\2\2\2a\u0134\3\2\2\2c"+
		"\u0139\3\2\2\2e\u013d\3\2\2\2g\u0140\3\2\2\2i\u0144\3\2\2\2k\u0149\3\2"+
		"\2\2m\u0150\3\2\2\2o\u0154\3\2\2\2q\u015c\3\2\2\2s\u0165\3\2\2\2u\u016b"+
		"\3\2\2\2w\u0177\3\2\2\2y\u0185\3\2\2\2{|\7/\2\2|}\7/\2\2}\u0081\3\2\2"+
		"\2~\u0080\13\2\2\2\177~\3\2\2\2\u0080\u0083\3\2\2\2\u0081\u0082\3\2\2"+
		"\2\u0081\177\3\2\2\2\u0082\u0085\3\2\2\2\u0083\u0081\3\2\2\2\u0084\u0086"+
		"\t\2\2\2\u0085\u0084\3\2\2\2\u0086\u0087\3\2\2\2\u0087\u0088\b\2\2\2\u0088"+
		"\6\3\2\2\2\u0089\u008a\7,\2\2\u008a\u008b\7+\2\2\u008b\u008c\3\2\2\2\u008c"+
		"\u008d\b\3\3\2\u008d\b\3\2\2\2\u008e\u008f\7*\2\2\u008f\u0090\7,\2\2\u0090"+
		"\u0091\3\2\2\2\u0091\u0092\b\4\2\2\u0092\u0093\b\4\4\2\u0093\n\3\2\2\2"+
		"\u0094\u0095\7,\2\2\u0095\u0096\7+\2\2\u0096\u0097\3\2\2\2\u0097\u0098"+
		"\b\5\2\2\u0098\u0099\b\5\5\2\u0099\f\3\2\2\2\u009a\u009b\7*\2\2\u009b"+
		"\u009c\7,\2\2\u009c\u009d\3\2\2\2\u009d\u009e\b\6\2\2\u009e\u009f\b\6"+
		"\6\2\u009f\16\3\2\2\2\u00a0\u00a1\13\2\2\2\u00a1\u00a2\7\2\2\3\u00a2\u00a3"+
		"\b\7\7\2\u00a3\20\3\2\2\2\u00a4\u00a5\13\2\2\2\u00a5\u00a6\3\2\2\2\u00a6"+
		"\u00a7\b\b\2\2\u00a7\22\3\2\2\2\u00a8\u00a9\7*\2\2\u00a9\u00aa\7,\2\2"+
		"\u00aa\u00ab\3\2\2\2\u00ab\u00ac\b\t\6\2\u00ac\u00ad\b\t\2\2\u00ad\24"+
		"\3\2\2\2\u00ae\u00af\7,\2\2\u00af\u00b0\7+\2\2\u00b0\u00b1\3\2\2\2\u00b1"+
		"\u00b2\7\2\2\3\u00b2\u00b3\b\n\b\2\u00b3\26\3\2\2\2\u00b4\u00b5\7,\2\2"+
		"\u00b5\u00b6\7+\2\2\u00b6\u00b7\3\2\2\2\u00b7\u00b8\b\13\5\2\u00b8\u00b9"+
		"\b\13\2\2\u00b9\30\3\2\2\2\u00ba\u00bb\13\2\2\2\u00bb\u00bc\3\2\2\2\u00bc"+
		"\u00bd\b\f\2\2\u00bd\32\3\2\2\2\u00be\u00bf\7\60\2\2\u00bf\34\3\2\2\2"+
		"\u00c0\u00c1\7.\2\2\u00c1\36\3\2\2\2\u00c2\u00c3\7B\2\2\u00c3 \3\2\2\2"+
		"\u00c4\u00c5\7=\2\2\u00c5\"\3\2\2\2\u00c6\u00c7\7<\2\2\u00c7$\3\2\2\2"+
		"\u00c8\u00c9\7}\2\2\u00c9&\3\2\2\2\u00ca\u00cb\7\177\2\2\u00cb(\3\2\2"+
		"\2\u00cc\u00cd\7*\2\2\u00cd*\3\2\2\2\u00ce\u00cf\7+\2\2\u00cf,\3\2\2\2"+
		"\u00d0\u00d1\7-\2\2\u00d1.\3\2\2\2\u00d2\u00d3\7/\2\2\u00d3\60\3\2\2\2"+
		"\u00d4\u00d5\7,\2\2\u00d5\62\3\2\2\2\u00d6\u00d7\7\61\2\2\u00d7\64\3\2"+
		"\2\2\u00d8\u00d9\7\u0080\2\2\u00d9\66\3\2\2\2\u00da\u00db\7>\2\2\u00db"+
		"8\3\2\2\2\u00dc\u00dd\7>\2\2\u00dd\u00de\7?\2\2\u00de:\3\2\2\2\u00df\u00e0"+
		"\7?\2\2\u00e0<\3\2\2\2\u00e1\u00e2\7>\2\2\u00e2\u00e3\7/\2\2\u00e3>\3"+
		"\2\2\2\u00e4\u00e5\7?\2\2\u00e5\u00e6\7@\2\2\u00e6@\3\2\2\2\u00e7\u00e9"+
		"\t\3\2\2\u00e8\u00e7\3\2\2\2\u00e9\u00ea\3\2\2\2\u00ea\u00e8\3\2\2\2\u00ea"+
		"\u00eb\3\2\2\2\u00ebB\3\2\2\2\u00ec\u00ed\t\4\2\2\u00edD\3\2\2\2\u00ee"+
		"\u00f1\5C!\2\u00ef\u00f1\7a\2\2\u00f0\u00ee\3\2\2\2\u00f0\u00ef\3\2\2"+
		"\2\u00f1F\3\2\2\2\u00f2\u00f3\t\5\2\2\u00f3\u00f4\t\6\2\2\u00f4\u00f5"+
		"\t\7\2\2\u00f5\u00f6\t\b\2\2\u00f6\u00f7\t\b\2\2\u00f7H\3\2\2\2\u00f8"+
		"\u00f9\t\t\2\2\u00f9\u00fa\t\6\2\2\u00fa\u00fb\t\b\2\2\u00fb\u00fc\t\t"+
		"\2\2\u00fcJ\3\2\2\2\u00fd\u00fe\t\n\2\2\u00fe\u00ff\t\13\2\2\u00ffL\3"+
		"\2\2\2\u0100\u0101\t\13\2\2\u0101\u0102\t\n\2\2\u0102N\3\2\2\2\u0103\u0104"+
		"\t\13\2\2\u0104\u0105\t\f\2\2\u0105P\3\2\2\2\u0106\u0107\t\13\2\2\u0107"+
		"\u0108\t\f\2\2\u0108\u0109\t\r\2\2\u0109\u010a\t\t\2\2\u010a\u010b\t\16"+
		"\2\2\u010b\u010c\t\13\2\2\u010c\u010d\t\17\2\2\u010d\u010e\t\b\2\2\u010e"+
		"R\3\2\2\2\u010f\u0110\t\13\2\2\u0110\u0111\t\b\2\2\u0111\u0112\t\20\2"+
		"\2\u0112\u0113\t\21\2\2\u0113\u0114\t\13\2\2\u0114\u0115\t\22\2\2\u0115"+
		"T\3\2\2\2\u0116\u0117\t\6\2\2\u0117\u0118\t\t\2\2\u0118\u0119\t\17\2\2"+
		"\u0119V\3\2\2\2\u011a\u011b\t\6\2\2\u011b\u011c\t\21\2\2\u011c\u011d\t"+
		"\21\2\2\u011d\u011e\t\23\2\2\u011eX\3\2\2\2\u011f\u0120\t\23\2\2\u0120"+
		"\u0121\t\21\2\2\u0121\u0122\t\21\2\2\u0122\u0123\t\6\2\2\u0123Z\3\2\2"+
		"\2\u0124\u0125\t\17\2\2\u0125\u0126\t\r\2\2\u0126\u0127\t\t\2\2\u0127"+
		"\u0128\t\f\2\2\u0128\\\3\2\2\2\u0129\u012a\t\24\2\2\u012a\u012b\t\r\2"+
		"\2\u012b\u012c\t\13\2\2\u012c\u012d\t\6\2\2\u012d\u012e\t\t\2\2\u012e"+
		"^\3\2\2\2\u012f\u0130\t\5\2\2\u0130\u0131\t\7\2\2\u0131\u0132\t\b\2\2"+
		"\u0132\u0133\t\t\2\2\u0133`\3\2\2\2\u0134\u0135\t\t\2\2\u0135\u0136\t"+
		"\b\2\2\u0136\u0137\t\7\2\2\u0137\u0138\t\5\2\2\u0138b\3\2\2\2\u0139\u013a"+
		"\t\f\2\2\u013a\u013b\t\t\2\2\u013b\u013c\t\24\2\2\u013cd\3\2\2\2\u013d"+
		"\u013e\t\21\2\2\u013e\u013f\t\n\2\2\u013ff\3\2\2\2\u0140\u0141\t\f\2\2"+
		"\u0141\u0142\t\21\2\2\u0142\u0143\t\17\2\2\u0143h\3\2\2\2\u0144\u0145"+
		"\7v\2\2\u0145\u0146\t\16\2\2\u0146\u0147\t\25\2\2\u0147\u0148\t\t\2\2"+
		"\u0148j\3\2\2\2\u0149\u014a\7h\2\2\u014a\u014b\t\7\2\2\u014b\u014c\t\6"+
		"\2\2\u014c\u014d\t\b\2\2\u014d\u014e\t\t\2\2\u014el\3\2\2\2\u014f\u0151"+
		"\7/\2\2\u0150\u014f\3\2\2\2\u0150\u0151\3\2\2\2\u0151\u0152\3\2\2\2\u0152"+
		"\u0153\5A \2\u0153n\3\2\2\2\u0154\u0159\t\26\2\2\u0155\u0158\5E\"\2\u0156"+
		"\u0158\5A \2\u0157\u0155\3\2\2\2\u0157\u0156\3\2\2\2\u0158\u015b\3\2\2"+
		"\2\u0159\u0157\3\2\2\2\u0159\u015a\3\2\2\2\u015ap\3\2\2\2\u015b\u0159"+
		"\3\2\2\2\u015c\u0161\t\27\2\2\u015d\u0160\5E\"\2\u015e\u0160\5A \2\u015f"+
		"\u015d\3\2\2\2\u015f\u015e\3\2\2\2\u0160\u0163\3\2\2\2\u0161\u015f\3\2"+
		"\2\2\u0161\u0162\3\2\2\2\u0162r\3\2\2\2\u0163\u0161\3\2\2\2\u0164\u0166"+
		"\t\30\2\2\u0165\u0164\3\2\2\2\u0166\u0167\3\2\2\2\u0167\u0165\3\2\2\2"+
		"\u0167\u0168\3\2\2\2\u0168\u0169\3\2\2\2\u0169\u016a\b9\2\2\u016at\3\2"+
		"\2\2\u016b\u0171\7$\2\2\u016c\u016d\7^\2\2\u016d\u0170\7$\2\2\u016e\u0170"+
		"\13\2\2\2\u016f\u016c\3\2\2\2\u016f\u016e\3\2\2\2\u0170\u0173\3\2\2\2"+
		"\u0171\u0172\3\2\2\2\u0171\u016f\3\2\2\2\u0172\u0174\3\2\2\2\u0173\u0171"+
		"\3\2\2\2\u0174\u0175\7$\2\2\u0175\u0176\b:\t\2\u0176v\3\2\2\2\u0177\u017f"+
		"\7$\2\2\u0178\u017e\7^\2\2\u0179\u017a\7^\2\2\u017a\u017e\7$\2\2\u017b"+
		"\u017e\5s9\2\u017c\u017e\n\31\2\2\u017d\u0178\3\2\2\2\u017d\u0179\3\2"+
		"\2\2\u017d\u017b\3\2\2\2\u017d\u017c\3\2\2\2\u017e\u0181\3\2\2\2\u017f"+
		"\u017d\3\2\2\2\u017f\u0180\3\2\2\2\u0180\u0182\3\2\2\2\u0181\u017f\3\2"+
		"\2\2\u0182\u0183\7\2\2\3\u0183\u0184\b;\n\2\u0184x\3\2\2\2\u0185\u0186"+
		"\13\2\2\2\u0186z\3\2\2\2\23\2\3\4\u0081\u0085\u00ea\u00f0\u0150\u0157"+
		"\u0159\u015f\u0161\u0167\u016f\u0171\u017d\u017f\13\b\2\2\3\3\2\7\3\2"+
		"\6\2\2\7\4\2\3\7\3\3\n\4\3:\5\3;\6";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}