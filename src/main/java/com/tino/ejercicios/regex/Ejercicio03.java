package com.tino.ejercicios.regex;

/**
 * Crea un programa que valide si una cadena es una URL válida
 * según el estándar. Debería verificar si comienza
 * con "http://" o "https://", seguido de dominio y ruta válidos.
 */
public class Ejercicio03 {
    public static void main(String[] args) {
        String sitio = "https://misitio.com.pe";
        String regex = "[(https?)]+\\:+\\/+\\/+[a-z]+.[a-z]{2,3}+(.[a-z]{2})?"; // los dos ultimos caracteres son del pais
        boolean esValido = sitio.matches(regex);
        System.out.println("esValido = " + esValido);
    }
}
