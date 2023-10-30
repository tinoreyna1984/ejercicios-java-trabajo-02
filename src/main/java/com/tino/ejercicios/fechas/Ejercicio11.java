package com.tino.ejercicios.fechas;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

/**
 * Dada tu fecha de nacimiento, calcula la fecha de tu próximo cumpleaños
 * y muestra cuántos días faltan para ese día.
 */
public class Ejercicio11 {
    public static void main(String[] args) {
        String fechaNac = "1984-05-05";
        LocalDate localDate = LocalDate.parse(fechaNac);
        LocalDate proxCumple = localDate.plusYears(40);
        System.out.println("Mi proximo cumple: " + proxCumple.toString());
        Period period = Period.between(LocalDate.now(), proxCumple);
        System.out.println("Faltan " + ChronoUnit.DAYS.between(LocalDate.now(), proxCumple) +
                " dias para mi proximo cumple a partir de hoy " + LocalDate.now());
    }
}
