package com.tino.ejercicios.colecciones;

import java.util.*;

/**
 * Toma dos listas y usa streams para encontrar
 * la unión y la diferencia entre ellas.
 */
public class Ejercicio23 {
    public static void main(String[] args) {
        List<Integer> lista01 = Arrays.asList(2,5,6,3);
        List<Integer> lista02 = Arrays.asList(4,5,8,3,10);

        // union
        Set<Integer> setUnionListas = new HashSet<>();
        setUnionListas.addAll(lista01);
        setUnionListas.addAll(lista02);
        List<Integer> listaUnion = new ArrayList<>(setUnionListas);
        System.out.println("Union: " + listaUnion);

        // diferencia
        List<Integer> listaDif01 = lista01.stream().filter(e -> !lista02.contains(e)).toList();
        List<Integer> listaDif02 = lista02.stream().filter(e -> !lista01.contains(e)).toList();
        List<Integer> listaDif = new ArrayList<>();
        listaDif.addAll(listaDif01);
        listaDif.addAll(listaDif02);
        System.out.println("Diferencia: " + listaDif);

    }
}
