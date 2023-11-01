package com.tino.ejercicios.colecciones;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * Realiza operaciones como intersección, unión y diferencia en conjuntos utilizando streams.
 */
public class Ejercicio29 {
    public static void main(String[] args) {
        // declarar e inicializar sets
        Set<Integer> set01 = new HashSet<>();
        Set<Integer> set02 = new HashSet<>();
        for (int i = 0; i < 5; i++) {
            set01.add(i + 1);
        }
        for (int i = 2; i < 7; i++) {
            set02.add(i + 1);
        }
        // interseccion
        Set<Integer> setInterseccion = set01.stream()
                .filter(e -> set02.contains(e))
                .collect(Collectors.toSet());
        System.out.println("Interseccion: " + setInterseccion);
        // union
        Set<Integer> tmpSet = new HashSet<>();
        tmpSet.addAll(set01);
        tmpSet.addAll(set02);
        Set<Integer> setUnion = tmpSet.stream().distinct().collect(Collectors.toSet());
        System.out.println("Union: " + setUnion);
        // diferencia
        Set<Integer> dif01 = set01.stream()
                .filter(e -> !set02.contains(e))
                .collect(Collectors.toSet());
        Set<Integer> dif02 = set02.stream()
                .filter(e -> !set01.contains(e))
                .collect(Collectors.toSet());
        Set<Integer> setDiferencia = new HashSet<>();
        setDiferencia.addAll(dif01);
        setDiferencia.addAll(dif02);
        System.out.println("Diferencia: " + setDiferencia);
    }
}
