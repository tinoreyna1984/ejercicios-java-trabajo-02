package com.tino.ejercicios.fechas;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.temporal.ChronoUnit;

/**
 * Dadas dos marcas de tiempo, calcula el tiempo transcurrido
 * entre ellas en horas, minutos y segundos utilizando LocalDateTime.
 */
public class Ejercicio07 {
    public static void main(String[] args) {
        String marca01 = "2015-08-03T10:15:30";
        String marca02 = "2015-08-12T14:23:10";
        LocalDateTime ld01 = LocalDateTime.parse(marca01);
        LocalDateTime ld02 = LocalDateTime.parse(marca02);
        System.out.println("Tiempo transcurrido: " +
                ld01.until(ld02, ChronoUnit.HOURS) + " horas, " +
                ld01.until(ld02, ChronoUnit.MINUTES) + " minutos y " +
                ld01.until(ld02, ChronoUnit.SECONDS) + " segundos");
    }
}
