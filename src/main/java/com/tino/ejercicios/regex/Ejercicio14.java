package com.tino.ejercicios.regex;

/**
 * Verifica si un código postal dado cumple con un formato específico.
 * Por ejemplo, en EE. UU., el formato podría ser "12345" o "12345-6789".
 */
public class Ejercicio14 {
    public static void main(String[] args) {
        String regex = "^([0-9\\-]+|^[a-zA-Z])$";
        String codigoPostal = "12345-6789";
        System.out.println(codigoPostal.matches(regex));
    }
}
