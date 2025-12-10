package org.example;

import java.util.Scanner;

public class Matrices_triangulares {
    static void main() {

    }

    public static int matriz(){

        Scanner teclado = new Scanner(System.in);

        int tamanyo =0;

        System.out.println("Introduce el tamaño de la matriz...");
        tamanyo = teclado.nextInt();
        int matriz[][] = new int[tamanyo][tamanyo];
        for (int x = 0; x <tamanyo ; x++) {
            for (int y = 0; y <tamanyo ; y++) {
            String fila[] =teclado.next().split(" ");
            for (String numero : fila){
                matriz[x][y]= Integer.parseInt(numero);
            }

            }
        }


        return 0;
    }
}
