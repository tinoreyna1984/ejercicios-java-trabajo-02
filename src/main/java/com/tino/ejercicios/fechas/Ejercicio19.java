package com.tino.ejercicios.fechas;

import java.time.ZoneId;
import java.time.ZonedDateTime;

/**
 * Dada una marca de tiempo en una zona horaria específica,
 * permite al usuario convertirla a otra zona horaria utilizando ZonedDateTime.
 */
public class Ejercicio19 {
    public static void main(String[] args) {
        ZonedDateTime fechaHoraLocal = ZonedDateTime.now();
        ZonedDateTime fechaOtroLugar = fechaHoraLocal.withZoneSameInstant(ZoneId.of("America/Argentina/Buenos_Aires"));
        System.out.println(fechaHoraLocal.toString());
        System.out.println(fechaOtroLugar.toString());
    }
}
