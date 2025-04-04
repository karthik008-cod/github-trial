package javaInput;
import java.util.*;
public class FirstAndLastOccurance {

    public static void Occurance(String name, int index, char a) {
        if (index+1 == name.length()){
            System.out.println(index+1);
            return;
        }
        char alpha = name.charAt(index);
        int position;
        if (a == alpha){
            position = index + 1;
        }
        Occurance(name, index+1, 'a');
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your Name: ");
        String name = sc.nextLine();
        Occurance(name,0, 'a');
    }
}
