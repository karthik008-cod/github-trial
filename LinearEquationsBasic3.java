package javaInput;
import java.util.*;
public class LinearEquationsBasic3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        System.out.print("Enter no.of problems: ");
        int n = sc.nextInt();
        for(int i=1;i<=n;i++){
            int type = random.nextInt(1,3);
            int coefficient = random.nextInt(2,21);
            int x = random.nextInt(1,41);
            if (type == 1){
                System.out.println(i+". x/"+coefficient+" = "+x);
            } else if (type == 2){
                System.out.println(i+". "+coefficient+"/x = "+x);
            }
        }
    }
}