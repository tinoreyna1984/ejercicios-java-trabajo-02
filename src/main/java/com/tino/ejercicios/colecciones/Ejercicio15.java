package com.tino.ejercicios.colecciones;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import static java.util.stream.Collectors.groupingBy;

/**
 * Dada una lista de objetos que contienen información de ventas
 * con fecha y cantidad, usa streams para agrupar las ventas por mes
 * y calcular la suma de ventas para cada mes.
 */
class Venta {
    private LocalDate fecha;
    private int ingreso;

    public Venta(LocalDate fecha, int ingreso) {
        this.fecha = fecha;
        this.ingreso = ingreso;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public int getIngreso() {
        return ingreso;
    }

    public void setIngreso(int ingreso) {
        this.ingreso = ingreso;
    }

    public int getMes(){
        return this.fecha.getMonthValue();
    }
}
public class Ejercicio15 {
    public static void main(String[] args) {
        Venta v01 = new Venta(LocalDate.of(2018, 5, 2), 1500);
        Venta v02 = new Venta(LocalDate.of(2018, 5, 4), 1200);
        Venta v03 = new Venta(LocalDate.of(2018, 5, 4), 1200);
        Venta v04 = new Venta(LocalDate.of(2018, 5, 6), 1330);
        Venta v05 = new Venta(LocalDate.of(2018, 5, 8), 1400);
        Venta v06 = new Venta(LocalDate.of(2018, 6, 3), 1440);
        Venta v07 = new Venta(LocalDate.of(2018, 6, 4), 2000);
        Venta v08 = new Venta(LocalDate.of(2018, 6, 5), 2000);
        Venta v09 = new Venta(LocalDate.of(2018, 6, 5), 1800);
        Venta v10 = new Venta(LocalDate.of(2018, 6, 12), 2200);
        Venta v11 = new Venta(LocalDate.of(2018, 7, 1), 2100);
        Venta v12 = new Venta(LocalDate.of(2018, 7, 1), 1900);
        Venta v13 = new Venta(LocalDate.of(2018, 7, 4), 1800);
        Venta v14 = new Venta(LocalDate.of(2018, 7, 6), 2000);
        Venta v15 = new Venta(LocalDate.of(2018, 7, 6), 2100);
        List<Venta> listaVentas = new ArrayList<>();
        listaVentas.add(v01);
        listaVentas.add(v02);
        listaVentas.add(v03);
        listaVentas.add(v04);
        listaVentas.add(v05);
        listaVentas.add(v06);
        listaVentas.add(v07);
        listaVentas.add(v08);
        listaVentas.add(v09);
        listaVentas.add(v10);
        listaVentas.add(v11);
        listaVentas.add(v12);
        listaVentas.add(v13);
        listaVentas.add(v14);
        listaVentas.add(v15);
        Map<Integer, List<Venta>> listaAgrupadaVentas = listaVentas.stream()
                .collect(groupingBy(Venta::getMes));
        for (Integer mes: listaAgrupadaVentas.keySet()) {
            System.out.println("Mes: " + mes);
            listaAgrupadaVentas.get(mes).forEach(v -> {
                System.out.println("Fecha: " + v.getFecha().toString());
                System.out.println("Monto: " + v.getIngreso());
            });
            System.out.println("Total del mes: " + listaAgrupadaVentas.get(mes).stream().mapToInt(Venta::getIngreso).sum());
        }
    }
}
