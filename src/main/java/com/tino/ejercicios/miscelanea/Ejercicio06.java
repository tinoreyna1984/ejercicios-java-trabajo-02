package com.tino.ejercicios.miscelanea;

import java.time.Duration;
import java.time.LocalDateTime;

/**
 * Desarrolla un programa que calcule
 * la duración en días entre dos fechas dadas.
 */
public class Ejercicio06 {
    public static void main(String[] args) {
        LocalDateTime ld01 = LocalDateTime.parse("2016-06-04T00:00:00");
        LocalDateTime ld02 = LocalDateTime.parse("2016-06-10T23:59:59");
        Duration duration = Duration.between(ld01, ld02);
        System.out.println("Duracion en dias: " + duration.getSeconds()/(3600*24)); // dias (24h)
    }
}
