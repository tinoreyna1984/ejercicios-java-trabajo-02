package com.tino.ejercicios.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Crea un programa que valide etiquetas HTML personalizadas
 * dentro de un documento HTML, como <mytag>contenido</mytag>,
 * utilizando una expresión regular que permita etiquetas personalizadas.
 */
public class Ejercicio39 {
    public static void main(String[] args) {
        String regex = "(<(\\/?)[a-z0-9]{1,}>|<[a-z0-9].*(\\/)>)|<[a-z0-9].*>";
        String texto =
                "<html xmlns=\"http://www.w3.org/1999/xhtml\" xml:lang=\"en\" lang=\"en\">\n" +
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
                        "<h1>Hola mundo</h1>\n" +
                        "<h2>Hola mundo</h2>\n" +
                        "<h3>Hola mundo</h3>\n" +
                        "<h4>Hola mundo</h4>\n" +
                        "<h5>Hola mundo</h5>\n" +
                        "<h6>Hola mundo</h6>\n" +
                        "</body>\n" +
                        "</html>";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto);
        while (matcher.find()){
            if(matcher.group().contains("/>"))
                System.out.println("Inicio y cierre: " + matcher.group());
            else if(matcher.group().contains("</"))
                System.out.println("Cierre: " + matcher.group());
            else System.out.println("Inicio: " + matcher.group());
        }
    }
}
