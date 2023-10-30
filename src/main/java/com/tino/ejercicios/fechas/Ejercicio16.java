package com.tino.ejercicios.fechas;

import java.time.LocalDate;
import java.time.Month;

/**
 * Dada una fecha, encuentra y muestra el último día del trimestre
 * (marzo, junio, septiembre o diciembre) correspondiente.
 */
public class Ejercicio16 {
    public static void main(String[] args) {
        LocalDate localFecha = LocalDate.of(2015, Month.JULY, 9);
        int mesFinalSemestre = 0, diaFinalSemestre = 0, anno = localFecha.getYear();
        if(localFecha.getMonthValue() <= 3){
            mesFinalSemestre = 3;
            diaFinalSemestre = 31;
        } else if (localFecha.getMonthValue() <= 6) {
            mesFinalSemestre = 6;
            diaFinalSemestre = 30;
        } else if (localFecha.getMonthValue() <= 9) {
            mesFinalSemestre = 9;
            diaFinalSemestre = 30;
        } else {
            mesFinalSemestre = 12;
            diaFinalSemestre = 31;
        }
        LocalDate finSemestre = LocalDate.of(anno, mesFinalSemestre, diaFinalSemestre);
        System.out.println(finSemestre.toString());
    }
}
