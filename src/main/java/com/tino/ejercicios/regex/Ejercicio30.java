package com.tino.ejercicios.regex;

/**
 * Crea un programa que valide códigos postales de diferentes países
 * utilizando expresiones regulares específicas para cada país.
 */
public class Ejercicio30 {
    public static void main(String[] args) {
        String regex = "^([0-9\\-]+|^[a-zA-Z])$";
        String codigoPostal = "12345-6789";
        System.out.println(codigoPostal.matches(regex));
    }
}
