package at.lus.basic;
import java.util.Scanner;
public class TicTacToe {

    public static void main(String[] args) {

        Scanner scanner = new Scanner (System.in);

        System.out.println("********************");
        System.out.println("     TicTacToe     ");
        System.out.println("********************");


        char[][] board =   {{' ', '|', ' ','|', ' '},
                            {'-', '-', '-','-', '-'},
                            {' ', '|', ' ','|', ' '},
                            {'-', '-', '-','-', '-'},
                            {' ', '|', ' ','|', ' '}};
        gameboard(board);

    }

    public static void gameboard(char[][] board) {

    for(char[] row : board) {
        for(char c : row) {
            System.out.print(c);
        }
        System.out.println();
    }

    }

}
