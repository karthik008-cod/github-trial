package javaInput;
import java.util.*;
public class BinaryConverter {

    public static int BNtoDN_Converter(int input, int length){
        int ans = 0;
        for(int i = length;i>=1;i--){
            ans = ans + (int)((int)(input/Math.pow(10,i-1))*(int)(Math.pow(2,i-1)));
            input = input % ((int) Math.pow(10,i-1));
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Binary Number: ");
        int input = sc.nextInt();
        int BN = input;
        int n = input;
        int length = 0;
        for(int i=0;i<=100;i++){
            if (n/10 == 0){
                length++;
                break;
            }
            length++;
            n /= 10;
        }
        int count = 0;
        for(int i=0;i<=20;i++){
            if (BN%10 != 0 && BN%10 != 1){
                System.out.println("❌Invalid input!❌");
                count++;
                break;
            }else count = 0;
        }
        if (count == 0){
            System.out.println("Decimal form of "+input+" is: "+BNtoDN_Converter(input,length));
        }else System.out.println("❌Invalid input!❌");
    }

}
