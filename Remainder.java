package javaInput;
import java.util.Scanner;
public class Remainder {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int D,d,r;
        System.out.print("Enter Dividend: ");
        D= sc.nextInt();
        System.out.print("Enter Divisor: ");
        d= sc.nextInt();
        System.out.println("The Remainder is : "+(D%d));
    }
}