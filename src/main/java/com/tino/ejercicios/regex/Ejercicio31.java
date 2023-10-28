package com.tino.ejercicios.regex;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Crea un programa que valide URLs,
 * pero solo permita aquellas que pertenezcan a un dominio específico.
 * Por ejemplo, solo aceptar URLs que pertenezcan a "example.com".
 */
public class Ejercicio31 {
    public static void main(String[] args) {
        String dominio = "midominio.com";
        String[] sitios = {
                "https://hola.midominio.com",
                "https://como.midominio.com",
                "https://vas.midominio.com",
                "https://hoy.midominio.com",
                "https://saludos.midominio.com",
                "https://hola.otrodominio.com",
                "https://como.otrodominio.com",
        };
        String regex = "[(https?)]+\\:+\\/+\\/+[a-z]+.[a-z]+.("+ dominio +")";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(Arrays.toString(sitios));
        int count = 0;
        while (matcher.find()){
            count++;
        }
        System.out.println(count + " sitios tienen el dominio \"" + dominio + "\"");
    }
}
