package javaInput;
import java.util.*;
public class AgeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Year of Birth: ");
        int y = sc.nextInt();
        System.out.print("Enter your Birth Month (MM) and Date (DD) by pressing the <SPACE> key: ");
        int m = sc.nextInt();
        int d = sc.nextInt();
        System.out.print("Enter today's Date (DD) format: ");
        int D = sc.nextInt();
        System.out.print("Enter the current Month in (MM) format: ");
        int M = sc.nextInt();
        System.out.print("Enter the current Year in (YYYY) format: ");
        int Y= sc.nextInt();
        if (M>m){
            System.out.print("Your Age is: "+(Y-y));
        } else if (M<m) {
            System.out.print("Your Age is: "+(Y-y-1));
        } else if (M==m){
            if(D>d){
                System.out.print("Your Age is: "+(Y-y));
            } else if(D<d){
                System.out.print("Your Age is: "+(Y-y-1));
            } else if (D==d){
                System.out.println("Ohh! Its your BIRTHDAY!!\nHAPPY BIRTHDAY \uD83C\uDF89 \uD83C\uDF8A");
                System.out.print("Your Age is: "+(Y-y));
            }
        }
    }
}
