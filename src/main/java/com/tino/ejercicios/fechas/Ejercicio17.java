package com.tino.ejercicios.fechas;

import java.time.LocalDate;
import java.time.YearMonth;

/**
 * Encuentra y muestra la fecha del primer
 * y último día del mes actual utilizando LocalDate.
 */
public class Ejercicio17 {
    public static void main(String[] args) {
        YearMonth yearMonth = YearMonth.now();
        LocalDate inicio = yearMonth.atDay(1);
        LocalDate fin = yearMonth.atEndOfMonth();
        System.out.println(inicio.toString());
        System.out.println(fin.toString());
    }
}
