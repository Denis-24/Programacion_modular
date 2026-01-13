package org.example;

import java.util.Scanner;

public class Ejercicios_recursividad_menu {

    static Scanner teclado = new Scanner(System.in);
    static int operacion = 0;
    static int p=0;


    public static void main() {
        p = preguntas();
        menu(respuesta(p));
        repetir();


    }

    public static void menu(int operacion){

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
                System.out.println("Que quiere invertir?");
                System.out.println("Un numero (n) o  una frase (f)");
                String respuesta=teclado.nextLine();
                char r=respuesta.charAt(0);
                if (r=='n'){
                    System.out.println("Introduce el numero");
                    int num=teclado.nextInt();
                    vuelta_num(num);
                } else if (r=='f') {
                    System.out.println("Introduce una frase");
                    char[] frase = teclado.next().toCharArray();
                    vuelta_char(frase.length-1,frase);
                }
                break;
            case 4:
                System.out.println("Introduce un numero...");
                int bin = teclado.nextInt();
                System.out.println(binario(bin));

                break;
            case 5:
                System.out.println("Introduce un numero...");
                int a_bin = teclado.nextInt();
                String bin_string= a_binario(a_bin);
                System.out.println(bin_string);
                break;
            case 6:
                System.out.println("Introduce una palabra");
                String palabra= teclado.next();
                orden_alfabetico(palabra);
                break;
            case 7:
                System.out.println("Introduce un numero");
                int n= teclado.nextInt();
                System.out.println(mostrar_suma(n));
                break;
        }

        teclado.nextLine();
    }

    public static void repetir(){
        System.out.println();
        System.out.println("Elige una opcion:");
        System.out.println("[M] - Volver al menú principal");
        System.out.println("[R] - Repetir");
        System.out.println("[X] - Salir");


        String resultado = teclado.nextLine();
        String resultado_max = resultado.toUpperCase();
        switch (resultado_max){
            case "M":
                System.out.println();
                preguntas();
                menu(respuesta(preguntas()));
                repetir();
                break;
            case "R":
                menu(p);
                repetir();
                break;
        }
    }

    public static int preguntas(){
        System.out.println("*** Bateria de ejercicios sobre recursividad ***");
        System.out.println("Selecciona a continuacion el modo que quieras ejecutar...");
        System.out.println("1 - Digitos");
        System.out.println("2 - Potencias");
        System.out.println("3 - Del Reves");
        System.out.println("4 - Binario");
        System.out.println("5 - A binario");
        System.out.println("6 - Orden alfabetico");
        System.out.println("7 - Mostrar sumas");
        System.out.println();
        System.out.print("Opcion:");

        return operacion =teclado.nextInt();
    }

    public static int respuesta(int operacion){

        int respuestas = operacion;
        return operacion;
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

    public static void vuelta_num(int num){
        if (num < 10){
            System.out.println(num);;
        }else{
            System.out.println(num%10);
            vuelta_num(num/10);

        }
    }

    public static void vuelta_char(int posicion, char[] frase){

        if (posicion>=0){
            System.out.print(frase[posicion]);
            vuelta_char(posicion-1, frase);
        }

    }

    public static boolean binario(int bin) {

        if (bin >= 10) {
            if (bin % 10 == 0 || bin == 1) {
                return binario(bin / 10);
            } else {
                return false;
            }
        } else{
            if (bin == 0 || bin == 1) {
                return true;
            } else {
                return false;
            }
        }
    }

    public static String a_binario(int a_bin){

        if (a_bin<=1){
            return Integer.toString(a_bin);
        }else{
            return a_binario(a_bin/2)+a_bin%2;
        }

    }

    public static boolean orden_alfabetico(String palabra){


        return false;
    }

    public static int mostrar_suma(int n){

        if (n==1){
            return n;
        }else{
            return n+mostrar_suma(n-1);
        }


    }

}