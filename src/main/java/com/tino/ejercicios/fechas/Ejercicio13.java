package com.tino.ejercicios.fechas;

import java.time.LocalDate;
import java.time.Period;

/**
 * Pide al usuario que ingrese una fecha
 * y determina si esa fecha está en el pasado,
 * presente o futuro en relación con la fecha actual.
 */
public class Ejercicio13 {
    public static void main(String[] args) {
        LocalDate fecha = LocalDate.of(2023, 10, 30);
        Period periodo = Period.between(fecha, LocalDate.now());
        int dias = periodo.getDays();
        if(dias > 0){
            System.out.println("La fecha esta en el futuro");
        }
        if(dias < 0){
            System.out.println("La fecha esta en el pasado");
        }
        else System.out.println("La fecha esta en el presente");
    }
}
