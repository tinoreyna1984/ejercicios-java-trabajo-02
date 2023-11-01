package com.tino.ejercicios.colecciones;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 * Si tienes una lista de eventos con fechas,
 * usa streams para filtrar los eventos que
 * ocurran en un rango de fechas específico.
 */
public class Ejercicio12 {
    public static void main(String[] args) {
        List<LocalDate> eventos = new ArrayList<>();
        eventos.add(LocalDate.of(2023, 11, 1));
        eventos.add(LocalDate.of(2023, 11, 15));
        eventos.add(LocalDate.of(2023, 11, 16));
        eventos.add(LocalDate.of(2023, 11, 18));
        eventos.add(LocalDate.of(2023, 12, 7));
        eventos.add(LocalDate.of(2023, 12, 12));
        eventos.add(LocalDate.of(2024, 1, 7));
        eventos.add(LocalDate.of(2024, 1, 15));
        eventos.add(LocalDate.of(2024, 2, 8));
        eventos.add(LocalDate.of(2024, 2, 23));
        eventos.add(LocalDate.of(2024, 3, 10));
        List<LocalDate> evEspecificos =
                eventos.parallelStream()
                .filter(
                    ev -> (
                        ev.isAfter(LocalDate.of(2023,11,14))
                        && ev.isBefore(LocalDate.of(2024,2,9))
                    )
                ) // filtro por rango de fechas especifico
                .toList();
        for (LocalDate fecha: evEspecificos){
            System.out.println(fecha.toString());
        }
    }
}
