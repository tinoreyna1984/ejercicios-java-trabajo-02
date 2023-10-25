package com.tino.ejercicios.cadenas;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

/**
 * Escribe un programa que cuente la frecuencia de cada palabra en una cadena de texto.
 * Ignora las mayúsculas y minúsculas, y considera que las palabras están separadas
 * por espacios o signos de puntuación.
 */
public class Ejercicio23 {
    public static void main(String[] args) {
        String cadena = "La paciencia es la fuerza que ayuda a mantener la esperanza";
        String[] palabras = Arrays.stream(cadena // temporalmente lo convierto a una coleccion
                .toLowerCase()                   // todas las palabras en minusculas
                .split(" "))               // rompo la cadena en subcadenas
                .distinct()                      // elimino duplicados
                .toArray(String[]::new);         // lo convierto de array de Strings
        for (int i = 0; i < palabras.length; i++) {
            int ocurrencias = 0;
            Pattern pattern = Pattern.compile("\\b" +palabras[i]+"\\b");
            Matcher matcher = pattern.matcher(cadena.toLowerCase());
            while(matcher.find()){
                ocurrencias++;
            }
            System.out.println("La palabra \"" + palabras[i] + "\" tiene " + ocurrencias + " ocurrencias");
        }
    }
}
