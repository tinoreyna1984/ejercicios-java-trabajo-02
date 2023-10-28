package com.tino.ejercicios.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Lee un fragmento de código fuente (por ejemplo, en Java, C++ o HTML)
 * y extrae todas las etiquetas de comentarios,
 * como \/\* comentario \*\/ en código Java o <!-- comentario --> en HTML.
 */
public class Ejercicio32 {
    public static void main(String[] args) {
        String codigo =
                "int main(){\n" +
                "\t/* 1 - declaro variables */\n" +
                "\tint a = 1, b = 2, c = 0;\n" +
                "\t/* 2 - hago una operacion */\n" +
                "\tc = a + b;\n" +
                "\t/* 3 - muestro resultado */\n" +
                "\tprintf(\"Resultado: %d\", c);\n" +
                "\t/* 4 - salgo del programa */\n" +
                "\texit(0);\n" +
                "}";
        String regex = "(?<=\\/\\*\\s)(.*)(?=\\s\\*\\/)"; // comentarios en C/C++/C#/Java/JavaScript
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(codigo);
        while (matcher.find()){
            System.out.println(matcher.group());
        }
    }
}
