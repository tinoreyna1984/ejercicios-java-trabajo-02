package com.tino.ejercicios.miscelanea;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Desarrolla un programa que cuente cuántas veces
 * aparece un carácter específico en una cadena de texto.
 */
public class Ejercicio16 {
    public static void main(String[] args) {
        String texto = "Esta es una cadena de texto";
        List<Character> listaCaracteres = texto.chars().mapToObj(e -> (char) e).toList();
        long ocurrencias = listaCaracteres.stream().filter(c -> c == 'a').count();
        System.out.println("La letra \"a\" ocurre " + ocurrencias + " veces en el texto");
    }
}
