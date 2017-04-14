grammar MiniJava;

@header
{
	package cc1.ay222cg.examples;
} 

program : mainClass (clazz)*;          

mainClass : 'class' mainClassName '{' mainMethod '}';
mainClassName : ID;
mainMethod : mainMethodSigniture '{' methodBody '}';
mainMethodSigniture : 'public' 'static' mainMethodType  mainMethodName  '(' 'String[]' ID ')';
mainMethodType : 'void'; 
mainMethodName : 'main';

clazz : 'class' clazzName '{' (defineVarSt ';')* (method)* '}';
clazzName : ID;
method : methodSigniture '{' methodBody '}';
methodSigniture : methodType methodName  '(' (methodParameter ',')* (methodParameter)? ')';
methodParameter : type ID;
methodType : type;
methodName : ID;
methodBody : (statement)*;

statement : (('break' | printSt | defineVarSt | assignArrayItem | assignSt | returnSt )';') | (ifSt|whileSt) ;
printSt : 'System.out.println(' operation ')';
defineVarSt : type (ID | assignSt);
assignSt : ID  '=' operation;
assignArrayItem : ID  ('[' (ID|Number)  ']') '=' operation;
ifSt : 'if' '(' conditions ')' (('{' statement* '}')|statement)  elseSt?;
elseSt : 'else' ('{' statement+ '}'|statement);
whileSt : 'while' '(' conditions ')' '{' (statement)* '}';
returnSt : 'return' (ID|Number);

conditions : (negativeSing '(')? (condition conjuction)*  condition ')'?;
condition : '(' condition ')' |
             operation (comparer operation)? | negativeSing operation |
			negativeSing?  '('  operation (comparer operation)? ')';
comparer : '<'|'>'|'=='|'<='|'>=';
conjuction : '&&' | '||';
negativeSing : '!';
			
operation : (element operator)* element;
element : objectMethodCall |
		  newObjectMethodCall |
		  element '.' element | 
		  '(' element ')' | 
		  element operator element |
          newObject | 
          methodCall | 
          '\'' .? '\'' | 
          ID | 
          arrayItem | 
          Number |  
          FIXSTR;
          
arrayItem : arrayName '[' arrayIndex ']';
arrayName : ID;
arrayIndex : ID;
objectMethodCall : objectName '.' methodCall;
newObjectMethodCall : newObject '.' methodCall;
objectName : ID;
newObject : 'new' ((type '[' ID ']') | 
			(ID '(' ')'));
methodCall : methodName '(' callParams? ')';
callParams : (callParameter ',')* callParameter;
callParameter : element | 
				('\'' (.|','|'.') '\'')| 
				FIXSTR;

type : 'boolean' | 'Character' | 'char' | 'String' | 'Integer' | 'int[]' | 'int' | ID;
ID : ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'0'..'9'|'_')*;
Number : ([0-9])+;
FIXSTR : '"' (~[\r\n])* '"';

operator : '+' | '-' | '*' | '/' | '%';
           
WS : [ \t\r\n]+ -> skip ; 
COMMENT :   '/*' .*? '*/' -> skip;
LINE_COMMENT  :   '//' ~[\r\n]* -> skip;