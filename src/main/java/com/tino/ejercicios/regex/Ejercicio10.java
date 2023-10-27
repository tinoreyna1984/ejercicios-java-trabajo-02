package com.tino.ejercicios.regex;

/**
 * Dado un párrafo, divide el texto en oraciones.
 * Utiliza una expresión regular para identificar los puntos finales,
 * excluyendo abreviaturas como "Dr." o "Srta."
 */
public class Ejercicio10 {
    public static void main(String[] args) {
        String texto = "Hubo una reunion con el Dr. Ramirez y la Srta. Perez, de modo que se llego a " +
                "ciertos acuerdos.\nIntervinieron otros expertos y lanzaron otras propuestas que ayudaban " +
                "a la situacion, la cual, sin embargo, no estuvo exenta de objeciones.\nPor tanto, se procuro " +
                "trabajar alturadamente y el consenso beneficio a la comunidad.";
        String[] oraciones = texto.split("\n");
        for(String oracion: oraciones)
            System.out.println(oracion);
    }
}
