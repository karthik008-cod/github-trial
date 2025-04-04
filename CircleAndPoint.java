package javaInput;
import java.util.Scanner;
import java.lang.Math;
public class CircleAndPoint {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the ABSCISSA of the centre of the circle: ");
        int x = sc.nextInt();
        System.out.print("Enter the ORDINATE of the centre of the circle: ");
        int y = sc.nextInt();
        System.out.print("Enter the RADIUS of the circle: ");
        int r = sc.nextInt();
        System.out.print("Enter the ABSCISSA of the point: ");
        int x1 = sc.nextInt();
        System.out.print("Enter the ORDINATE of the point: ");
        int y1 = sc.nextInt();
        System.out.println(" ");
        double d;
        d = Math.pow(((x1-x)*(x1-x))+((y1-y)*(y1-y)),0.5);
//        System.out.println(d);
        double D;
        if (d<0){
            D=-d;
        }
        else D=d;
        if (D>r){
            System.out.print("The point lies outside the circle");
        }
        else if (r>D) {
            System.out.print("The point lies inside the circle");
        }
        else if(r==D) System.out.println("The point lies on the circle");
    }
}