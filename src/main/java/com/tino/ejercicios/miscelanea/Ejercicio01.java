package com.tino.ejercicios.miscelanea;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Escribe un programa que tome dos listas y devuelva
 * una nueva lista que contenga todos los elementos
 * de ambas listas, sin duplicados.
 */
public class Ejercicio01 {
    public static void main(String[] args) {
        List<Integer> listaEnteros01 = new ArrayList<>();
        List<Integer> listaEnteros02 = new ArrayList<>();
        for (int i = 0; i < 6; i++) {
            listaEnteros01.add(i + 4);
        }
        for (int i = 0; i < 6; i++) {
            listaEnteros02.add(i + 6);
        }
        List<Integer> listaEnteros03 = new ArrayList<>();
        listaEnteros03.addAll(listaEnteros01);
        listaEnteros03.addAll(listaEnteros02);
        listaEnteros03 = listaEnteros03.stream().distinct().collect(Collectors.toList());
        System.out.println("Lista 01: " + Arrays.toString(listaEnteros01.toArray()));
        System.out.println("Lista 02: " + Arrays.toString(listaEnteros02.toArray()));
        System.out.println("Lista 03: " + Arrays.toString(listaEnteros03.toArray()));
    }
}
