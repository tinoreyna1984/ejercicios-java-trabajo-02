package com.tino.ejercicios.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Lee un tuit y extrae todas las menciones de
 * usuarios de Twitter (@nombredeusuario) presentes en el mensaje.
 */
public class Ejercicio27 {
    public static void main(String[] args) {
        String regex = "(@[a-zA-Z_0-9]{1,})";
        String texto = "Un saludo a @usuarioDePrueba y a @usuario_123.";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto);
        while (matcher.find()){
            System.out.println(matcher.group());
        }
    }
}
