package javaInput;
import java.util.*;
public class ReversingString {

    public static void ReversePrinting(String name, int index){
        if (index == 0){
            System.out.print(name.charAt(index));
            return;
        }
        System.out.print(name.charAt(index));
        ReversePrinting(name, index-1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your Name: ");
        String name = sc.nextLine();
        int length = String.valueOf(name).length();
        ReversePrinting(name, length-1);
    }
}
