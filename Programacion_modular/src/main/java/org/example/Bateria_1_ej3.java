package org.example;

import java.util.Scanner;

public class Bateria_1_ej3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce una cadena...");
        String cadena = teclado.next();

        System.out.println(imprimirCadenas(cadena));



    };

    public static String imprimirCadenas (String cadena){

        String cadena_m = cadena.toUpperCase();

        return cadena_m;
    }
}
