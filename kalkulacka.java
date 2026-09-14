package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int vysledok;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Zadaj cislo a:");
        int a = scanner.nextInt();

        System.out.println("Zadaj cislo b:");
        int b = scanner.nextInt();

        System.out.println("Chces cisla scitat (+), odcitat (-), nasobit (*) alebo delit (/)?");
        String operacia = scanner.next();

        if (operacia.equals("+")) {
            vysledok = a + b;
            System.out.println("Vysledok je: " + vysledok);
        }
        else if (operacia.equals("-")) {
            vysledok = a - b;
            System.out.println("Vysledok je: " + vysledok);
        }
        else if (operacia.equals("*")) {
            vysledok = a * b;
            System.out.println("Vysledok je: " + vysledok);
        }
        else if (operacia.equals("/")) {
            vysledok = a / b;
            System.out.println("Vysledok je: " + vysledok);
        }
        else {
            System.out.println("Neplatna operacia!");
        }
    }
}
