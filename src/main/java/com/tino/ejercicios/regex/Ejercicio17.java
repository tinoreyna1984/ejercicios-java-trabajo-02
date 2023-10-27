package com.tino.ejercicios.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**Lee un fragmento de código fuente en un
 * lenguaje de programación específico y
 * resalta la sintaxis utilizando expresiones regulares.
 * Por ejemplo, puedes resaltar palabras clave, cadenas, comentarios, etc.
 *
 */
public class Ejercicio17 {
    public static void main(String[] args) {
        String codFuente = "int main(){\n" +
                            "    int a = 2, b = 3;\n" +
                            "\tprintf(\"Suma: %d\", a + b);\n" +
                            "}";
        String regex = "(pr)?int(f)?";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(codFuente);
        int pos = 0;
        String wrd = "";
        String nuevoCodFuente = codFuente;
        while(matcher.find()){
            wrd = matcher.group();
            nuevoCodFuente = nuevoCodFuente.replace(wrd, "[" + wrd + "]");
        }
        System.out.println(nuevoCodFuente);
    }
}
