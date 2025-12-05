package org.example;

import java.util.Scanner;

public class Modo2 {
    static java.util.Scanner in;
    static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {
        while (casoDePrueba()) {

        }
    }

    public static boolean casoDePrueba() {
        //leer caso de prueba
        int x = teclado.nextInt();
        int y = teclado.nextInt();
        teclado.nextLine();

        if (x<0 || y<0)
            return false;
        else {
            // CÓDIGO PRINCIPAL AQUÍ
            System.out.println((x+y)*2);
            return true;
        }
    } // casoDePrueba
}
