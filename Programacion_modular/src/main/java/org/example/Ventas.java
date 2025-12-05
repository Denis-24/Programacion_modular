package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class Ventas {
    static Scanner teclado = new Scanner(System.in);

    static void main() {
        double rec[] = new double[6];

        System.out.println(Arrays.toString(datos(rec)));


        System.out.println(dia(rec));


        double media = media(rec);
        System.out.println(media);


    }

    public static double[] datos (double rec[]){

        boolean control = false;

        System.out.println("Introduce la recaudacion...");
        do {
            try {
                for (int i = 0; i < rec.length; i++) {
                    rec[i]= teclado.nextDouble();
                    control=true;
                }
            }catch (Exception e){
                System.out.println("Valores introducidos incorrectos");
                break;
            }
        }while (control==false);

        return rec;
    }


    public static String dia (double rec[]){
        int aux=0;
        String diamax = "";
        for (int i = 0; i < rec.length; i++) {
            if (rec[i+1] == rec.length+1){

            }else {
                if ((rec[i+1])<rec[i]){
                    aux=i;
                }
            }
        }
        switch (aux){
            case 0:
                diamax="Martes";
                break;
            case 1:
                diamax="Miercoles";
                break;
            case 2:
                diamax="Jueves";
                break;
            case 3:
                diamax="Viernes";
                break;
            case 4:
                diamax="Sabado";
                break;
            case 5:
                diamax="Domingo";
                break;
            default:
        }

        return diamax;
    }

    public static double media (double rec[]){
        double suma = 0;

        for (int i = 0; i < rec.length; i++) {
            suma+=rec[i];
        }

        return (suma/ rec.length);
    }
}
