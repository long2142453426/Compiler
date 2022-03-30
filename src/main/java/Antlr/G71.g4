grammar G71;


/** G71 Program. */
program
    :  globalDecl* function* mainProg  ;


mainProg:
    stat*
    ;

function:
    type? ID LPAR params? RPAR block
    ;

globalDecl:
    GLOBAL type ID SEMI
    ;

/** Grouped sequence of statements, it also creates a new scope */
block
    : LBRACE stat* RBRACE
    ;

/** Sepcial block that create a new thread executing what is inside */
parBlock: block;

/** Statement. */
stat: ID exprDimension* ASS expr SEMI               #assStat
    | type ID SEMI                                  #declStat
    | THREAD LBRACE parBlock+ RBRACE                #parallelStat
    | LOCK LPAR RPAR   SEMI                         #lockStat
    | UNLOCK LPAR RPAR SEMI                    #unlockStat
    | IF LPAR expr RPAR  block (ELSE block)?   #ifStat
    | WHILE LPAR expr RPAR block               #whileStat
    | OUT expr SEMI                            #outStat
    | RETURN expr?  SEMI                       #returnStat
    | expr SEMI                                #exprStat
    | block                                    #blockStat
    ;



params:
    type ID (COMMA type ID)*
    ;

dimension:
    LBRACK NUM RBRACK
    ;

exprDimension:
    LBRACK expr RBRACK
    ;


/** Expression. */
expr: NOT expr                  #notExpr
    | SUB expr                  #negExpr
    | expr mulOp expr           #mulExpr
    | expr addOp expr           #addExpr
    | expr booleanOp expr       #boolExpr
    | expr compOp expr          #compExpr
    | expr EQUAL expr           #eqExpr
    | LPAR expr RPAR            #parExpr
    | ID exprDimension*         #idExpr
    | NUM                       #numExpr
    | LBRACK expr+ RBRACK       #arrayExpr
    | ID LPAR paramMap* RPAR    #funcExpr
    | TRUE                      #trueExpr
    | FALSE                     #falseExpr
    ;



paramMap:
    ID COLON expr
    ;

addOp:
    ADD|SUB
    ;

mulOp:
    MUL
    ;

booleanOp:   AND | OR ;
compOp:  NEQ | GT | GTE | LT | LTE ;
/** Data type. */
type: INTEGER
    | BOOLEAN
    | dimension type
    ;

BOOLEAN: 'boolean';
INTEGER: 'int' ;
ELSE:    'else' ;
FALSE:   'false';
IF:     'if';
THEN:    'then' ;
WHILE:   'while' ;
TRUE:    'true' ;


ASS:    '=';


//Built in binary operators
MUL: '*';
ADD: '+';
SUB: '-';
EQUAL: '==';
NEQ: '!=';
GT: '>';
GTE: '>=';
LT: '<';
LTE: '<=';
AND: '&';
OR: '|';



//Prefix operator
NOT: '!';

//Used to print to console
OUT: 'out';

THREAD: 'thread';
GLOBAL: 'global';


LBRACE: '{';
LPAR:   '(';
LBRACK:  '[';
RBRACE: '}';
RPAR:   ')';
RBRACK:  ']';
SEMI:   ';';
COLON: ':';
COMMA :',';


LOCK: 'lock';
UNLOCK: 'unlock';
RETURN: 'return';


ID: LETTER (LETTER | DIGIT)*;
NUM: DIGIT (DIGIT)*;


fragment LETTER: [a-zA-Z];
fragment DIGIT: [0-9];

COMMENT:   '//' ~[\r\n]* -> skip;
WS: [ \t\r\n]+ -> skip;


