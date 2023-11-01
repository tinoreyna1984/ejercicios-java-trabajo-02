package com.tino.ejercicios.miscelanea;

import java.time.LocalDate;
import java.time.Period;
import java.time.YearMonth;

/**
 * Escribe un programa que, dado un mes y un año,
 * calcule el número de días en ese mes
 * (teniendo en cuenta si es un año bisiesto).
 */
public class Ejercicio20 {
    public static void main(String[] args) {
        String annoMes = "2017-04";
        YearMonth ym = YearMonth.parse(annoMes);
        LocalDate ld01 = ym.atDay(1).minusDays(1);
        LocalDate ld02 = ym.atEndOfMonth();
        Period period = Period.between(ld01, ld02);
        System.out.println(period.getDays());
    }
}
