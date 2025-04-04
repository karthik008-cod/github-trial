package javaInput;
import java.util.Scanner;
public class Factorial {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n;
        System.out.print("Enter n value to get nth factorial: ");
        n = sc.nextInt();
        int fact = 1;
        for(int i=n;i>=1;i--){
            fact *= i;
        }
        System.out.print(n+"! = "+fact);
    }
}