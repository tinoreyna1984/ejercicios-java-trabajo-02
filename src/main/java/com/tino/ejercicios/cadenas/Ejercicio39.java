package com.tino.ejercicios.cadenas;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Escribe un programa que tome una cadena con números
 * (por ejemplo, "Hoy es el 25 de diciembre")
 * y reemplace los números con sus equivalentes en palabras
 * ("Hoy es el veinticinco de diciembre").
 */
public class Ejercicio39 {
    public static boolean esNumero(String strNum) {
        if (strNum == null) {
            return false;
        }
        try {
            int d = Integer.parseInt(strNum);
        } catch (NumberFormatException nfe) {
            return false;
        }
        return true;
    }
    private static String numeroCadena(String num){
        if(!esNumero(num)) return num;
        Map<String, String> relacion = new HashMap<>();
        relacion.put("1", "uno");
        relacion.put("2", "dos");
        relacion.put("3", "tres");
        relacion.put("4", "cuatro");
        relacion.put("5", "cinco");
        String numCadena = relacion.get(num);
        return numCadena;
    }
    public static void main(String[] args) {
        Map<Integer, String> relacion = new HashMap<>();
        String texto = "Hoy es el 3 de diciembre";
        String[] arrPalabras = texto.split(" ");
        String[] arrConMap = Arrays.stream(arrPalabras).map(p -> numeroCadena(p)).toArray(String[]::new);
        String nuevoTexto = String.join(" ", arrConMap);
        System.out.println("texto = " + texto);
        System.out.println("nuevoTexto = " + nuevoTexto);
    }
}
