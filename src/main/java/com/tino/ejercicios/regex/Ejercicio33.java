package com.tino.ejercicios.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Escribe un programa que valide números de
 * tarjetas de crédito Visa y MasterCard
 * utilizando las reglas de validación de estos dos tipos de tarjetas.
 */
public class Ejercicio33 {
    public static void main(String[] args) {
        String voucher = "Card: 5415 5512 1026 0013";
        String regex = "([0-9]{4}\\s){3}([0-9]{4})";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(voucher);
        if (matcher.find()){
            String card = matcher.group();
            System.out.println(voucher);
            if(card.startsWith("4")){
                System.out.println("La tarjeta es Visa");
            } else if (Integer.valueOf(card.substring(0,2)) >= 51 && Integer.valueOf(card.substring(0,2)) <= 55) {
                System.out.println("La tarjeta es Mastercard");
            }
            else System.out.println("La tarjeta pertenece a otro sistema de pagos o no es valida");
        }
    }
}
