package com.tino.ejercicios.regex;

/**
 * Lee un texto y extrae todas las palabras en un idioma específico.
 * Puedes utilizar una expresión regular para definir las reglas de validación de palabras en ese idioma.
 */
public class Ejercicio19 {
    public static void main(String[] args) {
        String regex = "([a-z]*\\ñ[a-z]*)"; // especificamente para idioma español
        String[] palabras = {"tomorrow", "mañana", "bathroom", "baño"};
        int count = 0;
        for(String palabra: palabras){
            if(palabra.matches(regex)) count++;
        }
        System.out.println("Se tienen " + count + " palabras propias del idioma español");
    }
}
