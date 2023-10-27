package com.tino.ejercicios.regex;

/**
 * Crea un programa que valide contraseñas según los siguientes criterios:
 * al menos 8 caracteres de longitud,
 * al menos una letra mayúscula,
 * al menos una letra minúscula,
 * al menos un número y al menos un carácter especial.
 */
public class Ejercicio11 {
    public static void main(String[] args) {
        String regex = "^(?=.{8,})(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])(?=.*[@#$%^&+=]).*$";
        String contrasenna = "Pr0gr@mador";
        System.out.println(contrasenna.matches(regex));
    }
}
