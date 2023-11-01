package com.tino.ejercicios.colecciones;

import java.util.Arrays;
import java.util.List;
import java.util.NoSuchElementException;

public class Ejercicio18 {
    public static void main(String[] args) {
        List<Integer> listaNumeros = Arrays.asList(10,11,25,5,3,40);
        int maximo = listaNumeros.stream().mapToInt(n -> n) // requiere hacer mapeo de enteros
                .max()
                .orElseThrow(NoSuchElementException::new); // arroja excepcion
        int minimo = listaNumeros.stream().mapToInt(n -> n) // requiere hacer mapeo de enteros
                .min()
                .orElseThrow(NoSuchElementException::new); // arroja excepcion
        System.out.println("Lista: " + listaNumeros);
        System.out.println("Valor maximo: " + maximo);
        System.out.println("Valor minimo: " + minimo);
    }
}
