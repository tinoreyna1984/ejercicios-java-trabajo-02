package com.tino.ejercicios.regex;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ejercicio25 {
    public static void main(String[] args) {
        String texto = "Las edades de los hermanos de Juan son 21, 25 y 29 años.";
        Map<String, String> mapEdades = new HashMap<>();
        mapEdades.put("21", "ventiun");
        mapEdades.put("25", "venticinco");
        mapEdades.put("29", "ventinueve");
        String regex = "[0-9]{1,}";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto);
        String nuevoTexto = texto;
        while(matcher.find()){
            nuevoTexto = nuevoTexto.replace(matcher.group(), mapEdades.get(matcher.group()));
        }
        System.out.println("Texto original: "+ texto);
        System.out.println("Nuevo texto: " + nuevoTexto);
    }
}
