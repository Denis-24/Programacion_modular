package org.example;

import java.util.Scanner;

public class Cubos {

    public static void main(String[] args){
        int resultado = cubo();
        System.out.println(resultado);
    }

    public static int cubo(){
        Scanner teclado = new Scanner(System.in);

        System.out.println("Inroduce un numero...");
        int numero = teclado.nextInt();

        return numero*numero*numero;
    }

    public static void pintar_nombres(String...nombre){

        for (String nom : nombre){
            System.out.println(nom);
        }
    }

    public static boolean par(int numero){
        if (numero % 2 ==0){
            return true;
        }else {
            return false;
        }
    }



}
