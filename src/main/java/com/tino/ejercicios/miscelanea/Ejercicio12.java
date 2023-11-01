package com.tino.ejercicios.miscelanea;
/**
 * Desarrolla un programa que valide si una cadena
 * sigue un formato de fecha específico, como "dd/mm/yyyy".
 */
public class Ejercicio12 {
    public static void main(String[] args) {
        String fecha = "30/10/2023";
        String regex = "([^a-z]{2})+\\/+([^a-z]{2})+\\/+([^a-z]{4})";
        System.out.println(fecha.matches(regex));
    }
}
