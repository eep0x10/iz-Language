grammar grmt;

init: 
	ifthen;

// if x > y then x = 123
ifthen: 'if' condicao 'then' expr;

// x > y
condicao:
	(id|num) op_logc (id|num);

// Operadores logicos de comparacao
op_logc:
	'>' | '<' | '<=' | '>=' | '==' | '!=';

// x = 123
expr:
	id '=' (id|num);

// Tokens Variaveis
id:
	ID_EXPR; //Definir o Regex

ID_EXPR: //Maiuscula = Regex
	([a-z]|[A-Z])+[0-9]*;

num:
	NUM_EXPR; //Definir o Regex

NUM_EXPR: //Maiuscula = Regex
	[0-9]+;

// Deve ignorar esses casos:
Ws:
	[ \t\r\n]+ -> skip;
