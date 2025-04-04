package javaInput;
import java.util.*;
public class TicTacToe {

    public static void gameStart(String name, char[][] board){
        System.out.println(board);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your Name: ");
        String name = sc.nextLine();
        char[][] board = new char[3][5];
        gameStart(name, board);
    }
}
