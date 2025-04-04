package javaInput;
import org.w3c.dom.ls.LSOutput;

import java.util.*;

public class BODMAS2 {
    public static String symbol() {
        // create string for all char
        String symbol = "+-x÷";

        // create random string builder
        StringBuilder sb = new StringBuilder();

        //create an object of random string
        Random random = new Random();

        // specify the length of random string
        int length =1;
        for (int i = 0;i<length;i++){
            // generate random index number from string
            int index = random.nextInt(symbol.length());

            //get character specified by index from string
            char randomChar = symbol.charAt(index);

            //append the character to string builder
            sb.append(randomChar);
        }
        String randomString = sb.toString();
        return randomString;
    }

    public static int numbers(int ul,int ll) {
        Random random = new Random();
        int x = random.nextInt(ll,ul);
        return x;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int ul,n;
        byte ll;
        System.out.print("Enter the upper limit for the maximum of the numbers: ");
        ul = sc.nextInt();
        System.out.print("Enter the lower limit for the minimum of the numbers: ");
        ll = sc.nextByte();
        System.out.print("Enter no.of problems to be created: ");
        n = sc.nextInt();
        for(int i=1;i<=n;i++){
            System.out.println(i+". "+numbers(ul,ll)+" "+symbol()+" "+numbers(ul,ll)+" "+symbol()+" "+numbers(ul,ll)+" "+symbol()+" "+numbers(ul,ll)+" "+symbol()+" "+numbers(ul,ll)+" "+symbol()+" "+numbers(ul,ll)+" "+symbol()+" "+numbers(ul,ll));
        }
    }
}
