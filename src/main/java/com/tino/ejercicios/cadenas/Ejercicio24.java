package com.tino.ejercicios.cadenas;

/**
 * Escribe un programa que tome una cadena y
 * reemplace palabras censuradas con asteriscos (*).
 * Debes proporcionar una lista de palabras censuradas y
 * asegurarte de que no se reemplacen partes de otras palabras.
 */
public class Ejercicio24 {
    public static void main(String[] args) {
        String texto = "Se considera que Java tiene mas demanda que Python, C, PHP, entre otros";
        String[] censored = {
          "Python", "C", "PHP"
        };
        String nuevoTexto = texto;
        for (int i = 0; i < censored.length; i++) {
            nuevoTexto = nuevoTexto.replace(censored[i], "*****");
        }

        System.out.println("Texto original: " + texto);
        System.out.println("Texto censurado: " + nuevoTexto);
    }
}
