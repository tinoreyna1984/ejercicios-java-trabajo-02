package com.tino.ejercicios.fechas;


import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.YearMonth;
import java.time.temporal.TemporalAdjusters;

/**
 * Dado un mes y un año, encuentra y muestra la fecha
 * del primer día laborable (día hábil) del mes utilizando TemporalAdjusters.
 */
public class Ejercicio10 {
    public static void main(String[] args) {
        String fecha = "2017-04";
        YearMonth yearMonth = YearMonth.parse(fecha);
        LocalDate localDate = yearMonth
                .atDay(1) // comienzo con el primer dia del mes del yearMonth
                .with(TemporalAdjusters.firstInMonth(DayOfWeek.MONDAY)); // busco que sea lunes
        System.out.println(localDate.toString()); // 2017-04-03
    }
}
