package homework;

import java.util.*;

public class leap_year {
    public static void main(String args[]) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("enter the year = ");
            int year = sc.nextInt();

            if (year % 4 != 0) {
                System.out.println("not a leap year");
            } else {
                if (year % 100 != 0) {
                    System.out.println("leap year");
                }
                else{
                    if(year%400 != 0) {
                        System.out.println("not a leap year");
                    }
                }
            }
        }
    }
}
