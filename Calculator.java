package javaInput;
import java.util.*;
public class Calculator {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        System.out.println("REMEMBER '/' gives the QUOTIENT and '%' gives the REMAINDER");
        System.out.println("Press '*' for MULTIPLICATION");
        System.out.println("ONLY INTEGERS ARE ALLOWED");
        System.out.print("Enter a number, press space, then enter the operator, again space, and the second number:");
        int n1 = sc.nextInt();
        char operator = sc.next().charAt(0);
        int n2 = sc.nextInt();
        if ((int) operator == 43){
            System.out.print(n1+" + "+n2+" = "+(n1+n2));
        } else if ((int) operator == 45){
            System.out.print(n1+" - "+n2+" = "+(n1-n2));
        }else if ((int) operator == 42){
            System.out.print(n1+" X "+n2+" = "+(n1*n2));
        }else if ((int) operator == 47){
            System.out.print(n1+" / "+n2+" = "+(n1/n2));
        }else System.out.print("\nINVALID INPUT");
    }
}
