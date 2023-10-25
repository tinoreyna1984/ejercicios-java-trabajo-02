package com.tino.ejercicios.cadenas;

/**
 * Escribe un programa que elimine los espacios en blanco extras de una cadena.
 * Por ejemplo, si la cadena es " Esto es un ejemplo ", el resultado debería ser "Esto es un ejemplo".
 */
public class Ejercicio10 {
    public static void main(String[] args) {
        String texto = " Esto es un ejemplo ";
        String nuevoTexto = texto.substring(1);
        nuevoTexto = nuevoTexto.substring(0, nuevoTexto.length() - 1);
        System.out.println("texto = \"" + texto + "\"");
        System.out.println("nuevoTexto = \"" + nuevoTexto + "\"");
    }
}
