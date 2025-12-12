package org.example;

import java.util.Arrays;
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

            boolean control=true;
            externo:
            for (int x = 0; x < tamanyo; x++) {
                interno:
                for (int y = 0; y < tamanyo; y++) {
                    if (x==y){
                        int contador = x+1;
                        while (contador<tamanyo){
                            System.out.println(matriz[contador][y]);
                            if (matriz[contador][y]!=0){
                                control = false;
                                break externo;
                            }
                            contador++;

                        }
                        if (!control){
                            contador = y+1;
                            while (contador<tamanyo){
                                System.out.println(matriz[x][contador]);
                                if (matriz[contador][y]!=0){
                                    control = false;
                                    break externo;
                                }else{
                                    control=true;
                                }
                                contador++;

                            }
                        }

                    }
                }

            }
            if (control == true){
                System.out.println("SI!");
            }else if (control==false){
                System.out.println("NO!");
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
