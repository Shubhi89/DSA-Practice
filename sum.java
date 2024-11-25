import java.util.*;

public class sum {
    public static void main(String args[]) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("enter first number");
            int a = sc.nextInt();
            System.out.print("enter second number");
            int b = sc.nextInt();
            int sum = a + b;
            System.out.println("The sum is " + sum);
        }
    }
}
