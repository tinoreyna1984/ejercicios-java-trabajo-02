package com.tino.ejercicios.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Dada una cadena de texto, busca todas las ocurrencias
 * de una palabra clave específica y muestra sus ubicaciones en el texto.
 */
public class Ejercicio04 {
    public static void main(String[] args) {
        String texto = "Dada una cadena de texto, busca todas las ocurrencias" +
                "de una palabra clave específica y muestra sus ubicaciones en el texto.";
        String[] palabras = texto.replaceAll("\\p{Punct}", "").split(" ");
        for (int i = 0; i < palabras.length; i++) {
            Pattern patron = Pattern.compile(palabras[i], Pattern.CASE_INSENSITIVE);
            Matcher coincide = patron.matcher(texto);
            /*int count = 0;
            while(coincide.find()) count++;
            System.out.println(palabras[i] + ": " + count + " ubicaciones");*/
            int start = -1;
            while(coincide.find()){
                System.out.println("Palabra \""+ palabras[i] + "\" encontrada en la posicion " + coincide.start());
            }
        }
    }
}
