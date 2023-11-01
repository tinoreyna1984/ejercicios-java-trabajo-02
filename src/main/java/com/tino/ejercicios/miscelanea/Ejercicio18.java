package com.tino.ejercicios.miscelanea;

/**
 * Crea un programa que determine si una cadena es un palíndromo,
 * es decir, si se lee igual de izquierda a derecha que de
 * derecha a izquierda (ignorando espacios y signos de puntuación).
 */
public class Ejercicio18 {
    public static void main(String[] args) {
        String texto = "Anita lava la tina";
        String tmp01 = texto.replace(" ", "").toLowerCase();
        StringBuilder sb = new StringBuilder(tmp01);
        sb.reverse();
        String tmp02 = sb.toString();
        System.out.println("Texto: " + texto);
        System.out.println(tmp02.equals(tmp01) ? "El texto es palindromo" : "El texto no es palindromo");
    }
}
