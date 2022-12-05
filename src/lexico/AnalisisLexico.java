package lexico;

import lexico.LexerCSharp;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java_cup.runtime.Symbol;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author Braya
 */
public class AnalisisLexico {

    private static final Logger log = Logger.getLogger(AnalisisLexico.class.getName());
    
    private static File file;
    private static BufferedReader bf;
    private static LexerCSharp lexer;

    public static void main(String[] args) {
        file = new File("src/archivos/codigo.txt");
        analyze(file);
    }

    public static String analyze(File file) {
        String result = "";
        
        
        try {
            bf = new BufferedReader(new FileReader(file));
            lexer = new LexerCSharp(bf);
            result = lecture(lexer);
        } catch (FileNotFoundException ex) {
            log.severe(ex.getMessage()); 
        }
        
        return result;
    }

    private static String lecture(LexerCSharp lexer) {
        String compose = "";
        
        loop: while (true) {
            Symbol token;
            try {
                token = lexer.next_token();
                compose += "texto: " + token.toString()
                        + " valor: " + token.value + "\n";
                System.out.println("texto: " + token.toString()
                        + " valor: " + token.value + " estado: " + token.parse_state);
                switch (token.sym) {
                    case 1:
                        compose += "\n" + printFormatoCadena();
                        break;
                    case 2:
                        compose += "\n" + printFormatoCadena();
                        break;
                    case 3:
                        compose += "\n" + printTipoDato();
                        break;
                    case 4:
                        compose += "\n" + printTipoDato();
                        break;
                    case 5:
                        compose += "\n" + printOperacionComparacion();
                        break;
                    case 6:
                        compose += "\n" + printOperacionComparacion();
                        break;
                    case 7:
                        compose += "\n" + printOperadorFlujoDatos();
                        break;
                    case 8:
                        compose += "\n" + printOperadorFlujoDatos();
                        break;
                    case 9:
                        compose += "\n" + printOperadorFlujoDatos();
                        break;
                    case 10:
                        compose += "\n" + printOperadorAritmetico();
                        break;
                    case 11:
                        compose += "\n" + printOperadorAritmetico();
                        break;
                    case 12:
                        compose += "\n" + printOperadorAritmetico();
                        break;
                    case 13:
                        compose += "\n" + printOperadorAritmetico();
                        break;
                    case 14:
                        compose += "\n" + printOperadorAritmetico();
                        break;
                    case 15:
                        compose += "\n" + printOperadorLogico();
                        break;
                    case 16:
                        compose += "\n" + printOperadorRelacional();
                        break;
                    case 17:
                        compose += "\n" + printOperadorAtribucion();
                        break;
                    case 18:
                        compose += "\n" + printOperadorIncremental();
                        break;
                    case 19:
                        compose += "\n" + printOperadorBooleano();
                        break;
                    case 20:
                        compose += "\n" + printOperadorFlujo();
                        break;
                    case 21:
                        compose += "\n" + printOperadorFlujo();
                        break;
                    case 22:
                        compose += "\n" + printOperadorFlujo();
                        break;
                    case 23:
                        compose += "\n" + printOperadorFlujo();
                        break;
                    case 24:
                        compose += "\n" + printOperadorFlujo();
                        break;
                    case 25:
                        compose += "\n" + printOperadorFlujo();
                        break;
                    case 26:
                        compose += "\n" + printStaticValue();
                        break;
                    case 27:
                        compose += "\n" + printOperadorFlujo();
                        break;
                    case 28:
                        compose += "\n" + printIdentificadorDato();
                        break;
                    case 29:
                        compose += "\n" + printOperadorFlujo();
                        break;
                    case 30:
                        compose += "\n" + printOperadorFlujoDatos();
                        break;
                    case 31:
                        compose += "\n" + printTipoDato();
                        break;
                    case 32:
                        compose += "\n" + printOperadorError();
                        break;
                    case 33:
                        compose += "\n" + printIdentificadorDato();
                        break;
                    case 34:
                        compose += "\n" + printOperadorFlujoDatos();
                        break;
                    case 35:
                        compose += "\n" + printOperadorFlujoDatos();
                        break;
                    case 36:
                        compose += "\n" + printOperadorError();
                        break;
                    case 37:
                        compose += "\n" + printStaticValue();
                        break;
                    case 38:
                        compose += "\n" + printStaticValue();
                        break;
                    case 39:
                        compose += "\n" + printOperadorFlujoDatos();
                        break;
                    case 40:
                        compose += "\n" + printOperadorFlujoDatos();
                        break;
                    case 41:
                        compose += "\n" + printIdentificadorDato();
                        break;
                    case 42:
                        compose += "\n" + printStaticValue();
                        break;
                    case 43:
                        compose += "\n" + printStaticValue();
                        break;
                    case 44:
                        compose += "\n" + printStaticValue();
                        break;
                    case 45:
                        compose += "\n" + printOperadorFinalizacion();
                        break;
                    case 46:
                        compose += "\n" + printStaticValue();
                        break;
                    case 47:
                        compose += "\n" + printOperadorFlujoDatos();
                        break;
                    case 48:
                        compose += "\n" + printOperadorError();
                        break;
                    case 49:
                        compose += "\n" + printOperadorError();
                        break;
                    case 50:
                        compose += "\n" + printStaticValue();
                        break;
                    case 51:
                        compose += "\n" + printStaticValue();
                        break;
                    case 52:
                        compose += "\n" + printStaticValue();
                        break;
                    case 53:
                        compose += "\n" + printStaticValue();
                        break;
                    case 54:
                        compose += "\n" + printStaticValue();
                        break;
                    case 55:
                        compose += "\n" + printOperadorInterno();
                        break;
                    case 56:
                        compose +="\n" + printOperadorInterno();
                        break;
                    case 57:
                        compose += "\n" + printOperadorComentario();
                        break;
                    case 58:
                        compose += "\n" + printOperadorInterno();
                        break;
                    case 59:
                        compose += "\n" + printOperadorInterno();
                        break;
                    default:
                        break loop;
                }
            } catch (IOException ex) {
                Logger.getLogger(AnalisisLexico.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        return compose;
    }
    
    private static String printFormatoCadena() {
        final String OPE_CLASS = "Fomato de cadena!";
        System.out.println(OPE_CLASS);
        return OPE_CLASS + "\n\n";
    }
    
    private static String printOperacionComparacion() {
        final String OPE_COMP = "Operacion de comparacion!";
        System.out.println(OPE_COMP);
        return OPE_COMP + "\n";
    }

    private static String printTipoDato() {
        final String DATA_TYP = "Tipo de dato!";
        System.out.println(DATA_TYP);
        return DATA_TYP + "\n";
    }

    private static String printOperadorFinalizacion() {
        final String OPE_FIN = "Operador de finalizacion!";
        System.out.println(OPE_FIN);
        return OPE_FIN + "\n";
    }

    private static String printOperadorError() {
        final String OPE_ERR = "Operador de error!";
        System.out.println(OPE_ERR);
        return OPE_ERR + "\n";
    }

    private static String printIdentificadorDato() {
        final String IDEN_DATA = "Identificador de dato!";
        System.out.println(IDEN_DATA);
        return IDEN_DATA + "\n";
    }

    private static String printOperadorFlujoDatos() {
        final String STREAM_DATA = "Operador de flujo de datos";
        System.out.println(STREAM_DATA);
        return STREAM_DATA + "\n";
    }

    private static String printStaticValue() {
        final String STATIC_VAL = "Valor constante!";
        System.out.println(STATIC_VAL);
        return STATIC_VAL + "\n";
    }
    
    private static String printOperadorFlujo() {
        final String OP_FLOW = "Operador de flujo!";
        System.out.println(OP_FLOW);
        return OP_FLOW + "\n";
    }

    private static String printOperadorLogico() {
        final String OP_OPER = "Operador logico!";
        System.out.println(OP_OPER);
        return OP_OPER + "\n";
    }
    
    private static String printOperadorRelacional() {
        final String OP_REL = "Operador relacional!";
        System.out.println(OP_REL);
        return OP_REL + "\n";
    }
    
    private static String printOperadorAtribucion() {
        final String OP_ATRR = "Operador atribucion!";
        System.out.println(OP_ATRR);
        return OP_ATRR + "\n";
    }
    
    private static String printOperadorIncremental() {
        final String OP_INC = "Operador incrementeal!";
        System.out.println(OP_INC);
        return OP_INC + "\n";
    }
    
    private static String printOperadorBooleano() {
        final String OP_BOOL = "Operador booleano!";
        System.out.println(OP_BOOL);
        return OP_BOOL + "\n";
    }

    private static String printOperadorAritmetico() {
        final String OP_ARIT = "Operador aritmetico!";
        System.out.println(OP_ARIT);
        return OP_ARIT + "\n";
    }
    
    private static String printOperadorInterno() {
        final String OP_ARIT = "Identificador contextual!";
        System.out.println(OP_ARIT);
        return OP_ARIT + "\n";
    }
    
    private static String printOperadorComentario() {
        final String OP_ARIT = "Componente de comentario!";
        System.out.println(OP_ARIT);
        return OP_ARIT + "\n";
    }
}
