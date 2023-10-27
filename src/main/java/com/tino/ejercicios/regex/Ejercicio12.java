package com.tino.ejercicios.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Lee un mensaje de redes sociales y
 * extrae todos los hashtags (#) presentes en el mensaje.
 */
public class Ejercicio12 {
    public static void main(String[] args) {
        String tweet = "Aprendiendo #Java, un #RetoDiario. #Java8 #programacion #code_test";
        String regex = "(\\#[a-zA-Z0-9_]+)";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(tweet);
        System.out.println("Texto: " + tweet);
        while(matcher.find()){
            System.out.println("Hashtag: " + matcher.group());
        }
    }
}
