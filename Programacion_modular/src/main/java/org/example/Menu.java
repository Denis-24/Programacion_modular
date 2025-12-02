package org.example;

import com.sun.security.jgss.GSSUtil;

import java.util.Scanner;

public class Menu {
    public static void main(String[] args){

        Scanner teclado = new Scanner(System.in);

        imprimirMenu();

        System.out.println("Teclea tu opcion");
        char opcion = teclado.next().charAt(0);

        if (vaildar_opcion(opcion)){
            System.out.println("Valido");
        }else{
            System.out.println("No es valido");
        }

    }

    public static void imprimirMenu(){
        System.out.println("Bienvenido");
        System.out.println("1. Cantar");
        System.out.println("2. Bailar");
        System.out.println("3. Hacer backflip");
        System.out.println("x. salir");
    }

    public  static boolean vaildar_opcion(char opcion){

        switch (opcion){
            case '1':
            case '2':
            case '3':
            case 'x':
                return true;
            default:
                return false;
        }

    }
}
