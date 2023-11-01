package com.tino.ejercicios.miscelanea;

import java.util.*;
import java.util.stream.Collectors;

/**
 * Crea un programa que encuentre el elemento máximo y mínimo
 * en una lista de números enteros.
 */
public class Ejercicio15 {
    public static void main(String[] args) {
        Long[] arrEnteros = new Long[15];
        int i = 0;
        while (i < 15){
            arrEnteros[i] = (long) i + 1;
            i++;
        }
        List<Long> listaEnteros = new ArrayList<>(Arrays.stream(arrEnteros).toList());
        Collections.shuffle(listaEnteros); // ordenamiento aleatorio con shuffle
        Long min = listaEnteros.stream().mapToLong(v -> v).min().orElseThrow(NoSuchElementException::new);
        Long max = listaEnteros.stream().mapToLong(v -> v).max().orElseThrow(NoSuchElementException::new);

        /**
         * Otra forma:
         * Long min = Collections.min(listaEnteros);
         * Long max = Collections.max(listaEnteros);
         */

        System.out.println("Valor minimo: " + min + ", valor maximo: " + max);
    }
}
