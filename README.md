https://mediacdns3.ulife.com.br/PAT/Upload/3130705/projeto_comp_quarta_20220316104015.pdf

#  Requisitos

- [x] Criar Gamatica (grmt.g4)

- [x] Printar codigo convertido para Java (Tradutor.java)

- [x] Salvar em um arquivo (Main.java)

- [x] Compilar e executar codigo Java (Main.java + os lib)


## Gramática (grmt.g4)
- [x] 3 Tipos de Variaveis 
    * ID 
    * Int 
    * Float 
    * String 
    * Boolean 
- [x] Lógica
    * If Else 
    * While 
    * For 

- [x] Operadores
    * Atribuicao de Valor 
    * Operacoes Aritmetica 
    * Operacoes Comparacao 

- [x] In Out
    * Input
    * Output

## Tradutor Java (Tradutor.java)

- [x] Converter Gramatica para Java
    * Variaveis     
    * Atribuicao de valor 
    * Operacao Aritmetica
    * Diferenciar ID de String
    * Checar se ID ja foi declarado 
    * Operacao de Comparacao 
    * If Else 
    * While 
    * For 
    * Input e Output (input + print) 

> A parte de expressões envolvendo os operadores matemáticos deve ser realizada de maneira correta, respeitando a precedência. Não é necessário gerar a resposta da expressão, basta cuidar da precedência entre os operadores matemáticos através da gramática


# Comandos:
```
Compilar gramatica: ./antlr4.bat grmt.g4

Compilar todos arquivos java: javac *.java

Fazer arvore decisao: ./grun.bat grmt init -gui

Enviar codigo e converter para java: ./executavel.bat
```
# Exemplos Input
```
if 1 > 2 then var1 = valor

cont = 10 while cont > 0 then cont = cont - 1 print cont

teste = abc teste2 = 123 teste3 = dfg teste4 = 1+2 teste5 = true teste6=teste teste7 = teste2 print teste6

var1 = 2 var2 = 3 var3 = var1+var2 print var3

teste = input print teste 

variavel=0 if 1 > 2 then variavel = 1 print variavel else then variavel=2 print variavel

for i = 0 ; i < 10 ; i + + then print i
```
