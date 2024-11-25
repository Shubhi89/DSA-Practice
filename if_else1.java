// WAP to print greater number
import java.util.*;

public class if_else1 {
    public static void main(String args[]) {
        try(Scanner sc = new Scanner(System.in)) {
            System.out.print("enter your first number");
            int a = sc.nextInt();
            System.out.print("enter your second number");
            int b = sc.nextInt();

            if(a>b) {
                System.out.println(a + " is greater ");
            }
            else{
                System.out.println(b + " is greater");
            }

        }
    }
}

