package com.company;

        import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //float i = 3.4f;
        //float y = 4.9f;
        //System.out.println(i + y);

        //int a = 4;
        //int b = 5;

        //if (a == b) {
        //    System.out.println("A sa rovna b");
        //} else {
        //    System.out.println("A sa nerovna b");
        //}
        int vysledok;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Zadaj cislo a:");
        int a = scanner.nextInt();
        System.out.println("Zadaj cislo b:");
        int b = scanner.nextInt();
        System.out.println("Chces cisla scitat (1) alebo odcitat (2)?");
        int operacia = scanner.nextInt();

        if (operacia == 1){
            vysledok = a + b;
            System.out.println("Vysledok je: " + vysledok);
        }
        else {
            vysledok = a - b;
            System.out.println("Vysledok je:" + vysledok);
        }


    }
}
