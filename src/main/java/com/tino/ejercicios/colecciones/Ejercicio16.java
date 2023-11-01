package com.tino.ejercicios.colecciones;

import java.util.Arrays;
import java.util.List;

/**
 * Toma una lista de números y usa una sola operación de stream
 * para filtrar los números pares y luego mapearlos a sus cuadrados.
 */
public class Ejercicio16 {
    public static void main(String[] args) {
        int[] numeros = {
             3,5,1,7,10,13,12,4
        };
        List<Integer> listaParesAlCuadrado = Arrays.stream(numeros)
                .sorted() // ordeno
                .filter(n -> n % 2 == 0) // filtro los pares
                .map(n -> (int) (Math.pow(n, 2))) // elevo cada valor al cuadrado y lo convierto a entero
                .boxed().toList();
        System.out.println(Arrays.toString(listaParesAlCuadrado.toArray()));
    }
}
