package com.tino.ejercicios.cadenas;

/**
 * Escribe un programa que cuente cuántas palabras palíndromas hay en una cadena de texto.
 * Puedes asumir que las palabras están separadas por espacios en blanco.
 */
public class Ejercicio18 {
    private static boolean esPalindromo(String palabra){
        String textoSinEspacios = String.join("", palabra.toLowerCase().split(" "));
        StringBuilder nuevoTexto = new StringBuilder(textoSinEspacios);
        nuevoTexto.reverse();
        String textoInvertido = nuevoTexto.toString();
        return palabra.equalsIgnoreCase(textoInvertido);
    }
    public static void main(String[] args) {
        String texto = "El ojo ama la luz";
        String[] palabras = texto.split(" ");
        int palindromos = 0;
        for (int i = 0; i < palabras.length; i++) {
            if(esPalindromo(palabras[i])) palindromos++;
        }
        System.out.println("Texto: " + texto);
        System.out.println("Hay " + palindromos + " palindromos en el texto");
    }
}
