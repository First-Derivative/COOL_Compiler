lexer grammar CoolLexer;

tokens {
	ERROR
}

@lexer::members {
	public void createError(String text) { 
		setText(text);
		setType(ERROR);
	}

  public void checkString(String t) {
		StringBuilder buf = new StringBuilder(0);
		String text = t;

		for(int i = 0; i < text.length(); i++) {
			if (text.charAt(i) == '\\' && text.charAt(i+1) == '\000') {
				createError("String contains escaped null character.");
				return;
			} else if (text.charAt(i) == '\n') {
				createError("Unterminated string constant");
				return;
			} else if(text.charAt(i) == '\\') {
				if(text.charAt(i+1) == 'n')
					buf.append('\n');
				else if(text.charAt(i+1) == 'f')
					buf.append('\f');
				else if(text.charAt(i+1) == 't')
					buf.append('\t');
				else if(text.charAt(i+1) == 'b')
					buf.append('\t');
				else if(text.charAt(i+1) == '\"')
					buf.append('\"');
				else if(text.charAt(i+1) == '\\')
					buf.append('\\');
				else
					buf.append(text.charAt(i+1));
				i++;
			} else {
				buf.append(text.charAt(i));
			}
		}

		// TOOD: check string table for length

		// get rid of quotes maybe do with pop/push mode thing
		setText(
			newText.substring(
				1, newText.length()-1
			)
		);
		return;
	}
}

/* Comments */
SINGLE_LINE_COMMENT: '--' ~[\r\n]* '\r'? '\n' -> skip;
MULTI_LINE_COMMENT:
	'(*' (MULTI_LINE_COMMENT | .)*? '*)' -> skip;

/* Punctution */
PERIOD: '.';
COMMA: ',';
AT: '@';
SEMICOLON: ';';
COLON: ':';

CURLY_OPEN: '{';
CURLY_CLOSE: '}';
PARENT_OPEN: '(';
PARENT_CLOSE: ')';

/* Operators */
PLUS_OPERATOR: '+';
MINUS_OPERATOR: '-';
MULT_OPERATOR: '*';
DIV_OPERATOR: '/';

INT_COMPLEMENT_OPERATOR: '~';

LESS_OPERATOR: '<';
LESS_EQ_OPERATOR: '<=';
EQ_OPERATOR: '=';
ASSIGN_OPERATOR: '<-';
RIGHTARROW: '=>';

/* CHARACTER SETS */
fragment DIGIT: [0-9]+;
fragment LETTER: [a-zA-Z];
fragment LETTER_: LETTER | '_';
fragment ESCAPE_CHARACTERS:
	'\\'
	| '\n'
	| '\t'
	| '\f'
	| '\r'
	| '\b'
	| '"';

/* Keywords */
CLASS: [Cc] [Ll] [Aa] [Ss] [Ss];
ELSE: [Ee] [Ll] [Ss] [Ee];
FI: [Ff] [Ii];
IF: [Ii] [Ff];
IN: [Ii] [Nn];
INHERITS: [Ii] [Nn] [Hh] [Ee] [Rr] [Ii] [Tt] [Ss];
ISVOID: [Ii] [Ss] [Vv] [Oo] [Ii] [Dd];
LET: [Ll] [Ee] [Tt];
LOOP: [Ll] [Oo] [Oo] [Pp];
POOL: [Pp] [Oo] [Oo] [Ll];
THEN: [Tt] [Hh] [Ee] [Nn];
WHILE: [Ww] [Hh] [Ii] [Ll] [Ee];
CASE: [Cc] [Aa] [Ss] [Ee];
ESAC: [Ee] [Ss] [Aa] [Cc];
NEW: [Nn] [Ee] [Ww];
OF: [Oo] [Ff];
NOT: [Nn] [Oo] [Tt];

TRUE: 't' [Rr] [Uu] [Ee];
FALSE: 'f' [Aa] [Ll] [Ss] [Ee];

/* VALUES */

INT_CONST: '-'? DIGIT;
ID: [a-z] (LETTER_ | DIGIT)*;
TYPEID: [A-Z] (LETTER_ | DIGIT)*;
WS: (' ' | '\t' | '\n' | '\r' | '\u000B')+ -> skip;

EOF_STRING: ('"' ( '\\' | WS | ~('\\' | '"'))*) (EOF) {
	createError("EOF in string constant");
};

STRING_CONST:
	'"' (
		('\\' | '\t' | '\r\n' | '\r' | '\n' | '\\"')
		| ~('\\' | '\t' | '\r' | '\n' | '"')
	)* '"' { 
		checkString(getText()); 
	};

ERROR: .;