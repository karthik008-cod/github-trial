package javaInput;
import java.util.*;
public class nthTermOfFibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Fibonacci Sequence: 0,1,1,2,3,5,8,13,21,34..........");
        System.out.print("Enter n to get nth term of the Fibonacci Sequence: ");
        int n = sc.nextInt();
        int x = 1;
        int p = 0;
        int c = 0;
        for(int i=1;i<=n-1;i++){
            c = x+p;
            x = p;
            p = c;
        }
        if (n>=1){
            if (n%10 == 1){
                System.out.print(n+"st term of the sequence is: "+c);
            } else if (n%10 == 2){
                System.out.print(n+"nd term of the sequence is: "+c);
            } else System.out.print(n+"th term of the sequence is: "+c);
        } else System.out.print("INVALID INPUT");
    }
}
