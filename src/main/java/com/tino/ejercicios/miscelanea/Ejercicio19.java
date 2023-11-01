package com.tino.ejercicios.miscelanea;

import java.time.LocalDate;

/**
 * Desarrolla un programa que, dada una fecha de inicio
 * y un número de días, calcule la fecha resultante
 * después de ese número de días.
 */
public class Ejercicio19 {
    public static void main(String[] args) {
        String fechaInicio = "2023-11-02";
        long numDias = 15;
        LocalDate ld = LocalDate.parse(fechaInicio);
        LocalDate ld02 = ld.plusDays(numDias);
        System.out.println(ld02.toString());
    }
}
