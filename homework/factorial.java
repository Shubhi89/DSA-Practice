package homework;
import java.util.*;
public class factorial {
    public static void main(String args[]) {
        try(Scanner sc = new Scanner(System.in)) {
            System.out.print("enter your number");
            int num = sc.nextInt();
            int fac = 1;
            for(int i = 1;i<=num;i++) {
                fac *= i;
            }
            System.out.println("the factorial of the number is " + fac );
        }
    }
}
