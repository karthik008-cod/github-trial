package javaInput;
import java.util.Scanner;
public class DateToWord {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int d,m,y;
        System.out.print("Enter the date in (DD) format: ");
        d = sc.nextInt();
        System.out.print("Enter the month in (MM) format: ");
        m = sc.nextInt();
        System.out.print("Enter the year in (YYYY) format: ");
        y = sc.nextInt();
        System.out.println(" ");





        if (m >= 8 && m<=12 && m%2 == 0 && d <= 31){
            if (d == 10) {
                System.out.print("Tenth of ");
            } else if (d == 11) {
                System.out.print("Eleventh of ");
            } else if (d == 12) {
                System.out.print("Twelfth of ");
            } else if (d == 13) {
                System.out.print("Thirteenth of ");
            } else if (d == 14) {
                System.out.print("Fourteenth of ");
            } else if (d == 15) {
                System.out.print("Fifteenth of ");
            } else if (d == 16) {
                System.out.print("Sixteenth of ");
            } else if (d == 17) {
                System.out.print("Seventh of ");
            } else if (d == 18) {
                System.out.print("Eighteenth of ");
            } else if (d == 19) {
                System.out.print("Nineteenth of ");
            } else if (d / 10 == 2) {
                System.out.print("Twenty ");
            } else if (d / 10 == 3) {
                System.out.print("Thirty ");
            }else if (d % 10 == 1) {
                System.out.print("First of ");
            } else if (d % 10 == 2) {
                System.out.print("Second of ");
            } else if (d % 10 == 3) {
                System.out.print("Third of ");
            } else if (d % 10 == 4) {
                System.out.print("Fourth of ");
            } else if (d % 10 == 5) {
                System.out.print("Fifth of ");
            } else if (d % 10 == 6) {
                System.out.print("Sixth of ");
            } else if (d % 10 == 7) {
                System.out.print("Seventh of ");
            } else if (d % 10 == 8) {
                System.out.print("Eighth of ");
            } else if (d % 10 == 9) {
                System.out.print("Ninth of ");
            }
            if (m == 8) {
                System.out.print("August ");
            } else if (m == 10) {
                System.out.print("October ");
            } else if (m == 12) {
                System.out.print("December ");
            }
            if (y/100 == 19){
                System.out.print("Nineteen ");
            } else if (y/100 == 18){
                System.out.print("Eighteen ");
            }else if (y/100 == 17){
                System.out.print("Seventeen ");
            }else if (y/100 == 16){
                System.out.print("Sixteen ");
            }else if (y/100 == 15){
                System.out.print("Fifteen ");
            }else if (y/100 == 14){
                System.out.print("Fourteen ");
            }else if (y/100 == 13){
                System.out.print("Thirteen ");
            }else if (y/100 == 12){
                System.out.print("Twelve ");
            }else if (y/100 == 11){
                System.out.print("Eleven ");
            } else if (y / 1000 == 2) {
                System.out.print("Two Thousand ");
            } else if (y / 1000 == 3) {
                System.out.print("Three Thousand ");
            } else if (y / 1000 == 4) {
                System.out.print("Four Thousand ");
            } else if (y / 1000 == 5) {
                System.out.print("Five Thousand ");
            } else if (y / 1000 == 6) {
                System.out.print("Six Thousand ");
            } else if (y / 1000 == 7) {
                System.out.print("Seven Thousand ");
            } else if (y / 1000 == 8) {
                System.out.print("Eight Thousand ");
            } else if (y / 1000 == 9) {
                System.out.print("Nine Thousand ");
            } else if ((y / 100) % 10 == 1) {
                System.out.print("One Hundred And ");
            } else if ((y / 100) % 10 == 2) {
                System.out.print("Two Hundred And ");
            } else if ((y / 100) % 10 == 3) {
                System.out.print("Three Hundred And ");
            } else if ((y / 100) % 10 == 4) {
                System.out.print("Four Hundred And ");
            } else if ((y / 100) % 10 == 5) {
                System.out.print("Five Hundred And ");
            } else if ((y / 100) % 10 == 6) {
                System.out.print("Six Hundred And ");
            } else if ((y / 100) % 10 == 7) {
                System.out.print("Seven Hundred And ");
            } else if ((y / 100) % 10 == 8) {
                System.out.print("Eight Hundred And ");
            } else if ((y / 100) % 10 == 9) {
                System.out.print("Nine Hundred And ");
            }
            if (y%100 == 10){
                System.out.print("Ten");
            } else if (y%100 == 11){
                System.out.print("Eleven");
            } else if (y%100 == 12){
                System.out.print("Twelve");
            } else if (y%100 == 13){
                System.out.print("Thirteen");
            } else if (y%100 == 14){
                System.out.print("Fourteen");
            } else if (y%100 == 15){
                System.out.print("Fifteen");
            } else if (y%100 == 16){
                System.out.print("Sixteen");
            } else if (y%100 == 17){
                System.out.print("seventeen");
            } else if (y%100 == 18){
                System.out.print("Eighteen");
            } else if (y%100 == 19){
                System.out.print("Nineteen");
            }
            if (((y / 10) % 100) % 10 == 2) {
                System.out.print("Twenty");
            } else if (((y / 10) % 100) % 10 == 3) {
                System.out.print("Thirty");
            } else if (((y / 10) % 100) % 10 == 4) {
                System.out.print("Forty");
            } else if (((y / 10) % 100) % 10 == 5) {
                System.out.print("Fifty");
            } else if (((y / 10) % 100) % 10 == 6) {
                System.out.print("Sixty");
            } else if (((y / 10) % 100) % 10 == 7) {
                System.out.print("Seventy");
            } else if (((y / 10) % 100) % 10 == 8) {
                System.out.print("Eighty");
            } else if (((y / 10) % 100) % 10 == 9) {
                System.out.print("Ninety");
            }
            if (y % 10 == 1) {
                System.out.print("-One");
            } else if (y % 10 == 2) {
                System.out.print("-Two");
            } else if (y % 10 == 3) {
                System.out.print("-Three");
            } else if (y % 10 == 4) {
                System.out.print("-Four");
            } else if (y % 10 == 5) {
                System.out.print("-Five");
            } else if (y % 10 == 6) {
                System.out.print("-Six");
            } else if (y % 10 == 7) {
                System.out.print("-Seven");
            } else if (y % 10 == 8) {
                System.out.print("-Eight");
            } else if (y % 10 == 9) {
                System.out.print("-Nine");
            }
        }





