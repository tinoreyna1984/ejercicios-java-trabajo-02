package com.tino.ejercicios.colecciones;

import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Convierte un mapa en una lista de objetos personalizados,
 * donde cada objeto representa una entrada de mapa.
 */
class Elemento {
    private int id;
    private String descripcion;

    public Elemento(int id, String descripcion) {
        this.id = id;
        this.descripcion = descripcion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
public class Ejercicio20 {
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
        List<Elemento> listaElementos = items.entrySet() // genera un set a partir del map
                .stream()
                .sorted(Comparator.comparing(e -> e.getKey())) // ordeno por clave
                .map(e -> new Elemento(e.getKey(), e.getValue())) // mapeo convirtiendo cada entrada del map a una instancia de Elemento
                .toList(); // exporto a lista
        listaElementos.forEach(e -> {
            System.out.println("ID: " + e.getId() + ", Descr: " + e.getDescripcion());
        });
    }
}
