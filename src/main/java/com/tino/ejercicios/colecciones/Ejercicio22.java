package com.tino.ejercicios.colecciones;

import java.util.Arrays;
import java.util.List;

/**
 * Dada una lista de cadenas, usa streams para filtrar
 * las cadenas que tienen una longitud específica.
 */
public class Ejercicio22 {
    public static void main(String[] args) {
        List<String> listaCadenas = Arrays.asList("hola", "mundo", "estamos", "bien");
        List<String> listaFiltrada = listaCadenas.stream().filter(s -> s.length() == 4).toList();
        System.out.println(listaFiltrada);
    }
}
