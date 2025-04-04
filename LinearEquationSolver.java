package javaInput;
import java.util.*;
public class LinearEquationSolver {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ax+b=cx+d is the General Form.\nWhere b,d are the constants and a,c are the Coefficients of the Variable 'x'...");
        System.out.print("Input the value of a: ");
        double a = sc.nextDouble();
        System.out.print("Input the value of b: ");
        double b = sc.nextDouble();
        System.out.print("Input the value of c: ");
        double c = sc.nextDouble();
        System.out.print("Input the value of d: ");
        double d = sc.nextDouble();
        System.out.println("The value of x = "+((d-b)/(a-c)));
    }
}
