package com.tino.ejercicios.miscelanea;

import java.util.Arrays;
import java.util.List;

/**
 * Desarrolla un programa que tome una lista de cadenas
 * y las ordene alfabéticamente de manera ascendente.
 */
public class Ejercicio14 {
    public static void main(String[] args) {
        String[] cadenas = {
                "hola", "como", "estan",
                "ustedes", "que", "van",
                "a", "hacer", "mas", "tarde",
        };
        List<String> listaCadenas = Arrays.stream(cadenas).distinct().sorted().toList();
        for (String listaCadena : listaCadenas) {
            System.out.println(listaCadena);
        }
    }
}
