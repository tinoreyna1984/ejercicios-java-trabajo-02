package com.tino.ejercicios.miscelanea;

import java.time.LocalDate;

/**
 * Escribe un programa que determine si
 * una fecha dada está dentro de un rango
 * de fechas especificado.
 */
public class Ejercicio05 {
    public static void main(String[] args) {
        LocalDate ld01 = LocalDate.parse("2015-06-17");
        LocalDate ld02 = LocalDate.parse("2015-07-25");
        LocalDate ldPrueba = LocalDate.parse("2015-07-02");
        if(!(ldPrueba.isBefore(ld01) && ldPrueba.isAfter(ld02))){
            System.out.println("La fecha presentada pertenece al rango");
        }
        else System.out.println("La fecha presentada no pertenece al rango");
    }
}
