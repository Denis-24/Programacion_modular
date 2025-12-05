package org.example;

import java.util.Scanner;

public class Modo3 {
    static java.util.Scanner in;

    static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {
        while (casoDePrueba()) {

        }
    }

    public static boolean casoDePrueba() {
        if (!teclado.hasNext())
            return false;
        else {
            // CÓDIGO PRINCIPAL AQUÍ
            // (incluyendo la lectura del caso de prueba)
            int toros = teclado.nextInt();
            int velocidad_del_corredor = 0;
            for (int i = 0; i < toros; i++) {
                int velocidad = teclado.nextInt();
                if (velocidad>velocidad_del_corredor){
                    velocidad_del_corredor=velocidad;
                }
            }
            System.out.println(velocidad_del_corredor);
            teclado.nextLine();
            return true;
        }
    } // casoDePrueba
}
