package javaInput;
import java.util.*;
public class NumberByMultipleOfTen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        System.out.print("Enter the no.of problems: ");
        int N = sc.nextInt();
        for(int i=1;i<=N;i++){
            int x = random.nextInt(10,1000);
            int n = random.nextInt(1,6);
            int power = 10;
            for(int j=1;j<=n;j++){
                power *= 10;
            }
            System.out.println(i+". "+x+"/"+power);
        }
    }
}