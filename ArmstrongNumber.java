package javaInput;
import java.util.*;
public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to check weather the number is Armstrong Number: ");
        int n = sc.nextInt();
        int org = n;
        int input = org;
        int size = 0;
        for(int i=1;i<=n;i++){
            size = i;
            n /= 10;
            if(n==0){
                break;
            }
        }
        int cubeOfLastDigit = 0;
        int lastDigit = 0;
        for(int j=1;j<=size;j++){
            lastDigit = org%10;
            cubeOfLastDigit += lastDigit*lastDigit*lastDigit;
            org /= 10;
        }
        if (input == cubeOfLastDigit){
            System.out.print(input+" is an ARMSTRONG NUMBER");
        }else System.out.print(input+" is NOT an ARMSTRONG NUMBER");
    }
}
