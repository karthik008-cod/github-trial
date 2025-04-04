package javaInput;
import java.util.Scanner;
public class NumberOf_0s_InANumber {
    public static int length(int x){
        int i=1;
        for (i=1;i<=100;i++){
            x = x/10;
            int n=i;
            if (x==0){
                break;
            }
        }
        return i;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n,length,count=0;
        System.out.print("Enter a number: ");
        n = sc.nextInt();
        length = length(n);
        for(int i=0;i<=length;i++){
            if (n%10 == 0){
                count += 1;
            }
            n /= 10;
        }
        System.out.print("No.of zero(s) in the above number is/are: "+(count-1));
    }
}