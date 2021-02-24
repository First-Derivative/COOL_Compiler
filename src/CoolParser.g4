/**
 * Define a grammar for Cool
 */
parser grammar CoolParser;

options {
	tokenVocab = CoolLexer;
}

// ProgramNode
program: (coolClass SEMICOLON)+ EOF;

coolClass:
	// ClassNode
	CLASS TYPEID (INHERITS TYPEID)? CURLY_OPEN (
		feature SEMICOLON
	)* CURLY_CLOSE;

feature:
	//MethodNode
	OBJECTID PARENT_OPEN (formal (COMMA formal)*)? PARENT_CLOSE COLON TYPEID CURLY_OPEN expr
		CURLY_CLOSE
	//AttributeNode
	| OBJECTID COLON TYPEID (ASSIGN_OPERATOR expr)?;

// FormalNode
formal: OBJECTID COLON TYPEID;

// BranchNode 
branch: OBJECTID COLON TYPEID RIGHTARROW expr SEMICOLON;

letvars: OBJECTID COLON TYPEID (ASSIGN_OPERATOR expr)?;

expr:
	// AssignNode
	OBJECTID ASSIGN_OPERATOR expr

	// StaticDispatchNode <expr>@<type>.id(<expr>,...,<expr>)
	| expr (AT TYPEID)? PERIOD OBJECTID PARENT_OPEN (
		expr (COMMA expr)*
	)? PARENT_CLOSE

	// DispatchNode <id>(<expr>,...,<expr>)
	| OBJECTID PARENT_OPEN (expr (COMMA expr)*)? PARENT_CLOSE

	// DispatchNodeAlt <expr>.<id>(<exprn>...) consider merging into static dispatch
	| expr PERIOD OBJECTID PARENT_OPEN (expr (COMMA expr)*)? PARENT_CLOSE

	// CondNode
	| IF expr THEN expr ELSE expr FI

	// LoopNode
	| WHILE expr LOOP expr POOL

	// BlockNode
	| CURLY_OPEN (expr SEMICOLON)+ CURLY_CLOSE

	// LetNode
	| LET letvars (COMMA letvars)* IN expr

	// CaseNode
	| CASE expr OF branch+ ESAC

	// NewNode
	| NEW TYPEID

	// IsVoidNode
	| ISVOID expr

	// PlusNode
	| expr PLUS_OPERATOR expr

	// SubNode
	| expr MINUS_OPERATOR expr

	// MulNode
	| expr MULT_OPERATOR expr

	// DivideNode
	| expr DIV_OPERATOR expr

	// NegNode
	| INT_COMPLEMENT_OPERATOR expr

	// LTNode
	| expr LESS_OPERATOR expr

	// LEqNode
	| expr LESS_EQ_OPERATOR expr

	// EqNode 
	| expr EQ_OPERATOR expr

	// CompNode
	| NOT expr

	// ExpressionNode
	| PARENT_OPEN expr PARENT_CLOSE

	// ObjectNode
	| OBJECTID

	// IntConstNode
	| INT_CONST

	// StringConstNode
	| STRING_CONST

	// BoolConstNode
	| TRUE

	// BoolConstNode
	| FALSE;

error: ERROR { Utilities.lexError(); };