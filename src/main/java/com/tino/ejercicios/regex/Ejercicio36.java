package com.tino.ejercicios.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Lee una cadena que contiene expresiones con paréntesis,
 * como "(a + b) * (c - d)", y extrae todas las expresiones
 * dentro de los pares de paréntesis.
 */
public class Ejercicio36 {
    public static void main(String[] args) {
        String expresion = "(a + b) * (c - d)";
        String regex = "([a-z]\\s(\\+|\\-|\\*|\\/)\\s[a-z])";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(expresion);
        while (matcher.find()){
            System.out.println(matcher.group());
        }
    }
}