        else if (m >= 8 && m <= 12 && m%2 != 0 && d <= 30){

            if (d == 10) {
                System.out.print("Tenth of ");
            } else if (d == 11) {
                System.out.print("Eleventh of ");
            } else if (d == 12) {
                System.out.print("Twelfth of ");
            } else if (d == 13) {
                System.out.print("Thirteenth of ");
            } else if (d == 14) {
                System.out.print("Fourteenth of ");
            } else if (d == 15) {
                System.out.print("Fifteenth of ");
            } else if (d == 16) {
                System.out.print("Sixteenth of ");
            } else if (d == 17) {
                System.out.print("Seventh of ");
            } else if (d == 18) {
                System.out.print("Eighteenth of ");
            } else if (d == 19) {
                System.out.print("Nineteenth of ");
            }
            if (d / 10 == 2) {
                System.out.print("Twenty ");
            } else if (d / 10 == 3) {
                System.out.print("Thirty ");
            } else if (d % 10 == 1) {
                System.out.print("First of ");
            } else if (d % 10 == 2) {
                System.out.print("Second of ");
            } else if (d % 10 == 3) {
                System.out.print("Third of ");
            } else if (d % 10 == 4) {
                System.out.print("Fourth of ");
            } else if (d % 10 == 5) {
                System.out.print("Fifth of ");
            } else if (d % 10 == 6) {
                System.out.print("Sixth of ");
            } else if (d % 10 == 7) {
                System.out.print("Seventh of ");
            } else if (d % 10 == 8) {
                System.out.print("Eighth of ");
            } else if (d % 10 == 9) {
                System.out.print("Ninth of ");
            }
            if (m == 8) {
                System.out.print("August ");
            } else if (m == 9) {
                System.out.print("September ");
            } else if (m == 11) {
                System.out.print("November ");
            }
            if (y/100 == 19){
                System.out.print("Nineteen ");
            } else if (y/100 == 18){
                System.out.print("Eighteen ");
            }else if (y/100 == 17){
                System.out.print("Seventeen ");
            }else if (y/100 == 16){
                System.out.print("Sixteen ");
            }else if (y/100 == 15){
                System.out.print("Fifteen ");
            }else if (y/100 == 14){
                System.out.print("Fourteen ");
            }else if (y/100 == 13){
                System.out.print("Thirteen ");
            }else if (y/100 == 12){
                System.out.print("Twelve ");
            }else if (y/100 == 11){
                System.out.print("Eleven ");
            } else if (y / 1000 == 2) {
                System.out.print("Two Thousand ");
            } else if (y / 1000 == 3) {
                System.out.print("Three Thousand ");
            } else if (y / 1000 == 4) {
                System.out.print("Four Thousand ");
            } else if (y / 1000 == 5) {
                System.out.print("Five Thousand ");
            } else if (y / 1000 == 6) {
                System.out.print("Six Thousand ");
            } else if (y / 1000 == 7) {
                System.out.print("Seven Thousand ");
            } else if (y / 1000 == 8) {
                System.out.print("Eight Thousand ");
            } else if (y / 1000 == 9) {
                System.out.print("Nine Thousand ");
            } else if ((y / 100) % 10 == 1) {
                System.out.print("One Hundred And ");
            } else if ((y / 100) % 10 == 2) {
                System.out.print("Two Hundred And ");
            } else if ((y / 100) % 10 == 3) {
                System.out.print("Three Hundred And ");
            } else if ((y / 100) % 10 == 4) {
                System.out.print("Four Hundred And ");
            } else if ((y / 100) % 10 == 5) {
                System.out.print("Five Hundred And ");
            } else if ((y / 100) % 10 == 6) {
                System.out.print("Six Hundred And ");
            } else if ((y / 100) % 10 == 7) {
                System.out.print("Seven Hundred And ");
            } else if ((y / 100) % 10 == 8) {
                System.out.print("Eight Hundred And ");
            } else if ((y / 100) % 10 == 9) {
                System.out.print("Nine Hundred And ");
            }

            if (((y / 10) % 100) % 10 == 2) {
                System.out.print("Twenty");
            } else if (((y / 10) % 100) % 10 == 3) {
                System.out.print("Thirty");
            } else if (((y / 10) % 100) % 10 == 4) {
                System.out.print("Forty");
            } else if (((y / 10) % 100) % 10 == 5) {
                System.out.print("Fifty");
            } else if (((y / 10) % 100) % 10 == 6) {
                System.out.print("Sixty");
            } else if (((y / 10) % 100) % 10 == 7) {
                System.out.print("Seventy");
            } else if (((y / 10) % 100) % 10 == 8) {
                System.out.print("Eighty");
            } else if (((y / 10) % 100) % 10 == 9) {
                System.out.print("Ninety");
            }
            if (y % 10 == 1) {
                System.out.print("-One");
            } else if (y % 10 == 2) {
                System.out.print("-Two");
            } else if (y % 10 == 3) {
                System.out.print("-Three");
            } else if (y % 10 == 4) {
                System.out.print("-Four");
            } else if (y % 10 == 5) {
                System.out.print("-Five");
            } else if (y % 10 == 6) {
                System.out.print("-Six");
            } else if (y % 10 == 7) {
                System.out.print("-Seven");
            } else if (y % 10 == 8) {
                System.out.print("-Eight");
            } else if (y % 10 == 9) {
                System.out.print("-Nine");
            }
        }






