lexer grammar CoolLexer;

// Missing support for null values, invalid multiline comments (comment without closing bracket)

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

STRING_CONST:
	'"' (
		('\\' | '\t' | '\r\n' | '\r' | '\n' | '\\"')
		| ~('\\' | '\t' | '\r' | '\n' | '"')
	)* '"';

INT_CONST: '-'? DIGIT;
// BOOL_CONST: (TRUE | FALSE);

ID: [a-z] (LETTER_ | DIGIT)*;
TYPEID: [A-Z] (LETTER_ | DIGIT)*;

WS: (' ' | '\t' | '\n' | '\r' | '\u000B')+ -> skip;

ERROR: .;