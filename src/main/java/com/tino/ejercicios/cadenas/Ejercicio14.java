package com.tino.ejercicios.cadenas;

/**
 * Escribe un programa que cuente la cantidad de vocales y consonantes en una cadena de texto.
 * Puedes considerar únicamente letras del alfabeto y hacer distinción entre mayúsculas y minúsculas.
 */
public class Ejercicio14 {
    private static boolean esVocal(char c){
        char[] vocal = {
                'A', 'B', 'C', 'D', 'E',
                'a', 'e', 'i', 'o', 'u',
        };
        for (int i = 0; i < vocal.length; i++) {
            if(c == vocal[i])
                return true;
        }
        return false;
    }
    public static void main(String[] args) {
        String texto = "Quiero viajar en verano";
        String textoSinEspacios = String.join("", texto.split(" "));
        char[] letras = textoSinEspacios.toCharArray();
        int vocales = 0, consonantes = 0;
        for (int i = 0; i < letras.length; i++) {
            if(esVocal(letras[i])) vocales++;
            else consonantes++;
        }
        System.out.println("Texto: " + texto);
        System.out.println("Cantidad de vocales en el texto: " + vocales);
        System.out.println("Cantidad de consonantes en el texto: " + consonantes);
    }
}
