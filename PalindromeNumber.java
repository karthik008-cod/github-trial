package javaInput;
import java.util.*;
public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to check weather it is a Palindrome number or not: ");
        int n = sc.nextInt();
        int org = n;
        int input = n;
        int size = 0;
        for(int i=1;i<=n;i++){
            size = i;
            n /= 10;
            if(n==0){
                break;
            }
        }
        int lastDigit = 0;
        int rev = 0;
        for(int j=0;j<=size;j++){
            lastDigit = org%10;
            rev = (rev*10)+(lastDigit);
            org /= 10;
        }
        System.out.println(rev);
        if (input == rev){
            System.out.print(input+" is a PALINDROME number");
        } else System.out.print(input+" is NOT a PALINDROME number");
    }
}
