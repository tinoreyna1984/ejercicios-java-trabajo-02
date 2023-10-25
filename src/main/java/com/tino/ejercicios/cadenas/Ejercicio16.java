package com.tino.ejercicios.cadenas;

import java.io.UnsupportedEncodingException;
import java.util.Base64;

/**
 * Escribe un programa que tome una cadena y la encripte de alguna manera.
 * Puedes usar cifrado César o cualquier otro método de tu elección.
 */
public class Ejercicio16 {
    public static void main(String[] args) {
        String cadena = "mi clave";
        try {
            byte[] encodedBytes = Base64.getEncoder().encode(cadena.getBytes("UTF-8"));
            System.out.println("cadena: " + cadena);
            System.out.println("encodedBytes: " + new String(encodedBytes));
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }
    }
}
