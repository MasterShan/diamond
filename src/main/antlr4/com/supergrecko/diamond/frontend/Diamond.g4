grammar Diamond;

program
    : namespaceDeclaration? declarations+=primaryDeclaration*
    ;

// Declarations
namespaceDeclaration
    : NAMESPACE id=ID
    ;

entryDeclaration
    : ENTRY LBRACE body+=genericStatement* RBRACE
    ;

primaryDeclaration
    : entryDeclaration
    | functionDeclaration
    ;

functionDeclaration
    : FUN name=ID typeParameters? functionParameters LBRACE body+=genericStatement* RBRACE
    ;

// Groups
expression
    : LPAREN expr=expression RPAREN                                                     # groupingExpression
    | name=ID                                                                           # variableExpression
    | THIS                                                                              # thisExpression
    | value=STRING                                                                      # stringExpression
    | value=DOUBLE                                                                      # doubleExpression
    | value=INT                                                                         # intExpression
    | NULL                                                                              # nullExpression
    | value=(TRUE | FALSE)                                                              # booleanExpression
    | callable=expression typeArguments? functionArguments                              # callExpression
    | left=expression operator=(STAR | SLASH) right=expression                          # multiplicativeExpression
    | left=expression operator=(PLUS | MINUS) right=expression                          # additiveExpression
    | left=expression operator=(AND | OR) right=expression                              # binaryExpression
    | left=expression operator=ID right=expression                                      # infixExpression
    | left=expression operator=(EQUAL | NOTEQUAL) right=expression                      # equalityExpression
    | FUN typeParameters? functionParameters LBRACE body+=genericStatement* RBRACE      # functionExpression
    ;

functionArguments
    : LPAREN (args+=expression (COMMA args+=expression)*)? RPAREN
    ;

typeArguments
    : LARR args+=ID (COMMA args+=ID)* RARR
    ;

functionParameters
    : LPAREN (params+=ID (COMMA params+=ID)*)? RPAREN
    ;

typeParameters
    : LARR params+=ID (COMMA params+=ID)* LPAREN
    ;

genericStatement
    : mutStatement
    | constStatement
    | assignmentStatement
    | expressionStatement
    ;

// Statements
assignmentStatement
    : expression EQUAL expression
    ;

mutStatement
    : MUT id=ID COLON type=typeAnnotation EQUAL value=expression
    ;

constStatement
    : CONST id=ID COLON type=typeAnnotation EQUAL value=expression
    ;

breakStatement
    : BREAK
    ;

continueStatement
    : CONTINUE
    ;

expressionStatement
    : expr=expression
    ;

// Helpers
typeAnnotation
    : id=ID (LARR generic=typeAnnotation RARR)?
    ;

// Reserved Keywords
BREAK : 'break';
CONST : 'const';
CONTINUE : 'continue';
CONTRACT : 'contract';
DEFINE : 'define';
DERIVES : 'derives';
ELSE : 'else';
ENTRY : 'entry';
EXTERN : 'extern';
FUN : 'fun';
GUARD : 'guard';
IF : 'if';
LOOP : 'loop';
MUT : 'mut';
NAMESPACE : 'namespace';
RETURN : 'return';
STATIC : 'static';
STRUCT : 'struct';
THIS : 'this';
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
