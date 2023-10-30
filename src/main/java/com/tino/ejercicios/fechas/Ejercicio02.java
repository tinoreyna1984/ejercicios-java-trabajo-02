package com.tino.ejercicios.fechas;

import java.time.LocalDate;

/**
 * Dada una fecha, permite al usuario ingresar un número de días
 * y luego suma o resta ese número de días a la fecha original utilizando LocalDate.
 */
public class Ejercicio02 {
    public static void main(String[] args) {
        int numDias = 15;
        String fecha = "2023-05-05";
        LocalDate ld = LocalDate.parse(fecha).plusDays(numDias); // sumo 15 dias
        System.out.println("Fecha proxima: " + ld.toString());
    }
}
