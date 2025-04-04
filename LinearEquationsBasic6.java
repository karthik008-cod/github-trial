package javaInput;
import java.util.*;
public class LinearEquationsBasic6 {

    public static String Power() {
        // create string for all char
        String symbol = " ²³";

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

    public static String symbol() {
        // create string for all char
        String symbol = "xyz";

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

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        System.out.print("Enter no.of problems: ");
        int n = sc.nextInt();
        for(int i=1;i<=n;i++){
            int type = random.nextInt(1,5);
            int coefficient1 = random.nextInt(-10,11);
            int coefficient2 = random.nextInt(1,11);
            int coefficient3 = random.nextInt(1,11);
            int power = random.nextInt(1,4);
            if (type == 1){
                System.out.println(i+". "+coefficient1+symbol()+Power()+"("+coefficient2+symbol()+Power()+" + "+coefficient3+symbol()+Power()+")");
            } else if (type == 2){
                System.out.println(i+". ("+coefficient1+symbol()+Power()+" + "+coefficient2+symbol()+Power()+")"+coefficient3+symbol()+Power());
            } else if (type == 3){
                System.out.println(i+". "+coefficient1+symbol()+Power()+"("+coefficient2+symbol()+Power()+" - "+coefficient3+symbol()+Power()+")");
            }else if (type == 4){
                System.out.println(i+". ("+coefficient1+symbol()+Power()+" - "+coefficient2+symbol()+Power()+")"+coefficient3+symbol()+Power());

            }
        }
    }
}