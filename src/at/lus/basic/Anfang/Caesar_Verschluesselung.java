package at.lus.basic.Anfang;
import java.io.CharConversionException;
import java.util.Scanner;

public class Caesar_Verschluesselung {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);


        String selection ="";

        System.out.println("Geben sie ein Wort ein: ");

        selection = scanner.nextLine();


        int Zahl = 0;

        System.out.println("Geben sie die Verschiebung an: ");

        Zahl = scanner.nextInt();


        String result = encrypt(Zahl, selection);
    }

    public static String encrypt(int shift, String stringToEncrypt){

        char[] inputData = stringToEncrypt.toCharArray();

        for (int i = 0; i < inputData.length; i++) {

            int letter = inputData[i] + shift;
            System.out.println("Neue Buchstaben: " + Character.toString(letter));
        }


        return "";
    }



}
