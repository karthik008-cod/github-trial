package javaInput;

import java.util.Scanner;

public class DTDNEW {
    public DTDNEW() {
    }

    public static void main(String[] var0) {
        Scanner var1 = new Scanner(System.in);
        System.out.print("Enter the date in (DD) format: ");
        int var2 = var1.nextInt();
        System.out.print("Enter the month in (MM) format: ");
        int var3 = var1.nextInt();
        System.out.print("Enter the year in (YYYY) format: ");
        int var4 = var1.nextInt();
        System.out.println(" ");
        if (var3 >= 8 && var3 <= 12 && var3 % 2 == 0 && var2 <= 31) {
            if (var2 == 10) {
                System.out.print("Tenth of ");
            } else if (var2 == 11) {
                System.out.print("Eleventh of ");
            } else if (var2 == 12) {
                System.out.print("Twelfth of ");
            } else if (var2 == 13) {
                System.out.print("Thirteenth of ");
            } else if (var2 == 14) {
                System.out.print("Fourteenth of ");
            } else if (var2 == 15) {
                System.out.print("Fifteenth of ");
            } else if (var2 == 16) {
                System.out.print("Sixteenth of ");
            } else if (var2 == 17) {
                System.out.print("Seventh of ");
            } else if (var2 == 18) {
                System.out.print("Eighteenth of ");
            } else if (var2 == 19) {
                System.out.print("Nineteenth of ");
            } else if (var2 / 10 == 2) {
                System.out.print("Twenty ");
            } else if (var2 / 10 == 3) {
                System.out.print("Thirty ");
            } else if (var2 % 10 == 1) {
                System.out.print("First of ");
            } else if (var2 % 10 == 2) {
                System.out.print("Second of ");
            } else if (var2 % 10 == 3) {
                System.out.print("Third of ");
            } else if (var2 % 10 == 4) {
                System.out.print("Fourth of ");
            } else if (var2 % 10 == 5) {
                System.out.print("Fifth of ");
            } else if (var2 % 10 == 6) {
                System.out.print("Sixth of ");
            } else if (var2 % 10 == 7) {
                System.out.print("Seventh of ");
            } else if (var2 % 10 == 8) {
                System.out.print("Eighth of ");
            } else if (var2 % 10 == 9) {
                System.out.print("Ninth of ");
            }

            if (var3 == 8) {
                System.out.print("August ");
            } else if (var3 == 10) {
                System.out.print("October ");
            } else if (var3 == 12) {
                System.out.print("December ");
            }

            if (var4 / 100 == 19) {
                System.out.print("Nineteen ");
            } else if (var4 / 100 == 18) {
                System.out.print("Eighteen ");
            } else if (var4 / 100 == 17) {
                System.out.print("Seventeen ");
            } else if (var4 / 100 == 16) {
                System.out.print("Sixteen ");
            } else if (var4 / 100 == 15) {
                System.out.print("Fifteen ");
            } else if (var4 / 100 == 14) {
                System.out.print("Fourteen ");
            } else if (var4 / 100 == 13) {
                System.out.print("Thirteen ");
            } else if (var4 / 100 == 12) {
                System.out.print("Twelve ");
            } else if (var4 / 100 == 11) {
                System.out.print("Eleven ");
            } else if (var4 / 1000 == 2) {
                System.out.print("Two Thousand ");
            } else if (var4 / 1000 == 3) {
                System.out.print("Three Thousand ");
            } else if (var4 / 1000 == 4) {
                System.out.print("Four Thousand ");
            } else if (var4 / 1000 == 5) {
                System.out.print("Five Thousand ");
            } else if (var4 / 1000 == 6) {
                System.out.print("Six Thousand ");
            } else if (var4 / 1000 == 7) {
                System.out.print("Seven Thousand ");
            } else if (var4 / 1000 == 8) {
                System.out.print("Eight Thousand ");
            } else if (var4 / 1000 == 9) {
                System.out.print("Nine Thousand ");
            } else if (var4 / 100 % 10 == 1) {
                System.out.print("One Hundred And ");
            } else if (var4 / 100 % 10 == 2) {
                System.out.print("Two Hundred And ");
            } else if (var4 / 100 % 10 == 3) {
                System.out.print("Three Hundred And ");
            } else if (var4 / 100 % 10 == 4) {
                System.out.print("Four Hundred And ");
            } else if (var4 / 100 % 10 == 5) {
                System.out.print("Five Hundred And ");
            } else if (var4 / 100 % 10 == 6) {
                System.out.print("Six Hundred And ");
            } else if (var4 / 100 % 10 == 7) {
                System.out.print("Seven Hundred And ");
            } else if (var4 / 100 % 10 == 8) {
                System.out.print("Eight Hundred And ");
            } else if (var4 / 100 % 10 == 9) {
                System.out.print("Nine Hundred And ");
            }

            if (var4 % 100 == 10) {
                System.out.print("Ten");
            } else if (var4 % 100 == 11) {
                System.out.print("Eleven");
            } else if (var4 % 100 == 12) {
                System.out.print("Twelve");
            } else if (var4 % 100 == 13) {
                System.out.print("Thirteen");
            } else if (var4 % 100 == 14) {
                System.out.print("Fourteen");
            } else if (var4 % 100 == 15) {
                System.out.print("Fifteen");
            } else if (var4 % 100 == 16) {
                System.out.print("Sixteen");
            } else if (var4 % 100 == 17) {
                System.out.print("seventeen");
            } else if (var4 % 100 == 18) {
                System.out.print("Eighteen");
            } else if (var4 % 100 == 19) {
                System.out.print("Nineteen");
            }

            if (var4 / 10 % 100 % 10 == 2) {
                System.out.print("Twenty");
            } else if (var4 / 10 % 100 % 10 == 3) {
                System.out.print("Thirty");
            } else if (var4 / 10 % 100 % 10 == 4) {
                System.out.print("Forty");
            } else if (var4 / 10 % 100 % 10 == 5) {
                System.out.print("Fifty");
            } else if (var4 / 10 % 100 % 10 == 6) {
                System.out.print("Sixty");
            } else if (var4 / 10 % 100 % 10 == 7) {
                System.out.print("Seventy");
            } else if (var4 / 10 % 100 % 10 == 8) {
                System.out.print("Eighty");
            } else if (var4 / 10 % 100 % 10 == 9) {
                System.out.print("Ninety");
            }

            if (var4 % 10 == 1) {
                System.out.print("-One");
            } else if (var4 % 10 == 2) {
                System.out.print("-Two");
            } else if (var4 % 10 == 3) {
                System.out.print("-Three");
            } else if (var4 % 10 == 4) {
                System.out.print("-Four");
            } else if (var4 % 10 == 5) {
                System.out.print("-Five");
            } else if (var4 % 10 == 6) {
                System.out.print("-Six");
            } else if (var4 % 10 == 7) {
                System.out.print("-Seven");
            } else if (var4 % 10 == 8) {
                System.out.print("-Eight");
            } else if (var4 % 10 == 9) {
                System.out.print("-Nine");
            }
        } else if (var3 >= 8 && var3 <= 12 && var3 % 2 != 0 && var2 <= 30) {
            if (var2 == 10) {
                System.out.print("Tenth of ");
            } else if (var2 == 11) {
                System.out.print("Eleventh of ");
            } else if (var2 == 12) {
                System.out.print("Twelfth of ");
            } else if (var2 == 13) {
                System.out.print("Thirteenth of ");
            } else if (var2 == 14) {
                System.out.print("Fourteenth of ");
            } else if (var2 == 15) {
                System.out.print("Fifteenth of ");
            } else if (var2 == 16) {
                System.out.print("Sixteenth of ");
            } else if (var2 == 17) {
                System.out.print("Seventh of ");
            } else if (var2 == 18) {
                System.out.print("Eighteenth of ");
            } else if (var2 == 19) {
                System.out.print("Nineteenth of ");
            }

            if (var2 / 10 == 2) {
                System.out.print("Twenty ");
            } else if (var2 / 10 == 3) {
                System.out.print("Thirty ");
            } else if (var2 % 10 == 1) {
                System.out.print("First of ");
            } else if (var2 % 10 == 2) {
                System.out.print("Second of ");
            } else if (var2 % 10 == 3) {
                System.out.print("Third of ");
            } else if (var2 % 10 == 4) {
                System.out.print("Fourth of ");
            } else if (var2 % 10 == 5) {
                System.out.print("Fifth of ");
            } else if (var2 % 10 == 6) {
                System.out.print("Sixth of ");
            } else if (var2 % 10 == 7) {
                System.out.print("Seventh of ");
            } else if (var2 % 10 == 8) {
                System.out.print("Eighth of ");
            } else if (var2 % 10 == 9) {
                System.out.print("Ninth of ");
            }

            if (var3 == 8) {
                System.out.print("August ");
            } else if (var3 == 9) {
                System.out.print("September ");
            } else if (var3 == 11) {
                System.out.print("November ");
            }

            if (var4 / 100 == 19) {
                System.out.print("Nineteen ");
            } else if (var4 / 100 == 18) {
                System.out.print("Eighteen ");
            } else if (var4 / 100 == 17) {
                System.out.print("Seventeen ");
            } else if (var4 / 100 == 16) {
                System.out.print("Sixteen ");
            } else if (var4 / 100 == 15) {
                System.out.print("Fifteen ");
            } else if (var4 / 100 == 14) {
                System.out.print("Fourteen ");
            } else if (var4 / 100 == 13) {
                System.out.print("Thirteen ");
            } else if (var4 / 100 == 12) {
                System.out.print("Twelve ");
            } else if (var4 / 100 == 11) {
                System.out.print("Eleven ");
            } else if (var4 / 1000 == 2) {
                System.out.print("Two Thousand ");
            } else if (var4 / 1000 == 3) {
                System.out.print("Three Thousand ");
            } else if (var4 / 1000 == 4) {
                System.out.print("Four Thousand ");
            } else if (var4 / 1000 == 5) {
                System.out.print("Five Thousand ");
            } else if (var4 / 1000 == 6) {
                System.out.print("Six Thousand ");
            } else if (var4 / 1000 == 7) {
                System.out.print("Seven Thousand ");
            } else if (var4 / 1000 == 8) {
                System.out.print("Eight Thousand ");
            } else if (var4 / 1000 == 9) {
                System.out.print("Nine Thousand ");
            } else if (var4 / 100 % 10 == 1) {
                System.out.print("One Hundred And ");
            } else if (var4 / 100 % 10 == 2) {
                System.out.print("Two Hundred And ");
            } else if (var4 / 100 % 10 == 3) {
                System.out.print("Three Hundred And ");
            } else if (var4 / 100 % 10 == 4) {
                System.out.print("Four Hundred And ");
            } else if (var4 / 100 % 10 == 5) {
                System.out.print("Five Hundred And ");
            } else if (var4 / 100 % 10 == 6) {
                System.out.print("Six Hundred And ");
            } else if (var4 / 100 % 10 == 7) {
                System.out.print("Seven Hundred And ");
            } else if (var4 / 100 % 10 == 8) {
                System.out.print("Eight Hundred And ");
            } else if (var4 / 100 % 10 == 9) {
                System.out.print("Nine Hundred And ");
            }

            if (var4 / 10 % 100 % 10 == 2) {
                System.out.print("Twenty");
            } else if (var4 / 10 % 100 % 10 == 3) {
                System.out.print("Thirty");
            } else if (var4 / 10 % 100 % 10 == 4) {
                System.out.print("Forty");
            } else if (var4 / 10 % 100 % 10 == 5) {
                System.out.print("Fifty");
            } else if (var4 / 10 % 100 % 10 == 6) {
                System.out.print("Sixty");
            } else if (var4 / 10 % 100 % 10 == 7) {
                System.out.print("Seventy");
            } else if (var4 / 10 % 100 % 10 == 8) {
                System.out.print("Eighty");
            } else if (var4 / 10 % 100 % 10 == 9) {
                System.out.print("Ninety");
            }

            if (var4 % 10 == 1) {
                System.out.print("-One");
            } else if (var4 % 10 == 2) {
                System.out.print("-Two");
            } else if (var4 % 10 == 3) {
                System.out.print("-Three");
            } else if (var4 % 10 == 4) {
                System.out.print("-Four");
            } else if (var4 % 10 == 5) {
                System.out.print("-Five");
            } else if (var4 % 10 == 6) {
                System.out.print("-Six");
            } else if (var4 % 10 == 7) {
                System.out.print("-Seven");
            } else if (var4 % 10 == 8) {
                System.out.print("-Eight");
            } else if (var4 % 10 == 9) {
                System.out.print("-Nine");
            }
        } else if (var3 == 2 && var2 <= 29) {
            if (var2 == 10) {
                System.out.print("Tenth of ");
            } else if (var2 == 11) {
                System.out.print("Eleventh of ");
            } else if (var2 == 12) {
                System.out.print("Twelfth of ");
            } else if (var2 == 13) {
                System.out.print("Thirteenth of ");
            } else if (var2 == 14) {
                System.out.print("Fourteenth of ");
            } else if (var2 == 15) {
                System.out.print("Fifteenth of ");
            } else if (var2 == 16) {
                System.out.print("Sixteenth of ");
            } else if (var2 == 17) {
                System.out.print("Seventh of ");
            } else if (var2 == 18) {
                System.out.print("Eighteenth of ");
            } else if (var2 == 19) {
                System.out.print("Nineteenth of ");
            } else if (var2 / 10 == 2) {
                System.out.print("Twenty ");
            }

            if (var2 % 10 == 1) {
                System.out.print("First of ");
            } else if (var2 % 10 == 2) {
                System.out.print("Second of ");
            } else if (var2 % 10 == 3) {
                System.out.print("Third of ");
            } else if (var2 % 10 == 4) {
                System.out.print("Fourth of ");
            } else if (var2 % 10 == 5) {
                System.out.print("Fifth of ");
            } else if (var2 % 10 == 6) {
                System.out.print("Sixth of ");
            } else if (var2 % 10 == 7) {
                System.out.print("Seventh of ");
            } else if (var2 % 10 == 8) {
                System.out.print("Eighth of ");
            } else if (var2 % 10 == 9) {
                System.out.print("Ninth of ");
            }

            System.out.print("February ");
            if (var4 / 100 == 19) {
                System.out.print("Nineteen ");
            } else if (var4 / 100 == 18) {
                System.out.print("Eighteen ");
            } else if (var4 / 100 == 17) {
                System.out.print("Seventeen ");
            } else if (var4 / 100 == 16) {
                System.out.print("Sixteen ");
            } else if (var4 / 100 == 15) {
                System.out.print("Fifteen ");
            } else if (var4 / 100 == 14) {
                System.out.print("Fourteen ");
            } else if (var4 / 100 == 13) {
                System.out.print("Thirteen ");
            } else if (var4 / 100 == 12) {
                System.out.print("Twelve ");
            } else if (var4 / 100 == 11) {
                System.out.print("Eleven ");
            } else if (var4 / 1000 == 2) {
                System.out.print("Two Thousand ");
            } else if (var4 / 1000 == 3) {
                System.out.print("Three Thousand ");
            } else if (var4 / 1000 == 4) {
                System.out.print("Four Thousand ");
            } else if (var4 / 1000 == 5) {
                System.out.print("Five Thousand ");
            } else if (var4 / 1000 == 6) {
                System.out.print("Six Thousand ");
            } else if (var4 / 1000 == 7) {
                System.out.print("Seven Thousand ");
            } else if (var4 / 1000 == 8) {
                System.out.print("Eight Thousand ");
            } else if (var4 / 1000 == 9) {
                System.out.print("Nine Thousand ");
            }

            if (var4 / 1000 == 2 || var4 / 1000 == 3 || var4 / 1000 == 4 || var4 / 1000 == 5 || var4 / 1000 == 6 || var4 / 1000 == 8 || var4 / 1000 == 9) {
                if (var4 / 100 % 10 == 1) {
                    System.out.print("One Hundred And ");
                } else if (var4 / 100 % 10 == 2) {
                    System.out.print("Two Hundred And ");
                } else if (var4 / 100 % 10 == 3) {
                    System.out.print("Three Hundred And ");
                } else if (var4 / 100 % 10 == 4) {
                    System.out.print("Four Hundred And ");
                } else if (var4 / 100 % 10 == 5) {
                    System.out.print("Five Hundred And ");
                } else if (var4 / 100 % 10 == 6) {
                    System.out.print("Six Hundred And ");
                } else if (var4 / 100 % 10 == 7) {
                    System.out.print("Seven Hundred And ");
                } else if (var4 / 100 % 10 == 8) {
                    System.out.print("Eight Hundred And ");
                } else if (var4 / 100 % 10 == 9) {
                    System.out.print("Nine Hundred And ");
                }
            }

            if (var4 / 10 % 100 % 10 == 2) {
                System.out.print("Twenty");
            } else if (var4 / 10 % 100 % 10 == 3) {
                System.out.print("Thirty");
            } else if (var4 / 10 % 100 % 10 == 4) {
                System.out.print("Forty");
            } else if (var4 / 10 % 100 % 10 == 5) {
                System.out.print("Fifty");
            } else if (var4 / 10 % 100 % 10 == 6) {
                System.out.print("Sixty");
            } else if (var4 / 10 % 100 % 10 == 7) {
                System.out.print("Seventy");
            } else if (var4 / 10 % 100 % 10 == 8) {
                System.out.print("Eighty");
            } else if (var4 / 10 % 100 % 10 == 9) {
                System.out.print("Ninety");
            }

            if (var4 % 10 == 1) {
                System.out.print("-One");
            } else if (var4 % 10 == 2) {
                System.out.print("-Two");
            } else if (var4 % 10 == 3) {
                System.out.print("-Three");
            } else if (var4 % 10 == 4) {
                System.out.print("-Four");
            } else if (var4 % 10 == 5) {
                System.out.print("-Five");
            } else if (var4 % 10 == 6) {
                System.out.print("-Six");
            } else if (var4 % 10 == 7) {
                System.out.print("-Seven");
            } else if (var4 % 10 == 8) {
                System.out.print("-Eight");
            } else if (var4 % 10 == 9) {
                System.out.print("-Nine");
            }
        } else if (var3 < 8 && var3 != 2 && var3 % 2 == 0 && var2 <= 30) {
            if (var2 == 10) {
                System.out.print("Tenth of ");
            } else if (var2 == 11) {
                System.out.print("Eleventh of ");
            } else if (var2 == 12) {
                System.out.print("Twelfth of ");
            } else if (var2 == 13) {
                System.out.print("Thirteenth of ");
            } else if (var2 == 14) {
                System.out.print("Fourteenth of ");
            } else if (var2 == 15) {
                System.out.print("Fifteenth of ");
            } else if (var2 == 16) {
                System.out.print("Sixteenth of ");
            } else if (var2 == 17) {
                System.out.print("Seventh of ");
            } else if (var2 == 18) {
                System.out.print("Eighteenth of ");
            } else if (var2 == 19) {
                System.out.print("Nineteenth of ");
            }

            if (var2 / 10 == 2) {
                System.out.print("Twenty ");
            } else if (var2 / 10 == 3) {
                System.out.print("Thirty ");
            }

            if (var2 % 10 == 1) {
                System.out.print("First of ");
            } else if (var2 % 10 == 2) {
                System.out.print("Second of ");
            } else if (var2 % 10 == 3) {
                System.out.print("Third of ");
            } else if (var2 % 10 == 4) {
                System.out.print("Fourth of ");
            } else if (var2 % 10 == 5) {
                System.out.print("Fifth of ");
            } else if (var2 % 10 == 6) {
                System.out.print("Sixth of ");
            } else if (var2 % 10 == 7) {
                System.out.print("Seventh of ");
            } else if (var2 % 10 == 8) {
                System.out.print("Eighth of ");
            } else if (var2 % 10 == 9) {
                System.out.print("Ninth of ");
            }

            if (var3 == 4) {
                System.out.print("April ");
            } else if (var3 == 6) {
                System.out.print("June ");
            }

            if (var4 / 100 == 19) {
                System.out.print("Nineteen ");
            } else if (var4 / 100 == 18) {
                System.out.print("Eighteen ");
            } else if (var4 / 100 == 17) {
                System.out.print("Seventeen ");
            } else if (var4 / 100 == 16) {
                System.out.print("Sixteen ");
            } else if (var4 / 100 == 15) {
                System.out.print("Fifteen ");
            } else if (var4 / 100 == 14) {
                System.out.print("Fourteen ");
            } else if (var4 / 100 == 13) {
                System.out.print("Thirteen ");
            } else if (var4 / 100 == 12) {
                System.out.print("Twelve ");
            } else if (var4 / 100 == 11) {
                System.out.print("Eleven ");
            } else if (var4 / 1000 == 2) {
                System.out.print("Two Thousand ");
            } else if (var4 / 1000 == 3) {
                System.out.print("Three Thousand ");
            } else if (var4 / 1000 == 4) {
                System.out.print("Four Thousand ");
            } else if (var4 / 1000 == 5) {
                System.out.print("Five Thousand ");
            } else if (var4 / 1000 == 6) {
                System.out.print("Six Thousand ");
            } else if (var4 / 1000 == 7) {
                System.out.print("Seven Thousand ");
            } else if (var4 / 1000 == 8) {
                System.out.print("Eight Thousand ");
            } else if (var4 / 1000 == 9) {
                System.out.print("Nine Thousand ");
            }

            if (var4 / 100 % 10 == 1) {
                System.out.print("One Hundred And ");
            } else if (var4 / 100 % 10 == 2) {
                System.out.print("Two Hundred And ");
            } else if (var4 / 100 % 10 == 3) {
                System.out.print("Three Hundred And ");
            } else if (var4 / 100 % 10 == 4) {
                System.out.print("Four Hundred And ");
            } else if (var4 / 100 % 10 == 5) {
                System.out.print("Five Hundred And ");
            } else if (var4 / 100 % 10 == 6) {
                System.out.print("Six Hundred And ");
            } else if (var4 / 100 % 10 == 7) {
                System.out.print("Seven Hundred And ");
            } else if (var4 / 100 % 10 == 8) {
                System.out.print("Eight Hundred And ");
            } else if (var4 / 100 % 10 == 9) {
                System.out.print("Nine Hundred And ");
            }

            if (var4 / 10 % 100 % 10 == 2) {
                System.out.print("Twenty");
            } else if (var4 / 10 % 100 % 10 == 3) {
                System.out.print("Thirty");
            } else if (var4 / 10 % 100 % 10 == 4) {
                System.out.print("Forty");
            } else if (var4 / 10 % 100 % 10 == 5) {
                System.out.print("Fifty");
            } else if (var4 / 10 % 100 % 10 == 6) {
                System.out.print("Sixty");
            } else if (var4 / 10 % 100 % 10 == 7) {
                System.out.print("Seventy");
            } else if (var4 / 10 % 100 % 10 == 8) {
                System.out.print("Eighty");
            } else if (var4 / 10 % 100 % 10 == 9) {
                System.out.print("Ninety");
            }

            if (var4 % 10 == 1) {
                System.out.print("-One");
            } else if (var4 % 10 == 2) {
                System.out.print("-Two");
            } else if (var4 % 10 == 3) {
                System.out.print("-Three");
            } else if (var4 % 10 == 4) {
                System.out.print("-Four");
            } else if (var4 % 10 == 5) {
                System.out.print("-Five");
            } else if (var4 % 10 == 6) {
                System.out.print("-Six");
            } else if (var4 % 10 == 7) {
                System.out.print("-Seven");
            } else if (var4 % 10 == 8) {
                System.out.print("-Eight");
            } else if (var4 % 10 == 9) {
                System.out.print("-Nine");
            }
        } else if (var3 < 8 && var3 % 2 != 0 && var2 <= 31) {
            if (var2 == 10) {
                System.out.print("Tenth of ");
            } else if (var2 == 11) {
                System.out.print("Eleventh of ");
            } else if (var2 == 12) {
                System.out.print("Twelfth of ");
            } else if (var2 == 13) {
                System.out.print("Thirteenth of ");
            } else if (var2 == 14) {
                System.out.print("Fourteenth of ");
            } else if (var2 == 15) {
                System.out.print("Fifteenth of ");
            } else if (var2 == 16) {
                System.out.print("Sixteenth of ");
            } else if (var2 == 17) {
                System.out.print("Seventh of ");
            } else if (var2 == 18) {
                System.out.print("Eighteenth of ");
            } else if (var2 == 19) {
                System.out.print("Nineteenth of ");
            }

            if (var2 / 10 == 2) {
                System.out.print("Twenty ");
            } else if (var2 / 10 == 3) {
                System.out.print("Thirty ");
            }

            if (var2 % 10 == 1) {
                System.out.print("First of ");
            } else if (var2 % 10 == 2) {
                System.out.print("Second of ");
            } else if (var2 % 10 == 3) {
                System.out.print("Third of ");
            } else if (var2 % 10 == 4) {
                System.out.print("Fourth of ");
            } else if (var2 % 10 == 5) {
                System.out.print("Fifth of ");
            } else if (var2 % 10 == 6) {
                System.out.print("Sixth of ");
            } else if (var2 % 10 == 7) {
                System.out.print("Seventh of ");
            } else if (var2 % 10 == 8) {
                System.out.print("Eighth of ");
            } else if (var2 % 10 == 9) {
                System.out.print("Ninth of ");
            }

            if (var3 == 1) {
                System.out.print("January ");
            } else if (var3 == 3) {
                System.out.print("March ");
            } else if (var3 == 5) {
                System.out.print("May ");
            } else if (var3 == 7) {
                System.out.print("July ");
            }

            if (var4 / 100 == 19) {
                System.out.print("Nineteen ");
            } else if (var4 / 100 == 18) {
                System.out.print("Eighteen ");
            } else if (var4 / 100 == 17) {
                System.out.print("Seventeen ");
            } else if (var4 / 100 == 16) {
                System.out.print("Sixteen ");
            } else if (var4 / 100 == 15) {
                System.out.print("Fifteen ");
            } else if (var4 / 100 == 14) {
                System.out.print("Fourteen ");
            } else if (var4 / 100 == 13) {
                System.out.print("Thirteen ");
            } else if (var4 / 100 == 12) {
                System.out.print("Twelve ");
            } else if (var4 / 100 == 11) {
                System.out.print("Eleven ");
            } else if (var4 / 1000 == 2) {
                System.out.print("Two Thousand ");
            } else if (var4 / 1000 == 3) {
                System.out.print("Three Thousand ");
            } else if (var4 / 1000 == 4) {
                System.out.print("Four Thousand ");
            } else if (var4 / 1000 == 5) {
                System.out.print("Five Thousand ");
            } else if (var4 / 1000 == 6) {
                System.out.print("Six Thousand ");
            } else if (var4 / 1000 == 7) {
                System.out.print("Seven Thousand ");
            } else if (var4 / 1000 == 8) {
                System.out.print("Eight Thousand ");
            } else if (var4 / 1000 == 9) {
                System.out.print("Nine Thousand ");
            }

            if (var4 / 100 % 10 == 1) {
                System.out.print("One Hundred And ");
            } else if (var4 / 100 % 10 == 2) {
                System.out.print("Two Hundred And ");
            } else if (var4 / 100 % 10 == 3) {
                System.out.print("Three Hundred And ");
            } else if (var4 / 100 % 10 == 4) {
                System.out.print("Four Hundred And ");
            } else if (var4 / 100 % 10 == 5) {
                System.out.print("Five Hundred And ");
            } else if (var4 / 100 % 10 == 6) {
                System.out.print("Six Hundred And ");
            } else if (var4 / 100 % 10 == 7) {
                System.out.print("Seven Hundred And ");
            } else if (var4 / 100 % 10 == 8) {
                System.out.print("Eight Hundred And ");
            } else if (var4 / 100 % 10 == 9) {
                System.out.print("Nine Hundred And ");
            }

            if (var4 / 10 % 100 % 10 == 2) {
                System.out.print("Twenty");
            } else if (var4 / 10 % 100 % 10 == 3) {
                System.out.print("Thirty");
            } else if (var4 / 10 % 100 % 10 == 4) {
                System.out.print("Forty");
            } else if (var4 / 10 % 100 % 10 == 5) {
                System.out.print("Fifty");
            } else if (var4 / 10 % 100 % 10 == 6) {
                System.out.print("Sixty");
            } else if (var4 / 10 % 100 % 10 == 7) {
                System.out.print("Seventy");
            } else if (var4 / 10 % 100 % 10 == 8) {
                System.out.print("Eighty");
            } else if (var4 / 10 % 100 % 10 == 9) {
                System.out.print("Ninety");
            }

            if (var4 % 10 == 1) {
                System.out.print("-One");
            } else if (var4 % 10 == 2) {
                System.out.print("-Two");
            } else if (var4 % 10 == 3) {
                System.out.print("-Three");
            } else if (var4 % 10 == 4) {
                System.out.print("-Four");
            } else if (var4 % 10 == 5) {
                System.out.print("-Five");
            } else if (var4 % 10 == 6) {
                System.out.print("-Six");
            } else if (var4 % 10 == 7) {
                System.out.print("-Seven");
            } else if (var4 % 10 == 8) {
                System.out.print("-Eight");
            } else if (var4 % 10 == 9) {
                System.out.print("-Nine");
            }
        } else {
            System.out.print("INVALID DATE");
        }

    }
}
