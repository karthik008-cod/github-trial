package javaInput;
import java.util.*;
public class sumOfDigitsTillOneDigit {

    public static int Sum(int n, int length) {
        int lastDigit = 0;
        int sum = 0;
        for(int i=0;i<=length;i++){
            lastDigit = n%10;
            sum += lastDigit;
            n /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to get the\nsum of all the digits till\nthe sum becomes a single digit: ");
        int n = sc.nextInt();
        int length = String.valueOf(n).length();
        int sum = 0;
        for(int i=0;i<=length;i++){
            sum = Sum(n,length);
            n = sum;
        }
        System.out.println("The sum is: "+n);
    }
}
