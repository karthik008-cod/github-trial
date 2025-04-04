package javaInput;
import java.util.*;
public class ReverseOfAnInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int x = n;
        int o = n;
        int size = 0;
        for(int i=1;i<=n;i++){
            x /= 10;
            size++;
            if(x==0){
                break;
            }
        }
        int rev = 0;
        int l = 0;
        for(int j=1;j<=size;j++){
            l = n%10;
            rev = (10*rev)+l;
            n /= 10;
        }
        System.out.print("Reverse of "+o+" is "+rev);
    }
}
