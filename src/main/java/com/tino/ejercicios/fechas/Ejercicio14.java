package com.tino.ejercicios.fechas;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.YearMonth;
import java.time.temporal.TemporalAdjusters;

/**
 * Calcula la fecha del próximo viernes 13 utilizando TemporalAdjusters
 * y muestra cuántos días faltan para llegar a ese día.
 */
public class Ejercicio14 {
    public static void main(String[] args) {
        LocalDate viernes13 = LocalDate.now();
        while(viernes13.getDayOfMonth() != 13){ // mientras no llegue el dia 13
            viernes13 = viernes13
                    .plusDays(1) // itera un dia por ciclo
                    .with(TemporalAdjusters.next(DayOfWeek.FRIDAY)); // asegura que sea dia viernes
        }
        System.out.println(viernes13.toString() + " cae " + viernes13.getDayOfWeek()); // 2024-09-13
    }
}
