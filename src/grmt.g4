grammar grmt;

init: 
	ifthen;

// IF [if x > y then x = 123]
ifthen: 'if' condicao 'then' expr;

// IF - Condicao [x > y]
condicao:
	(id|num) op_logc (id|num);

// Operadores logicos de comparacao
op_logc:
	'>' | '<' | '<=' | '>=' | '==' | '!=';

// Operadores Matematicos
op_mat:
	'+' | '-' | '*' | '/';

// Atribuicao Valor [x = 123]
expr:
	id '=' (id|num);

// Tokens
//ID
id: //Definir o Regex
	ID_EXPR; 
ID_EXPR: //Maiuscula = Regex
	([a-z]|[A-Z])+[0-9]*;

//Numeros Inteiros
num: //Definir o Regex
	NUM_EXPR;
NUM_EXPR: //Maiuscula = Regex
	[0-9]+;

//Float
flt: //Definir o Regex
	FLT_EXPR;
FLT_EXPR: //Maiuscula = Regex
	[0-9]?.[0-9]+;

// Deve ignorar esses casos:
Ws:
	[ \t\r\n]+ -> skip;