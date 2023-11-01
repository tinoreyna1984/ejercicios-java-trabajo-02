package com.tino.ejercicios.colecciones;

import java.util.Arrays;
import java.util.List;

/**
 * Escribe un programa que filtre elementos nulos y no nulos en una lista usando streams.
 */
public class Ejercicio26 {
    public static void main(String[] args) {
        List<Elemento> listaElementos = Arrays.asList(
                new Elemento(1, "uno"),
                new Elemento(2, "dos"),
                new Elemento(3, null),
                new Elemento(4, "cuatro"),
                new Elemento(5, null)
        );
        List<Elemento> elementosConNull = listaElementos.stream()
                .filter(e -> e.getDescripcion() == null)
                .toList();
        for (Elemento e: elementosConNull) {
            System.out.println(e.getId() + " tiene \"null\"");
        }
    }
}
