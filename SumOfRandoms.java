package javaInput;
import java.util.Scanner;
import java.util.Random;
public class SumOfRandoms {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int ll,ul,n;
        System.out.print("Enter the upper limit for the maximum of the numbers: ");
        ul = sc.nextInt();
        System.out.print("Enter the lower limit for the maximum of the numbers: ");
        ll = sc.nextInt();
        System.out.print("Enter the number of problems to be generated: ");
        n = sc.nextInt();
        for(int i=1;i<=n;i++){
            int xi = random.nextInt(ll,ul)+1;
            int yi = random.nextInt(ll,ul)+1;
            System.out.println(xi+" "+yi);
            //System.out.println(i+". "+xi+" + "+yi+" =____________");
        }
    }
}