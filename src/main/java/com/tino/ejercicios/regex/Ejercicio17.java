package com.tino.ejercicios.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Lee un párrafo de texto y busca y valida todas
 * las direcciones de correo electrónico presentes en el texto.
 */
public class Ejercicio17 {
    public static void main(String[] args) {
        String regex = "\\w[a-z0-9_.]+@[a-z0-9_.]+.[a-z]{2,3}.[a-z]{2,3}";
        String texto = "Por favor, escribe a tino@mail.com, gaby@correo.com y pepe@mail.com";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto);
        while (matcher.find()){
            System.out.println(matcher.group());
        }
    }
}
