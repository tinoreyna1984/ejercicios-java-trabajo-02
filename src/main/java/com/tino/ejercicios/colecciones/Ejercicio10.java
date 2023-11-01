package com.tino.ejercicios.colecciones;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

/**
 * Realiza alguna de las operaciones anteriores
 * (por ejemplo, filtrado, mapeo, suma) en paralelo
 * utilizando streams paralelos para mejorar el rendimiento.
 */
public class Ejercicio10 {
    public static void main(String[] args) {
        Producto p01 = new Producto("Arroz", 30);
        Producto p02 = new Producto("Papa", 0);
        Producto p03 = new Producto("Platano", 0);
        Producto p04 = new Producto("Agua", 14);
        Producto p05 = new Producto("Azucar", 20);
        Producto p06 = new Producto("Tomate", 11);
        Producto p07 = new Producto("Limon", 20);
        Producto p08 = new Producto("Cebolla", 0);
        Producto p09 = new Producto("Queso", 5);
        Producto p10 = new Producto("Jamon", 6);
        Producto p11 = new Producto("Galleta", 6);
        Producto p12 = new Producto("Pollo", 50);
        List<Producto> listaProd = new ArrayList<>();
        listaProd.add(p01);
        listaProd.add(p02);
        listaProd.add(p03);
        listaProd.add(p04);
        listaProd.add(p05);
        listaProd.add(p06);
        listaProd.add(p07);
        listaProd.add(p08);
        listaProd.add(p09);
        listaProd.add(p10);
        listaProd.add(p11);
        listaProd.add(p12);
        Producto prodEspecifico = listaProd.parallelStream() // genera stream paralelo (util para mejorar rendimiento)
                .filter(p -> p.getNombre().equalsIgnoreCase("agua")) // filtra por nombre "agua"
                .findFirst() // encuentra el primer elemento
                .orElseThrow(NoSuchElementException::new); // arroja excepcion en caso de que falle
        System.out.println(prodEspecifico.getNombre() + ": " + prodEspecifico.getUnidades() + " unidades");
    }
}
