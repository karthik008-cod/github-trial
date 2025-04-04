package javaInput;
import java.util.*;
public class DateToDay {

    public static int calculate(int D, int M, int Y){
        int ans = 0;
        if (Y<400){

        }else {
            ans = Y%400;
//            if (){
//
//            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Date in (DD) format: ");
        int D = sc.nextInt();
        System.out.println("Enter The Month in (MM) format: ");
        int M = sc.nextInt();
        System.out.println("Enter The Year in (YYYY) format: ");
        int Y = sc.nextInt();
        if ((M==1 && D<=31) || (M==2 && D<=29) || (M==3 && D<=31) || (M==4 && D<=30) || (M==5 && D<=31) || (M==6 && D<=30) || (M==7 && D<=31) || (M==8 && D<=31) || (M==9 && D<=30) || (M==10 && D<=31) || (M==11 && D<=30) || (M==12 && D<=31)){
            if ((M==2 && Y%4!=0 && D<=28) || (M==2 && Y%400!=0 && D<=28)){
                calculate(D,M,Y);
            }else System.out.println("Invalid Date!");
        }else System.out.println("Invalid Date!");
    }
}
