package org.example;

import java.util.Scanner;

public class modo2_matriz_triangualr {
    static java.util.Scanner in;
    static Scanner teclado = new Scanner(System.in);

    public static boolean casoDePrueba() {
        int tamanyo=0;
        System.out.println("Introduce el tamanyo...");
        tamanyo = teclado.nextInt();

        if (tamanyo==0){
            return false;
        }
        else {
            // CÓDIGO PRINCIPAL AQUÍ
            int matriz[][] = new int[tamanyo][tamanyo];
            for (int x = 0; x <tamanyo ; x++) {
                for (int y = 0; y <tamanyo ; y++) {
                    String fila[] =teclado.next().split(" ");
                    for (String numero : fila){
                        matriz[x][y]= Integer.parseInt(numero);
                    }

                }
            }
            for (int linea[] : matriz){
                for (int num : linea){
                    System.out.print(num + " ");
                }
                System.out.println();
            }

            for (int x = 0; x < tamanyo; x++) {
                for (int y = 0; y < tamanyo; y++) {
                    if (x==y){
                        
                    }
                }

            }
            return true;
        }
    } // casoDePrueba

    public static void main(String[] args) {
        in = new java.util.Scanner(System.in);
        while (casoDePrueba()) {
        }
    }
}
