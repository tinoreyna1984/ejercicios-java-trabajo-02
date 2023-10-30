package com.tino.ejercicios.fechas;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 * Pide al usuario una fecha en un formato específico
 * (por ejemplo, "dd/MM/yyyy") y luego convierte
 * esa fecha al formato "yyyy-MM-dd" utilizando DateTimeFormatter.
 */
public class Ejercicio06 {
    public static void main(String[] args) {
        String fecha = "02/08/2014";
        LocalDate ld = LocalDate.parse(fecha, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        DateTimeFormatter df = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        df.format(ld); // aqui se hace el cambio de formato
        System.out.println(ld.toString());
    }
}
