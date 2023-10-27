package com.tino.ejercicios.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Lee un archivo XML y extrae todas las etiquetas XML presentes en el documento.
 * Esto puede incluir etiquetas anidadas y atributos.
 */
public class Ejercicio09 {
    public static void main(String[] args) {
        String xml = "<note>\n" +
                "<to>Tove</to>\n" +
                "<from>Jani</from>\n" +
                "<heading>Reminder</heading>\n" +
                "<body>Don't forget me this weekend!</body>\n" +
                "</note>";
        Pattern patron = Pattern.compile("\\<+[a-z]+[a-z0-9]\\>", Pattern.CASE_INSENSITIVE);
        Matcher coincide = patron.matcher(xml);
        while (coincide.find()){
            System.out.println(coincide.group());
        }
    }
}
