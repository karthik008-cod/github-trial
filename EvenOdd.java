package javaInput;
import java.util.Scanner;
public class EvenOdd {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int x = sc.nextInt();
        if(x%2==0){
            System.out.println(x+" is an EVEN number");
        }
        else System.out.println(x+" is an ODD number");
    }
}