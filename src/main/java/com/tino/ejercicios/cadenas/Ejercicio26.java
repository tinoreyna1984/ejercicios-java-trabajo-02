package com.tino.ejercicios.cadenas;

import java.text.DecimalFormat;

/**
 * Escribe un programa que tome un número y lo formatee
 * como una cadena con comas para separar miles y dos decimales.
 * Por ejemplo, 1234567.89 debería formatearse como "1,234,567.89".
 */
public class Ejercicio26 {
    public static void main(String[] args) {
        Double numDecimal = 1234567.89;
        String numDecCadena = String.format("%,.2f", numDecimal);
        System.out.println("numDecCadena = " + numDecCadena);
    }
}
