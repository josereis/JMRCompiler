grammar JMRCompiler;

@header{
        import java.util.HashMap;
        import java.util.Map;
        
       import models.ObjectSymbolTable;
}

@parser::members{   
        Map<String, ObjectSymbolTable> SymbolTable = new HashMap<String, ObjectSymbolTable>();
}

programa: 'Class' ID ';' decVars* decConsts* decFuncs* main 
    ;
decVars: tipo ':' listaIDs[$tipo.type] ';'
       ;
tipo returns [int type]: 'Int' {$type = 1;}
	| 'Float' {$type = 2;} 
    | 'Str' {$type = 3;}
    | 'Bool' {$type = 4;}  
    ;
    
tipoF returns [int type]: tipo {$type = $tipo.type;}
	| 'Void' {$type = 0;}    
    ;
    
listaIDs[int type]: ID (',' ID)*
        ;

listaIDs2: ID (',' ID)*
        ;
decConsts: 'final' tipo ID Tk_Eq valor ';'
         ;
valor returns [int type, Object value]: INT {$type = 1; $value = Integer.parseInt($INT.text);}
     | REAL {$type = 2; $value = Float.parseFloat($REAL.text);}
     | STRING {$type = 3; $value = $STRING.text;}
     | BOOLEAN {$type = 4;
     			if(($BOOLEAN.text).equals("true"))
     				$value = true;
     			else
     				$value = false;
     			}
     ;

decFuncs: tipoF ID '(' lista_parametros? ')' '{' decVars* decConsts* comandos+ '}'
        ;

lista_parametros: tipo ID (',' tipo ID)*
	;

main: 'Main' '{' comandos+ '}'
    ;

comandos: 'if' '(' bool ')' '{'comandos+'}' ('else' '{'comandos+'}')?
        | 'for' '(' atrib bool ';' bool ')' '{' comandos*'}'
        | atrib
        | funcao
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

term: term '*' unary
    | term '/' unary
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