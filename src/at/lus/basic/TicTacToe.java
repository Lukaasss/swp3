package at.lus.basic;
import java.sql.SQLOutput;
import java.util.Scanner;

public class TicTacToe {


    public static void main(String[] args) {



        int iAuswahl = ' ';
        int iÜberprüfung = 0;
        int ibeendet = 0;
        int isieg = 0;
        int iunentschieden = 0;
        Scanner scanner = new Scanner(System.in);

        int[]  iumgewandelt = new int[2];
        char[][] cboard = new char[3][3];
        int[][] ifrei = new int [3][3];



        for (int i = 0; i < cboard.length; i++) {
            for (int j = 0; j < cboard.length; j++) {
                cboard[i][j] = ' ';
            }
        }

        for (int i = 0; i < ifrei.length; i++) {
            for (int j = 0; j < ifrei.length; j++) {
                ifrei[i][j] = 0;
            }
        }



        System.out.println("Geben sie abwechselnd die Zeilen an.");
        System.out.println("1|2|3\n"  +
                "4|5|6\n" +
                "7|8|9\n");


        do {

            anzeigeSpielfeld(cboard);

            System.out.println("Der erste Spieler mit dem X ist dran, wo möchten sie es hinsetzen");
            System.out.print("->");


            do {


                iAuswahl = scanner.nextInt();

                iÜberprüfung = isavailable(ifrei, iAuswahl);

                if (iÜberprüfung == 0) {


