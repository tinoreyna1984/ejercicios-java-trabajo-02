package com.tino.ejercicios.fechas;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

/**
 * Dada la fecha y hora de inicio y la fecha y hora
 * de finalización de un evento, calcula la duración
 * del evento en horas y minutos.
 */
public class Ejercicio15 {
    public static void main(String[] args) {
        LocalDateTime ldt01 = LocalDateTime.of(2023, 11, 14, 15, 00);
        LocalDateTime ldt02 = LocalDateTime.of(2023, 11, 14, 17, 45);
        long horas = ChronoUnit.HOURS.between(ldt01, ldt02);
        long minutos = ChronoUnit.MINUTES.between(ldt01, ldt02.minusMinutes(horas*60));
        System.out.println("Duracion del evento: " + horas + " horas y " + minutos + " minutos");
    }
}
