/**
 * Define a lexer rules for Cool
 */
lexer grammar CoolLexer;

/* Comments */
SINGLE_LINE_COMMENT: '--' ~[\r\n]* '\r'? '\n' -> skip;
MULTI_LINE_COMMENT: '(*' .*? '*)' -> skip;

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
fragment CLASS: [Cc] [Ll] [Aa] [Ss] [Ss];
fragment ELSE: [Ee] [Ll] [Ss] [Ee];
fragment FI: [Ff] [Ii];
fragment IF: [Ii] [Ff];
fragment IN: [Ii] [Nn];
fragment INHERITS: [Ii] [Nn] [Hh] [Ee] [Rr] [Ii] [Tt] [Ss];
fragment ISVOID: [Ii] [Ss] [Vv] [Oo] [Ii] [Dd];
fragment LET: [Ll] [Ee] [Tt];
fragment LOOP: [Ll] [Oo] [Oo] [Pp];
fragment POOL: [Pp] [Oo] [Oo] [Ll];
fragment THEN: [Tt] [Hh] [Ee] [Nn];
fragment WHILE: [Ww] [Hh] [Ii] [Ll] [Ee];
fragment CASE: [Cc] [Aa] [Ss] [Ee];
fragment ESAC: [Ee] [Ss] [Aa] [Cc];
fragment NEW: [Nn] [Ee] [Ww];
fragment OF: [Oo] [Ff];
fragment NOT: [Nn] [Oo] [Tt];
fragment TRUE: 't' [Rr] [Uu] [Ee];
fragment FALSE: 'f' [Aa] [Ll] [Ss] [Ee];

KEYWORD:
	CLASS
	| ELSE
	| FI
	| IF
	| IN
	| INHERITS
	| ISVOID
	| LET
	| LOOP
	| POOL
	| THEN
	| WHILE
	| CASE
	| ESAC
	| NEW
	| OF
	| NOT
	| TRUE
	| FALSE;

/* VALUES */

// check that string and comments supports empty

STRING_CONST:
	'"' (
		'\\' ('\\' | '\t' | '\r\n' | '\r' | '\n' | '\"')
		| ~('\\' | '\t' | '\r' | '\n' | '"')
	)* '"';

INT_CONST: '-'? DIGIT;

IDENTIFIER: LETTER (LETTER_ | DIGIT)*;

WS: (' ' | '\t' | '\n' | '\r' | '\u000B')+ -> skip;

/* ERROR */
ERROR: .;
