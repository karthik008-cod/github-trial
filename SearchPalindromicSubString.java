package javaInput;
import java.util.*;
public class SearchPalindromicSubString {
    public static boolean tf (String s){
        int i = 0;
        int j = s.length()-1;
        while(i<j){
            if (s.charAt(i) != s.charAt(j)){
                return false;
            }
            i++;j--;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        int count =0;
        for(int i=0;i<input.length();i++){
            for(int j=i+1;j<=input.length();j++){
                if (tf(input.substring(i,j))){
                    System.out.println(input.substring(i,j));
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
