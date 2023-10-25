package com.tino.ejercicios.cadenas;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Escribe un programa que tome una cadena de texto y ordene las palabras alfabéticamente.
 * Puedes asumir que las palabras están separadas por espacios.
 */
public class Ejercicio27 {
    public static void main(String[] args) {
        String texto = "Ya falta poco para Navidad";
        String[] palabras = Arrays.stream(texto
                .split(" ")) // separa en palabras
                .sorted(Comparator.comparing(String::new, String.CASE_INSENSITIVE_ORDER)) // ordena alfabeticamente sin importar mayusculas o minusculas
                .toArray(String[]::new); // exporta a arreglo de Strings
        String nuevoTexto = String.join(" ", palabras);
        System.out.println("texto = " + texto);
        System.out.println("nuevoTexto = " + nuevoTexto);
    }
}
