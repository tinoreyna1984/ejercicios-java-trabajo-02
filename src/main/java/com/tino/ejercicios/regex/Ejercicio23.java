package com.tino.ejercicios.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Escribe un programa que valide direcciones de correo electrónico,
 * pero solo acepte direcciones de correo que pertenezcan
 * a un dominio específico
 * (por ejemplo, solo dominios "@miempresa.com").
 */
public class Ejercicio23 {
    public static void main(String[] args) {
        String dominio = "mail.com";
        String correos = "tino@mail.com"+
                         "luis@mail.com"+
                         "gaby@mail.com"+
                         "pepe@correo.com";
        String regex = "([a-zA-Z]{1,}@"+dominio+")";
        Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(correos);
        while(matcher.find()){
            System.out.println(matcher.group());
        }
    }
}
