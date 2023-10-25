package com.tino.ejercicios.cadenas;

/**
 * Escribe un programa que tome una cadena y la divida
 * en subcadenas basadas en un delimitador específico.
 * Luego, muestra cada subcadena por separado.
 */
public class Ejercicio20 {
    private static String[] splitter(String cadena, String delimitador){
        return cadena.replaceAll("\\p{Punct}", "").split(" ");
    }
    public static void main(String[] args) {
        String texto = "En el principio, era el Verbo. Y el Verbo estaba con Dios y el Verbo era Dios";
        String[] palabras = splitter(texto, " ");
        for (String palabra : palabras) {
            System.out.println("Palabra: " + palabra);
        }
    }
}
