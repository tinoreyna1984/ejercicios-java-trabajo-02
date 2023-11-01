package com.tino.ejercicios.miscelanea;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Dada una lista de números enteros,
 * crea un programa que filtre solo
 * los números pares y los almacene en una nueva lista.
 */
public class Ejercicio02 {
    public static void main(String[] args) {
        List<Integer> listaEnteros = new ArrayList<>();
        listaEnteros.add(3);
        listaEnteros.add(5);
        listaEnteros.add(4);
        listaEnteros.add(2);
        listaEnteros.add(11);
        listaEnteros.add(14);
        listaEnteros.add(21);
        listaEnteros.add(30);
        listaEnteros.add(4);
        listaEnteros.add(1);
        listaEnteros.add(2);
        List<Integer> listaPares = listaEnteros
                .stream().distinct() // quito duplicados
                .filter(n -> n % 2 == 0).toList(); // filtro los pares y exporto a lista
        System.out.println("Lista enteros: " + Arrays.toString(listaEnteros.toArray()));
        System.out.println("Lista pares: " + Arrays.toString(listaPares.toArray()));
    }
}
