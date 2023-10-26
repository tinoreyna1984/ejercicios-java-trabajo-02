package com.tino.ejercicios.cadenas;

/**
 * Escribe un programa que convierta una cadena
 * en formato camelCase (por ejemplo, "estoEsCamelCase")
 * a snake_case (por ejemplo, "esto_es_snake_case").
 */
public class Ejercicio34 {
    public static void main(String[] args) {
        String textoCamelCase = "libroDeStockConInventario";
        StringBuilder sb = new StringBuilder(textoCamelCase);
        int pos = 0;
        for (int i = 0; i < textoCamelCase.length(); i++) {
            if(String.valueOf(sb.charAt(i)).matches("[A-Z]")){
                sb.replace(i, i + 1, "_" + String.valueOf(sb.charAt(i)).toLowerCase());
            }
        }
        System.out.println("Texto en camel case: " + textoCamelCase);
        System.out.println("Texto en snake case: " + sb);
    }
}
