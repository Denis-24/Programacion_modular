package org.example;

import java.util.Scanner;

public class Cubos {

    public static void main(String[] args){

        Scanner teclado = new Scanner(System.in);

        System.out.println("Inroduce un numero...");
        int numero = teclado.nextInt();
        int resultado = cubo(numero);
        System.out.println(resultado);

        for (int i = 0; i < args.length; i++) {
            System.out.println(args[i]);
        }

        pintar_nombres("patri","Kevin","david");




    }

    public static int cubo(int numero){
        return numero*numero*numero;
    }

    public static void pintar_nombres(String...nombre){

        for (String nom : nombre){
            System.out.println(nom);
        }
    }


}
