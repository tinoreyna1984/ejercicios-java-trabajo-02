package com.tino.ejercicios.regex;

/**
 * Escribe un programa que tome una dirección de correo electrónico como entrada
 * y utilice una expresión regular para verificar si la dirección de correo electrónico es válida.
 */
public class Ejercicio01 {
    public static void main(String[] args) {
        String direccionCorreo = "correo@mail.com.ec";
        String regex = "\\w[a-z0-9_.]+@[a-z0-9_.]+.[a-z]{2,3}.[a-z]{2,3}";
        boolean esValida = direccionCorreo.matches(regex);
        System.out.println("esValida = " + esValida); // true o false
    }
}
