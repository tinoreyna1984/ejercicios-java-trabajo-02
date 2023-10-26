package com.tino.ejercicios.cadenas;

import java.util.Arrays;
import java.util.stream.Collectors;

/**
 * Escribe un programa que tome una cadena de texto y
 * genere un acrónimo utilizando la primera letra
 * de cada palabra en mayúsculas
 */
public class Ejercicio38 {
    public static void main(String[] args) {
        String texto = "Fortalezas-Oportunidades-Debilidades-Amenazas";
        String resultado = Arrays.stream(texto.split("-"))
                .map(p -> p.substring(0,1).toUpperCase())
                .collect(Collectors.joining());
        System.out.println("Texto: " + texto);
        System.out.println("Acronimo: " + resultado);
    }
}
