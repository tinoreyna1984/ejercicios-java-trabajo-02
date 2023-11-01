package com.tino.ejercicios.colecciones;

import java.util.*;
import java.util.stream.Collectors;

/**
 * Combina dos listas de objetos en una sola lista,
 * eliminando duplicados y manteniendo solo los elementos únicos.
 */
public class Ejercicio13 {
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
        List<Producto> lp01 = new ArrayList<>();
        List<Producto> lp02 = new ArrayList<>();
        lp01.add(p02);
        lp01.add(p11);
        lp01.add(p04);
        lp01.add(p05);
        lp01.add(p08);
        lp01.add(p12);
        lp01.add(p06);
        lp02.add(p02);
        lp02.add(p07);
        lp02.add(p08);
        lp02.add(p03);
        lp02.add(p10);
        lp02.add(p01);
        lp02.add(p09);
        lp02.add(p04);
        List<Producto> lp03 = new ArrayList<>();
        lp03.addAll(lp01);
        lp03.addAll(lp02);
        lp03 = lp03.stream().distinct().collect(Collectors.toList());
        for (Producto p: lp03) {
            System.out.println(p.getNombre() + ", unidades: " + p.getUnidades());
        }
    }
}
