package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;


/**
 * Esta clase contrien el resultado bonito para el problema 160 de ProgramaMe.
 * @author Denis Rico
 * @version 1.0
 * @see <a href = "https://aceptaelreto.com/problem/statement.php?id=160">Matriz_Triangular</a>
 */
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

    /**
     * @author Denis Rico
     * @version 1.0
     * @return tamanyo - devuelve un tamanyo el cual se a comprobado con un try catch, de que no hayan introducido una letra.
     */
    public static int controltamanyo(){

        int tamanyo=0;
        boolean control=false;

        do {
            try{
                System.out.println("Introduce el tamanyo de la matriz...");
                tamanyo=teclado.nextInt();
                control=true;
            }catch (InputMismatchException e){
                System.out.println("Valores introducidos incorrectos, solo numeros");
                control=false;
            }
            teclado.nextLine();
        }while (control==false);

        return tamanyo;
    }

    /**
     * @author Denis Rico
     * @version 1.0
     * @return matriz - delvuelve una matriz tipo int, donde he ido introduciendo a la matriz lo que se introduce por teclado.
     */

    public static int[][] matriz( int tamanyolisto){

        System.out.println("Introduce los numeros de la matriz por filas y con espacios");
        int matriz[][] = new int[tamanyolisto][tamanyolisto];
        for (int x = 0; x < tamanyolisto; x++) {
            for (int y = 0; y < tamanyolisto; y++) {
                String fila[] = teclado.next().split(" ");
                for (String num : fila){
                    matriz[x][y]= Integer.parseInt(num);
                }
            }
        }
        return matriz;
    }

    /**
     * @author Denis Rico
     * @version 1.0
     * @return control - devuelve un booleano
     */
    public static boolean revision(int tamanyolisto, int matriz[][]){

        boolean control=true;
        //hago dos for para que se vayan recoriendo la matriz.
        externo:
        for (int x = 0; x < tamanyolisto; x++) {
            interno:
            for (int y = 0; y < tamanyolisto; y++) {
                //voy mirando cuando la x y la y son iguales, ya que cuando son iguales es la diagonal.
                if (x==y){
                    //creo un contador para ir recorriendo las celdas cuando x e y son iguales.
                    int contador = x+1;
                    //voy mirando cada celda de la matriz que se encuentra debajo de la diagonal, mientras que se encuentre cero seguira comprobando, en el caso que se encuentre un numero se cancelara y pasara al siguiente proceso.
                    while (contador<tamanyolisto){
                        if (matriz[contador][y]!=0){
                            control = false;
                        }
                        contador++;

                    }
                    if (!control){
                        contador = y+1;
                        //En este proceso hago lo mismo que el procesoa anterior, solo que en vez de ir comprobando las columnas miro las filas, ya que los numeros que compruebo se encuentran a la derecha de la diagonal.
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

        //Aqui compruebo que al introducir una matriz de 1x1 como no hay diagonal compruebo directamente el numero que hay.
        if (tamanyolisto == 1 && matriz[0][0]!=0){
            control=false;
        }
        return control;
    }


    /**
     * @author Denis Rico
     * @version 1.0
     * @return respu - devuelve un string, el cual es el que vamos a mostrar por pantalla que depende del booleano recibido del metodo revision.
     */
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
