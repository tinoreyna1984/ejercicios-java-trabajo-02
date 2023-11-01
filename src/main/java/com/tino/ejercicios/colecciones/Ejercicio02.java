package com.tino.ejercicios.colecciones;

import java.util.Arrays;
import java.util.List;

/**
 * Dada una lista de cadenas,
 * usa streams para transformar todas las cadenas en mayúsculas.
 */
public class Ejercicio02 {
    public static void main(String[] args) {
        String[] cadenas = {
                "Java", "es", "un", "buen", "lenguaje"
        };
        List<String> listaCadenas = Arrays.stream(cadenas) // genero un stream
                                    .map(String::toUpperCase) // transformo a mayusculas
                                    .toList(); // exporto como lista
        System.out.println(Arrays.toString(listaCadenas.toArray()));
    }
}
