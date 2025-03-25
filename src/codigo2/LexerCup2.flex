package codigo;
import java_cup.runtime.Symbol;
%%
%class LexerCup2
%type java_cup.runtime.Symbol
%cup
%full
%line
%char
L=[a-zA-Z_]+
D=[0-9]+
espacio=[ ,\t,\r,\n]+
%{
    private Symbol symEbol(int type, Object value){
        return new Symbol(type, yyline, yycolumn, value);
    }
    private Symbol symEbol(int type){
        return new Symbol(type, yyline, yycolumn);
    }
%}
%%

/* Espacios en blanco */
{espacio} {/*Ignore*/}

/* Comentarios */
( "//"(.)* ) {/*Ignore*/}

/* Comillas */
( "\"" ) {return new Symbol(symE.Comillas, yychar, yyline, yytext());}

/* Tipos de datos */
( byte | char | long | float | double ) {return new Symbol(symE.T_dato, yychar, yyline, yytext());}

/* Tipo de dato Int (Para el main) */
( "entero" ) {return new Symbol(symE.Entero, yychar, yyline, yytext());}

/* Tipo de dato String */
( String ) {return new Symbol(symE.Cadena, yychar, yyline, yytext());}

/* Palabra reservada If */
( Si ) {return new Symbol(symE.Si, yychar, yyline, yytext());}

/* Palabra reservada Else */
( Sino ) {return new Symbol(symE.Sino, yychar, yyline, yytext());}

/* Palabra reservada Do */
( Hacer ) {return new Symbol(symE.Hacer, yychar, yyline, yytext());}

/* Palabra reservada While */
( Mientras ) {return new Symbol(symE.Mientras, yychar, yyline, yytext());}

/* Palabra reservada For */
( Para ) {return new Symbol(symE.Para, yychar, yyline, yytext());}

/* Operador Igual */
( "=" ) {return new Symbol(symE.Igual, yychar, yyline, yytext());}

/* Operador Suma */
( "+" ) {return new Symbol(symE.Suma, yychar, yyline, yytext());}

/* Operador Resta */
( "-" ) {return new Symbol(symE.Resta, yychar, yyline, yytext());}

/* Operador Multiplicacion */
( "*" ) {return new Symbol(symE.Multiplicacion, yychar, yyline, yytext());}

/* Operador Division */
( "/" ) {return new Symbol(symE.Division, yychar, yyline, yytext());}

/* Operadores logicos */
( "&&" | "||" | "!" | "&" | "|" ) {return new Symbol(symE.Op_logico, yychar, yyline, yytext());}

/*Operadores Relacionales */
( ">" | "<" | "==" | "!=" | ">=" | "<=" | "<<" | ">>" ) {return new Symbol(symE.Op_relacional, yychar, yyline, yytext());}

/* Operadores Atribucion */
( "+=" | "-="  | "*=" | "/=" | "%=" | "=" ) {return new Symbol(symE.Op_atribucion, yychar, yyline, yytext());}

/* Operadores Incremento y decremento */
( "++" | "--" ) {return new Symbol(symE.Op_incremento, yychar, yyline, yytext());}

/*Operadores Booleanos*/
( true | false ) {return new Symbol(symE.Op_booleano, yychar, yyline, yytext());}

/* Parentesis de apertura */
( "(" ) {return new Symbol(symE.Parentesis_a, yychar, yyline, yytext());}

/* Parentesis de cierre */
( ")" ) {return new Symbol(symE.Parentesis_c, yychar, yyline, yytext());}

/* Llave de apertura */
( "{" ) {return new Symbol(symE.Llave_a, yychar, yyline, yytext());}

/* Llave de cierre */
( "}" ) {return new Symbol(symE.Llave_c, yychar, yyline, yytext());}

/* Corchete de apertura */
( "[" ) {return new Symbol(symE.Corchete_a, yychar, yyline, yytext());}

/* Corchete de cierre */
( "]" ) {return new Symbol(symE.Corchete_c, yychar, yyline, yytext());}

/* Marcador de inicio de algoritmo */
( "principal" ) {return new Symbol(symE.Principal, yychar, yyline, yytext());}

/* Punto y coma */
( ";" ) {return new Symbol(symE.P_coma, yychar, yyline, yytext());}

/* Identificador */
{L}({L}|{D})* {return new Symbol(symE.Identificador, yychar, yyline, yytext());}

/* Numero */
("(-"{D}+")")|{D}+ {return new Symbol(symE.Numero, yychar, yyline, yytext());}

/* Error de analisis */
 . {return new Symbol(symE.ERROR, yychar, yyline, yytext());}

