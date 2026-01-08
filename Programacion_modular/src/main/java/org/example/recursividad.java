package org.example;

public class recursividad {
static int limite=100000;


    public static void main() {
        imprimir(1);


    }

    public static void imprimir(int num){

        if (num<=limite){
            System.out.println(num);
            imprimir(num+1);
        }


    }




}