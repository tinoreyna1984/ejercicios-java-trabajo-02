package com.tino.ejercicios.miscelanea;

import java.util.Arrays;

/**
 * Crea un programa que tome una oración
 * y cuente cuántas palabras contiene.
 * Las palabras están separadas por espacios en blanco.
 */
public class Ejercicio07 {
    public static void main(String[] args) {
        String loremIpsum = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.";
        Long cantidadPalabras = Arrays.stream( // convierte a un stream basado en String[]
                                  loremIpsum.replaceAll("\\p{Punct}", "") // elimina signos de puntuacion
                                            .split(" ")) // separa el parrafo delimitado por espacios
                                .count(); // cuenta total de palabras
        System.out.println("Total de palabras en el parrafo: " + cantidadPalabras);
    }
}
