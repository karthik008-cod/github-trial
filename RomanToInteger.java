package javaInput;
import java.util.*;
public class RomanToInteger {

    public static boolean errorChecker(String input){
        int count = 0;
        for(int i=0;i<=input.length()-4;i++){
            if (input.charAt(i) == 'I' && input.charAt(i+1) == 'L'){
                count = 1;
            }else if (input.charAt(i) == 'I' && input.charAt(i+1) == 'C'){
                count = 1;
            }else if (input.charAt(i) == 'I' && input.charAt(i+1) == 'D'){
                count = 1;
            }else if (input.charAt(i) == 'I' && input.charAt(i+1) == 'M'){
                count = 1;
            }else if (input.charAt(i) == 'X' && input.charAt(i+1) == 'D'){
                count = 1;
            }else if (input.charAt(i) == 'X' && input.charAt(i+1) == 'M'){
                count = 1;
            }else if (input.charAt(i) == 'L' && input.charAt(i+1) == 'D'){
                count = 1;
            }else if (input.charAt(i) == 'L' && input.charAt(i+1) == 'M'){
                count = 1;
            }else if (input.charAt(i) == 'V' && input.charAt(i+1) == 'V'){
                count = 1;
            }else if (input.charAt(i) == 'L' && input.charAt(i+1) == 'L'){
                count = 1;
            }else if (input.charAt(i) == 'D' && input.charAt(i+1) == 'D'){
                count = 1;
            }else if (input.charAt(i) != 'I' && input.charAt(i) != 'V' && input.charAt(i) != 'X' && input.charAt(i) != 'L' && input.charAt(i) != 'C' && input.charAt(i) != 'D' && input.charAt(i) != 'M') {
                System.out.println("Enter valid ROMAN !");
                count = 1;
            } else if (input.charAt(i) == input.charAt(i + 1) && input.charAt(i + 1) == input.charAt(i + 2) && input.charAt(i + 2) == input.charAt(i + 3)) {
                System.out.println("Enter valid ROMAN !");
                count = 1;
            }
        }
        if (count == 1){
            return true;
        }else return false;
    }

    public static int value(char c){
        if (c == 'I'){
            return 1;
        }else if(c == 'V'){
            return 5;
        }else if(c == 'X'){
            return 10;
        }else if(c == 'L'){
            return 50;
        }else if(c == 'C'){
            return 100;
        }else if(c == 'D'){
            return 500;
        }else if(c == 'M') {
            return 1000;
        }else return 0;
    }

    public static boolean check(char a, char b){
        if (value(a)>=value(b)){
            return true;
        }else return false;
    }

    public static void calculate(String input){
        if (errorChecker(input)){
            System.out.println("Enter valid ROMAN !");
        }else{
            char a;
            char b;
            int ans = 0;
            if (value(input.charAt(0))>=value(input.charAt(1))){
                ans = value(input.charAt(0))+value(input.charAt(1));
            }else {
                ans = value(input.charAt(1))-value(input.charAt(0));
            }
            int j=1;
            while(j<=input.length()-2){
                a = input.charAt(j);
                b = input.charAt(j+1);
                if (check(a, b)){
                    ans = ans  + value(b);
                }else {
                    ans = ans + value(b) - 2*value(a);
                }
                j++;
            }
            System.out.println("Roman value of "+input+" is: "+ans);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter in ROMAN: ");
        String input = sc.nextLine();
        calculate(input);
    }

}