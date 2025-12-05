package org.example;

import java.util.Scanner;

public class Modo1 {

    static java.util.Scanner in;

    static Scanner teclado = new Scanner(System.in);

    static void main(String[] args) {

        int numCasos = in.nextInt();

        teclado.nextLine();

        for (int i = 0; i < numCasos; i++) {
            casoDePrueba();
        }
    }

    public static void casoDePrueba() {


        String nombre[] = teclado.nextLine().split("");
        System.out.println("Hola, " + nombre[1] + ".");

    }
}
