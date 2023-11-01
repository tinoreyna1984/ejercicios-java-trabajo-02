package com.tino.ejercicios.colecciones;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Toma dos listas y únelas en una sola lista utilizando streams.
 */
public class Ejercicio07 {
    public static void main(String[] args) {
        List<Integer> lista01 = new ArrayList<>();
        List<Integer> lista02 = new ArrayList<>();
        lista01.add(1);
        lista01.add(4);
        lista01.add(5);
        lista02.add(1);
        lista02.add(10);
        lista02.add(7);
        List<Integer> lista03 = new ArrayList<>();
        lista03.addAll(lista01);
        lista03.addAll(lista02);
        lista03 = lista03.stream().distinct().sorted().collect(Collectors.toList());
        System.out.println(Arrays.toString(lista03.toArray()));
    }
}
