package com.tino.ejercicios.cadenas;

/**
 * Escribe un programa que tome una cadena y devuelva un arreglo de palabras individuales.
 * Asume que las palabras están separadas por espacios en blanco.
 */
public class Ejercicio11 {
    public static void main(String[] args) {
        String texto = "Este es un texto";
        String[] palabras = texto.split(" ");
        for (int i = 0; i < palabras.length; i++) {
            System.out.println(palabras[i]);
        }
    }
}
