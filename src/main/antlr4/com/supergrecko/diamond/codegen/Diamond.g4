grammar Diamond;

program : topLevelDeclaration;

entryDeclaration : ENTRY LBRACE RBRACE;

topLevelDeclaration : entryDeclaration
    | structDeclaration
    ;

structDeclaration : STRUCT name=ID (LARR generics += ID (COMMA generics += ID) RARR)? LBRACE RBRACE;

genericType : ID LARR genericType RARR;

// Reserved Keywords
BREAK : 'break';
CONST : 'const';
CONTINUE : 'continue';
DEFINE : 'define';
DERIVES : 'derives';
ELSE : 'else';
ENTRY : 'entry';
EXTERN : 'extern';
FUN : 'fun';
GUARD : 'guard';
IF : 'if';
IMPORT : 'import';
LINK : 'link';
LOOP : 'loop';
MUT : 'mut';
RETURN : 'return';
STATIC : 'static';
STRUCT : 'struct';
THIS : 'this';
TYPEDEF : 'typedef';
WHEN : 'when';
YIELD : 'yield';

// Identifiers
LARR : '<';
RARR : '>';
LBRACE : '{';
RBRACE : '}';
LBRACKET : '[';
RBRACKET : ']';
LPAREN : '(';
RPAREN : ')';
DOT : '.';
COMMA : ',';
COLON : ':';
SEMICOLON : ';';
STAR : '*';
SLASH : '/';
PLUS : '+';
MINUS : '-';
EQUAL : '=';
BANG : '!';
NOTEQUAL : '!=';
OR : '||';
AND : '&&';
LESSEQUAL : '<=';
GREATEQUAL : '>=';
COLONCOLON : '::';
ARROW : '->';

// Literal values
NULL : 'null';
TRUE : 'true';
FALSE : 'false';

INT : DIGIT+;
DOUBLE : DIGIT+ '.' DIGIT+;
STRING : '\'' ~('\'')* '\'';
ID : [A-Za-z][A-Za-z0-9]+;

fragment DIGIT : [0-9];

COMMENT: '#' .*?-> skip;
WS: [ \n\t\r]+ -> skip;
UNKNOWN : .;
