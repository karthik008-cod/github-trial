package javaInput;
import java.util.*;
public class SearchAnArray {
    public static void main(String[] args) {
        int[] arr = {4,2,46,5,4,21,65,4,321,6385,7,32,45,1,3,541,5,1};
        int x = 5;
        int index = -1;
        for(int i=0;i<arr.length;i++){
            if (arr[i]==x){
                index = i;
                System.out.println(i);
            }
        }
        if (index == -1){
            System.out.println(index);
        }
    }
}
