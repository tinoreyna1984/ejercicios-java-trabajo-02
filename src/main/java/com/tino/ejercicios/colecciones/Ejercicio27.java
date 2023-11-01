package com.tino.ejercicios.colecciones;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;

import static java.util.stream.Collectors.groupingBy;

/**
 * Dada una lista de transacciones financieras con categorías,
 * usa streams para agrupar las transacciones por categoría
 * y calcular estadísticas avanzadas,
 * como el total, promedio y desviación estándar de cada categoría.
 */
enum TxnCategoria {
    RETIRO,
    DEPOSITO,
    CONSULTA,
    TRANSFERENCIA
};
class Transaccion{
    private int id;
    private TxnCategoria categoria;
    private int monto;

    public Transaccion(int id, TxnCategoria categoria, int monto) {
        this.id = id;
        this.categoria = categoria;
        this.monto = monto;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public TxnCategoria getCategoria() {
        return categoria;
    }

    public void setCategoria(TxnCategoria categoria) {
        this.categoria = categoria;
    }

    public int getMonto() {
        return monto;
    }

    public void setMonto(int monto) {
        this.monto = monto;
    }
}
public class Ejercicio27 {
    public static void main(String[] args) {
        List<Transaccion> listaTransacciones = Arrays.asList(
                new Transaccion(1, TxnCategoria.RETIRO, 250),
                new Transaccion(2, TxnCategoria.DEPOSITO, 1400),
                new Transaccion(3, TxnCategoria.CONSULTA, 0),
                new Transaccion(4, TxnCategoria.TRANSFERENCIA, 600),
                new Transaccion(5, TxnCategoria.DEPOSITO, 250),
                new Transaccion(6, TxnCategoria.CONSULTA, 0),
                new Transaccion(7, TxnCategoria.RETIRO, 50),
                new Transaccion(8, TxnCategoria.DEPOSITO, 10),
                new Transaccion(9, TxnCategoria.TRANSFERENCIA, 700),
                new Transaccion(10, TxnCategoria.CONSULTA, 0),
                new Transaccion(11, TxnCategoria.DEPOSITO, 600),
                new Transaccion(12, TxnCategoria.CONSULTA, 0),
                new Transaccion(13, TxnCategoria.RETIRO, 250),
                new Transaccion(14, TxnCategoria.TRANSFERENCIA, 70),
                new Transaccion(15, TxnCategoria.DEPOSITO, 20)
        );
        Map<TxnCategoria, List<Transaccion>> txnsPorCategoria = listaTransacciones.stream() // stream desde lista
                .collect(groupingBy(Transaccion::getCategoria));
        for(TxnCategoria cat : txnsPorCategoria.keySet()){
            System.out.println(cat.toString() + ":");
            IntSummaryStatistics statistics  = txnsPorCategoria.get(cat).stream()
                    .mapToInt(e -> e.getMonto()).summaryStatistics();
            System.out.println("Rango de transacciones: [" + statistics.getMin() + "; " + statistics.getMax() + "]");
            System.out.println("Promedio de transacciones: " + statistics.getAverage());
            double sdTransacciones = Math.sqrt((double) txnsPorCategoria.get(cat).stream()
                    .mapToInt(e -> (int) Math.pow(e.getMonto() - statistics.getAverage(), 2))
                    .sum() /(txnsPorCategoria.get(cat).size() - 1));
            System.out.println("SD de transacciones: " + sdTransacciones);
        }
    }
}
