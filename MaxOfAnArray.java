package javaInput;
import java.util.*;
public class MaxOfAnArray {
    public static void main(String[] args) {
        int[] arr = {2,3,4,9,6,7,66,21,54,75,84,32,51};
        int max = arr[0];
        for(int i = 1;i<arr.length;i++){
            if (max<arr[i]){
                max = arr[i];
            }
        }
        System.out.println(max);
    }
}
