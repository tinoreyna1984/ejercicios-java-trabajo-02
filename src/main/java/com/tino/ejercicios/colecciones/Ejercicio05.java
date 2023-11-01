package com.tino.ejercicios.colecciones;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import static java.util.stream.Collectors.groupingBy;

/**
 * Dada una lista de objetos que tienen un atributo "categoria",
 * usa streams para agrupar los objetos por categoría y contar
 * cuántos objetos pertenecen a cada categoría.
 */

enum Categoria{
    TECNOLOGIA,
    BLOG,
    PSICOLOGIA,
    CRISTIANISMO
}
class Articulo {
    String titulo;
    Categoria categoria;
    String contenido;

    public Articulo(String titulo, Categoria categoria, String contenido) {
        this.titulo = titulo;
        this.categoria = categoria;
        this.contenido = contenido;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }
}

public class Ejercicio05 {
    public static void main(String[] args) {
        Articulo a01 = new Articulo("Lenguaje Java y sus propiedades", Categoria.TECNOLOGIA, "\"Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.\"");
        Articulo a02 = new Articulo("Docker y Kubernetes", Categoria.TECNOLOGIA, "\"Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.\"");
        Articulo a03 = new Articulo("Programacion Reactiva en Spring Webflux y RxJs", Categoria.TECNOLOGIA, "\"Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.\"");
        Articulo a04 = new Articulo("Proximos planes para el 2024", Categoria.BLOG, "\"Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.\"");
        Articulo a05 = new Articulo("Sobre salud mental y sus cuidados", Categoria.PSICOLOGIA, "\"Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.\"");
        Articulo a06 = new Articulo("Cambio de pensamientos", Categoria.PSICOLOGIA, "\"Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.\"");
        Articulo a07 = new Articulo("La Biblia y su aplicacion cotidiana", Categoria.CRISTIANISMO, "\"Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.\"");
        List<Articulo> listaArticulos = new ArrayList<>();
        listaArticulos.add(a01);
        listaArticulos.add(a02);
        listaArticulos.add(a03);
        listaArticulos.add(a04);
        listaArticulos.add(a05);
        listaArticulos.add(a06);
        listaArticulos.add(a07);
        Map<Categoria, List<Articulo>> articulosPorCategoria = listaArticulos.stream() // stream desde lista
                .collect(groupingBy(Articulo::getCategoria)); // agrupamos por categoria
        for (Categoria cat: articulosPorCategoria.keySet()){
            System.out.println(cat.toString() + ":"); // titulo de la categoria
            articulosPorCategoria.get(cat).forEach(a -> {
                System.out.println("Titulo: " + a.titulo);
                System.out.println("Contenido: " + a.contenido);
            });
        }
    }
}
