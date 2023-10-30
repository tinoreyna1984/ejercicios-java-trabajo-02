package com.tino.ejercicios.fechas;

import java.time.Year;

/**
 * Pide al usuario que ingrese un año y determina
 * si es un año bisiesto o no utilizando Year.isLeap().
 */
public class Ejercicio04 {
    public static void main(String[] args) {
        String anno = "2020";
        boolean esBisiesto = Year.isLeap(Long.valueOf(anno));
        System.out.println("El anno ingresado " + (esBisiesto ? "es bisiesto" : "no es bisiesto"));
    }
}
