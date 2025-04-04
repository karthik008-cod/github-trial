package javaInput;
import java.util.*;
public class LinearEquationsBasic5 {
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
            int denominator = random.nextInt(2,11);
            if (type == 1){
                System.out.println(i+". "+coefficient+"x/"+denominator+" + "+a1+" = "+b1);
            } else if (type == 2){
                System.out.println(i+". "+a1+" + "+coefficient+"x/"+denominator+" = "+b1);
            } else if (type == 3){
                System.out.println(i+". "+a1+" = "+b1+" + "+coefficient+"x/"+denominator);
            }else if (type == 4){
                System.out.println(i+". "+a1+" = "+b1+" - "+coefficient+"x/"+denominator);
            }else if (type == 5){
                System.out.println(i+". "+a1+" - "+coefficient+"x/"+denominator+" = "+b1);
            }else if (type == 1){
                System.out.println(i+". "+coefficient+"x/"+denominator+" - "+a1+" = "+b1);
            }
        }
    }
}