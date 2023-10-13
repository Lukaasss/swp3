package at.lus.basic;
import java.io.CharConversionException;
import java.util.Scanner;

public class Caesar_Verschluesselung {
    public static void main(String[] args){

        String result = encrypt(3, "hallo");
    }

    //Scanner scanner = new Scanner(System.in);
    //String selection ="";
    //selection = scanner.nextln();

    public static String encrypt(int shift, String stringToEncrypt){

        char[] inputData = stringToEncrypt.toCharArray();

        for (int i = 0; i < inputData.length; i++) {

            int letter = inputData[i] + shift;
            System.out.println("Neue Buchstaben: " + Character.toString(letter));
        }


        return "";
    }



}
