package at.lus.basic;

import java.util.Random;

public class ControlStructurs3 {

    public static void main(String[] args) {

        Random random = new Random();
        int randomNumber = random.nextInt(100);


        if (randomNumber < 20) {
            System.out.println(randomNumber);
            System.out.print("mini");
        } else if ((randomNumber > 20) && (randomNumber < 50)) {
            System.out.println(randomNumber);
            System.out.print("medium");
        } else {
            System.out.println(randomNumber);
            System.out.print("large");
        }


    }
}