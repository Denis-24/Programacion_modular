package org.example;

import java.util.Scanner;

public class Matrices_triangulares {
    static Scanner teclado = new Scanner(System.in);
    static void main() {
        int tamanyo =1;
        while (tamanyo!=0){
            System.out.println("Introduce el tamanyo de la matriz...");
            tamanyo=teclado.nextInt();
            if (tamanyo!=0){
                int matriz[][]=matriz(tamanyo);
                boolean revision = revision(tamanyo, matriz);
                System.out.println(respuesta(revision));
            }
        }


    }

    public static int[][] matriz( int tamanyo){

        System.out.println("Introduce los numeros de la matriz por filas y con espacios");
        int matriz[][] = new int[tamanyo][tamanyo];
        for (int x = 0; x <tamanyo ; x++) {
            for (int y = 0; y <tamanyo ; y++) {
                String fila[] =teclado.next().split(" ");
                for (String numero : fila){
                    matriz[x][y]= Integer.parseInt(numero);
                }

            }
        }
        return matriz;
    }

    public static boolean revision(int tamanyo, int matriz[][]){

        boolean control=true;
        externo:
        for (int x = 0; x < tamanyo; x++) {
            interno:
            for (int y = 0; y < tamanyo; y++) {
                if (x==y){
                    int contador = x+1;
                    while (contador<tamanyo){
                        if (matriz[contador][y]!=0){
                            control = false;
                        }
                        contador++;

                    }
                    if (!control){
                        contador = y+1;
                        while (contador<tamanyo){
                            if (matriz[x][contador]!=0){
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
        return control;
    }

    public static String respuesta(boolean control){
        String respuesta = "";
        if (control == true){
            respuesta="SI!";
        }else if (control==false){
            respuesta="NO!";
        }
        return respuesta;
    }
}
