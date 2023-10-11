package at.lus.basic;

import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;

public class Würfelspiel {

    public static void main(String[] args) {

        Random random = new Random();
        int winsPlayer = 0;
        int winsComp = 0;
        int draws = 0;


        System.out.println("Menü");
        System.out.println("");

            for (int i = 0; i < 6; i++) {

            int randomPlayer = random.nextInt(6) + 1;
            int randomComp = random.nextInt(6) + 1;

            if (randomPlayer > randomComp) {
                winsPlayer++;
            } else if (randomPlayer < randomComp) {
                winsComp++;
            } else {
                draws++;
            }


            System.out.println("Player " + randomPlayer + " Computer " + randomComp);

            }

            System.out.println("----------------------------------------------");
            System.out.println("Player: " + winsPlayer + " Computer " + winsComp + " Draws: " + draws);

            if(winsPlayer < winsComp)
            {
                System.out.println("Computer wins");
            }else if(winsPlayer > winsComp)
            {
                System.out.println("Player wins");
            }

    }

}
