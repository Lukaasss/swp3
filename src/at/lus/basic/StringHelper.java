package at.lus.basic;
import java.util.Scanner;
public class StringHelper {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        String wort ="";

        System.out.println("Geben sie einen Satz ein: ");

        wort = scanner.nextLine();


        char buchstabe =' ';

        System.out.println("Geben sie einen Buchstaben ein: ");

        buchstabe = scanner.next().charAt(buchstabe);


        int result = countLetters(wort, buchstabe);
        System.out.println("Es wurden" + result + "gefunden");
    }


    public static boolean isPalindrome (String text){

        return false;
    }

    public static int countLetters (String text, char search){

        char[] textArray = text.toCharArray();
        int count = 0;

        for (int i = 0; i < textArray.length; i++) {

            if(textArray[i] == search) {

                count ++;

            }

        }

        return count;
    }

}
