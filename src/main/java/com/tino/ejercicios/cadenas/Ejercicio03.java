package com.tino.ejercicios.cadenas;

/**
 * Escribe un programa que cuente cuántas veces aparece una subcadena en una cadena dada.
 * Por ejemplo, cuántas veces aparece "Java" en "Java es un lenguaje de programación y Java es divertido".
 */

public class Ejercicio03 {
    public static void main(String[] args) {
        String cadena = "Java es un lenguaje de programación y Java es divertido";
        String palabra = "Java";
        String[] palabras = cadena.split(" ");
        int ocurrencias = 0;
        for (int i = 0; i < palabras.length; i++) {
            if(palabras[i].equalsIgnoreCase(palabra)){
                ocurrencias++;
            }
        }
        System.out.println("Texto: " + cadena);
        System.out.println("Numero de veces que aparece la palabra \"" + palabra + "\" en el texto: " + ocurrencias);
    }
}
