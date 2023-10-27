package com.tino.ejercicios.regex;

/**
 * Verifica si es numero telefonico
 */
public class Ejercicio02 {
    public static void main(String[] args) {
        String numero = "(+593)986440040";
        String regex = "\\(\\+.[0-9]{1,3}\\)+[0-9]{8,9}";
        boolean esValido = numero.matches(regex);
        System.out.println("esValido = " + esValido);
    }
}
