package com.tino.ejercicios.colecciones;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import static java.util.stream.Collectors.groupingBy;

/**
 * Divide una lista de objetos en varias sublistas, agrupándolas según un atributo específico.
 */
enum TipoComida {
    POSTRE,
    BEBIDA,
    ENTRADA,
    SEGUNDO,
    SOPA
}
enum TamannoComida {
    PEQUENNO,
    MEDIANO,
    GRANDE
}
class Comida{
    private int id;
    private String nombre;
    private TipoComida tipoComida;
    private TamannoComida tamannoComida;

    public Comida(int id, String nombre, TipoComida tipoComida, TamannoComida tamannoComida) {
        this.id = id;
        this.nombre = nombre;
        this.tipoComida = tipoComida;
        this.tamannoComida = tamannoComida;
    }
    record registroComida(int id, String nombre, TipoComida tipoComida, TamannoComida tamannoComida){};

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public TipoComida getTipoComida() {
        return tipoComida;
    }

    public void setTipoComida(TipoComida tipoComida) {
        this.tipoComida = tipoComida;
    }

    public TamannoComida getTamannoComida() {
        return tamannoComida;
    }

    public void setTamannoComida(TamannoComida tamannoComida) {
        this.tamannoComida = tamannoComida;
    }
}
public class Ejercicio28 {
    public static void main(String[] args) {
        List<Comida> listaComidas = Arrays.asList(
                new Comida(1, "Bolon", TipoComida.ENTRADA, TamannoComida.PEQUENNO),
                new Comida(2, "Fritada", TipoComida.ENTRADA, TamannoComida.MEDIANO),
                new Comida(3, "Mixto", TipoComida.ENTRADA, TamannoComida.PEQUENNO),
                new Comida(4, "Helado", TipoComida.POSTRE, TamannoComida.PEQUENNO),
                new Comida(5, "Chocolate Caliente", TipoComida.BEBIDA, TamannoComida.PEQUENNO),
                new Comida(6, "Moro con chuleta", TipoComida.SEGUNDO, TamannoComida.MEDIANO),
                new Comida(7, "Moro con pollo asado", TipoComida.SEGUNDO, TamannoComida.MEDIANO),
                new Comida(8, "Pizza full meat", TipoComida.SEGUNDO, TamannoComida.GRANDE),
                new Comida(9, "Cerveza Pilsener", TipoComida.BEBIDA, TamannoComida.PEQUENNO),
                new Comida(10, "Ramen", TipoComida.SOPA, TamannoComida.MEDIANO),
                new Comida(11, "Caldo de gallina", TipoComida.SOPA, TamannoComida.MEDIANO),
                new Comida(12, "Sopa Wantan", TipoComida.SOPA, TamannoComida.MEDIANO),
                new Comida(13, "Pollo Asado + parrilla", TipoComida.SEGUNDO, TamannoComida.GRANDE),
                new Comida(14, "Selva Negra", TipoComida.POSTRE, TamannoComida.GRANDE),
                new Comida(15, "Tartaleta", TipoComida.POSTRE, TamannoComida.PEQUENNO),
                new Comida(16, "Hamburguesa doble + pulled pork", TipoComida.SEGUNDO, TamannoComida.GRANDE)
        );
        // dividir en sublistas
        int tamanno = 4;
        int partes = listaComidas.size()/tamanno;
        List<List<Comida>> subListasComidas = new ArrayList<>();
        for (int i = 0; i < partes; i++) {
            subListasComidas.add(listaComidas.subList(i, i + tamanno - 1));
            // agrupa comida por tipo
            Map<TipoComida, List<Comida>> slComidaTipo = subListasComidas.get(i).stream()
                    .collect(groupingBy(Comida::getTipoComida));
            System.out.println("Agrupa por tipo:");
            for(TipoComida tipo: slComidaTipo.keySet()){
                slComidaTipo.get(tipo).forEach(c -> {
                    System.out.println("Nombre: " + c.getNombre());
                    System.out.println("Tipo: " + c.getTipoComida().toString());
                    System.out.println("Tamanno: " + c.getTamannoComida().toString());
                });
            }
            // agrupa comida por tamanno
            Map<TamannoComida, List<Comida>> slComidaTamanno = subListasComidas.get(i).stream()
                    .collect(groupingBy(Comida::getTamannoComida));
            System.out.println("*******************");
            System.out.println("Agrupa por tamanno:");
            for(TamannoComida tam: slComidaTamanno.keySet()){
                slComidaTamanno.get(tam).forEach(c -> {
                    System.out.println("Nombre: " + c.getNombre());
                    System.out.println("Tamanno: " + c.getTamannoComida().toString());
                    System.out.println("Tipo: " + c.getTipoComida().toString());
                });
            }
        }
    }
}
