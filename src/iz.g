class MeuParser extends Parser;
{
	//Java Code
}
//Criacao da logica da linguagem / Regras da Analise Lexica
expr
	: expr_c T_EOF
	;
expr_c
	: termo ((T_sum | T_min ) termo)*
	;
termo
	: fator ((T_mul | T_div) fator)*
	;
fator
	: T_num | T_id
	;

Class MeuLexer extends Lexer;

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

//Analise Lexica
/*
Prog : programa Declara Bloco fimprog.;
Declara : (inteiro | decimal) Id (, Id)*.;
Bloco : (Cmd)+;
Cmd : CmdLeitura | CmdEscrita | CmdExpr | CmdSe;

//In Out
CmdLeitura : leia '(' Id ')'.;
CmdEscrita : escreva '(' Texto | Id ')'.;

//If
CmdSe : se '(' Expr Op_rel Expr ')' '{' Cmd+ '}' (senao '{' Cmd+ '}')?;
CmdExpr : Id ':' '=' Expr.;
Op_rel : '<' | '>' | '<' '=' | '>' '=' | '!' '=' | '=' '=';
Expr : Expr '+' Termo | Expr '-' Termo | Termo;
Termo : Termo '*' Fator | Termo '/' Fator | Fator;
Fator : Num | Id | '(' Expr ')';

//Tokens
Texto : ' "' (0-9 | a-z | A-Z | ' ' )+ ' "';
Num : ((0-9))+;
Id : ((a-z) | (A-Z))((a-z) | (A-Z) | (0-9))*;
*/