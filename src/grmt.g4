grammar grmt;

init: 
	ifthen | whilethen | forthen | atrib | calc | comp;

// IF [if x > y then x = 123]
ifthen:
	'if' comp 'then' expressao;

// While [while x > y == True then x = 123]
whilethen:
	'while' comp 'then' atrib;

// For [for x > y && i=0 then x = 123]
forthen:
	'for' comp '&'(comp)* 'then' atrib;

expressao: 
	id atrib var_types;

//Comparacao
comp:
	number op_comp number;
// Operadores de Comparacao
op_comp:
	'>' | '<' | '<=' | '>=' | '==' | '!=';

//Calculo
calc:
	number op_calc number;
// Operadores Matematicos
op_calc:
	'+' | '-' | '*' | '/';

// Atribuicao Valor [x = 123]
atrib:
	'=';

number:
	num|flt;
var_types:
	number|str|bool;

// Tokens
fragment ID_LETTER :
	[a-z] | [A-Z] | '_' ;
fragment DIGIT : 
	[0-9] ;

//Boolean
bool: //Definir o Regex
	BOOL_EXPR;
BOOL_EXPR:
	'true' | 'false';
	
//Variavel Generica / String
id:
	ID_EXPR; 
ID_EXPR:
	(DIGIT)* ID_LETTER (ID_LETTER | DIGIT)*;

//String
str:
	ID_EXPR;

//Integer
num:
	NUM_EXPR;
NUM_EXPR:
	(DIGIT)+;

//Float
flt:
	FLT_EXPR;
FLT_EXPR:
	(DIGIT)*([.]DIGIT)+;

// Deve ignorar esses casos:
Ws:
	[ \t\r\n]+ -> skip;