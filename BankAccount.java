package javaInput;
import java.util.*;
public class BankAccount {

    public static void DepositMoney(int BB) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter PIN: ");
        int PIN = sc.nextInt();
        if (PIN == 4758){
            System.out.print("Please Enter The Amount You Wanted To Deposit: ");
            int DM = sc.nextInt();
            System.out.println("Insert Your Cash Into, The Box Just Opened...\n");
            System.out.println("Your Bank Balance Now Is: "+(BB+DM));
        } else if(PIN != 4758){
            System.out.print("Enter correct PIN(One Chance Left): ");
            PIN = sc.nextInt();
            if (PIN == 4758){
                System.out.print("Please Enter The Amount You Wanted To Deposit: ");
                int DM = sc.nextInt();
                System.out.println("Insert Your Cash Into, The Box Just Opened...\n");
                System.out.println("Your Bank Balance Now Is: "+(BB+DM));
            }else System.out.println("Incorrect PIN Entered...");
        }
        System.out.print("Please Collect your Card...\nHave A Good Day...\n\n\n");
    }

    public static void WithDraw(int BB) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter PIN: ");
        int PIN = sc.nextInt();
        if(PIN == 4758) {
            System.out.print("Please Enter The Amount You Wanted To Withdraw: ");
            int WM = sc.nextInt();
            if (BB >= WM) {
                System.out.println("Please, Collect You Cash...");
                System.out.println("Your Bank Balance was: "+BB);
                System.out.println("\nYour Bank Balance now is: "+(BB-WM));
            } else System.out.print("Withdraw Amount is Greater Than Bank Balance");
        }else if(PIN != 4758){
            System.out.print("Enter correct PIN(One Chance Left): ");
            PIN = sc.nextInt();
            if (PIN == 4758){
                System.out.print("Please Enter The Amount You Wanted To Withdraw: ");
                int WM = sc.nextInt();
                if (BB >= WM){
                    System.out.println("\nPlease, Collect You Cash...");
                    System.out.println("Your Bank Balance was: "+BB);
                    System.out.println("\nYour Bank Balance now is: "+(BB-WM));
                } else System.out.print("Withdraw Amount is Greater Than Bank Balance");
            }else System.out.print("Incorrect PIN Entered...");
        }
        System.out.print("\nPlease Collect your Card...\nHave A Good Day...\n\n\n");
    }

    public static void BankBalance(int BB) {
        System.out.println("You Bank Balance is: "+(BB*10));
        System.out.print("\nPlease Collect your Card...\nHave A Good Day...\n\n\n");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        System.out.println("Please, Insert your ATM card...Then,");
        System.out.print("Please, Enter your Name: ");
        String name = sc.nextLine();
        System.out.print("Hello, "+name+".");
        System.out.print("\n1.Check Bank Balance\n2.Deposit Money\n3.Withdraw Money\n");
        System.out.print("Please Enter the serial number of the section you wanted to go: ");
        int Section = sc.nextInt();
        int BB,WM = 0,DM = 0;
        BB = rand.nextInt(1000,9000);
        if (Section == 1){
            BankBalance(BB);
        } else if(Section == 2){
            DepositMoney(BB);
        } else if(Section == 3){
            WithDraw(BB);
        }
    }
}