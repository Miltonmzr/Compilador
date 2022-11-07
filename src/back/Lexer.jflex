/* JFlex example: partial Java language lexer specification */
package analyzer;

import JFlex.sym;
import java_cup.runtime.*;

/**
 * This class is a simple example lexer.
*/

%%
%public
%class Lexer
%unicode
%cup
%line
%column


%{
    StringBuffer string = new StringBuffer();

    private Symbol symbol(int type) {
        return new Symbol(type, yyline, yycolumn);
    }
      
    private Symbol symbol(int type, Object value) {
        return new Symbol(type, yyline, yycolumn, value);
    }
%}

/* comments */
    Comment = {TraditionalComment} | {EndOfLineComment} | {DocumentationComment}
    TraditionalComment   = "/" [^] ~"/" | "/" "*"+ "/"

// Comment can be the last line of the file, without line terminator.
    EndOfLineComment     = "//"
    DocumentationComment = "/*" {CommentContent} ""+ "/"
    CommentContent       = ( [^] | \+ [^/] )
    WhiteSpace           = [\n\r\t ]
    

Identifier = [:jletter:] [:jletterdigit:]*

DecIntegerLiteral = 0 | [1-9][0-9]*

%state STRING
%%

/* keywords */
    <YYINITIAL> "abstract"           { return symbol(ReservedWords.ABSTRACT.value,yytext()); }
    <YYINITIAL> "as"                 { return symbol(ReservedWords.AS.value,yytext()); }
    <YYINITIAL> "base"               { return symbol(ReservedWords.BASE.value,yytext()); }
    <YYINITIAL> "bool"               { return symbol(ReservedWords.BOOL.value,yytext()); }
    <YYINITIAL> "break"              { return symbol(ReservedWords.BREAK.value,yytext()); }
    <YYINITIAL> "byte"               { return symbol(ReservedWords.BYTE.value,yytext()); }
    <YYINITIAL> "case"               { return symbol(ReservedWords.CASE.value,yytext()); }
    <YYINITIAL> "catch"              { return symbol(ReservedWords.CATCH.value,yytext()); }
    <YYINITIAL> "char"               { return symbol(ReservedWords.CHAR.value,yytext()); }
    <YYINITIAL> "checked"            { return symbol(ReservedWords.CHECKED.value,yytext()); } 
    <YYINITIAL> "class"              { return symbol(ReservedWords.CLASS.value,yytext()); }     
    <YYINITIAL> "const"              { return symbol(ReservedWords.CONST.value,yytext()); }
    <YYINITIAL> "continue"           { return symbol(ReservedWords.CONTINUE.value,yytext()); }
    <YYINITIAL> "decimal"            { return symbol(ReservedWords.DECIMAL.value,yytext()); }
    <YYINITIAL> "default"            { return symbol(ReservedWords.DEFAULT.value,yytext()); }
    <YYINITIAL> "delegate"           { return symbol(ReservedWords.DELEGATE.value,yytext()); }
    <YYINITIAL> "do"                 { return symbol(ReservedWords.DO.value,yytext()); }
    <YYINITIAL> "double"             { return symbol(ReservedWords.DOUBLE.value,yytext()); }
    <YYINITIAL> "else"               { return symbol(ReservedWords.ELSE.value,yytext()); }
    <YYINITIAL> "enum"               { return symbol(ReservedWords.ENUM.value,yytext()); }
    <YYINITIAL> "event"              { return symbol(ReservedWords.EVENT.value,yytext()); }
    <YYINITIAL> "explicit"           { return symbol(ReservedWords.EXPLICIT.value,yytext()); }
    <YYINITIAL> "extern"             { return symbol(ReservedWords.EXTERN.value,yytext()); }
    <YYINITIAL> "false"              { return symbol(ReservedWords.FALSE.value,yytext()); }
    <YYINITIAL> "finally"            { return symbol(ReservedWords.FINALLY.value,yytext()); }
    <YYINITIAL> "fixed"              { return symbol(ReservedWords.FIXED.value,yytext()); }
    <YYINITIAL> "float"              { return symbol(ReservedWords.FLOAT.value,yytext()); }
    <YYINITIAL> "for"                { return symbol(ReservedWords.FOR.value,yytext()); }
    <YYINITIAL> "foreach"            { return symbol(ReservedWords.FOREACH.value,yytext()); }
    <YYINITIAL> "goto"               { return symbol(ReservedWords.GOTO.value,yytext()); }
    <YYINITIAL> "if"                 { return symbol(ReservedWords.IF.value,yytext()); }
    <YYINITIAL> "implicit"           { return symbol(ReservedWords.IMPLICIT.value,yytext()); } 
    <YYINITIAL> "in"                 { return symbol(ReservedWords.IN.value,yytext()); }
    <YYINITIAL> "int"                { return symbol(ReservedWords.INT.value,yytext()); }
    <YYINITIAL> "interface"          { return symbol(ReservedWords.INTERFACE.value,yytext()); }
    <YYINITIAL> "internal"           { return symbol(ReservedWords.INTERNAL.value,yytext()); }
    <YYINITIAL> "is"                 { return symbol(ReservedWords.IS.value,yytext()); }
    <YYINITIAL> "lock"               { return symbol(ReservedWords.LOCK.value,yytext()); }
    <YYINITIAL> "long"               { return symbol(ReservedWords.LONG.value,yytext()); }
    <YYINITIAL> "namespace"          { return symbol(ReservedWords.NAMESPACE.value,yytext()); }
    <YYINITIAL> "new"                { return symbol(ReservedWords.NEW.value,yytext()); }
    <YYINITIAL> "null"               { return symbol(ReservedWords.NULL.value,yytext()); }
    <YYINITIAL> "object"             { return symbol(ReservedWords.OBJECT.value,yytext()); }
    <YYINITIAL> "operator"           { return symbol(ReservedWords.OPERATOR.value,yytext()); }
    <YYINITIAL> "out"                { return symbol(ReservedWords.OUT.value,yytext()); }
    <YYINITIAL> "override"           { return symbol(ReservedWords.OVERRIDE.value,yytext()); }
    <YYINITIAL> "params"             { return symbol(ReservedWords.PARAMS.value,yytext()); }
    <YYINITIAL> "private"            { return symbol(ReservedWords.PRIVATE.value,yytext()); }
    <YYINITIAL> "protected"          { return symbol(ReservedWords.PROTECTED.value,yytext()); }
    <YYINITIAL> "public"             { return symbol(ReservedWords.PUBLIC.value,yytext()); }
    <YYINITIAL> "readonly"           { return symbol(ReservedWords.READONLY.value,yytext()); }
    <YYINITIAL> "ref"                { return symbol(ReservedWords.REF.value,yytext()); }
    <YYINITIAL> "return"             { return symbol(ReservedWords.RETURN.value,yytext()); }
    <YYINITIAL> "sbyte"              { return symbol(ReservedWords.SBYTE.value,yytext()); }
    <YYINITIAL> "sealed"             { return symbol(ReservedWords.SEALED.value,yytext()); }
    <YYINITIAL> "short"              { return symbol(ReservedWords.SHORT.value,yytext()); }
    <YYINITIAL> "sizeof"             { return symbol(ReservedWords.SIZEOF.value,yytext()); }
    <YYINITIAL> "stackalloc"         { return symbol(ReservedWords.STACKALLOC.value,yytext()); }
    <YYINITIAL> "static"             { return symbol(ReservedWords.STATIC.value,yytext()); }
    <YYINITIAL> "string"             { return symbol(ReservedWords.STRING.value,yytext()); }
    <YYINITIAL> "struct"             { return symbol(ReservedWords.STRUCT.value,yytext()); }
    <YYINITIAL> "switch"             { return symbol(ReservedWords.SWITCH.value,yytext()); }
    <YYINITIAL> "this"               { return symbol(ReservedWords.THIS.value,yytext()); }
    <YYINITIAL> "throw"              { return symbol(ReservedWords.THROW.value,yytext()); }
    <YYINITIAL> "true"               { return symbol(ReservedWords.TRUE.value,yytext()); }
    <YYINITIAL> "try"                { return symbol(ReservedWords.TRY.value,yytext()); }
    <YYINITIAL> "typeof"             { return symbol(ReservedWords.TYPEOF.value,yytext()); }
    <YYINITIAL> "uint"               { return symbol(ReservedWords.UINT.value,yytext()); }
    <YYINITIAL> "ulong"              { return symbol(ReservedWords.ULONG.value,yytext()); }
    <YYINITIAL> "unchecked"          { return symbol(ReservedWords.UNCHECKED.value,yytext()); }
    <YYINITIAL> "unsafe"             { return symbol(ReservedWords.UNSAFE.value,yytext()); }
    <YYINITIAL> "ushort"             { return symbol(ReservedWords.USHORT.value,yytext()); }
    <YYINITIAL> "using"              { return symbol(ReservedWords.USING.value,yytext()); }
    <YYINITIAL> "virtual"            { return symbol(ReservedWords.VIRTUAL.value,yytext()); }
    <YYINITIAL> "void"               { return symbol(ReservedWords.VOID.value,yytext()); }
    <YYINITIAL> "while"              { return symbol(ReservedWords.WHILE.value,yytext()); }
    <YYINITIAL> "WriteLine"          { return symbol(ReservedWords.WRITELINE.value,yytext()); }
    <YYINITIAL> "ReadLine"           { return symbol(ReservedWords.READLINE.value,yytext()); }
    <YYINITIAL> "Main"               { return symbol(ReservedWords.MAIN.value,yytext()); }
    <YYINITIAL> "args"               { return symbol(ReservedWords.ARGS.value,yytext()); }

    <YYINITIAL> {
      /* identifiers */ 
      {Identifier}                   { return symbol(Operators.IDENTIFIER.value,yytext()); }
     
      /* literals */
      {DecIntegerLiteral}            { return symbol(ReservedWords.INTEGER_LITERAL.value,yytext()); }
      \"                             { string.setLength(0); yybegin(STRING); }

      /* operators */
      "="                            { return symbol(Operators.EQ.value,yytext()); }
      "=="                           { return symbol(Operators.EQEQ.value,yytext()); }
      "+"                            { return symbol(Operators.PLUS.value,yytext()); }
      "-"                            { return symbol(Operators.SUBTRACTION.value,yytext()); }
      "*"                            { return symbol(Operators.MULTIPLICATION.value,yytext()); }
      "/"                            { return symbol(Operators.DIVISION.value,yytext()); }
      "||"                           { return symbol(Operators.OR.value,yytext()); }
      ":"                            { return symbol(Operators.TERN_OR.value,yytext()); }
      "{"                            { return symbol(Operators.OPEN_BRACKET.value,yytext()); }
      "}"                            { return symbol(Operators.CLOSE_BRACKET.value,yytext()); }
      "}"                            { return symbol(Operators.CLOSE_BRACKET.value,yytext()); }
      "."                            { return symbol(Operators.DOTE.value,yytext()); }
      "("                            { return symbol(Operators.OPEN_PARENTHESES.value,yytext()); }
      ")"                            { return symbol(Operators.CLOSE_PARENTHESES.value,yytext()); }
      "/";"/"                        { return symbol(Operators.SEMICOLON.value,yytext()); }
      ","                            { return symbol(Operators.COMMA.value,yytext()); }

      /* comments   */
      {Comment}                      { return symbol(Operators.COMMENT.value,yytext()); }
     
      /* whitespace */
      {WhiteSpace}                   { return symbol(Operators.WHITESPACE.value,yytext()); } 
    }

    <STRING> {
      \"                             { yybegin(YYINITIAL); 
                                       return symbol(ReservedWords.STRING_LITERAL.value, 
                                       string.toString()); }
      [^\n\r\"\\]+                   { string.append( yytext() ); }
      \\t                            { string.append('\t'); }
      \\n                            { string.append('\n'); }

      \\r                            { string.append('\r'); }
      \\\"                           { string.append('\"'); }
      \\                             { string.append('\\'); }
    }

    /* error fallback */
    [^]                              { throw new Error("Illegal character --**"+
                                                        yytext()+"**--"); }