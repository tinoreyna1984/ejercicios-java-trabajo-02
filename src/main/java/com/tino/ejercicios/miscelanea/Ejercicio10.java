package com.tino.ejercicios.miscelanea;

/**
 * Crea un programa que verifique si una cadena dada
 * es una dirección de correo electrónico válida.
 */
public class Ejercicio10 {
    public static void main(String[] args) {
        String correo = "tinoreyna198@gmail.com";
        String regex = "\\w[a-z0-9_.]+@[a-z0-9_.]+.[a-z]{2,3}.[a-z]{2,3}";
        System.out.println(correo.matches(regex));
    }
}
