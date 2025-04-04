package javaInput;
import java.util.*;
public class HarshadNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int org = n;
        int length = String.valueOf(n).length();
        int lastDigit = 0;
        int sum = 0;
        for(int i=0;i<=length;i++){
            lastDigit = n%10;
            sum += lastDigit;
            n /= 10;
        }
        if (org%sum==0){
            System.out.print(org+" is a HARSHAD NUMBER");
        }else System.out.print(org+" is NOT a HARSHAD NUMBER");
    }
}
