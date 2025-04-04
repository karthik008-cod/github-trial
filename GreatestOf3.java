package javaInput;
import java.util.Scanner;
public class GreatestOf3 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter First number: ");
        int x = sc.nextInt();
        System.out.print("Enter Second number: ");
        int y = sc.nextInt();
        System.out.print("Enter Third number: ");
        int z = sc.nextInt();
        if(x==y || y==z || z==x){
            System.out.print("Two or more numbers an not be same!!\n              BUT....\n");
        }
        if(x>=y && x>=z){
            System.out.print(x+" is the GREATEST among the three");
        }
        else if(y>=x && y>=z){
            System.out.print(y+" is the GREATEST among the three");
        }
        else if(z>=y && z>=x){
            System.out.print(z+" is the GREATEST among the three");
        }
    }
}