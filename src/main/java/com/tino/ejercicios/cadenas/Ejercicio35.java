package com.tino.ejercicios.cadenas;

import java.util.Arrays;
import java.util.List;

/**
 * Escribe un programa que tome una cadena y elimine todas las palabras vacías
 * (por ejemplo, "el", "la", "de", "y", "en") de la misma.
 */
public class Ejercicio35 {
    private static boolean esPalabraVacia(String palabra){
        String[] palabrasVacias = {
                "el", "la", "de", "y", "e", "por", "en", "que"
        };
        for(String p: palabrasVacias){
            if(palabra.equalsIgnoreCase(p))
                return true;
        }
        return false;
    }
    public static void main(String[] args) {
        String texto = "El gato que esta en la oscuridad, lagrima clara de primavera";
        List<String> listaPalabras = Arrays.stream(texto.split(" ")).filter(s -> !esPalabraVacia(s)).toList();
        String nuevoTexto = String.join(" ", listaPalabras.toArray(new String[0]));
        System.out.println("texto = " + texto);
        System.out.println("nuevoTexto = " + nuevoTexto);
    }
}
