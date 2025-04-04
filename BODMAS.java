package javaInput;
import java.util.*;
public class BODMAS {

//    public static char sign(String[] args) {
//        Random random = new Random();
//        int sign = random.nextInt(1,5);
//        int symbol;
//        if (sign == 1){
//            symbol = '+';
//        }else if (sign == 2){
//            symbol = '-';
//        }else if (sign == 3){
//            symbol = 'x';
//        }else if (sign == 4){
//            symbol = '÷';
//        }
//        return symbol;
//    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int ul,N;
        byte ll;
        System.out.print("Enter the upper limit for the maximum of the numbers: ");
        ul = sc.nextInt();
        System.out.print("Enter the lower limit for the minimum of the numbers: ");
        ll = sc.nextByte();
        System.out.print("Enter no.of problems to be created: ");
        N = sc.nextInt();
        for(int i=1;i<=N;i++){
            //int  type = random.nextInt(0,24);
            int x1 = random.nextInt(ll,ul);
            int x2 = random.nextInt(ll,ul);
            int x3 = random.nextInt(ll,ul);
            int x4 = random.nextInt(ll,ul);
            int x5 = random.nextInt(ll,ul);

        }
    }
}