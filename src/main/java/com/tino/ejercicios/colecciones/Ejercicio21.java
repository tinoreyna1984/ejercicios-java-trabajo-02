package com.tino.ejercicios.colecciones;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

/**
 * Dada una lista de listas de números, utiliza streams
 * para obtener la suma de todos los números en todas las sublistas.
 */
public class Ejercicio21 {
    public static void main(String[] args) {
        List<Integer> listaNumeros = Arrays.asList(10,15,12,13,14,16,23,20,5,4,8,7);
        int tamannoParticion = 2;
        List<List<Integer>> subListasNumeros =
                IntStream.range(0, listaNumeros.size())
                        .filter(i -> i % tamannoParticion == 0)
                        .mapToObj(
                                i -> listaNumeros.subList(i, Math.min(i + tamannoParticion, listaNumeros.size()))
                        )
                        .toList();
        System.out.println(subListasNumeros);
        List<Integer> sumasSubListas = subListasNumeros.parallelStream()
                .map(sl -> sl.stream().mapToInt(n -> n).sum())
                .toList();
        System.out.println(sumasSubListas);
    }
}
