package com.tino.ejercicios.fechas;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

/**
 * Crea una lista de fechas que representen días festivos
 * y luego permite al usuario ingresar una fecha para verificar
 * si es un día festivo.
 */
public class Ejercicio18 {
    public static void main(String[] args) {
        String fecha = "2023-05-01";
        LocalDate localFecha = LocalDate.parse(fecha);
        List<LocalDate> listaDiasFestivos = new ArrayList<>();
        listaDiasFestivos.add(LocalDate.of(LocalDate.now().getYear(), Month.JANUARY, 1) );
        listaDiasFestivos.add(LocalDate.of(LocalDate.now().getYear(), Month.MAY, 1) );
        listaDiasFestivos.add(LocalDate.of(LocalDate.now().getYear(), Month.JULY, 28) );
        listaDiasFestivos.add(LocalDate.of(LocalDate.now().getYear(), Month.DECEMBER, 25) );
        listaDiasFestivos.add(LocalDate.of(LocalDate.now().getYear(), Month.DECEMBER, 31) );
        boolean esFestivo = listaDiasFestivos.contains(localFecha);
        System.out.println(esFestivo);
    }
}
