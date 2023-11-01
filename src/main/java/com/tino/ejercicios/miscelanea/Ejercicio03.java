package com.tino.ejercicios.miscelanea;

import java.util.ArrayList;
import java.util.List;

/**
 * Escribe un programa que cuente cuántas veces
 * aparece un elemento específico en una lista.
 */
public class Ejercicio03 {
    public static void main(String[] args) {
        String texto = "Elemento";
        List<String> listaElementos = new ArrayList<>();
        listaElementos.add("Este");
        listaElementos.add("es");
        listaElementos.add("un");
        listaElementos.add("elemento");
        listaElementos.add("y");
        listaElementos.add("este");
        listaElementos.add("es");
        listaElementos.add("otro");
        listaElementos.add("elemento");
        Long ocurrencias = listaElementos.stream().filter(s -> s.equalsIgnoreCase("elemento")).count();
        System.out.println("La palabra \"" + texto + "\" ocurre " + ocurrencias + " veces");
    }
}
