package com.tino.ejercicios.miscelanea;

import java.util.LinkedHashSet;

/**
 * Escribe un programa que tome una cadena
 * y elimine los caracteres repetidos,
 * dejando solo una instancia de cada carácter.
 */
public class Ejercicio09 {
    public static void main(String[] args) {
        String texto = "Este es un texto";
        StringBuilder sb = new StringBuilder();
        LinkedHashSet<Character> caracteres = new LinkedHashSet<>();
        for (int i = 0; i < texto.length(); i++) {
            caracteres.add(texto.charAt(i));
        }
        for (Character c : caracteres) {
            sb.append(c);
        }
        System.out.println("Texto original: " + texto);
        System.out.println("Texto reducido: " + sb);
    }
}
