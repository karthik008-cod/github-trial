package javaInput;
import java.util.*;
public class ReverseEveryWordInASentence {

    public static String Rev(String word){
        String rev = "";
        for(int i=word.length()-1; i >= 0; i--){
            rev += word.charAt(i);
        }
        return rev;
    }

    public static int FindSpace(String input, int firstGap){
        int i = firstGap;
        while(i < input.length() && input.charAt(i) != ' '){
            i++;
        }
        return i;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        int firstSpace = 0;
        int secondSpace = FindSpace(input, firstSpace);

        while(secondSpace <= input.length()){
            String word = input.substring(firstSpace, secondSpace).trim();
            if(!word.isEmpty()){
                System.out.print(Rev(word)+" ");
            }
            firstSpace = secondSpace + 1;
            secondSpace = FindSpace(input, firstSpace);
        }
    }
}