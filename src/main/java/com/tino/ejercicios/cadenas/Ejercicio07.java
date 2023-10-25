package com.tino.ejercicios.cadenas;

/**
 * Escribe un programa que cuente cuántas letras mayúsculas y
 * cuántas letras minúsculas hay en una cadena.
 */

public class Ejercicio07 {

    private static boolean esLetraMayuscula(char c){
        char[] letrasMay = {
                'A', 'B', 'C', 'D', 'E',
                'F', 'G', 'H', 'I', 'J',
                'K', 'L', 'M', 'N', 'O',
                'P', 'Q', 'R', 'S', 'T',
                'U', 'V', 'W', 'X', 'Y',
                'Z'
        };
        for (int i = 0; i < letrasMay.length; i++) {
            if(c == letrasMay[i])
                return true;
        }
        return false;
    }

    public static void main(String[] args) {
        String texto = "Mi nombre es Tino Reyna y vivo en Guayaquil";
        char[] caracteres = texto.toCharArray();
        int mayusculas = 0, minusculas = 0;

        for (int i = 0; i < caracteres.length; i++) {
            if(esLetraMayuscula(caracteres[i])) mayusculas++;
            else minusculas++;
        }
        System.out.println("Texto: " + texto);
        System.out.println("Cantidad de letras mayusculas en el texto: " + mayusculas);
        System.out.println("Cantidad de letras minusculas en el texto: " + minusculas);
    }
}
