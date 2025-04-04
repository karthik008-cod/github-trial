package javaInput;
import java.util.*;
public class DifferentPercentageOfNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        System.out.print("Enter the no.of problems to be created: ");
        int n = sc.nextInt();
        for(int i=1;i<=n;i++){
            int p = random.nextInt(1,40);
            int x = random.nextInt(1,100);
            System.out.println(i+". "+(p*5)+"% of "+(x*10));
        }
    }
}