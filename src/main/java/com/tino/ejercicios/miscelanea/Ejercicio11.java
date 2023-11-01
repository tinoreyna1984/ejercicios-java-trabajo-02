package com.tino.ejercicios.miscelanea;

/**
 * Escribe un programa que compruebe si una cadena
 * representa un número de teléfono válido.
 */
public class Ejercicio11 {
    public static void main(String[] args) {
        String fono = "(+593)986440040";
        String regex = "\\(\\+.[0-9]{1,3}\\)+[0-9]{8,9}";
        System.out.println(fono.matches(regex));
    }
}
