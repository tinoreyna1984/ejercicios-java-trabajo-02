package com.tino.ejercicios.cadenas;

import java.util.Arrays;
import java.util.List;

/**
 * Escribe un programa que tome una cadena y capitalice la primera letra de cada palabra.
 */
public class Ejercicio09 {
    private static String capitalizaPalabra(String palabra){
        return palabra.substring(0, 1).toUpperCase() + palabra.substring(1);
    }
    public static void main(String[] args) {
        String cadena = "Esta es una cadena de texto";
        String[] palabras = cadena.split(" ");
        List<String> listaPalabras = Arrays.asList(palabras);
        List<String> palabrasCapitalizadas = listaPalabras.stream().map(p -> capitalizaPalabra(p)).toList();
        String[] arrayPalabrasCapitalizadas = palabrasCapitalizadas.toArray(String[]::new);
        String nuevaCadena = String.join(" ", arrayPalabrasCapitalizadas);
        System.out.println("Cadena original: " + cadena);
        System.out.println("Cadena con palabras capitalizadas: " + nuevaCadena);
    }
}
