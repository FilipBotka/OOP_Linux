package org.example;

public class App {
    public static void main(String[] args){

        //int cislo = 1;
        for (int i=1; i<3; i++) {
            switch (i) {
                case 1:
                    System.out.println("nieco");
                    break;
                case 2:
                    System.out.println("nieco 2");
                    break;
                default:
                    System.out.println("Ani jedno z toho");
            }
        }
    }
}
