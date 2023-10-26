package com.tino.ejercicios.cadenas;

import java.util.Arrays;
import java.util.List;

/**
 * Escribe un programa que tome una lista de cadenas
 * y las concatene en una sola cadena, separando cada cadena
 * con un delimitador personalizable.
 */
public class Ejercicio30 {
    private static String unirConDelim(List<String> lista, String delim){
        return String.join(delim, lista.stream().toList());
    }
    public static void main(String[] args) {
        String texto = "Esta es una cadena de prueba";
        String delim = "-";
        List<String> listaPalabras = Arrays.stream(texto.split(" ")).toList();
        String nuevaCadena = unirConDelim(listaPalabras, delim);
        System.out.println("Texto original: " + texto);
        System.out.println("Texto con delimitador: " + nuevaCadena); // "Esta-es-una-cadena-de-prueba"
    }
}
