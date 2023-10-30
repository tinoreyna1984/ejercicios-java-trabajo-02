package com.tino.ejercicios.fechas;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

/**
 * Dada una fecha, determina el día de la semana correspondiente
 * (por ejemplo, lunes, martes, etc.) utilizando DayOfWeek.
 */
public class Ejercicio08 {
    public static void main(String[] args) {
        String fecha = "17/06/2014";
        Locale locale = new Locale("es", "PE");
        LocalDate ld = LocalDate.parse(fecha, DateTimeFormatter.ofPattern("dd/MM/yyyy", locale));
        DateTimeFormatter df = DateTimeFormatter.ofPattern("EEEE, dd MMMM, yyyy");
        System.out.println(df.format(ld));
    }
}
