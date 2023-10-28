package com.tino.ejercicios.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Lee un documento en formato Markdown
 * y extrae todas las etiquetas Markdown presentes en el texto.
 * Esto podría incluir encabezados (#), listas (- o *), enlaces (texto), etc
 */
public class Ejercicio22 {
    public static void main(String[] args) {
        String markdown =
                "## Titulo\n" +
                "Texto comun\n" +
                "### Subtitulo 1\n" +
                "#### Subtitulo 2\n" +
                "* Item de lista\n" +
                "[enlace](https://enlace.com/)";
        String regex = "(#{1,}\\s)(.*)|(\\*{1}\\s)(.*)|(\\[[a-z0-9A-Z]{1,}\\]\\(http?s:\\/\\/[a-z0-9./]{1,}\\))";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(markdown);
        while(matcher.find()){
            System.out.println(matcher.group());
        }
    }
}
