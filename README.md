https://mediacdns3.ulife.com.br/PAT/Upload/3130705/projeto_comp_quarta_20220316104015.pdf

#  Requisitos

[OK] Criar Gamatica [OK] (grmt.g4)

[ ] Printar codigo convertido para Java [Pendente] (Tradutor.java)

[ ] Salvar em um arquivo [Pendente] (Main.java)

[ ] Compilar e executar codigo Java [Pendente] (Main.java + os lib)


## Gramática (grmt.g4)
* 3 Tipos de Variaveis 
    * ID [OK]
    * Int [OK]
    * Float [OK]
    * String [OK]
    * Boolean [OK]

* If Else [OK] 
* While [OK] 
* For [OK]

* Atribuicao de Valor [OK]
* Operacoes Aritmetica [OK]
* Operacoes Comparacao [OK]

## Tradutor Java (Tradutor.java)

* Converter Gramatica para Java
    * Variaveis [Pendente]    
    * Atribuicao de valor [Pendente]
    * Operacao Aritmetica [Pendente]
        (Verificar tipo da variavel)
    * Operacao de Comparacao [Pendente]
    * If Else [Pendente]
    * While [Pendente]
    * For [Pendente]

* Input e Output (input + print) [Pendente] -> ??

* Verificar se a variável ja foi declarada [Pendente] -> Validar no momento de fazer o tradutor, retornando erro caso ja tenha sido declarada (criar um array de variáveis já declaradas)

A parte de expressões envolvendo os operadores matemáticos deve ser realizada de maneira correta, respeitando a precedência. Não é necessário gerar a resposta da expressão, basta cuidar da precedência entre os operadores matemáticos através da gramática [OK]


# Comandos:

Compilar gramatica: ./antlr4.bat grmt.g4

Compilar todos arquivos java: javac *.java

Fazer arvore decisao: ./grun.bat grmt init -gui

Enviar codigo e converter para java: ./executavel.bat
