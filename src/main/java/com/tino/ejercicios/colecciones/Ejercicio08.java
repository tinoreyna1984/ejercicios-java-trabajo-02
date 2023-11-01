package com.tino.ejercicios.colecciones;

import java.util.ArrayList;
import java.util.List;

/**
 * Dada una lista de objetos, filtra los objetos
 * que cumplan ciertas condiciones utilizando expresiones lambda.
 */
class Producto{
    private String nombre;
    private int unidades;

    public Producto(String nombre, int unidades) {
        this.nombre = nombre;
        this.unidades = unidades;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getUnidades() {
        return unidades;
    }

    public void setUnidades(int unidades) {
        this.unidades = unidades;
    }
}
public class Ejercicio08 {
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
        List<Producto> productosDisponibles = listaProd.stream().filter(p -> p.getUnidades() > 0).toList();
        for(Producto p: productosDisponibles){
            System.out.println(p.getNombre() + ": " + p.getUnidades() + " unidades");
        }
    }
}
