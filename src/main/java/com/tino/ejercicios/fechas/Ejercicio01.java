package com.tino.ejercicios.fechas;

import java.time.LocalDate;
import java.time.Period;

/**
 * Dadas dos fechas, calcula la diferencia en días
 * entre ellas utilizando LocalDate.
 * Por ejemplo, la diferencia entre "2023-10-28" y "2023-11-10".
 */
public class Ejercicio01 {
    public static void main(String[] args) {
        LocalDate ld01 = LocalDate.parse("2023-10-28");
        LocalDate ld02 = LocalDate.parse("2023-11-10");
        Period period = Period.between(ld01, ld02);
        System.out.println("Días entre las fechas: " + period.getDays());
    }
}
