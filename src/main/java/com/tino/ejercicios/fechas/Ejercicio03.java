package com.tino.ejercicios.fechas;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

/**
 * Dada la fecha de nacimiento de una persona,
 * calcula su edad en años, meses y días.
 * Puedes utilizar LocalDate para esto.
 */
public class Ejercicio03 {
    public static void main(String[] args) {
        String fechaNac = "05/05/1984";
        LocalDate ld = LocalDate.parse(fechaNac, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        Period period = Period.between(ld, LocalDate.now());
        System.out.println("Mi edad actual es " + period.getYears() + " annos");
    }
}
