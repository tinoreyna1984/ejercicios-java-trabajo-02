package com.tino.ejercicios.cadenas;

/**
 * Escribe un programa que tome una cadena y capitalice la primera letra
 * de cada oración (considerando las oraciones separadas por puntos,
 * signos de exclamación o interrogación).
 */
public class Ejercicio33 {
    public static void main(String[] args) {
        String cadena = "A caballo regalado, no se le mira el dentado";
        StringBuilder sb = new StringBuilder(cadena);
        String[] palabras = cadena.replaceAll("\\p{Punct}", "").split(" ");
        int pos = 0, longPalabra = 0;
        for (int i = 0; i < palabras.length; i++) {
            pos = sb.indexOf(palabras[i], pos + longPalabra);
            sb.replace(pos, pos + 1, sb.substring(pos, pos + 1).toUpperCase());
        }
        System.out.println("Texto original: " + cadena);
        System.out.println("Texto capitalizado: " + sb);
    }
}
