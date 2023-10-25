package com.tino.ejercicios.cadenas;

import java.util.LinkedHashSet;
import java.util.Set;

/**
 * Escribe un programa que tome una cadena y elimine los caracteres duplicados,
 * dejando solo una ocurrencia de cada carácter.
 */
public class Ejercicio17 {
    public static void main(String[] args) {
        String cadena = "mi cadena es breve";
        StringBuilder sb = new StringBuilder();
        Set<Character> set = new LinkedHashSet<>(); // lista enlazada: previene los duplicados
        for (int i = 0; i < cadena.length(); i++) {
            set.add(cadena.charAt(i));
        }
        for (Character c: set){
            sb.append(c);
        }
        System.out.println("cadena = " + cadena);
        System.out.println("sb = " + sb);
    }
}
