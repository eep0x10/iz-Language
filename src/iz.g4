grammar iz;

init
 : comando
 ;
comando
 : tipo VAR '=' (VAR|INT)
 ;
tipo
 : 'it' | 'fl'
 ;
let
 : VAR '=' INT 
 ;
show
 : 'show' (INT | VAR) 
 ;
VAR
 : [a-z]+
 ;
INT
 : [0-9]+(.[0-9]+)?
 ;
JMP
 : [\t\r\n ]+ -> skip
 ;