        else if (m == 2 && d <= 29){
            if (d == 10) {
                System.out.print("Tenth of ");
            } else if (d == 11) {
                System.out.print("Eleventh of ");
            } else if (d == 12) {
                System.out.print("Twelfth of ");
            } else if (d == 13) {
                System.out.print("Thirteenth of ");
            } else if (d == 14) {
                System.out.print("Fourteenth of ");
            } else if (d == 15) {
                System.out.print("Fifteenth of ");
            } else if (d == 16) {
                System.out.print("Sixteenth of ");
            } else if (d == 17) {
                System.out.print("Seventh of ");
            } else if (d == 18) {
                System.out.print("Eighteenth of ");
            } else if (d == 19) {
                System.out.print("Nineteenth of ");
            } else if (d / 10 == 2) {
                System.out.print("Twenty ");
            }
            if (d % 10 == 1) {
                System.out.print("First of ");
            } else if (d % 10 == 2) {
                System.out.print("Second of ");
            } else if (d % 10 == 3) {
                System.out.print("Third of ");
            } else if (d % 10 == 4) {
                System.out.print("Fourth of ");
            } else if (d % 10 == 5) {
                System.out.print("Fifth of ");
            } else if (d % 10 == 6) {
                System.out.print("Sixth of ");
            } else if (d % 10 == 7) {
                System.out.print("Seventh of ");
            } else if (d % 10 == 8) {
                System.out.print("Eighth of ");
            } else if (d % 10 == 9) {
                System.out.print("Ninth of ");
            }
            System.out.print("February ");
            if (y/100 == 19){
                System.out.print("Nineteen ");
            } else if (y/100 == 18){
                System.out.print("Eighteen ");
            }else if (y/100 == 17){
                System.out.print("Seventeen ");
            }else if (y/100 == 16){
                System.out.print("Sixteen ");
            }else if (y/100 == 15){
                System.out.print("Fifteen ");
            }else if (y/100 == 14){
                System.out.print("Fourteen ");
            }else if (y/100 == 13){
                System.out.print("Thirteen ");
            }else if (y/100 == 12){
                System.out.print("Twelve ");
            }else if (y/100 == 11){
                System.out.print("Eleven ");
            } else if (y / 1000 == 2) {
                System.out.print("Two Thousand ");
            } else if (y / 1000 == 3) {
                System.out.print("Three Thousand ");
            }else if (y / 1000 == 4) {
                System.out.print("Four Thousand ");
            } else if (y / 1000 == 5) {
                System.out.print("Five Thousand ");
            } else if (y / 1000 == 6) {
                System.out.print("Six Thousand ");
            } else if (y / 1000 == 7) {
                System.out.print("Seven Thousand ");
            } else if (y / 1000 == 8) {
                System.out.print("Eight Thousand ");
            } else if (y / 1000 == 9) {
                System.out.print("Nine Thousand ");
            }
            if (y / 1000 == 2 || y / 1000 == 3 || y / 1000 == 4|| y / 1000 == 5 || y / 1000 == 6 || y / 1000 == 8 || y / 1000 == 9){
                if ((y / 100) % 10 == 1) {
                    System.out.print("One Hundred And ");
                } else if ((y / 100) % 10 == 2) {
                    System.out.print("Two Hundred And ");
                } else if ((y / 100) % 10 == 3) {
                    System.out.print("Three Hundred And ");
                } else if ((y / 100) % 10 == 4) {
                    System.out.print("Four Hundred And ");
                } else if ((y / 100) % 10 == 5) {
                    System.out.print("Five Hundred And ");
                } else if ((y / 100) % 10 == 6) {
                    System.out.print("Six Hundred And ");
                } else if ((y / 100) % 10 == 7) {
                    System.out.print("Seven Hundred And ");
                } else if ((y / 100) % 10 == 8) {
                    System.out.print("Eight Hundred And ");
                } else if ((y / 100) % 10 == 9) {
                    System.out.print("Nine Hundred And ");
                }
            }

            if (((y / 10) % 100) % 10 == 2) {
                System.out.print("Twenty");
            } else if (((y / 10) % 100) % 10 == 3) {
                System.out.print("Thirty");
            } else if (((y / 10) % 100) % 10 == 4) {
                System.out.print("Forty");
            } else if (((y / 10) % 100) % 10 == 5) {
                System.out.print("Fifty");
            } else if (((y / 10) % 100) % 10 == 6) {
                System.out.print("Sixty");
            } else if (((y / 10) % 100) % 10 == 7) {
                System.out.print("Seventy");
            } else if (((y / 10) % 100) % 10 == 8) {
                System.out.print("Eighty");
            } else if (((y / 10) % 100) % 10 == 9) {
                System.out.print("Ninety");
            }
            if (y % 10 == 1) {
                System.out.print("-One");
            } else if (y % 10 == 2) {
                System.out.print("-Two");
            } else if (y % 10 == 3) {
                System.out.print("-Three");
            } else if (y % 10 == 4) {
                System.out.print("-Four");
            } else if (y % 10 == 5) {
                System.out.print("-Five");
            } else if (y % 10 == 6) {
                System.out.print("-Six");
            } else if (y % 10 == 7) {
                System.out.print("-Seven");
            } else if (y % 10 == 8) {
                System.out.print("-Eight");
            } else if (y % 10 == 9) {
                System.out.print("-Nine");
            }
        }







