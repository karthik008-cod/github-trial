package javaInput;
import java.util.Scanner;
public class SumOfTwoNumbers {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter First number: ");
        int x = sc.nextInt();
        System.out.print("Enter Second number: ");
        int y = sc.nextInt();
        System.out.println("Sum of "+x+" and "+y+" is "+(x+y));
    }
}