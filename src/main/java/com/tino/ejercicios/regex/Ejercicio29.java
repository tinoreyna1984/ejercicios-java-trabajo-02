package com.tino.ejercicios.regex;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Lee un texto que contiene números decimales en
 * diferentes formatos (por ejemplo, "3.14" o "42,000.00")
 * y extrae todos los números decimales válidos
 */
public class Ejercicio29 {
    public static void main(String[] args) {
        String regex = "\\d{1,3}(,\\d{3})*(\\.\\d+)?";
        String[] numeros = {
                "3.14159",
                "6.023",
                "17,800.14",
                "abc",
        };
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(Arrays.toString(numeros));
        while (matcher.find()){
            String valor = matcher.group();
            int posDecimal = valor.indexOf(".");
            System.out.println("Parte decimal de " + valor + ": " + valor.substring(posDecimal + 1));
        }
    }
}
