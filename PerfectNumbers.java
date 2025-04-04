package javaInput;
import java.util.*;
public class PerfectNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to know weather it is a Perfect number or not: ");
        int n = sc.nextInt();
        int d = 0;
        for(int i=1;i<=n/2;i++){
            if (n%i ==0){
                d += i;
            }
        }
        if (n==d){
            System.out.print(n+" is a PERFECT number !!");
        }else System.out.print(n+" is NOT a PERFECT number !!");
    }
}
