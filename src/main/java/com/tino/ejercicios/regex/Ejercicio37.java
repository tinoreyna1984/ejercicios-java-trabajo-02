package com.tino.ejercicios.regex;

/**
 * Escribe un programa que valide contraseñas
 * según políticas personalizadas definidas por el usuario,
 * como una longitud mínima,
 * caracteres especiales requeridos
 * y restricciones específicas.
 */
public class Ejercicio37 {
    public static void main(String[] args) {
        String regex = "^(?=.{8,})(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])(?=.*[@#$%^&+=]).*$";
        String contrasenna = "Pr0gr@mador";
        System.out.println(contrasenna.matches(regex));
    }
}
