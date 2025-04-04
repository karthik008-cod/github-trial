package javaInput;
import java.util.*;
public class DecimalToBinaryConverter {

    public static int rev(int input, int length){
        int n = input;
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
        return rev;
    }

    public static int converter(int input, int length){
        int ans = 0;
        int DN = input;
        int rem = 0;
        for(int i=0;i<=input;i++){
                rem = DN % 2;
                ans = (ans * 10) + rem;
                DN /= 2;
                if (DN == 0 || DN == 1){
                    break;
                }
        }
        ans = rev((ans*10)+1, length);
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int input = sc.nextInt();
        int DN = input;
        int length = 0;
        while(DN>0){
            length++;
            DN /= 10;
        }
        int i = 0;
        int count = 0;
        for(i = 1; i <= 25;i++){
            if (input == Math.pow(2,i)){
                count++;
                System.out.println("Binary form of "+input+" is: "+(int)(Math.pow(10,i)));
                break;
            }else count = 0;
        }
        if (count == 0){
            System.out.println("Binary form of "+input+" is: "+(converter(input, length)));
        }
    }
}
