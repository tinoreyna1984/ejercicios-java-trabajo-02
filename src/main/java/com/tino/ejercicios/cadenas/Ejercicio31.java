package com.tino.ejercicios.cadenas;

/**
 * Escribe un programa que cuente la cantidad de letras, números y
 * caracteres especiales en una cadena de texto.
 * Puedes considerar letras del alfabeto y dígitos numéricos.
 */
public class Ejercicio31 {
    private static boolean esLetra(char c){
        char[] letras = {
                'A', 'B', 'C', 'D', 'E',
                'F', 'G', 'H', 'I', 'J',
                'K', 'L', 'M', 'N', 'O',
                'P', 'Q', 'R', 'S', 'T',
                'U', 'V', 'W', 'X', 'Y',
                'Z',
                'a', 'b', 'c', 'd', 'e',
                'f', 'g', 'h', 'i', 'j',
                'k', 'l', 'm', 'n', 'o',
                'p', 'q', 'r', 's', 't',
                'u', 'v', 'w', 'x', 'y',
                'z',
        };
        for (int i = 0; i < letras.length; i++) {
            if(c == letras[i]) return true;
        }
        return false;
    }
    private static boolean esNumero(char c){
        char[] numeros = {
                '0', '1', '2', '3', '4',
                '5', '6', '7', '8', '9',
        };
        for (int i = 0; i < numeros.length; i++) {
            if(c == numeros[i]) return true;
        }
        return false;
    }
    public static void main(String[] args) {
        String texto = "Mi direccion de correo es: usuario123@mail.com";
        char[] caracteres = texto.toCharArray();
        int contLetras = 0, contNumeros = 0, contCarEsp = 0;
        for (int i = 0; i < caracteres.length; i++) {
            if(esLetra(caracteres[i])) contLetras++;
            else if (esNumero(caracteres[i])) contNumeros++;
            else contCarEsp++;
        }
        System.out.println("texto = " + texto);
        System.out.println("contLetras = " + contLetras);
        System.out.println("contNumeros = " + contNumeros);
        System.out.println("contCarEsp = " + contCarEsp);
    }
}
