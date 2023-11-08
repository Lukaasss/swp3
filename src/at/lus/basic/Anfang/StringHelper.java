package at.lus.basic.Anfang;
import java.util.Scanner;
public class StringHelper {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        String Palindrome = "";

        System.out.println("Geben sie ein Wort ein: ");

        Palindrome = scanner.nextLine();

        boolean result3 = isPalindrome(Palindrome);

        System.out.println(result3);

            String wort = "";

            System.out.println("Geben sie einen Satz ein: ");

            wort = scanner.nextLine();


            char buchstabe = ' ';

            System.out.println("Geben sie einen Buchstaben ein: ");

            buchstabe = scanner.next().charAt(0);


            int result = countLetters(wort, buchstabe);
            System.out.println("Es wurden " + result + " gefunden");



    }
    public static int countLetters (String text, char search){

        char[] textArray = text.toCharArray();
        int count = 0;

        for(int i = 0; i < textArray.length; i++) {

            if(textArray[i] == search) {

                count ++;

            }

        }

        return count;
    }


    public static boolean isPalindrome (String Palindrome){

        int iHilfe = 0;
        int i2 = 0;
        boolean Ausgabe = true;
        char[] PalindromArray = Palindrome.toCharArray();

        for (int i = PalindromArray.length - 1; i > 0; i--) {


            if(PalindromArray[i] == PalindromArray[i2])
            {
                i2++;

            }else{
                iHilfe = 1;
            }
            if(iHilfe == 1)
            {
                Ausgabe = false;
            }



        }


        return Ausgabe;
    }



}
