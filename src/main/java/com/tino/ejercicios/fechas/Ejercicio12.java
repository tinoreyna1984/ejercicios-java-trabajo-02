package com.tino.ejercicios.fechas;

import java.time.LocalDate;
import java.time.Period;

/**
 * Pide al usuario que ingrese una fecha pasada
 * y muestra cuánto tiempo ha transcurrido en años, meses y días
 * desde esa fecha hasta la fecha actual.
 */
public class Ejercicio12 {
    public static void main(String[] args) {
        String fechaPasada = "2015-04-11";
        LocalDate localPasada = LocalDate.parse(fechaPasada);
        Period periodo = Period.between(localPasada, LocalDate.now());
        System.out.println("Tiempo transcurrido:");
        System.out.println(periodo.getYears() + " annos, " + periodo.getMonths() + " meses, " + periodo.getDays() + " dias");
    }
}
