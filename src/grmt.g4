grammar grmt;

init: 
	(ifthen | whilethen | forthen | atrib | calc | comp | print | else)*;

//print + input
print:
	'print' id;
input:
	'input';

// IF [if x > y then x = 123]
ifthen:
	'if' comp expressao;

//Else
else:
	'else' expressao;

// While [while x > y == True then x = 123]
whilethen:
	'while' comp expressao;

// For [for x > y && i=0 then x = 123]
forthen:
	'for' forcomp expressao;

forcomp:
	id op_atrib (var_types|calc|input) p_virg (number|id) op_comp (number|id) p_virg (id) add_min add_min;

add_min:
	'+' | '-';

p_virg:
	';';

expressao: 
	'then' (print | atrib | ifthen | whilethen | forthen | calc | comp)*;

//Comparacao
comp:
	(number|id) op_comp (number|id);
// Operadores de Comparacao
op_comp:
	'>' | '<' | '<=' | '>=' | '==' | '!=';

//Calculo
calc:
	(number|id) op_calc (number|id);
// Operadores Matematicos
op_calc:
	'+' | '-' | '*' | '/';

atrib:
	id op_atrib (var_types|calc|input);

// Atribuicao Valor [x = 123]
op_atrib:
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