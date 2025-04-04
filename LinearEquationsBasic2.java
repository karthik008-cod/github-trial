package javaInput;
import java.util.*;
public class LinearEquationsBasic2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        System.out.print("Enter no.of problems: ");
        int n = sc.nextInt();
        for(int i=1;i<=n;i++){
            int coefficient = random.nextInt(2,21);
            int x = random.nextInt(1,41);
            System.out.println(i+". "+coefficient+"x = "+x);
        }
    }
}