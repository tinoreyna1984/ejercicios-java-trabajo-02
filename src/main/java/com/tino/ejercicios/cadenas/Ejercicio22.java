package com.tino.ejercicios.cadenas;

/**
 * Escribe un programa que tome un párrafo o un texto largo y lo divida en oraciones.
 * Puedes asumir que las oraciones están separadas por puntos, signos de exclamación
 * o interrogación.
 */
public class Ejercicio22 {
    public static void main(String[] args) {
        String parrafo = "Por lo demás, hermanos, todo lo que es verdadero, " +
                "todo lo honesto, todo lo justo, todo lo puro, todo lo amable, " +
                "todo lo que es de buen nombre; si hay virtud alguna, " +
                "si algo digno de alabanza, en esto pensad.";
        String[] porciones = parrafo.split("\\, |\\. |\\; |\\.");
        for (String p : porciones) {
            System.out.println("porciones = " + p);
        }
    }
}
