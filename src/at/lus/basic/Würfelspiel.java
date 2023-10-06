package at.lus.basic;

import java.util.Random;
import java.util.Scanner;

public class Würfelspiel {

    public static void main(String[] args) {

        Random random = new Random();
        int winsofPlayer = 0;
        int winsofComp = 0;
        int draws = 0;


        System.out.println("Menü");
        System.out.println("");

            for (int i = 0; i < 6; i++) {

            int randomPlayer = random.nextInt(6) + 1;
            int randomComp = random.nextInt(6) + 1;

            if (randomPlayer > randomComp) {
                winsofPlayer++;
            } else if (randomPlayer < randomComp) {
                winsofComp++;
            } else {
                draws++;
            }


            System.out.println("Player " + randomPlayer + " Computer " + randomComp);

            }

            System.out.println("----------------------------------------------");
            System.out.println("Player: " + winsofPlayer + " Computer " + winsofComp + " Draws: " + draws);

    }

}
