package com.tino.ejercicios.miscelanea;

import java.time.MonthDay;

/**
 * Crea un programa que, dado un mes y un día,
 * determine la estación del año correspondiente
 * (primavera, verano, otoño, invierno).
 */
public class Ejercicio21 {
    public static void main(String[] args) {
        MonthDay md = MonthDay.of(2, 15); // fecha a evaluar
        if(md.isAfter(MonthDay.of(3, 19)) && md.isBefore(MonthDay.of(6, 21))){
            System.out.println("Estamos en otonno");
        } else if (md.isAfter(MonthDay.of(6, 20)) && md.isBefore(MonthDay.of(9, 22))) {
            System.out.println("Estamos en invierno");
        } else if (md.isAfter(MonthDay.of(9, 21)) && md.isBefore(MonthDay.of(12, 21))) {
            System.out.println("Estamos en primavera");
        } else {
            System.out.println("Estamos en verano");
        }
    }
}
