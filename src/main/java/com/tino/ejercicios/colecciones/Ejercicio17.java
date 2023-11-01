package com.tino.ejercicios.colecciones;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * Divide una lista grande en partes más pequeñas
 * con un tamaño específico y realiza operaciones
 * en paralelo en cada parte utilizando streams paralelos.
 */
public class Ejercicio17 {
    public static void main(String[] args) {
        List<Integer> listaNumeros = Arrays.asList(2,3,4,5,6,7,9);
        int tamannoParticion = 2;
        List<List<Integer>> subListas = // List<List<Integer>> es una lista de sublistas
                IntStream.range(0, listaNumeros.size())
                .filter(i -> i % tamannoParticion == 0) // delimita las posiciones de las sublistas
                .mapToObj(i ->
                        listaNumeros.subList(i, Math.min(i + tamannoParticion, listaNumeros.size()))
                ) // genera las sublistas
                .toList(); // agrupa las sublistas en una lista
        System.out.println("Sublistas: " + subListas);
        List<Integer> sumasSubListas =
                subListas.parallelStream()
                .map(sl -> sl.stream().mapToInt(n -> n).sum()).toList();
        System.out.println("Sumas de las sublistas: "+ Arrays.toString(sumasSubListas.toArray()));

    }
}
