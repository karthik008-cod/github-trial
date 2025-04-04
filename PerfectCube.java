package javaInput;
import java.util.*;
public class PerfectCube {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to know weather the number is a Perfect Cube or not: ");
        int n = sc.nextInt();
        int CR = 0;
        for(int i=0;i<=n;i++){
            if(i*i*i==n){
                CR = i;
                break;
            }else CR = -2;
        }
        if (CR>=0){
            System.out.print(n+" is a Perfect Cube, and its Cube Root is: "+CR);
        }else if(CR == -2){
            System.out.print(n+" is NOT a Perfect Cube");
        }
    }
}
