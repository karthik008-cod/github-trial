package javaInput;
import java.util.*;
public class RandomFromString {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        // create string for all char
        String symbol = "+-x/";

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
        System.out.println("Random string is "+randomString);
    }
}