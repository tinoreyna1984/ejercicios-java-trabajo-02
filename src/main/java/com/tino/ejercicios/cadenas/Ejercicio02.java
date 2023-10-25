package com.tino.ejercicios.cadenas;

import javax.xml.stream.events.Characters;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Escribe un programa que tome una cadena y la invierta.
 * Por ejemplo, si la cadena es "Java", el resultado debería ser "avaJ".
 */
public class Ejercicio02 {
    public static void main(String[] args) {
        String cadena = "Esta es una cadena de texto";
        StringBuilder cadenaRevertida = new StringBuilder(cadena);
        cadenaRevertida.reverse(); // revierte el orden
        System.out.println("Texto: " + cadena); // "Esta es una cadena de texto"
        System.out.println("Texto revertido: " + cadenaRevertida); // "otxet ed anedac anu se atsE"
    }

}
