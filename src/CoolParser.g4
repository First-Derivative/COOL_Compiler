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
	//MethodNode
	OBJECTID PARENT_OPEN (formal (COMMA formal)*)? PARENT_CLOSE COLON TYPEID CURLY_OPEN expr
		CURLY_CLOSE
	//AttributeNode
	| OBJECTID COLON TYPEID (ASSIGN_OPERATOR expr)?;

formal: OBJECTID COLON TYPEID;

expr:
	OBJECTID ASSIGN_OPERATOR expr
	| expr (AT TYPEID)? PERIOD OBJECTID PARENT_OPEN (
		expr (COMMA expr)*
	)? PARENT_CLOSE
	| OBJECTID PARENT_OPEN (expr (COMMA expr)*)? PARENT_CLOSE
	| IF expr THEN expr ELSE expr FI
	| WHILE expr LOOP expr POOL
	| CURLY_OPEN (expr SEMICOLON)+ CURLY_CLOSE
	| LET OBJECTID COLON TYPEID (ASSIGN_OPERATOR expr)? (
		COMMA OBJECTID COLON TYPEID (ASSIGN_OPERATOR expr)?
	)* IN expr
	| CASE expr OF (
		OBJECTID COLON TYPEID RIGHTARROW expr SEMICOLON
	)+ ESAC
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
	| OBJECTID
	| INT_CONST
	| STRING_CONST
	| TRUE
	| FALSE;

error: ERROR { Utilities.lexError(); };