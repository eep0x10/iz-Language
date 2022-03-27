//Criacao da logica da linguagem / Regras da Analise Lexica
//expr
//	: expr_c T_EOF
//	;
expr_c
	: termo ((T_sum | T_min ) termo)*
	;
termo
	: fator ((T_mul | T_div) fator)*
	;
fator
	: T_num | T_id
	;


//Criacao dos Tokens

//Configuracoes
options {
	caseSensitive = true; //Diferencia entre maiusculas e minusculas
	charVocabulary = '\0'..'\377'; //Aceita todos simbolos UNICODE
	k = 5; //Minimo de caracteres para analisar, a fim de nao se confundir com uma palavra reservada
}

//Tokens
T_EOF
	: ';'
	;

//Operacoes Matematicas Basicas
T_sum
	: '+'
	;
T_min
	: '-'
	;
T_div
	: '/'
	;
T_mul
	: '*'
	;

T_num
	: ('0'..'9')+
	;
T_id
	: ((a..z) | (A..Z)) ((a..z) | (A..Z) | (0..9))*
	;
T_space
	: (' ' | '\t' | '\n' | '\r') {_ttype = Token.Skip; }
	;