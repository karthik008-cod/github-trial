package javaInput;
import java.util.*;
public class PowerOf2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to check weather it is a power of 2 or not: ");
        int n = sc.nextInt();
        int x = 2;
        for(int i=1;i<=50;i++){
            x*=2;
            if(x==n){
                System.out.print(n+" is a power of 2");
                break;
            }
        }
        if(x!=n){
            System.out.print(n+" is NOT a power of 2");
        }
    }
}
