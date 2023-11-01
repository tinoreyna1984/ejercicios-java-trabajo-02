package com.tino.ejercicios.colecciones;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * Ordena una lista de objetos personalizados en base a
 * múltiples atributos o reglas de ordenación personalizadas.
 */
public class Ejercicio24 {
    public static void main(String[] args) {
        Persona p01 = new Persona("Tino", "Reyna", 39);
        Persona p02 = new Persona("Gabriela", "Lorentzen", 33);
        Persona p03 = new Persona("Pepe", "Trueno", 31);
        Persona p04 = new Persona("Pocho", "Pazos", 25);
        Persona p05 = new Persona("Julio", "Garrido", 35);
        List<Persona> listaPersonas = new ArrayList<>();
        listaPersonas.add(p01);
        listaPersonas.add(p02);
        listaPersonas.add(p03);
        listaPersonas.add(p04);
        listaPersonas.add(p05);
        listaPersonas.sort(Comparator.comparing(Persona::getApellido) // ordeno por apellido
                .thenComparing(Persona::getEdad)); // luego ordeno por edad
        for(Persona p: listaPersonas){
            System.out.println((listaPersonas.indexOf(p) + 1) + ": " + p.getApellido() + ", " + p.getNombre() + ". Edad: " + p.getEdad());
        }
    }
}
