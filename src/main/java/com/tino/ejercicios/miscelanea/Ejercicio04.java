package com.tino.ejercicios.miscelanea;

import java.time.LocalDate;
import java.time.Period;

/**
 * Dada una fecha de nacimiento,
 * crea un programa que calcule la edad de una persona en años.
 */
public class Ejercicio04 {
    public static void main(String[] args) {
        String fechaNac = "1984-05-05";
        LocalDate ldFechaNac = LocalDate.parse(fechaNac);
        Period period = Period.between(ldFechaNac, LocalDate.now());
        System.out.println("Edad al dia de hoy: " + period.getYears() + " annos");
    }
}
