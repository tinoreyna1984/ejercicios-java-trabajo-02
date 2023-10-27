package com.tino.ejercicios.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Lee un archivo HTML y extrae todas las etiquetas
 * HTML presentes en el documento.
 * No es necesario que manejes etiquetas anidadas complejas,
 * solo las etiquetas principales
 */
public class Ejercicio05 {
    public static void main(String[] args) {
        String html = "<html xmlns=\"http://www.w3.org/1999/xhtml\" xml:lang=\"en\" lang=\"en\">\n" +
                "<head>\n" +
                "\t<title>title</title>\n" +
                "\t<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\n" +
                "\t<meta name=\"description\" content=\"\" />\n" +
                "\t<meta name=\"keywords\" content=\"\" />\n" +
                "\t<meta name=\"robots\" content=\"index,follow\" />\n" +
                "\t<link rel=\"stylesheet\" type=\"text/css\" href=\"styles.css\" />\n" +
                "</head>\n" +
                "\n" +
                "<body>\n" +
                "    <h1>Hola mundo</h1>\n" +
                "</body>\n" +
                "</html>";
        Pattern patron = Pattern.compile("\\<+[a-z]+[a-z0-9]\\>", Pattern.CASE_INSENSITIVE);
        Matcher coincide = patron.matcher(html);
        while (coincide.find()){
            System.out.println(coincide.group());
        }
    }
}
