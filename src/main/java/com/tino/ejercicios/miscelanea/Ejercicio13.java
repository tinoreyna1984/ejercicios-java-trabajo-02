package com.tino.ejercicios.miscelanea;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Escribe un programa que tome una lista
 * y elimine los elementos duplicados,
 * dejando solo una instancia de cada elemento.
 */
public class Ejercicio13 {
    public static void main(String[] args) {
        List<Integer> listaEnteros = new ArrayList<>();
        listaEnteros.add(5);
        listaEnteros.add(15);
        listaEnteros.add(8);
        listaEnteros.add(5);
        listaEnteros.add(6);
        listaEnteros.add(9);
        listaEnteros.add(5);
        listaEnteros.add(9);
        listaEnteros = listaEnteros.stream().distinct().collect(Collectors.toList());
        System.out.println(Arrays.toString(listaEnteros.toArray())); // [5, 15, 8, 6, 9]
    }
}
