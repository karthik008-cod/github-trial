package javaInput;
import java.util.Scanner;
public class ProfitLoss {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter Cost Price: ");
        double cp = sc.nextDouble();
        System.out.print("Enter Selling Price: ");
        double sp = sc.nextDouble();
        if(cp==sp){
            System.out.print("You Neither earned Profit nor loss");
        }
        else if (cp>sp) {
            System.out.println("You Incurred a loss of "+(sp-cp)+" ₹");
        }
        else if (sp>cp) {
            System.out.println("You Incurred a profit of "+(sp-cp)+" ₹");
        }
    }
}