package at.lus.basic;

import java.sql.SQLOutput;
import java.util.Scanner;


public class Bankomat {


    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        double selection = 0;
        double dEinzahlung;
        double dAuszahlung;
        double dKonto = 0;


        System.out.println("Wählen sie die Gewünschte eingabe");
        System.out.println(
                "\n 1. Einzahlen" +
                "\n 2. Abheben" +
                "\n 3. Kontostand" +
                "\n 4. Beenden");



        do {
            selection = scanner.nextDouble();

            if (selection == 1) {
                System.out.println("Wie viel Geld wollen sie einzahlen");

                dEinzahlung = scanner.nextDouble();
                dKonto = dKonto + dEinzahlung;
                System.out.println(dEinzahlung + " Euro wurden eingezahlt");


            }
            else if (selection == 2) {
                System.out.println("Wie viel Geld wollen sie abheben");

                dAuszahlung = scanner.nextDouble();
                dKonto = dKonto - dAuszahlung;
                System.out.println(dAuszahlung + " Euro wurden Abgehoben");


            }
            else if (selection == 3) {
                System.out.println("Ihr Kontostand lautet: " + dKonto);

            }
            else if (selection == 4) {
                System.out.println("Ihr Programm wird beendet");

            }
            else {
                System.out.println("Falsche eingabe");
            }

        }while(selection != 4);


    }
}