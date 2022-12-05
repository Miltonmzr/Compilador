/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sintactico;

import lexico.LexerCSharp;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

/**
 *
 * @author Braya
 */
public class AnalizadorSintactico {
    public static void main(String[] args) throws IOException {
        FileInputStream file = new FileInputStream("src/archivos/codigo.txt");
        Reader lector = new BufferedReader(new InputStreamReader(file));
        ParserCSharp s = new ParserCSharp(new LexerCSharp(lector));
        
        try {
            System.out.println(s.parse());
            System.out.println("Analisis realizado correctamente");
        } catch (Exception ex) {
            int sym = s.error_sym();
            System.out.println("Error de sintaxis. Linea: " + sym);
        }
    }
}

