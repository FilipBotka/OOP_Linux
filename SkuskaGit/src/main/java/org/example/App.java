package org.example;

public class App {
    public static void main(String[] args){
        int[] pole = new int[10];

        for (int i=0; i < pole.length; i++){
            pole[i] = i;
        }

        for (int i=0; i < pole.length; i++){
            vypis(pole[i]);
        }
    }

    public static void vypis(int a){

        System.out.println(String.format("Funkcia bola zavolana %d. krat", a+1));

        if (a==0) {
            System.out.println("Cislo je nula");
        }
    }
}
