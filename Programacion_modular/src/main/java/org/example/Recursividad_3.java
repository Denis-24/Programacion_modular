package org.example;

public class Recursividad_3 {

    public static void main() {
        System.gc(); //Limpia lo que pueda antes de medir

        long inicioEjecucion = System.nanoTime();
        long memoriaAntes = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();

        System.out.println(operacion(10));

        long finEjecucion = System.nanoTime();
        long memoriaDespues = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();

        System.out.println("Tiempo recursivo: " + (finEjecucion - inicioEjecucion) + " ns");
        System.out.println("Memoria consumida recursivo: " + (memoriaDespues - memoriaAntes) + " bytes");


        System.gc(); //Limpia lo que pueda antes de medir

        inicioEjecucion = System.nanoTime();
        memoriaAntes = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();

        imprimir_bucle();

        finEjecucion = System.nanoTime();
        memoriaDespues = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();

        System.out.println("Tiempo recursivo: " + (finEjecucion - inicioEjecucion) + " ns");
        System.out.println("Memoria consumida recursivo: " + (memoriaDespues - memoriaAntes) + " bytes");
    }

    public static int operacion(int num){

        if (num==0){
            return num;
        }else {
            return num+operacion(num-1);
        }

    }



    public static int imprimir_bucle(){



        for (int i = 0; i <= 10; i++) {
            System.out.println(i);
        }

        return 0;
    }


}
