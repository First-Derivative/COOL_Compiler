lexer grammar CoolLexer;

tokens {
	ERROR
}

@lexer::members {
	public void createError(String text) { 
		setText(text);
		setType(ERROR);
	}

  public void checkString(String text) {
		// String newText = t;
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

		String bufString = buf.toString();
		if(bufString.length() - 2 > 1024) {
			createError("String constant too long");
			return;
		}

		setText(bufString);
		return;
	}
}

/* Comments */
SINGLE_LINE_COMMENT: '--' (.)*? ('\n' | '\r' | EOF) -> skip;
// MULTI_LINE_COMMENT: '(*' (MULTI_LINE_COMMENT | .)*? '*)' -> skip; UNMATCHED_COMMENT: '*)' {
// createError("Unmatched *)"); }; EOF_COMMENT: '(*' .(EOF) { createError("EOF in comment"); };

UNMATCHED_COMMENT: '*)' { createError("Unmatched *)"); };

BEGIN_COMMENT: '(*' -> skip, pushMode(COMMENT_MODE);
mode COMMENT_MODE;
END_COMMENT: '*)' -> skip, popMode;
BEGIN_INNER_COMMENT: '(*' -> skip, pushMode(INNER_COMMENT);
EOF_COMMENT: . (EOF) { createError("EOF in comment"); };
COMMENT_CONTENT: . -> skip;

mode INNER_COMMENT;
NEW_INNER_COMMENT: '(*' -> pushMode(INNER_COMMENT), skip;
INNER_COMMENT_EOF: '*)' EOF { createError("EOF in comment"); };
CLOSE_INNER_COMMENT: '*)' -> popMode, skip;
INNER_COMMENT_CONTENT: . -> skip;

mode DEFAULT_MODE;

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
OBJECTID: [a-z] (LETTER_ | DIGIT)*;
TYPEID: [A-Z] (LETTER_ | DIGIT)*;
WS: (' ' | '\t' | '\n' | '\r' | '\f' | '\u000B')+ -> skip;

STRING_CONST:
	'"' (
		('\\' | '\t' | '\r\n' | '\r' | '\n' | '\\"')
		| ~('\\' | '\t' | '\r' | '\n' | '"')
	)* '"' { checkString(getText()); };

EOF_STRING: ('"' ( '\\' | '\\"' | WS | ~('\\' | '"'))*) (EOF) {
	String text = getText();

	for (int i=0; i<text.length(); i++) {
		if (text.charAt(i) == '\000') {
			createError("String contains null character.");
			return; 
		}
	}
	
	createError("EOF in string constant"); 
};

ERROR: .;