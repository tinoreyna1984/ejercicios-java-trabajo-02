package com.tino.ejercicios.fechas;

import java.time.LocalDate;

/**
 * Dada una fecha, muestra el cronograma de la semana correspondiente,
 * es decir, los siete días de la semana con fechas.
 */
public class Ejercicio09 {
    public static void main(String[] args) {
        String fecha = "2014-05-01";
        LocalDate ld = LocalDate.parse(fecha);
        System.out.println(ld.getDayOfWeek());
        for (int i = 1; i < 7; i++) {
            System.out.println(ld.plusDays(i).getDayOfWeek());
        }
    }
}
