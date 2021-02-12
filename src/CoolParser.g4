/**
 * Define a grammar for Cool
 */
parser grammar CoolParser;

options {
	tokenVocab = CoolLexer;
}

program: (coolClass SEMICOLON)+ EOF;

coolClass:
	CLASS TYPEID (INHERITS TYPEID)? CURLY_OPEN (
		feature SEMICOLON
	)* CURLY_CLOSE;

feature:
	ID PARENT_OPEN (parameter (COMMA parameter)*)? PARENT_CLOSE COLON TYPEID CURLY_OPEN expr
		CURLY_CLOSE
	| ID COLON TYPEID (ASSIGN_OPERATOR expr)?;

parameter: ID COLON TYPEID;

expr:
	ID ASSIGN_OPERATOR expr
	| expr (AT TYPEID)? PERIOD ID PARENT_OPEN (
		expr (COMMA expr)*
	)? PARENT_CLOSE
	| ID PARENT_OPEN (expr (COMMA expr)*)? PARENT_CLOSE
	| IF expr THEN expr ELSE expr FI
	| WHILE expr LOOP expr POOL
	| CURLY_OPEN (expr SEMICOLON)+ CURLY_CLOSE
	| LET ID COLON TYPEID (ASSIGN_OPERATOR expr)? (
		COMMA ID COLON TYPEID (ASSIGN_OPERATOR expr)?
	)* IN expr
	| CASE expr OF (ID COLON TYPEID RIGHTARROW expr SEMICOLON)+ ESAC
	| NEW TYPEID
	| ISVOID expr
	| expr PLUS_OPERATOR expr
	| expr MINUS_OPERATOR expr
	| expr MULT_OPERATOR expr
	| expr DIV_OPERATOR expr
	| INT_COMPLEMENT_OPERATOR expr
	| expr LESS_OPERATOR expr
	| expr LESS_EQ_OPERATOR expr
	| expr EQ_OPERATOR expr
	| NOT expr
	| PARENT_OPEN expr PARENT_CLOSE
	| ID
	| INT_CONST
	| STRING_CONST
	| TRUE
	| FALSE;

error: ERROR { Utilities.lexError(); };