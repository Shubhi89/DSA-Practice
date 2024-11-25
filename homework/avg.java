package homework;

import java.util.*;

public class avg {
    public static void main(String args[]) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("enter first number");
            int a = sc.nextInt();
            System.out.println("enter second number");
            int b = sc.nextInt();
            System.out.println("enter third number");
            int c = sc.nextInt();
            int avg = (a + b + c) / 3;
            System.out.println("the average is " + avg);
        }
    }
}
