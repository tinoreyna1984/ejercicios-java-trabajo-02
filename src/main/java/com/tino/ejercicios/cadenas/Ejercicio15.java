package com.tino.ejercicios.cadenas;

/**
 * Escribe un programa que tome una cadena y reemplace
 * todas las ocurrencias de una subcadena específica
 * por otra subcadena proporcionada por el usuario.
 */
public class Ejercicio15 {
    public static void main(String[] args) {
        String texto = "Aprender Java es dificil. El lenguaje Java es muy exigente";
        String buscar = "Java";
        String reemplazar = "Python";
        String nuevoTexto = "";
        nuevoTexto = texto.replace(buscar, reemplazar);
        System.out.println("Texto original: " + texto);
        System.out.println("Texto nuevo: " + nuevoTexto);
    }
}
