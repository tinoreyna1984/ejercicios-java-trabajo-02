package com.tino.ejercicios.cadenas;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Escribe un programa que verifique si una cadena dada es un acrónimo.
 * Puedes asumir que un acrónimo consiste en las iniciales de una serie de palabras,
 * todas en mayúsculas y sin espacios.
 */
public class Ejercicio25 {
    public static void main(String[] args) {
        String[] palabras = {
                "ONU", "USA", "Mobil", "Toshiba", "APROFE", "SOS"
        };
        int acronimos = 0;
        String regex = "\\b[A-Z]+\\b";
        boolean esAcronimo = false;
        for (int i = 0; i < palabras.length; i++) {
            esAcronimo = palabras[i].matches(regex);
            if(esAcronimo) acronimos++;
        }
        System.out.println("Se encontraron " + acronimos + " acronimos");
    }
}
