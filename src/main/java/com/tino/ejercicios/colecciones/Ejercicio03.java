package com.tino.ejercicios.colecciones;

import java.util.Arrays;
import java.util.List;

/**
 * Escribe un programa que tome una lista de números
 * y use streams para calcular la suma y el promedio de los elementos.
 */
public class Ejercicio03 {
    public static void main(String[] args) {
        long[] numeros = {
                10, 15, 20, 15, 14, 16, 18
        };
        List<Long> listaNumeros = Arrays.stream(numeros).boxed().toList();
        long numElementos = listaNumeros.stream().count();
        long sumElementos = listaNumeros.stream().mapToLong(n -> n).sum();
        double promElementos = (double) sumElementos/numElementos;
        System.out.println("Suma de elementos: " + sumElementos);
        System.out.println("Promedio de elementos: " + promElementos);
    }
}
