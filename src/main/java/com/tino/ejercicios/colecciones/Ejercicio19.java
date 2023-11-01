package com.tino.ejercicios.colecciones;

import java.util.Arrays;
import java.util.List;

/**
 * Dada una lista de cadenas, usa streams para filtrar las cadenas
 * que contienen un patrón o palabra clave específicos.
 */
public class Ejercicio19 {
    public static void main(String[] args) {
        List<String> listaPalabras = Arrays.asList("192.168.10.15", "2A:3F:10:F1:11:25", "172.10.0.15", "255.255.255.0", "hola");
        String regex = "([^a-z]{1,3}\\.)+([^a-z]{1,3}\\.)+([^a-z]{1,3}\\.)+([^a-z]{1,3})";
        System.out.println("Lista original: " + listaPalabras);
        List<String> listaIPs = listaPalabras.stream().filter(p -> p.matches(regex)).toList();
        System.out.println("Lista de IPs: " + listaIPs);
    }
}
