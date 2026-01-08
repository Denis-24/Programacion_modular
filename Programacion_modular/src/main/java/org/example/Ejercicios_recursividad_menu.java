package org.example;

import java.util.Scanner;

public class Ejercicios_recursividad_menu {

    static Scanner teclado = new Scanner(System.in);


    public static void main() {
        menu();


    }

    public static void menu(){
        System.out.println("*** Bateria de ejercicios sobre recursividad ***");
        System.out.println("Selecciona a continuacion el modo que quieras ejecutar...");
        System.out.println("1 - Digitos");
        System.out.println("2 - Potencias");
        System.out.println("3 - Del Reves");
        System.out.println("4 - Binario");
        System.out.println("5 - A binario");
        System.out.println("6 - Orden alfabetico");
        System.out.println("7 - Mostrar sumas");

        int operacion =teclado.nextInt();

        switch (operacion){
            case 1:
                System.out.println("Inroduce un numero");
                int numeros= teclado.nextInt();
                System.out.println(digitos(numeros));
                break;
            case 2:
                System.out.println("Introduce el numero");
                int numero=teclado.nextInt();
                System.out.println("Introduce el exponente");
                int exponente= teclado.nextInt();
                System.out.println(potencias(numero,exponente));
                break;
            case 3:
                System.out.println("Introduce el numero");
                int num=teclado.nextInt();
                System.out.println(vuelta(num));
                break;
            case 4:

                break;
            case 5:

                break;
            case 6:

                break;
            case 7:

                break;
        }

        teclado.nextLine();

        System.out.println();
        System.out.println("Elige una opcion:");
        System.out.println("[M] - Volver al menú principal");
        System.out.println("[X] - Salir");


        String resultado = teclado.nextLine();
        String resultado_max = resultado.toUpperCase();
        switch (resultado_max){
            case "M":
                menu();
                break;
        }

    }

    public static int digitos(int numero){

        if (numero < 10){
            return 1;
        }else{
            return 1+digitos(numero/10);
        }
    }

    public static int potencias(int numero, int exponente){

        if (exponente==1){
            return numero;
        }else {
            return numero*potencias(numero,exponente-1);
        }

    }

    public static int vuelta(int num){
        if (num < 10){
            return 1;
        }else{
            return 1+digitos(num%10);
        }
    }



}

