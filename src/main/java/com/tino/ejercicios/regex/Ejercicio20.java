package com.tino.ejercicios.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Lee un archivo que contenga comentarios HTML o XML
 * y extrae todas las etiquetas que se encuentran dentro de los comentarios.
 */
public class Ejercicio20 {
    public static void main(String[] args) {
        String codigo = "<html>\n" +
                        "<head>\n" +
                        "\t<title>title</title>\n" +
                        "</head>\n" +
                        "<body>\n" +
                        "<!-- hola mundo -->\n" +
                        "<!-- hola mundo 02-->\n" +
                        "<!-- hola mundo 03-->\n" +
                        "</body>\n" +
                        "</html>";
        String regex = "<!--(.*?)-->";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(codigo);
        while (matcher.find()){
            // encuentro los comentarios como "<!-- hola mundo -->" y extraigo solo el texto
            System.out.println(matcher.group().replaceAll("\\p{Punct}",""));
        }
    }
}
