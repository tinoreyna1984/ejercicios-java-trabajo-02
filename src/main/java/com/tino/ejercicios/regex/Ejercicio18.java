package com.tino.ejercicios.regex;

/**
 * Crea un programa que valide números de teléfono
 * en diferentes formatos internacionales,
 * como +1-555-555-5555 (EE. UU.) o +44 20 7123 1234 (Reino Unido).
 */
public class Ejercicio18 {
    public static void main(String[] args) {
        String regex = "^(\\(\\+[0-9][^a-zA-Z]{1,3}\\)[0-9][^a-zA-Z]{8,}).*$";
        String telefono = "(+593)986440040";
        System.out.println(telefono.matches(regex));
    }
}
