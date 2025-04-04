package javaInput;
import java.util.Scanner;
public class Absolute {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter an Integer: ");
        int n = sc.nextInt();
        int abs;
        if(n==0){
            System.out.print("Absolute value of 0 is 0");
        }
        else if (n<0) {
            abs=-n;
            System.out.print("Absolute value of "+n+" is "+abs);
        }
        else System.out.print("Absolute value of "+n+" is "+n);
    }
}