        else if (m < 8 && m != 2 && m%2 ==0 && d <= 30){

            if (d == 10) {
                System.out.print("Tenth of ");
            } else if (d == 11) {
                System.out.print("Eleventh of ");
            } else if (d == 12) {
                System.out.print("Twelfth of ");
            } else if (d == 13) {
                System.out.print("Thirteenth of ");
            } else if (d == 14) {
                System.out.print("Fourteenth of ");
            } else if (d == 15) {
                System.out.print("Fifteenth of ");
            } else if (d == 16) {
                System.out.print("Sixteenth of ");
            } else if (d == 17) {
                System.out.print("Seventh of ");
            } else if (d == 18) {
                System.out.print("Eighteenth of ");
            } else if (d == 19) {
                System.out.print("Nineteenth of ");
            }

            if (d / 10 == 2) {
                System.out.print("Twenty ");
            } else if (d / 10 == 3) {
                System.out.print("Thirty ");
            }
            if (d % 10 == 1) {
                System.out.print("First of ");
            } else if (d % 10 == 2) {
                System.out.print("Second of ");
            } else if (d % 10 == 3) {
                System.out.print("Third of ");
            } else if (d % 10 == 4) {
                System.out.print("Fourth of ");
            } else if (d % 10 == 5) {
                System.out.print("Fifth of ");
            } else if (d % 10 == 6) {
                System.out.print("Sixth of ");
            } else if (d % 10 == 7) {
                System.out.print("Seventh of ");
            } else if (d % 10 == 8) {
                System.out.print("Eighth of ");
            } else if (d % 10 == 9) {
                System.out.print("Ninth of ");
            }
            if (m == 4) {
                System.out.print("April ");
            } else if (m == 6) {
                System.out.print("June ");
            }
            if (y/100 == 19){
                System.out.print("Nineteen ");
            } else if (y/100 == 18){
                System.out.print("Eighteen ");
            }else if (y/100 == 17){
                System.out.print("Seventeen ");
            }else if (y/100 == 16){
                System.out.print("Sixteen ");
            }else if (y/100 == 15){
                System.out.print("Fifteen ");
            }else if (y/100 == 14){
                System.out.print("Fourteen ");
            }else if (y/100 == 13){
                System.out.print("Thirteen ");
            }else if (y/100 == 12){
                System.out.print("Twelve ");
            }else if (y/100 == 11){
                System.out.print("Eleven ");
            } else if (y / 1000 == 2) {
                System.out.print("Two Thousand ");
            } else if (y / 1000 == 3) {
                System.out.print("Three Thousand ");
            } else if (y / 1000 == 4) {
                System.out.print("Four Thousand ");
            } else if (y / 1000 == 5) {
                System.out.print("Five Thousand ");
            } else if (y / 1000 == 6) {
                System.out.print("Six Thousand ");
            } else if (y / 1000 == 7) {
                System.out.print("Seven Thousand ");
            } else if (y / 1000 == 8) {
                System.out.print("Eight Thousand ");
            } else if (y / 1000 == 9) {
                System.out.print("Nine Thousand ");
            }
            if ((y / 100) % 10 == 1) {
                System.out.print("One Hundred And ");
            } else if ((y / 100) % 10 == 2) {
                System.out.print("Two Hundred And ");
            } else if ((y / 100) % 10 == 3) {
                System.out.print("Three Hundred And ");
            } else if ((y / 100) % 10 == 4) {
                System.out.print("Four Hundred And ");
            } else if ((y / 100) % 10 == 5) {
                System.out.print("Five Hundred And ");
            } else if ((y / 100) % 10 == 6) {
                System.out.print("Six Hundred And ");
            } else if ((y / 100) % 10 == 7) {
                System.out.print("Seven Hundred And ");
            } else if ((y / 100) % 10 == 8) {
                System.out.print("Eight Hundred And ");
            } else if ((y / 100) % 10 == 9) {
                System.out.print("Nine Hundred And ");
            }

            if (((y / 10) % 100) % 10 == 2) {
                System.out.print("Twenty");
            } else if (((y / 10) % 100) % 10 == 3) {
                System.out.print("Thirty");
            } else if (((y / 10) % 100) % 10 == 4) {
                System.out.print("Forty");
            } else if (((y / 10) % 100) % 10 == 5) {
                System.out.print("Fifty");
            } else if (((y / 10) % 100) % 10 == 6) {
                System.out.print("Sixty");
            } else if (((y / 10) % 100) % 10 == 7) {
                System.out.print("Seventy");
            } else if (((y / 10) % 100) % 10 == 8) {
                System.out.print("Eighty");
            } else if (((y / 10) % 100) % 10 == 9) {
                System.out.print("Ninety");
            }
            if (y % 10 == 1) {
                System.out.print("-One");
            } else if (y % 10 == 2) {
                System.out.print("-Two");
            } else if (y % 10 == 3) {
                System.out.print("-Three");
            } else if (y % 10 == 4) {
                System.out.print("-Four");
            } else if (y % 10 == 5) {
                System.out.print("-Five");
            } else if (y % 10 == 6) {
                System.out.print("-Six");
            } else if (y % 10 == 7) {
                System.out.print("-Seven");
            } else if (y % 10 == 8) {
                System.out.print("-Eight");
            } else if (y % 10 == 9) {
                System.out.print("-Nine");
            }
        }





