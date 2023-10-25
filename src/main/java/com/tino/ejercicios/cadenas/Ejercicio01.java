package com.tino.ejercicios.cadenas;

/**
 * Escribe un programa que cuente cuántas palabras hay en una cadena de texto dada.
 * Puedes asumir que las palabras están separadas por espacios en blanco.
 */
public class Ejercicio01 {
    public static void main(String[] args) {
        String cadena = "Esta es una cadena de texto";
        String[] palabras = cadena.split(" ");
        System.out.println("Texto: " + cadena);
        System.out.println("Cantidad de palabras en el texto: " + palabras.length);
    }
}
