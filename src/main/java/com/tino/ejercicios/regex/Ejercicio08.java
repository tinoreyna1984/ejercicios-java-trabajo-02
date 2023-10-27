package com.tino.ejercicios.regex;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

/**
 * Crea un programa que valide fechas en formato "dd/mm/aaaa".
 * Asegúrate de que las fechas sean válidas en términos de días y meses.
 */
public class Ejercicio08 {
    public static void main(String[] args) {
        String fecha = "10/12/2015";
        String regex = "([^a-z]{2})+\\/+([^a-z]{2})+\\/+([^a-z]{4})";
        boolean esValido = fecha.matches(regex);
        if(esValido){
            DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
            df.setLenient(false);
            try {
                df.parse(fecha);
            } catch (ParseException e) {
                System.out.println("Fecha no valida");
                System.exit(0);
            }
            System.out.println("Fecha valida");
        }
        else System.out.println("Fecha no valida");
    }
}
