package com.tino.ejercicios.cadenas;

/**
 * Escribe un programa que determine si una cadena dada es un palíndromo, es decir,
 * si se lee igual de izquierda a derecha y de derecha a izquierda
 * (ignorando espacios y mayúsculas/minúsculas).
 */
public class Ejercicio08 {
    public static void main(String[] args) {
        String texto = "Anita lava la tina";
        String[] palabras = texto.toLowerCase().split(" ");
        String textoSinEspacios = String.join("", palabras);
        StringBuilder nuevoTexto = new StringBuilder(textoSinEspacios);
        nuevoTexto.reverse();
        String textoInvertido = nuevoTexto.toString();
        if(textoInvertido.equalsIgnoreCase(textoSinEspacios)){
            System.out.println("El texto es palindromo");
        }
        else System.out.println("El texto no es palindromo");
    }
}
