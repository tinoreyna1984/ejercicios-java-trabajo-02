package com.tino.ejercicios.cadenas;

public class Ejercicio04 {
    public static void main(String[] args) {
        String correo = "correo@mail.com";
        boolean esCorreo = correo.matches("[A-Za-z0-9_.]+@[A-Za-z0-9-.]\\w+\\.[A-Za-z]\\w{2,3}");
        System.out.println("Texto: " + correo);
        if(esCorreo){
            System.out.println("El texto es una dirección de correo válida");
        }
        else {
            System.out.println("El texto no es una dirección de correo válida");
        }
    }
}
