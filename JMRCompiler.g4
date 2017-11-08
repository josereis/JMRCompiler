grammar JMRCompiler;

@header{
        import java.util.HashMap;
        import java.util.Map;
        
       import models.ObjectSymbolTable;
}

@parser::members{   
        Map<String, ObjectSymbolTable> SymbolTable = new HashMap<String, ObjectSymbolTable>();
}

programa: 'Class' ID ';' (decVars|decConsts|decFuncs)* main 
    ;
decVars: tipo ':' listaIDs[$tipo.t] ';'
       ;
tipo returns [int t]: 'Int' {$t = 1;} 
    | 'Str' {$t = 2;}
    | 'Bool' {$t = 3;} 
    | 'Float' {$t = 4;} 
    ;
listaIDs[int t]: ID (',' ID)*
        ;

listaIDs2: ID (',' ID)*
        ;
decConsts: 'final' tipo ID Tk_Eq valor ';'
         ;
valor: INT 
     | REAL 
     | STRING 
     | BOOLEAN 
     ;

decFuncs: (tipo|'Void') ID '(' lista_parametros ')' '{' (comandos|decVars|decConsts)+ '}'
        ;

lista_parametros: tipo ID (',' tipo ID)*
                ;

main: 'Main' '{' (comandos|decVars|decConsts)+ '}'
    ;

comandos: 'if' '(' bool ')' '{'comandos+'}' ('else' '{'comandos+'}')?
        | 'for' '(' atrib bool ';' bool ')' '{' comandos*'}'
        | decConsts
        | atrib
        | bool ';'
        | print
        | read
        | 'break' ';'
        | 'return' (bool)? ';'
        ;

atrib: ID Tk_Eq bool ';'
     | ID '++' ';'
     | ID '--' ';'
     ;

funcao: ID '(' bool(',' bool )* ')'
      ;

bool: bool '||' join
    | join
    ;

join: join '&&' rel
    | rel
    ;

rel: equality '<' equality 
   | equality '<=' equality
   | equality '>=' equality
   | equality '>' equality
   | equality
   ;

equality: equality '==' expr
        | equality '!=' expr
        | expr
        ;

expr: expr '+' term
    | expr '-' term
    | term
    ;

term: term '*' term2
    | term '/' term2
    | term2
    ;

term2: unary '++'
     | unary '--'
     | unary
     ;

unary: '!' factor
     | '-' factor
     | factor
     ;

factor: funcao
      | valor
      | '('bool')'
      | ID
      ;


print: 'print' '(' bool(',' bool )* ')' ';'
     ;

read: 'read' '(' listaIDs2 ')' ';'
    ;
        
        
Tk_Class: 'Class';
Tk_Main: 'Main';
Tk_PtVirg: ';';
Tk_Virg: ',';
Tk_DoisPt: ':';
Tk_Eq: '=';
Tk_Int: 'Int';
Tk_Str: 'Str';
Tk_Bool: 'Bool';
Tk_Float: 'Float';
Tk_Void: 'Void';
Tk_Final: 'final';
Tk_AbreChave: '{';
Tk_FechChave: '}';
Tk_AbrePar: '(';
Tk_FechaPar: ')';
Tk_Return: 'return';
Tk_If: 'if';
Tk_Else: 'else';
Tk_For: 'for';
Tk_Break: 'break';
Tk_Print: 'print';
Tk_Read: 'read';

Tk_Inc: '++';
Tk_Dec: '--';
Tk_Soma: '+';
Tk_Sub: '-';
Tk_Mult: '*';
Tk_Div: '/';
Tk_Equal: '==';
Tk_Dif: '!=';
Tk_Diff: '!';
Tk_Maiorq: '>';
Tk_Menorq: '<';
Tk_Maiorig: '>=';
Tk_Menorig: '<=';
Tk_Ou: '||';
Tk_E: '&&';

STRING: '"' .*? '"' ;
INT: [0-9]+ ;
REAL: [0-9]+'.'[0-9]+ ;
BOOLEAN: ('true'|'false');
ID: [A-Za-z][A-Za-z0-9]* ;
COMMENT_LINE: '//' .*? '\r'? '\n' -> skip;
COMMENT: '/*' .*? '*/' -> skip;
WS: [ \t\r\n] -> skip;