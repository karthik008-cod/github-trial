package javaInput;
import java.util.*;
public class LinearEquationsBasic4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        System.out.print("Enter no.of problems: ");
        int n = sc.nextInt();
        for(int i=1;i<=n;i++){
            int a1 = random.nextInt(10,50);
            int b1 = random.nextInt(10,50);
            int type = random.nextInt(1,7);
            int coefficient = random.nextInt(1,11);
            if (type == 1){
                System.out.println(i+". "+coefficient+"x + "+a1+" = "+b1);
            } else if (type == 2){
                System.out.println(i+". "+a1+" + "+coefficient+"x = "+b1);
            } else if (type == 3){
                System.out.println(i+". "+a1+" = "+b1+" + "+coefficient+"x");
            }else if (type == 4){
                System.out.println(i+". "+a1+" = "+b1+" - "+coefficient+"x");
            }else if (type == 5){
                System.out.println(i+". "+a1+" - "+coefficient+"x = "+b1);
            }else if (type == 1){
                System.out.println(i+". "+coefficient+"x - "+a1+" = "+b1);
            }
        }
    }
}