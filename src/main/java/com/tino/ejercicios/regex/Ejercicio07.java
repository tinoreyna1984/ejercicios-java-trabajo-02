package com.tino.ejercicios.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Lee un texto y reemplaza todas las palabras ofensivas con asteriscos (*)
 * o algún otro carácter.
 * Define una lista de palabras ofensivas y utilízalas para buscar y reemplazar en el texto.
 */
public class Ejercicio07 {
    public static void main(String[] args) {
        String texto = "Java es superior a Python, PHP, Basic, etc.";
        StringBuilder sb = new StringBuilder(texto);
        Pattern pattern = Pattern.compile("(Python|PHP|BASIC)", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(sb);
        int pos = 0;
        String rep = "";
        while (matcher.find()){
            pos = matcher.start();
            rep = matcher.group();
            sb.replace(pos, pos + rep.length(), "******");
        }
        System.out.println("Texto original: " + texto);
        System.out.println("Texto censurado: " + sb);
    }
}
