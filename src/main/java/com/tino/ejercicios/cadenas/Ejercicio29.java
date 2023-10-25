package com.tino.ejercicios.cadenas;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import java.util.Base64;

/**
 * Escribe un programa que tome una cadena encriptada (por ejemplo, cifrado César)
 * y la desencripte para revelar el mensaje original.
 */
public class Ejercicio29 {
    public static void main(String[] args) {
        String cadena = "mi clave";
        try {
            System.out.println("cadena: " + cadena); // limpio
            byte[] encodedBytes = Base64.getEncoder().encode(cadena.getBytes("UTF-8"));
            System.out.println("encodedBytes: " + new String(encodedBytes)); // encriptado
            byte[] decoded = Base64.getDecoder().decode(encodedBytes);
            System.out.println("decoded: " + new String(decoded)); // decodificado, nuevamente limpio
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }
    }
}
