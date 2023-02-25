package org.example;

public class App {
    public static void main(String[] args){

        int i = 1;
        while (i<1) {
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
            i++;
        }
    }
}
