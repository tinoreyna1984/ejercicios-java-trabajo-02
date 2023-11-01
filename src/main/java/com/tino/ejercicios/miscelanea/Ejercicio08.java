package com.tino.ejercicios.miscelanea;

/**
 * Desarrolla un programa que invierta una cadena de texto dada.
 * Por ejemplo, si la entrada es "Java", la salida debería ser "avaJ".
 */
public class Ejercicio08 {
    public static void main(String[] args) {
        String texto = "Java es un lenguaje divertido";
        StringBuilder sb = new StringBuilder(texto);
        System.out.println("Texto original: \"" + sb + "\"");
        System.out.println("Texto al reves: \"" + sb.reverse() + "\"");
    }
}
