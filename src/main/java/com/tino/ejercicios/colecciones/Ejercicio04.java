package com.tino.ejercicios.colecciones;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Toma una lista de objetos personalizados
 * y ordénalos en base a un campo específico
 * (por ejemplo, edad, nombre, fecha).
 */

class Persona {
    private String nombre;
    private String apellido;
    private int edad;

    public Persona() {
    }

    public Persona(String nombre, String apellido, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}

public class Ejercicio04 {
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
        listaPersonas.sort(Comparator.comparing(Persona::getApellido)); // ordeno por apellido
        for(Persona p: listaPersonas){
            System.out.println((listaPersonas.indexOf(p) + 1) + ": " + p.getApellido() + ", " + p.getNombre() + ". Edad: " + p.getEdad());
        }
    }
}
