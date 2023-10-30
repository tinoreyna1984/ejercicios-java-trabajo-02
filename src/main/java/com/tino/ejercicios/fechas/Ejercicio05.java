package com.tino.ejercicios.fechas;

import java.text.ParseException;
import java.time.YearMonth;

/**
 * Dada una fecha, encuentra y muestra
 * el último día del mes correspondiente
 * utilizando YearMonth.
 */
public class Ejercicio05 {
    public static void main(String[] args) {
        String fecha = "2018-06-17";
        YearMonth ym = YearMonth.parse(fecha.substring(0, 7)); // parseo 2018-06
        System.out.println("Ultima fecha del mes de la fecha ingresada: " + ym.atEndOfMonth().getDayOfMonth());
    }
}
