package com.tino.ejercicios.cadenas;

/**
 * Escribe un programa que tome una cadena y reemplace todos
 * los caracteres especiales (por ejemplo, !, @, #, $, %) por guiones.
 */
public class Ejercicio06 {
    private static boolean caracterEspecial(char c){
        char[] normalChars = {
                'a', 'b', 'c', 'd', 'e',
                'f', 'g', 'h', 'i', 'j',
                'k', 'l', 'm', 'n', 'o',
                'p', 'q', 'r', 's', 't',
                'u', 'v', 'w', 'x', 'y',
                'z',
                'A', 'B', 'C', 'D', 'E',
                'F', 'G', 'H', 'I', 'J',
                'K', 'L', 'M', 'N', 'O',
                'P', 'Q', 'R', 'S', 'T',
                'U', 'V', 'W', 'X', 'Y',
                'Z'
        };
        for (int i = 0; i < normalChars.length; i++) {
            if(c == normalChars[i]){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String cadena = "abcdeEFGHI!@#$%^&*(){\":;";
        char[] arregloCaracteres = cadena.toCharArray();
        for (int i = 0; i < arregloCaracteres.length; i++) {
            if (caracterEspecial(arregloCaracteres[i])){
                arregloCaracteres[i] = '-';
            }
        }
        String nuevaCadena = "";
        for (int i = 0; i < arregloCaracteres.length; i++) {
            nuevaCadena += arregloCaracteres[i];
        }
        System.out.println("Cadena original: " + cadena);
        System.out.println("Nueva cadena: " + nuevaCadena);
    }
}
