package com.tino.ejercicios.cadenas;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

/**
 * Escribe un programa que verifique si una cadena dada
 * representa una fecha válida en un formato específico
 * (por ejemplo, "dd/mm/aaaa" o "mm/dd/aaaa").
 */
public class Ejercicio32 {
    private static boolean esFechaValida(String fecha, String formato){
        DateFormat df = new SimpleDateFormat(formato);
        df.setLenient(false);
        try {
            df.parse(fecha);
        } catch (ParseException e) {
            return false;
        }
        return true;
    }
    public static void main(String[] args) {
        String fecha = "99/10/2015";
        String formatoFecha = "dd/MM/yyyy";
        if(esFechaValida(fecha, formatoFecha)) System.out.println("La fecha tiene el formato valido");
        else System.out.println("La fecha no tiene el formato valido");
    }
}
