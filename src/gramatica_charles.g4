grammar Gramatica;

init: {System.out.println("public class Code{");
	System.out.println("public static void main(String[] args){");}
	ifstmt  
	{System.out.println("}");};

ifstmt: 'if' {System.out.print("if(");} 
	condicao 
	'then'{System.out.println("){");} 
	expressao {System.out.println(";\n}");
	System.out.println("}");};

condicao: id operador {System.out.print(" " + $operador.text + " ");} id;

expressao: id atribuicao {System.out.print(" = ");} (num|id);

atribuicao: '=';

operador: '>' | '<' | '==' | '!=';

id: ID {System.out.print($ID.text);};

num: NUM {System.out.print($NUM.text);};

ID: [a-z]+;
NUM: [0-9]+;
WS: [ \t\r\n]+ -> skip;
