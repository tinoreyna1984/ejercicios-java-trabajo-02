package com.tino.ejercicios.cadenas;

/**
 * Escribe un programa que tome una cadena y una subcadena como entrada
 * y encuentre la posición de la primera ocurrencia de la subcadena en
 * la cadena principal. Si la subcadena no está presente, muestra un mensaje
 * indicando que no se encontró.
 */
public class Ejercicio21 {
    public static void main(String[] args) {
        String cadena = "Java es un lenguaje importante. Muchas aplicaciones usan Java hoy en dia";
        String buscar = "Java";
        int pos = 0;
        int longitudPalabra = 0, ocurrencias = 0;
        while(pos != -1){
            pos = cadena.indexOf(buscar, pos + longitudPalabra);
            longitudPalabra = buscar.length();
            if(pos > 0) ocurrencias++;
        }
        if(ocurrencias > 0){
            System.out.println("Se encontro al menos una ocurrencia de " + buscar + " en el texto");
        }
        else{
            System.out.println("No se encontro ninguna ocurrencia de " + buscar + " en el texto");
        }
    }
}
