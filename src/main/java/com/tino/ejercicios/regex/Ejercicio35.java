package com.tino.ejercicios.regex;

/**
 * Crea un programa que valide direcciones MAC (Media Access Control)
 * en formato hexadecimal, como "00:1A:2B:3C:4D:5E
 */
public class Ejercicio35 {
    public static void main(String[] args) {
        String direccionMac = "00:1A:2B:3C:4D:5E";
        String regex = "([0-9a-fA-F]{2}:){5}([0-9a-fA-F]{2})";
        System.out.println(direccionMac.matches(regex));
    }
}
