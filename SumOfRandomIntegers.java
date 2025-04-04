package javaInput;
import javax.swing.text.StyleContext;
import java.util.Scanner;
import java.util.Random;
public class SumOfRandomIntegers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int ul,n;
        byte ll;
        System.out.print("Enter the upper limit for the maximum of the numbers: ");
        ul = sc.nextInt();
        System.out.print("Enter the lower limit for the minimum of the numbers: ");
        ll = sc.nextByte();
        System.out.print("Enter the number of problems to be generated: ");
        n = sc.nextInt();
        for(int i=1;i<=n;i++){
            int ai = random.nextInt(ll,ul);
            int bi = random.nextInt(ll,ul);
            int ci = random.nextInt(ll,ul);
            int di = random.nextInt(ll,ul);
            int ei = random.nextInt(ll,ul);
            if (ai<=-1 && bi<=-1 && ci<=-1 && di<=-1 && ei<=-1){
                System.out.println(i+". "+ai+" - "+(-bi)+" - "+(-ci)+" - "+(-di)+" - "+(-ei)+" =____________");
            }else if (ai<=-1 && bi<=-1 && ci<=-1 && di<=-1 && ei>=0) System.out.println(i+". "+ai+" - "+(-bi)+" - "+(-ci)+" - "+(-di)+" + "+ei+" =____________");
            else if (ai<=-1 && bi<=-1 && ci<=-1 && di>=0 && ei<=-1) System.out.println(i+". "+ai+" - "+(-bi)+" - "+(-ci)+" + "+di+" - "+(-ei)+" =____________");
            else if (ai<=-1 && bi<=-1 && ci>=0 && di<=-1 && ei<=-1) System.out.println(i+". "+ai+" - "+(-bi)+" + "+ci+" - "+(-di)+" - "+(-ei)+" =____________");
            else if (ai<=-1 && bi>=0 && ci<=-1 && di<=-1 && ei<=-1) System.out.println(i+". "+ai+" + "+bi+" - "+(-ci)+" - "+(-di)+" - "+(-ei)+" =____________");
            else if (ai>=0 && bi<=-1 && ci<=-1 && di<=-1 && ei<=-1) System.out.println(i+". "+ai+" - "+(-bi)+" - "+(-ci)+" - "+(-di)+" - "+(-ei)+" =____________");
            else if (ai>=0 && bi>=0 && ci<=-1 && di<=-1 && ei<=-1) System.out.println(i+". "+ai+" + "+bi+" - "+(-ci)+" - "+(-di)+" - "+(-ei)+" =____________");
            else if (ai>=0 && bi<=-1 && ci>=0 && di<=-1 && ei<=-1) System.out.println(i+". "+ai+" - "+(-bi)+" + "+ci+" - "+(-di)+" - "+(-ei)+" =____________");
            else if (ai>=0 && bi<=-1 && ci<=-1 && di>=0 && ei<=-1) System.out.println(i+". "+ai+" - "+(-bi)+" - "+(-ci)+" + "+di+" - "+(-ei)+" =____________");
            else if (ai>=0 && bi<=-1 && ci<=-1 && di<=-1 && ei>=0) System.out.println(i+". "+ai+" - "+(-bi)+" - "+(-ci)+" - "+(-di)+" + "+ei+" =____________");
            else if (ai<=-1 && bi>=0 && ci>=0 && di<=-1 && ei<=-1) System.out.println(i+". "+ai+" + "+bi+" + "+ci+" - "+(-di)+" - "+(-ei)+" =____________");
            else if (ai<=-1 && bi>=0 && ci<=-1 && di>=0 && ei<=-1) System.out.println(i+". "+ai+" + "+bi+" - "+(-ci)+" + "+di+" - "+(-ei)+" =____________");
            else if (ai<=-1 && bi>=0 && ci<=-1 && di<=-1 && ei>=0) System.out.println(i+". "+ai+" + "+bi+" - "+(-ci)+" - "+(-di)+" + "+ei+" =____________");
            else if (ai<=-1 && bi<=-1 && ci>=0 && di>=0 && ei<=-1) System.out.println(i+". "+ai+" - "+(-bi)+" + "+ci+" + "+di+" - "+(-ei)+" =____________");
            else if (ai<=-1 && bi<=-1 && ci>=0 && di<=-1 && ei>=0) System.out.println(i+". "+ai+" - "+(-bi)+" + "+ci+" - "+(-di)+" + "+ei+" =____________");
            else if (ai<=-1 && bi<=-1 && ci<=-1 && di>=0 && ei>=0) System.out.println(i+". "+ai+" - "+(-bi)+" - "+(-ci)+" + "+di+" + "+ei+" =____________");
            else if (ai<=-1 && bi<=-1 && ci>=0 && di>=0 && ei>=0) System.out.println(i+". "+ai+" - "+(-bi)+" + "+ci+" + "+di+" + "+ei+" =____________");
            else if (ai<=-1 && bi>=0 && ci<=-1 && di>=0 && ei>=0) System.out.println(i+". "+ai+" + "+bi+" - "+(-ci)+" + "+di+" + "+ei+" =____________");
            else if (ai<=-1 && bi>=0 && ci>=0 && di<=-1 && ei>=0) System.out.println(i+". "+ai+" + "+bi+" + "+ci+" - "+(-di)+" + "+ei+" =____________");
            else if (ai<=-1 && bi>=0 && ci>=0 && di>=0 && ei<=-1) System.out.println(i+". "+ai+" + "+bi+" + "+ci+" + "+di+" - "+(-ei)+" =____________");
            else if (ai>=0 && bi<=-1 && ci<=-1 && di>=0 && ei>=0) System.out.println(i+". "+ai+" - "+(-bi)+" - "+(-ci)+" + "+di+" + "+ei+" =____________");
            else if (ai>=0 && bi<=-1 && ci>=0 && di<=-1 && ei>=0) System.out.println(i+". "+ai+" - "+(-bi)+" + "+ci+" - "+(-di)+" + "+ei+" =____________");
            else if (ai>=0 && bi<=-1 && ci>=0 && di>=0 && ei<=-1) System.out.println(i+". "+ai+" - "+(-bi)+" + "+ci+" + "+di+" - "+(-ei)+" =____________");
            else if (ai>=0 && bi>=0 && ci<=-1 && di<=-1 && ei>=0) System.out.println(i+". "+ai+" + "+bi+" - "+(-ci)+" - "+(-di)+" + "+ei+" =____________");
            else if (ai>=0 && bi>=0 && ci<=-1 && di>=0 && ei<=-1) System.out.println(i+". "+ai+" + "+bi+" - "+(-ci)+" + "+di+" - "+(-ei)+" =____________");
            else if (ai>=0 && bi>=0 && ci>=0 && di<=-1 && ei<=-1) System.out.println(i+". "+ai+" + "+bi+" + "+ci+" - "+(-di)+" - "+(-ei)+" =____________");
            else if (ai<=-1 && bi>=0 && ci>=0 && di>=0 && ei>=0) System.out.println(i+". "+ai+" + "+bi+" + "+ci+" + "+di+" + "+ei+" =____________");
            else if (ai>=0 && bi<=-1 && ci>=0 && di>=0 && ei>=0) System.out.println(i+". "+ai+" - "+(-bi)+" + "+ci+" + "+di+" + "+ei+" =____________");
            else if (ai>=0 && bi>=0 && ci<=-1 && di>=0 && ei>=0) System.out.println(i+". "+ai+" + "+bi+" - "+(-ci)+" + "+di+" + "+ei+" =____________");
            else if (ai>=0 && bi>=0 && ci>=0 && di<=-1 && ei>=0) System.out.println(i+". "+ai+" + "+bi+" + "+ci+" - "+(-di)+" + "+ei+" =____________");
            else if (ai>=0 && bi>=0 && ci>=0 && di>=0 && ei<=-1) System.out.println(i+". "+ai+" + "+bi+" + "+ci+" + "+di+" - "+(-ei)+" =____________");
            else if (ai>=0 && bi>=0 && ci>=0 && di>=0 && ei>=0) System.out.println(i+". "+ai+" + "+bi+" + "+ci+" + "+di+" + "+ei+" =____________");
        }
    }
}