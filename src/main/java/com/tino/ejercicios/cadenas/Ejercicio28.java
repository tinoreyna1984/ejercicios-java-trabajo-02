package com.tino.ejercicios.cadenas;

import java.util.Arrays;
import java.util.List;

/**
 * Escribe un programa que cuente cuántas palabras en una cadena
 * tienen una longitud específica proporcionada por el usuario.
 */
public class Ejercicio28 {
    public static void main(String[] args) {
        String texto = "Escribe un programa que cuente cuántas palabras en una cadena" +
                       "tienen una longitud específica proporcionada por el usuario.";
        int longitudEsp = 3; // que, una, una, por
        List<String> listaPalabras = Arrays.stream(texto
                .replaceAll("\\p{Punct}", "")
                .split(" "))
                .toList();
        Long palabrasLongEsp = listaPalabras
                .stream().filter(s -> s.length() == longitudEsp) // filtro las que cumplen con la longitud indicada
                .count(); // obtengo cantidad de elementos final
        System.out.println("Numero de palabras con longitud especifica: " + palabrasLongEsp); // 4
    }
}
