package com.tino.ejercicios.cadenas;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * Dada una cadena que contiene nombres en el formato "Apellido, Nombre", escribe un programa
 * que la formatee en el formato "Nombre Apellido".
 */
public class Ejercicio05 {
    public static void main(String[] args) {
        String nombreOriginal = "Reyna, Tino";
        String[] valores = nombreOriginal.split(", ");
        List<String> listaValores = Arrays.stream(valores).sorted(Comparator.reverseOrder()).toList();
        String[] valoresReordenados = {};
        valoresReordenados = listaValores.toArray(valoresReordenados);
        String nombreFormateado = String.join(" ", valoresReordenados);
        System.out.println("Nombre original: " + nombreOriginal);
        System.out.println("Nombre formateado: " + nombreFormateado);
    }
}
