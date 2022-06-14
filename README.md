https://mediacdns3.ulife.com.br/PAT/Upload/3130705/projeto_comp_quarta_20220316104015.pdf

#  Requisitos

- [x] Criar Gamatica (grmt.g4)

- [x] Printar codigo convertido para Java (Tradutor.java)

- [] Salvar em um arquivo (Main.java)

- [] Compilar e executar codigo Java (Main.java + os lib)


## Gramática (grmt.g4)
- [x] 3 Tipos de Variaveis 
    * ID [OK]
    * Int [OK]
    * Float [OK]
    * String [OK]
    * Boolean [OK]
- [x] Lógica
    * If Else [OK] 
    * While [OK] 
    * For [OK]

- [x] Operadores
    * Atribuicao de Valor [OK]
    * Operacoes Aritmetica [OK]
    * Operacoes Comparacao [OK]

- [x] In Out
    * Input
    * Output

## Tradutor Java (Tradutor.java)

- [x] Converter Gramatica para Java
    * Variaveis [OK]    
    * Atribuicao de valor [OK]
    * Operacao Aritmetica [OK]
    * Diferenciar ID de String [OK]
    * Checar se ID ja foi declarado [OK]
    * Operacao de Comparacao [OK]
    * If Else [OK]
    * While [OK]
    * For [OK]

* Input e Output (input + print) [OK]

A parte de expressões envolvendo os operadores matemáticos deve ser realizada de maneira correta, respeitando a precedência. Não é necessário gerar a resposta da expressão, basta cuidar da precedência entre os operadores matemáticos através da gramática [OK]


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

teste = input print 

variavel=0 if 1 > 2 then variavel = 1 print variavel else then variavel=2 print variavel

for i = 0 ; i < 10 ; i + + then print i
```