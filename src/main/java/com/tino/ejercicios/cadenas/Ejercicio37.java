package com.tino.ejercicios.cadenas;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * Escribe un programa que cuente cuántas veces
 * se repiten letras consecutivas en una cadena.
 * Por ejemplo, en la cadena "aaabbcddde",
 * las letras 'a' y 'd' se repiten tres veces consecutivamente.
 */
public class Ejercicio37 {
    private static int veces(String texto, String letra){
        String[] arrayLetras = texto.split("");
        int veces = 0;
        for(String elemento: arrayLetras){
            if(letra.equalsIgnoreCase(elemento)) veces++;
        }
        return veces;
    }
    public static void main(String[] args) {
        String cadena = "aaabbcddde";
        String[] caracteres = Arrays.stream(cadena.split("")).distinct().toArray(String[]::new);
        for(String valor: caracteres){
            System.out.println("La letra \"" + valor + "\" se repite " + veces(cadena, valor) + " veces");
        }
    }
}
