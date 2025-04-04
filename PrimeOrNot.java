package javaInput;
import java.util.*;
public class PrimeOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to check weather if it is a Prime number or not: ");
        int n = sc.nextInt();
        int org = n;
        int divisor = 0;
        for(int i=1;i<=n/2;i++){
            if(n%i == 0){
                divisor = i;
            }
        }
        if (org == 1){
            System.out.print("According to the definition of prime numbers,\nany number having only two positive divisors \nare known as prime numbers. \nSo, is 1 a prime number or not? Is it a composite number? \nThe answer to this question is: No, 1 is \nnot a prime number and it is not a composite number!");
        }else if(org == 0){
            System.out.print("Zero is neither prime nor composite.");
        }else if (divisor>1){
            System.out.print(org+" is Not a prime as it has some Divisors");
        }else if(divisor == 1){
            System.out.print(org+" is a PRIME number");
        }else System.out.print("INVALID INPUT");
    }
}
