package com.tino.ejercicios.miscelanea;

/**
 * Desarrolla un programa que verifique si una cadena representa una dirección IP válida.
 */
public class Ejercicio22 {
    public static void main(String[] args) {
        String direccionIP = "192.168.2.10";
        String regex = "([^a-z]{1,3}\\.)+([^a-z]{1,3}\\.)+([^a-z]{1,3}\\.)+([^a-z]{1,3})";
        System.out.println(direccionIP.matches(regex));
    }
}
