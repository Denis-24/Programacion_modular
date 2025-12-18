package org.example;

import com.sun.jdi.Value;

import java.util.Arrays;
import java.util.Scanner;

public class VIajando_en_el_siglo_XIX {
    static java.util.Scanner in;
    static Scanner teclado = new Scanner(System.in);

    public static void casoDePrueba() {
        int tamanyo =0;
        tamanyo=teclado.nextInt();
        int matriz[][] = new int[tamanyo][4];
        int l =0;
        int c=0;
        int p=0;
        int num=0;
        int total=0;


        for (int x = 0; x < tamanyo; x++) {
            System.out.println("fila " + x);
            String fila[] =teclado.nextLine().split(" ");
            for (int y = 0; y < 4; y++) {

                System.out.println(Arrays.toString(fila));
            }
        }
        for (int linea[] : matriz){
            for (int i = 0; i < linea.length; i++) {
                if (!(linea[0] == 0)){
                    num=linea[0];
                    c=1;
                    for (int j = 1; j <= num; j++) {
                        c+=c;
                    }
                } else if (!(linea[1] == 0)) {
                    num=linea[1];
                    p=9;
                    for (int j = 0; j <= num; j++) {
                        p+=p;
                    }
                } else if (!(linea[2] == 0)) {
                    num=linea[2];
                    if (c==0){
                        c=1;
                    } else if (p==0) {
                        p=6;
                    }
                    for (int j = 0; j <= num; j++) {
                        c+=c;
                        p+=p;
                    }
                } else if (!(linea[3] == 0)) {
                    num=linea[3];
                    if (c==0){
                        c=1;
                    } else if (p==0) {
                        p=6;
                    }
                    for (int j = 0; j <= num; j++) {
                        c+=c;
                    }
                }
            }
        }
        System.out.println(c);
        System.out.println(p);


    } // casoDePrueba

    public static void main(String[] args) {

        in = new java.util.Scanner(System.in);

        int numCasos = in.nextInt();
        for (int i = 0; i < numCasos; i++)
            casoDePrueba();
    } // main
}
