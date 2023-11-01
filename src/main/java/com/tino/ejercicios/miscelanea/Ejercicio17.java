package com.tino.ejercicios.miscelanea;

/**
 * Escribe un programa que tome una cadena
 * y reemplace todas las instancias de una subcadena
 * con otra subcadena especificada.
 */
public class Ejercicio17 {
    public static void main(String[] args) {
        String texto = "Aprender JavaScript es chevere";
        String nuevoTexto = texto.replace("JavaScript", "Java");
        System.out.println("Texto original: " + texto);
        System.out.println("Nuevo texto: " + nuevoTexto);
    }
}
