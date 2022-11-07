package lexico;

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
 * @author Milton
 */
public class AnalisisLexico {

    private static final Logger log = Logger.getLogger(AnalisisLexico.class.getName());

    private static File file;
    private static BufferedReader bf;
    private static Lexer lexer;

    public static void main(String[] args) {
        file = new File("src/lexico/codigo.txt");
        analyze(file);
    }

    public static String analyze(File file) {
        String result = "";
        
        try {
            bf = new BufferedReader(new FileReader(file));
            lexer = new Lexer(bf);
            result = lecture(lexer);
        } catch (FileNotFoundException ex) {
            log.severe(ex.getMessage());
        }
        
        return result;
    }

    private static String lecture(Lexer lexer) {
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
                        compose += "\n" + printIdentificadorClase();
                        break;
                    case 2:
                        compose += "\n" + printOperadorComparacion();
                        break;
                    case 3:
                        compose += "\n" + printOperadorConversion();
                        break;
                    case 4:
                        compose += "\n" + printTipoDato();
                        break;
                    case 5:
                        compose += "\n" + printOperadorFlujo();
                        break;
                    case 6:
                        compose += "\n" + printTipoDato();
                        break;
                    case 7:
                        compose += "\n" + printOperadorComparacion();
                        break;
                    case 8:
                        compose += "\n" + printOperadorError();
                        break;
                    case 9:
                        compose += "\n" + printTipoDato();
                        break;
                    case 10:
                        compose += "\n" + printOperadorConfirmacion();
                        break;
                    case 11:
                        compose += "\n" + printTipoArchivo();
                        break;
                    case 12:
                        compose += "\n" + printIdentificadorDato();
                        break;
                    case 13:
                        compose += "\n" + printOperadorFlujo();
                        break;
                    case 14:
                        compose += "\n" + printTipoDato();
                        break;
                    case 15:
                        compose += "\n" + printOperadorFlujo();
                        break;
                    case 16:
                        compose += "\n" + printOperadorFlujo();
                        break;
                    case 17:
                        compose += "\n" + printOperadorFlujoDatos();
                        break;
                    case 18:
                        compose += "\n" + printTipoDato();
                        break;
                    case 19:
                        compose += "\n" + printOperadorFlujo();
                        break;
                    case 20:
                        compose += "\n" + printTipoArchivo();
                        break;
                    case 21:
                        compose += "\n" + printOperadorFlujo();
                        break;
                    case 22:
                        compose += "\n" + printIdentificadorDato();
                        break;
                    case 23:
                        compose += "\n" + printIdentificadorDato();
                        break;
                    case 24:
                        compose += "\n" + printStaticValue();
                        break;
                    case 25:
                        compose += "\n" + printIdentificadorDato();
                        break;
                    case 26:
                        compose += "\n" + printTipoDato();
                        break;
                    case 27:
                        compose += "\n" + printOperadorFlujoDatos();
                        break;
                    case 28:
                        compose += "\n" + printOperadorFlujoDatos();
                        break;
                    case 29:
                        compose += "\n" + printOperadorFlujo();
                        break;
                    case 30:
                        compose += "\n" + printOperadorFlujoDatos();
                        break;
                    case 31:
                        compose += "\n" + printIdentificadorClase();
                        break;
                    case 32:
                        compose += "\n" + printOperadorComparacion();
                        break;
                    case 33:
                        compose += "\n" + printTipoDato();
                        break;
                    case 34:
                        compose += "\n" + printTipoArchivo();
                        break;
                    case 35:
                        compose += "\n" + printIdentificadorDato();
                        break;
                    case 36:
                        compose += "\n" + printOperadorComparacion();
                        break;
                    case 37:
                        compose += "\n" + printIdentificadorClase();
                        break;
                    case 38:
                        compose += "\n" + printTipoDato();
                        break;
                    case 39:
                        compose += "\n" + printIdentificadorClase();
                        break;
                    case 40:
                        compose += "\n" + printIdentificadorDato();
                        break;
                    case 41:
                        compose += "\n" + printStaticValue();
                        break;
                    case 42:
                        compose += "\n" + printTipoDato();
                        break;
                    case 43:
                        compose += "\n" + printTipoDato();
                        break;
                    case 44:
                        compose += "\n" + printOperadorFlujoDatos();
                        break;
                    case 45:
                        compose += "\n" + printEtiquetaFuncion();
                        break;
                    case 46:
                        compose += "\n" + printTipoDato();
                        break;
                    case 47:
                        compose += "\n" + printIdentificadorGlobal();
                        break;
                    case 48:
                        compose += "\n" + printIdentificadorGlobal();
                        break;
                    case 49:
                        compose += "\n" + printIdentificadorGlobal();
                        break;
                    case 50:
                        compose += "\n" + printIdentificadorDato();
                        break;
                    case 51:
                        compose += "\n" + printIdentificadorDato();
                        break;
                    case 52:
                        compose += "\n" + printOperadorFinalizacion();
                        break;
                    case 53:
                        compose += "\n" + printTipoDato();
                        break;
                    case 54:
                        compose += "\n" + printIdentificadorClase();
                        break;
                    case 55:
                        compose += "\n" + printIdentificadorDato();
                        break;
                    case 56:
                        compose +="\n" + printTipoDato();
                        break;
                    case 57:
                        compose += "\n" + printOperadorFlujo();
                        break;
                    case 58:
                        compose += "\n" + printIdentificadorGlobal();
                        break;
                    case 59:
                        compose += "\n" + printTipoDato();
                        break;
                    case 60:
                        compose += "\n" + printTipoDato();
                        break;
                    case 61:
                        compose += "\n" + printOperadorFlujoDatos();
                        break;
                    case 62:
                        compose += "\n" + printIdentificadorDato();
                        break;
                    case 63:
                        compose += "\n" + printOperadorError();
                        break;
                    case 64:
                        compose += "\n" + printStaticValue();
                        break;
                    case 65:
                        compose += "\n" + printOperadorError();
                        break;
                    case 66:
                        compose += "\n" + printStaticValue();
                        break;
                    case 67:
                        compose += "\n" + printTipoDato();
                        break;
                    case 68:
                        compose += "\n" + printTipoDato();
                        break;
                    case 69:
                        compose += "\n" + printIdentificadorDato();
                        break;
                    case 70:
                        compose += "\n" + printIdentificadorDato();
                        break;
                    case 71:
                        compose += "\n" + printTipoDato();
                        break;
                    case 72:
                        compose += "\n" + printIdentificadorDato();
                        break;
                    case 73:
                        compose += "\n" + printIdentificadorClase();
                        break;
                    case 74:
                        compose += "\n" + printIdentificadorDato();
                        break;
                    case 75:
                        compose += "\n" + printOperadorFlujoDatos();
                        break;
                    case 76:
                        compose += "\n" + printTipoDato();
                        break;
                    case 77:
                        compose += "\n" + printTipoDato();
                        break;
                    case 78:
                        compose += "\n" + printIdentificadorDato();
                        break;
                    case 79:
                        compose += "\n" + printOperadorComparacion();
                        break;
                    case 80:
                        compose += "\n" + printOperadorOperacion();
                        break;
                    case 81:
                        compose += "\n" + printOperadorComparacion();
                        break;
                    case 82:
                        compose +="\n" + printOperadorAritmetico();
                        break;
                    case 83:
                        compose += "\n" + printOperadorAritmetico();
                        break;
                    case 84:
                        compose += "\n" + printOperadorAritmetico();
                        break;
                    case 85:
                        compose += "\n" + printOperadorComparacion();
                        break;
                    case 86:
                        compose += "\n" + printOperadorComparacion();
                        break;
                    case 87:
                        compose += "\n" + printOperadorComparacion();
                        break;
                    case 88:
                        compose += "\n" + printOperadorFinalizacion();
                        break;
                    case 89:
                        compose += "\n" + printOperadorFinalizacion();
                        break;
                    case 90:
                        compose += "\n" + printOperadorFinalizacion();
                        break;
                    case 91:
                        compose += "\n" + printOperadorFinalizacion();
                        break;
                    case 92:
                        compose += "\n" + printOperadorFlujo();
                        break;
                    case 93:
                        compose += "\n" + printOperadorFlujo();
                        break;
                    case 94:
                        compose += "\n" + printStaticValue();
                        break;
                    case 95:
                        compose += "\n" + printStaticValue();
                        break;
                    case 96:
                        compose += "\n" + printStaticValue();
                        break;
                    case 97:
                        compose += "\n" + printOperadorFlujoDatos();
                        break;
                    case 98:
                        compose += "\n" + printOperadorFlujoDatos();
                        break;
                    case 99:
                        compose += "\n" + printOperadorFlujoDatos();
                        break;
                    case 100:
                        compose += "\n" + printOperadorComparacion();
                        break;
                    case 101:
                        compose += "\n" + printOperadorComparacion();
                        break;
                    case 102:
                        compose += "\n" + printOperadorComparacion();
                        break;
                    case 103:
                        compose += "\n" + printOperadorComparacion();
                        break;
                    case 104:
                        compose += "\n" + printStaticValue();
                        break;
                    case 105:
                        compose += "\n" + printIdentificadorClase();
                        break;
                    case 106:
                        compose += "\n" + printOperadorFinalizacion();
                        break;
                    case 107:
                        compose += "\n" + printOperadorFinalizacion();
                        break;
                    case 108:
                        compose += "\n" + printOperadorFinalizacion();
                        break;
                    case 109:
                        compose += "\n" + printOperadorFinalizacion();
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

    private static String printIdentificadorClase() {
        final String OPE_CLASS = "Identificador de clase!";
        System.out.println(OPE_CLASS);
        return OPE_CLASS + "\n\n";
    }

    private static String printOperadorComparacion() {
        final String OPE_COMP = "Operador de comparacion!";
        System.out.println(OPE_COMP);
        return OPE_COMP + "\n";
    }

    private static String printOperadorConversion() {
        final String OPE_CONV = "Operador de conversion!";
        System.out.println(OPE_CONV);
        return OPE_CONV + "\n";
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

    private static String printOperadorFlujo() {
        final String OPE_STREAM = "Operador de flujo!";
        System.out.println(OPE_STREAM);
        return OPE_STREAM + "\n";
    }

    private static String printOperadorError() {
        final String OPE_ERR = "Operador de error!";
        System.out.println(OPE_ERR);
        return OPE_ERR + "\n";
    }

    private static String printOperadorConfirmacion() {
        final String OPE_CONF = "Operador de confirmacion!";
        System.out.println(OPE_CONF);
        return OPE_CONF + "\n";
    }

    private static String printIdentificadorDato() {
        final String IDEN_DATA = "Identifiador de dato!";
        System.out.println(IDEN_DATA);
        return IDEN_DATA + "\n";
    }
    
    private static String printIdentificadorGlobal() {
        final String IDEN_GLOBAL = "Identificador global!";
        System.out.println(IDEN_GLOBAL);
        return IDEN_GLOBAL + "\n";
    }

    private static String printOperadorFlujoDatos() {
        final String STREAM_DATA = "Operador de flujo de datos";
        System.out.println(STREAM_DATA);
        return STREAM_DATA + "\n";
    }

    private static String printStaticValue() {
        final String STATIC_VAL = "Valor constante de variable!";
        System.out.println(STATIC_VAL);
        return STATIC_VAL + "\n";
    }

    private static String printTipoArchivo() {
        final String TYP_FIL = "Tipo de archivo!";
        System.out.println(TYP_FIL);
        return TYP_FIL + "\n";
    }

    private static String printEtiquetaFuncion() {
        final String LAB_FUNC = "Etiqueta de funcion!";
        System.out.println(LAB_FUNC);
        return LAB_FUNC + "\n";
    }

    private static String printOperadorOperacion() {
        final String OP_OPER = "Operador de operacion!";
        System.out.println(OP_OPER);
        return OP_OPER + "\n";
    }

    private static String printOperadorAritmetico() {
        final String OP_ARIT = "Operador aritmetico!";
        System.out.println(OP_ARIT);
        return OP_ARIT + "\n";
    }
}
