package com.tino.ejercicios.colecciones;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Realiza operaciones como filtrado, transformación
 * y agregación en un mapa de elementos usando streams.
 */
public class Ejercicio25 {
    public static void main(String[] args) {
        Map<Integer, String> items = new HashMap<>();
        items.put(1, "uno");
        items.put(2, "dos");
        items.put(3, "tres");
        items.put(4, "cuatro");
        items.put(5, "cinco");
        items.put(6, "seis");
        items.put(7, "siete");
        items.put(8, "ocho");
        items.put(9, "nueve");
        items.put(10, "diez");
        Map<Integer, String> filtrarMap = items.entrySet().stream()
                .filter(e -> e.getKey() != 2 && e.getKey() != 5)
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
        for (Integer i: filtrarMap.keySet()) {
            System.out.println(filtrarMap.get(i));
        }
        Map<Integer, String> transformarMap = items.entrySet().stream()
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        e -> e.getValue().toUpperCase()
                ));
        for (Integer i: transformarMap.keySet()) {
            System.out.println(transformarMap.get(i));
        }
        Map<Integer, String> newItems = new HashMap<>();
        newItems.put(11, "once");
        newItems.put(12, "doce");
        Map<Integer, String> agregarMap = new HashMap<>();
        agregarMap.putAll(items);
        agregarMap.putAll(newItems);
        for (Integer i: agregarMap.keySet()) {
            System.out.println(agregarMap.get(i));
        }
    }
}
