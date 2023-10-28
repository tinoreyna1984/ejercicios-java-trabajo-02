package com.tino.ejercicios.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Lee un archivo CSV (valores separados por comas)
 * y extrae los datos de las celdas en filas y columnas.
 */
public class Ejercicio38 {
    public static void main(String[] args) {
        String csv =
                "Tino Reyna, 1984-05-05, tino@mail.com\n" +
                "Gabriela Lorentzen, 1990-10-17, gaby@mail.com\n" +
                "Pepe Lozano, 1987-11-09, pepe@correo.com\n";
        String regex = "([A-Za-z\\s]+\\,).([0-9]{4}-[0-9]{2}-[0-9]{2}\\,).(\\w[a-z0-9_.]+@[a-z0-9_.]+.[a-z]{2,3}.[a-z]{2,3})(?=\\n)";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(csv);
        System.out.println("Registro:");
        System.out.println("Nombre\t|\tFec. nacimiento\t|\tCorreo");
        System.out.println("=====================================");
        while (matcher.find()){
            System.out.println(matcher.group()
                    .replace("\n", "") // elimino saltos de linea
                    .replace(", ", "\t|\t")); // reemplazo coma y espacio por pipes con tabs a los costados
        }
    }
}
