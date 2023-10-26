package com.tino.ejercicios.cadenas;

import java.util.Arrays;

/**
 * Escribe un programa que tome una cadena y separe
 * todas las letras en orden alfabético,
 * eliminando los espacios y otros caracteres.
 */
public class Ejercicio40 {
    public static void main(String[] args) {
        String loremIpsum = "Lorem ipsum dolor sit amet, consectetur adipiscing elit," +
                "sed do eiusmod tempor incididunt ut labore et dolore magna aliqua." +
                "Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris" +
                "nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in" +
                "reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla" +
                "pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa" +
                "qui officia deserunt mollit anim id est laborum.";
        String[] liArray = loremIpsum.replaceAll("\\p{Punct}", "").split(" ");
        String liFusion = String.join("", liArray);
        String listLi = Arrays.stream(liFusion.toLowerCase().split("")).sorted().toList().toString();
        String listLiNoDup = Arrays.stream(liFusion.toLowerCase().split("")).distinct().sorted().toList().toString();
        System.out.println("listLi = " + listLi);
        System.out.println("listLiNoDup = " + listLiNoDup);
    }
}
