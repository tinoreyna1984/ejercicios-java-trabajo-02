package com.tino.ejercicios.colecciones;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * Dada una lista de elementos, elimina los duplicados
 * y devuelve una lista sin elementos repetidos.
 */
public class Ejercicio06 {
    public static void main(String[] args) {
        int[] numeros = {2, 3, 10, 9, 6, 15, 4, 3, 9, 15};
        List<Long> listaNumeros = Arrays.stream(numeros).distinct().sorted().mapToLong(n -> n).boxed().toList();
        System.out.println(Arrays.toString(listaNumeros.toArray()));
    }
}
