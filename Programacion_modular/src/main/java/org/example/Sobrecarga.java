package org.example;

public class Sobrecarga {
    public  static void atacar(){
        System.out.println("Atacando");
    }

    public static void atacar(String nombre){
        System.out.println("Te esta atacando " + nombre);
    }

    public static void atacar(int nivel){
        System.out.println("Atacando con nivel " + nivel);
    }

    static void main(String[] args) {
        atacar("10");
    }
}
