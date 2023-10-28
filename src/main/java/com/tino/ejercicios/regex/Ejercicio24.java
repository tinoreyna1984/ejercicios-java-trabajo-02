package com.tino.ejercicios.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Lee un documento de texto y extrae todas
 * las fechas presentes en el formato
 * "dd/mm/aaaa" o "dd-mm-aaaa".
 */
public class Ejercicio24 {
    public static void main(String[] args) {
        String texto = "Naci el 05/05/1984. Mi fecha tambien la puedo escribir asi: 05-05-1984";
        String regex = "([0-9]{2}(\\/|-)[0-9]{2}(\\/|-)[0-9]{4})";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto);
        while(matcher.find()){
            System.out.println(matcher.group());
        }
    }
}
