package com.tino.ejercicios.regex;

/**
 * Escribe un programa que valide tanto
 * direcciones IPv4 como IPv6
 * utilizando expresiones regulares.
 */
public class Ejercicio13 {
    public static void main(String[] args) {
        String direccionIP = "192.168.20.10";
        String regex = "([^a-z]{1,3}\\.)+([^a-z]{1,3}\\.)+([^a-z]{1,3}\\.)+([^a-z]{1,3})";
        // primero se verifica que sea valida segun la regex
        boolean esValido = direccionIP.matches(regex);
        if(esValido){
            String[] valoresIP = direccionIP.split(".");
            // luego se verifica que sea valida segun los valores en la direccion IP
            for (String numero: valoresIP) {
                if(numero.startsWith("0")) {
                    break;
                }
                if(Integer.valueOf(numero) < 0 || Integer.valueOf(numero) > 255) {
                    break;
                }
            }
            System.out.println("La direccion IP es valida");
        }
        else System.out.println("La direccion IP no es valida");
    }
}
