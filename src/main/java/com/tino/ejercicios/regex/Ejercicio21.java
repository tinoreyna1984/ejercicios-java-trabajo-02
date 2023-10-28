package com.tino.ejercicios.regex;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Crea un programa que valide nombres de usuario.
 * Los nombres de usuario deben contener solo letras y números,
 * tener una longitud de 4 a 20 caracteres
 * y no pueden comenzar con un número.
 */
public class Ejercicio21 {
    public static void main(String[] args) {
        String username = "usuario2023";
        String regex = "\\b([^0-9][a-z0-9]{3,19})\\b";
        Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(username);
        System.out.println(matcher.matches());
    }
}
