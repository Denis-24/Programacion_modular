package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {

        int num = 10;
        int numero = Funcion(num);
        System.out.println(numero);
        procedimineto();
        System.out.println("He vuelto al principio");
    }

    public static int Funcion(int numero){
        numero = numero + 10;
        return numero*10;
    }

    public static void procedimineto(){

        System.out.println("Hola soy un porocedimiento y hago cosas");

    }

}
