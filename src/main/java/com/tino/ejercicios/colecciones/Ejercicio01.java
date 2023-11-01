package com.tino.ejercicios.colecciones;

import java.util.Arrays;
import java.util.List;

/**
 * Escribe un programa que tome una lista de números
 * y use streams para filtrar solo los números pares o impares.
 */
public class Ejercicio01 {
    public static void main(String[] args) {
        long[] numeros = {10, 2, 4, 6, 3, 9, 15};
        List<Long> listaNumerosPares = Arrays.stream(numeros) // genera un LongStream
                                        .sorted() // ordena los elementos
                                        .filter(n -> n % 2 == 0) // filtra los valores pares
                                        .boxed() // genera un stream de elementos tipo Long
                                        .toList(); // convierte a lista
        System.out.println(Arrays.stream(listaNumerosPares.toArray()).toList());
    }
}
