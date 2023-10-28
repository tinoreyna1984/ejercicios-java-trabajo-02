package com.tino.ejercicios.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Dado un texto que puede contener números de tarjetas de crédito,
 * extrae y enmascara esos números, dejando solo los últimos cuatro dígitos visibles.
 */
public class Ejercicio16 {
    public static void main(String[] args) {
        String voucher = "Card: 4215 5512 1026 0013";
        String regex = "([0-9]{4}\\s){3}([0-9]{4})";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(voucher);
        if (matcher.find()){
            String card = matcher.group();
            String[] porciones = card.split(" ");
            for (int i = 0; i < porciones.length - 1; i++) { // solo las tres primeras partes
                porciones[i] = porciones[i].replace(porciones[i].substring(0,4), "****");
            }
            String nuevaTarjeta = String.join(" ", porciones);
            System.out.println("Tarjeta: " + card);
            System.out.println("Enmascarada: " + nuevaTarjeta);
        }
    }
}
