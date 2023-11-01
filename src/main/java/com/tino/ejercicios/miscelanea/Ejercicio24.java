package com.tino.ejercicios.miscelanea;

/**
 * Crea un programa que valide si una cadena es una URL válida siguiendo el formato adecuado.
 */
public class Ejercicio24 {
    public static void main(String[] args) {
        String sitioWeb = "https://misitio.ec";
        String regex = "[(https?)]+\\:+\\/+\\/+[a-z]+.[a-z]{2,3}.[a-z]{2,3}";
        System.out.println(sitioWeb.matches(regex));
    }
}
