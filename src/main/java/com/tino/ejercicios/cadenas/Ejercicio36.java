package com.tino.ejercicios.cadenas;

import java.util.*;

/**
 * Escribe un programa que encuentre la palabra
 * más común en una cadena de texto.
 * Puedes ignorar las mayúsculas y minúsculas,
 * así como los signos de puntuación.
 */
public class Ejercicio36 {
    private static long ocurrenciasEnTexto(String texto, String palabra){
        String[] array = texto.split(" ");
        int ocurrencias = 0;
        for(String elemento: array){
            if(palabra.equalsIgnoreCase(elemento)) ocurrencias++;
        }
        return ocurrencias;
    }
    public static void main(String[] args) {
        // mas comun: mayor repitencia
        String texto = "Un ideal diferencia a un individuo de otro";
        List<String> listaPalabras = Arrays.stream(texto.replaceAll("\\p{Punct}", "")
                .split(" ")).distinct().toList();
        List<Long> listaOcurrencias = listaPalabras.stream().map(p -> ocurrenciasEnTexto(texto,p)).toList();
        Long maximo = listaOcurrencias.stream().mapToLong(v -> v).max().orElseThrow(NoSuchElementException::new);
        Map<String, Long> claveValor = new HashMap<>();
        for (int i = 0; i < listaPalabras.size(); i++) {
            claveValor.put(listaPalabras.get(i), listaOcurrencias.get(i));
        }
        System.out.println("La palabra mas comun es \"" + Collections.max(claveValor.keySet()) +
                "\" con " + Collections.max(claveValor.values()) + " ocurrencias");
    }
}
