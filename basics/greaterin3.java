package basics;
import java.util.*;
public class greaterin3 {
    public static void main(String args[]) {
        try(Scanner sc = new Scanner(System.in)) {
            System.out.print("enter your first number = ");
            int a = sc.nextInt();
            System.out.print("enter your second number = ");
            int b = sc.nextInt();
            System.out.print("enter your third number = ");
            int c = sc.nextInt();

            if(a>b && a>c) {
                System.out.println("a is greatest");
            }
            else if(b>a && b>c) {
                System.out.println("b is greatest");
            }
            else if(c>a && c>b) {
                System.out.println("c is greatest");
            }
        }
    }
}
