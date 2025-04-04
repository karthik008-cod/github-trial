package javaInput;
import java.util.Scanner;
public class ThreePoints {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the abscissa of the first point: ");
        int x1 = sc.nextInt();
        System.out.print("Enter the ordinate of the first point: ");
        int y1 = sc.nextInt();
        System.out.print("Enter the abscissa of the second point: ");
        int x2 = sc.nextInt();
        System.out.print("Enter the ordinate of the second point: ");
        int y2 = sc.nextInt();
        System.out.print("Enter the abscissa of the third point: ");
        int x3 = sc.nextInt();
        System.out.print("Enter the ordinate of the third point: ");
        int y3 = sc.nextInt();
        double area = (0.5)*(x1*(y2 - y3) + x2*(y3 - y1) + x3*(y1 - y2));
        if (area == 0){
            System.out.print("The entered co-ordinates lie on a single line");
        }
        else System.out.print("The area of the triangle formed by the co-ordinates is "+area);
    }
}