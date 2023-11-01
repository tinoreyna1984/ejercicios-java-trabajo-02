package com.tino.ejercicios.miscelanea;

/**
 * Escribe un programa que compruebe si una cadena cumple
 * con ciertos criterios de seguridad para contraseñas,
 * como contener al menos una letra mayúscula,
 * una letra minúscula, un número y un carácter especial.
 */
public class Ejercicio23 {
    public static void main(String[] args) {
        String contrasenna = "P@s$w0rd";
        String regex = "^(?=.{8,})(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])(?=.*[@#$%^&+=]).*$";
        System.out.println(contrasenna.matches(regex));
    }
}
