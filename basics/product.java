package basics;
import java.util.*;
public class product {
    public static void main(String args[]) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("enter first number");
            int a = sc.nextInt();
            System.out.print("enter second number");
            int b = sc.nextInt();
            int product = a*b;
            System.out.println("The prouduct of these two numbers are " + product);
            System.out.print("enter third number");
            int c = sc.nextInt();
            System.out.print("the addition of numbers is " +  (a+b+c));
        }
    }
}
