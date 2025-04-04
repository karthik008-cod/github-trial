package javaInput;
import java.util.*;
public class FractionOfNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        System.out.print("Enter the no.of problems: ");
        int N = sc.nextInt();
        for(int i=1;i<=N;i++){
            int n = random.nextInt(1,10);
            int d = random.nextInt(11,20);
            int x = random.nextInt(10,500);
            System.out.println(i+". "+n+"/"+d+" of "+x);
        }
    }
}