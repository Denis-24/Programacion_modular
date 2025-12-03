package org.example;

import java.util.Scanner;

public class Bateria_1_ej3 {
    public void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce una cadena...");
        String cadena = teclado.next();

        System.out.println(imprimirCadenas(cadena));
        System.out.println(contadorvocales(imprimirCadenas(cadena)));
    }

    public static String imprimirCadenas (String cadena){

        String cadena_m = cadena.toUpperCase();

        return cadena_m;
    }

    public static int contadorvocales(String cadenas_m){

        int contador = 0;

        for (int i = 0; i < cadenas_m.length(); i++) {
            if (cadenas_m.charAt(i)=='A' || cadenas_m.charAt(i)=='E' || cadenas_m.charAt(i)=='I' || cadenas_m.charAt(i)=='O' || cadenas_m.charAt(i)=='U'){
                contador++;
            }

        }

        return contador;
    }
}
