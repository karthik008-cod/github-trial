package javaInput;
import java.util.*;
public class PercentageOfNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        System.out.print("Enter the percentage : ");
        int p = sc.nextInt();
        System.out.print("Enter the no.of problems to be created: ");
        int n = sc.nextInt();
        for(int i=1;i<=n;i++){
            int x = random.nextInt(1,100);
            System.out.println(i+". "+p+"% of "+(x*10));
        }
    }
}