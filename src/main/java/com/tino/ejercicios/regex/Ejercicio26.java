package com.tino.ejercicios.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Crea un programa que valide una lista de
 * direcciones de correo electrónico separadas por comas.
 * Asegúrate de que todas las direcciones sean válidas.
 */
public class Ejercicio26 {
    public static void main(String[] args) {
        String correos = "tino@mail.com,\n" +
                "luis@mail.com,\n" +
                "gaby@mail.com,\n" +
                "pepe@correo.com";
        String regex = "\\w[a-z0-9_.]+@[a-z0-9_.]+.[a-z]{2,3}.[a-z]{2,3}";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(correos);
        while (matcher.find()){
            System.out.println(matcher.group());
        }
    }
}
