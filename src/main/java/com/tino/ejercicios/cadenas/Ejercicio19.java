package com.tino.ejercicios.cadenas;

/**
 * Escribe un programa que tome una cadena y la convierta a formato de título (capitalizando la primera letra de cada palabra, excepto las palabras comunes como "el", "la", "de", etc.).
 */
public class Ejercicio19 {
    private static boolean esArticulo(String termino){
        String[] comunes = {
                "el", "la", "los", "las", "de", "del",
                "en", "por"
        };
        for (int i = 0; i < comunes.length; i++) {
            if(termino.equalsIgnoreCase(comunes[i])) return true;
        }
        return false;
    }
    private static String capitalizar(String termino){
        return termino.substring(0,1).toUpperCase() + termino.substring(1);
    }
    public static void main(String[] args) {
        String texto = "El caballero de los mares";
        String[] palabras = texto.split(" ");
        for (int i = 0; i < palabras.length; i++) {
            if(!esArticulo(palabras[i])){
                palabras[i] = capitalizar(palabras[i]);
            }
        }
        String nuevoTexto = String.join(" ", palabras);
        System.out.println("Texto original: " + texto);
        System.out.println("Nuevo texto: " + nuevoTexto);
    }
}
