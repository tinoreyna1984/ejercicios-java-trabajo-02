package com.tino.ejercicios.cadenas;


/**
 * Escribe un programa que encuentre la palabra más larga en una cadena dada.
 * Si hay varias palabras con la misma longitud máxima, puedes devolver cualquiera de ellas.
 */
public class Ejercicio12 {
    public static void main(String[] args) {
        String texto = "En este texto se encuentra la palabra mas larga";
        String[] palabras = texto.split(" ");
        String palabraMasLarga = palabras[0];
        for (int i = 0; i < palabras.length; i++) {
            if(palabras[i].length() >= palabraMasLarga.length()){
                palabraMasLarga = palabras[i];
            }
        }
        System.out.println("La palabra mas larga del texto es \"" + palabraMasLarga + "\"");
    }
}