        else if (m < 8 && m%2 != 0 && d <= 31){

            if (d == 10) {
                System.out.print("Tenth of ");
            } else if (d == 11) {
                System.out.print("Eleventh of ");
            } else if (d == 12) {
                System.out.print("Twelfth of ");
            } else if (d == 13) {
                System.out.print("Thirteenth of ");
            } else if (d == 14) {
                System.out.print("Fourteenth of ");
            } else if (d == 15) {
                System.out.print("Fifteenth of ");
            } else if (d == 16) {
                System.out.print("Sixteenth of ");
            } else if (d == 17) {
                System.out.print("Seventh of ");
            } else if (d == 18) {
                System.out.print("Eighteenth of ");
            } else if (d == 19) {
                System.out.print("Nineteenth of ");
            }

            if (d / 10 == 2) {
                System.out.print("Twenty ");
            } else if (d / 10 == 3) {
                System.out.print("Thirty ");
            }
            if (d % 10 == 1) {
                System.out.print("First of ");
            } else if (d % 10 == 2) {
                System.out.print("Second of ");
            } else if (d % 10 == 3) {
                System.out.print("Third of ");
            } else if (d % 10 == 4) {
                System.out.print("Fourth of ");
            } else if (d % 10 == 5) {
                System.out.print("Fifth of ");
            } else if (d % 10 == 6) {
                System.out.print("Sixth of ");
            } else if (d % 10 == 7) {
                System.out.print("Seventh of ");
            } else if (d % 10 == 8) {
                System.out.print("Eighth of ");
            } else if (d % 10 == 9) {
                System.out.print("Ninth of ");
            }
            if (m == 1) {
                System.out.print("January ");
            } else if (m == 3) {
                System.out.print("March ");
            } else if (m == 5) {
                System.out.print("May ");
            } else if (m == 7) {
                System.out.print("July ");
            }
            if (y/100 == 19){
                System.out.print("Nineteen ");
            } else if (y/100 == 18){
                System.out.print("Eighteen ");
            }else if (y/100 == 17){
                System.out.print("Seventeen ");
            }else if (y/100 == 16){
                System.out.print("Sixteen ");
            }else if (y/100 == 15){
                System.out.print("Fifteen ");
            }else if (y/100 == 14){
                System.out.print("Fourteen ");
            }else if (y/100 == 13){
                System.out.print("Thirteen ");
            }else if (y/100 == 12){
                System.out.print("Twelve ");
            }else if (y/100 == 11){
                System.out.print("Eleven ");
            } else if (y / 1000 == 2) {
                System.out.print("Two Thousand ");
            } else if (y / 1000 == 3) {
                System.out.print("Three Thousand ");
            } else if (y / 1000 == 4) {
                System.out.print("Four Thousand ");
            } else if (y / 1000 == 5) {
                System.out.print("Five Thousand ");
            } else if (y / 1000 == 6) {
                System.out.print("Six Thousand ");
            } else if (y / 1000 == 7) {
                System.out.print("Seven Thousand ");
            } else if (y / 1000 == 8) {
                System.out.print("Eight Thousand ");
            } else if (y / 1000 == 9) {
                System.out.print("Nine Thousand ");
            }
            if ((y / 100) % 10 == 1) {
                System.out.print("One Hundred And ");
            } else if ((y / 100) % 10 == 2) {
                System.out.print("Two Hundred And ");
            } else if ((y / 100) % 10 == 3) {
                System.out.print("Three Hundred And ");
            } else if ((y / 100) % 10 == 4) {
                System.out.print("Four Hundred And ");
            } else if ((y / 100) % 10 == 5) {
                System.out.print("Five Hundred And ");
            } else if ((y / 100) % 10 == 6) {
                System.out.print("Six Hundred And ");
            } else if ((y / 100) % 10 == 7) {
                System.out.print("Seven Hundred And ");
            } else if ((y / 100) % 10 == 8) {
                System.out.print("Eight Hundred And ");
            } else if ((y / 100) % 10 == 9) {
                System.out.print("Nine Hundred And ");
            }

            if (((y / 10) % 100) % 10 == 2) {
                System.out.print("Twenty");
            } else if (((y / 10) % 100) % 10 == 3) {
                System.out.print("Thirty");
            } else if (((y / 10) % 100) % 10 == 4) {
                System.out.print("Forty");
            } else if (((y / 10) % 100) % 10 == 5) {
                System.out.print("Fifty");
            } else if (((y / 10) % 100) % 10 == 6) {
                System.out.print("Sixty");
            } else if (((y / 10) % 100) % 10 == 7) {
                System.out.print("Seventy");
            } else if (((y / 10) % 100) % 10 == 8) {
                System.out.print("Eighty");
            } else if (((y / 10) % 100) % 10 == 9) {
                System.out.print("Ninety");
            }
            if (y % 10 == 1) {
                System.out.print("-One");
            } else if (y % 10 == 2) {
                System.out.print("-Two");
            } else if (y % 10 == 3) {
                System.out.print("-Three");
            } else if (y % 10 == 4) {
                System.out.print("-Four");
            } else if (y % 10 == 5) {
                System.out.print("-Five");
            } else if (y % 10 == 6) {
                System.out.print("-Six");
            } else if (y % 10 == 7) {
                System.out.print("-Seven");
            } else if (y % 10 == 8) {
                System.out.print("-Eight");
            } else if (y % 10 == 9) {
                System.out.print("-Nine");
            }
        }
        else System.out.print("INVALID DATE");
    }
}