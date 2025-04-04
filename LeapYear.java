package javaInput;
import java.util.Scanner;
public class LeapYear {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the Year: ");
        int year = sc.nextInt();
        if(year%100==0){
            System.out.println(year+" is NOT a Leap year");
        }
        else if (year%4==0) {
            System.out.println(year+" is a Leap year");
        }
        else System.out.println(year+" is NOT a Leap year");
    }
}