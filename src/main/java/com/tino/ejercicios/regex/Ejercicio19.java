package com.tino.ejercicios.regex;

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
