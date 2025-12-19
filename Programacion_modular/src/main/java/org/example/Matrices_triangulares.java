package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Matrices_triangulares {
    static Scanner teclado = new Scanner(System.in);
    static void main() {
        int tamanyo =1;
        while (tamanyo!=0){
            int tamanyolisto = controltamanyo();
            tamanyo=tamanyolisto;
            if (tamanyolisto!=0){
                int matriz[][]=matriz(tamanyolisto);
                boolean revision = revision(tamanyolisto, matriz);
                System.out.println(respuesta(revision));
            }
        }


    }

    public static int controltamanyo(){

        int tamanyo=0;

        try{
            System.out.println("Introduce el tamanyo de la matriz...");
            tamanyo=teclado.nextInt();
        }catch (InputMismatchException e){
            System.out.println("Valores introducidos incorrectos");
        }

        return tamanyo;
    }

    public static int[][] matriz( int tamanyolisto){

        System.out.println("Introduce los numeros de la matriz por filas y con espacios");
        int matriz[][] = new int[tamanyolisto][tamanyolisto];
        for (int x = 0; x <tamanyolisto ; x++) {
            for (int y = 0; y <tamanyolisto ; y++) {
                String fila[] =teclado.next().split(" ");
                if (controlfilas()==true){
                    for (String numero : fila){
                        matriz[x][y]= Integer.parseInt(numero);
                    }
                }else{
                    x--;
                }

            }
        }
        return matriz;
    }
    public static boolean controlfilas(String[] fila){



        return true;
    }

    public static boolean revision(int tamanyolisto, int matriz[][]){

        boolean control=true;
        externo:
        for (int x = 0; x < tamanyolisto; x++) {
            interno:
            for (int y = 0; y < tamanyolisto; y++) {
                if (x==y){
                    int contador = x+1;
                    while (contador<tamanyolisto){
                        if (matriz[contador][y]!=0){
                            control = false;
                        }
                        contador++;

                    }
                    if (!control){
                        contador = y+1;
                        while (contador<tamanyolisto){
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

        if (tamanyolisto == 1 && matriz[0][0]!=0){
            control=false;
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
