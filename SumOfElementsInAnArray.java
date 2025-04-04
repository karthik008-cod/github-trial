package javaInput;
import java.util.*;
public class SumOfElementsInAnArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,6,5,4,7,8,9};
        int sum = 0;
        for(int i = 0;i<9;i++){
            sum += arr[i];
        }
        System.out.println(sum);
    }
}
