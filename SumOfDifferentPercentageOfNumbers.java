package javaInput;
import java.util.*;
public class SumOfDifferentPercentageOfNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        System.out.print("Enter the no.of problems to be created: ");
        int n = sc.nextInt();
        for(int i=1;i<=n;i++){
            int p1 = random.nextInt(1,40);
            int p2 = random.nextInt(1,40);
            int x1 = random.nextInt(1,100);
            int x2 = random.nextInt(1,100);
            System.out.println(i+". "+(p1*5)+"% of "+(x1*10)+" + "+(p2*5)+"% of "+(x2*10));
        }
    }
}