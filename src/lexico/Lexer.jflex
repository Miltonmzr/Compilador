/* JFlex example: partial Java language lexer specification */
package lexico;

import java_cup.runtime.*;
import sintactico.sym;

/**
 * This class is a simple example lexer.
*/

%%
%public
%class LexerCSharp
%unicode
%cup
%full
%line
%column
%char
%ignorecase
%type java_cup.runtime.Symbol

%{
    StringBuffer string = new StringBuffer();

    private Symbol symbol(int type) {
        return new Symbol(type, yyline, yycolumn);
    }
      
    private Symbol symbol(int type, Object value) {
        return new Symbol(type, yyline, yycolumn, value);
    }
%}
    
    LineTerminator = \r|\n|\r\n
    InputCharacter = [^\r\n]
    /* comments */
    Comment = {TraditionalComment} | {EndOfLineComment} | {DocumentationComment}
    TraditionalComment   = "/*" [^*] ~"*/" | "/*" "*"+ "/"
    // Comment can be the last line of the file, without line terminator.
    EndOfLineComment     = "//" {InputCharacter}* {LineTerminator}?
    DocumentationComment = "/**" {CommentContent} "*"+ "/"
    CommentContent       = ( [^*] | \*+ [^/*] )*
    WhiteSpace = [\n\r\t ] 
    ImportRule = [A-Z][a-z]*
    SimpleImport = {ImportRule}(;)
    Imports = "using " ({ImportRule}(.))*{SimpleImport}

    Identifier = [:jletter:] [:jletterdigit:]*

    DecIntegerLiteral = 0 | [1-9][0-9]*

%state STRING
%%

/* keywords */
    ( "if" )                                                          { System.out.println(yytext()); return symbol(sym.IF,yytext()); }
    ( "else" )                                                        { System.out.println(yytext()); return symbol(sym.ELSE,yytext()); }
    ( "do" )                                                          { System.out.println(yytext()); return symbol(sym.DO,yytext()); }
    ( "while" )                                                       { System.out.println(yytext()); return symbol(sym.WHILE,yytext()); }
    ( "for" )                                                         { System.out.println(yytext()); return symbol(sym.FOR,yytext()); }
    ( "true" | "false" )                                                { System.out.println(yytext()); return symbol(sym.OPERADOR_BOOLEANO,yytext()); } 
    ( "byte" | "int" | "char" | "long" | "float" | "double" | "decimal" | "short" ) { System.out.println(yytext()); return symbol(sym.TIPO_DATO,yytext()); }
    ( "String" )                                             { System.out.println(yytext()); return symbol(sym.CADENA,yytext()); }
    ( "Main" )                                                      { System.out.println(yytext()); return symbol(sym.MAIN,yytext()); }
    ( "Abstract" )                                                  { System.out.println(yytext()); return symbol(sym.ABSTRACT,yytext()); }
    ( "break" )                                                     { System.out.println(yytext()); return symbol(sym.BREAK,yytext()); }
    ( "case" )                                                      { System.out.println(yytext()); return symbol(sym.CASE,yytext()); }
    ( "catch" )                                                     { System.out.println(yytext()); return symbol(sym.CATCH,yytext()); }
    ( "class" )                                                     { System.out.println(yytext()); return symbol(sym.CLASS,yytext()); }
    ( "CONST" )                                                     { System.out.println(yytext()); return symbol(sym.CONST,yytext()); }
    ( "default" )                                                   { System.out.println(yytext()); return symbol(sym.DEFAULT,yytext()); }
    ( "finally" )                                                   { System.out.println(yytext()); return symbol(sym.FINALLY,yytext()); }
    ( "goto" )                                                      { System.out.println(yytext()); return symbol(sym.GOTO,yytext()); }
    ( "interface" )                                                 { System.out.println(yytext()); return symbol(sym.INTERFACE,yytext()); }
    ( "namespace" )                                                 { System.out.println(yytext()); return symbol(sym.NAMESPACE,yytext()); }
    ( "null" )                                                      { System.out.println(yytext()); return symbol(sym.NULL,yytext()); }
    ( "out" )                                                       { System.out.println(yytext()); return symbol(sym.OUT,yytext()); }
    ( "return" )                                                    { System.out.println(yytext()); return symbol(sym.RETURN,yytext()); }
    ( "static" )                                                    { System.out.println(yytext()); return symbol(sym.STATIC,yytext()); }
    ( "switch" )                                                    { System.out.println(yytext()); return symbol(sym.SWITCH,yytext()); }
    ( "throw" )                                                     { System.out.println(yytext()); return symbol(sym.THROW,yytext()); }
    ( "try" )                                                       { System.out.println(yytext()); return symbol(sym.TRY,yytext()); }
    ( "void" )                                                      { System.out.println(yytext()); return symbol(sym.VOID,yytext()); }
    ( "System" )                                                    { System.out.println(yytext()); return symbol(sym.SYSTEM,yytext()); }
    ( "WriteLine" )                                                 { System.out.println(yytext()); return symbol(sym.WRITELINE,yytext()); }
    ( "Console" )                                                   { System.out.println(yytext()); return symbol(sym.CONSOLE,yytext()); }
    ( "Write" )                                                     { System.out.println(yytext()); return symbol(sym.WRITE,yytext()); }
   
      /* operators */
      ( "=" )                                           { System.out.println(yytext()); return symbol(sym.IGUAL,yytext()); }
      ( "[" )                                        { System.out.println(yytext()); return symbol(sym.CORCHETE_APERTURA,yytext()); }
      ( "]" )                                           { System.out.println(yytext()); return symbol(sym.CORCHETE_CIERRE,yytext()); }
      ( ";" )                                        { System.out.println(yytext()); return symbol(sym.PUNTO_COMA,yytext()); }
      ( "+" )                                           { System.out.println(yytext()); return symbol(sym.SUMA,yytext()); }
      ( "-" )                                          { System.out.println(yytext()); return symbol(sym.RESTA,yytext()); }
      ( "*" )                                           { System.out.println(yytext()); return symbol(sym.MULTIPLICACION,yytext()); }
      ( "/" )                                           { System.out.println(yytext()); return symbol(sym.DIVISION,yytext()); }
      ( "&&" | "||" | "!" | "&" | "|" )                 { System.out.println(yytext()); return symbol(sym.OPERADOR_LOGICO,yytext()); }
      ( ">" | "<" | "==" | "!=" | ">=" | "<=" )         { System.out.println(yytext()); return symbol(sym.OPERADOR_RELACIONAL,yytext()); }
      ( "+=" | "-="  | "*=" | "/=" | "%=" | "=" | ":" ) { System.out.println(yytext()); return symbol(sym.OPERADOR_ATRIBUCION,yytext()); }
      ( "++" | "--" )                                   { System.out.println(yytext()); return symbol(sym.OPERADOR_INCREMENTO,yytext()); }
      ( "{" )                                           { System.out.println(yytext()); return symbol(sym.LLAVE_APERTURA,yytext()); }
      ( "}" )                                           { System.out.println(yytext()); return symbol(sym.LLAVE_CIERRE,yytext()); }
      ( "." | "," )                                     { System.out.println(yytext()); return symbol(sym.OPERADOR_CONTEXTUAL,yytext()); }
      ( "(" )                                           { System.out.println(yytext()); return symbol(sym.PARENTESIS_APERTURA,yytext()); }
      ( ")" )                                           { System.out.println(yytext()); return symbol(sym.PARENTESIS_CIERRE,yytext()); }
      ( "[" )                                           { System.out.println(yytext()); return symbol(sym.CORCHETE_APERTURA,yytext()); }
      ( "]" )                                           { System.out.println(yytext()); return symbol(sym.CORCHETE_CIERRE,yytext()); }                         
     ( "\"" | "'" )                                    { System.out.println(yytext()); return symbol(sym.COMILLAS,yytext()); }
   

      /* Comments */
    {Comment}               { System.out.println(yytext()); }

    /* WhiteSpace */ 
    {WhiteSpace}            { }

    /* Imports */ 
    {Imports}            { System.out.println(yytext()); }
    
     /* Identificador */
    {Identifier}    { System.out.println(yytext()); return symbol(sym.IDENTIFICADOR,yytext()); }

    /* Numeros */
    {DecIntegerLiteral}    { return symbol(sym.NUMERO,yytext()); }
    

   <STRING> {
      \"                             { yybegin(YYINITIAL); 
                                       return symbol(StrictmodeReservedwords.STRING_LITERAL, 
                                       string.toString()); }
      [^\n\r\"\\]+                   { string.append( yytext() ); }
      \\t                            { string.append('\t'); }
      \\n                            { string.append('\n'); }

      \\r                            { string.append('\r'); }
      \\\"                           { string.append('\"'); }
      \\                             { string.append('\\'); }
    }

    /* error fallback */
    [^]                              { throw new Error("Illegal character **"+
                                                        yytext()+"**"); }