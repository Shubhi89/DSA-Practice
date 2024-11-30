package basics;
// print the number is odd or even
import java.util.*;
public class if_else2 {
    public static void main(String args[]) {
        try(Scanner sc = new Scanner(System.in)) {
            System.out.print("enter your number = ");
            int num = sc.nextInt();

            if(num%2 == 0) {
                System.out.println("number is even");
            }
            else{
                System.out.println("number is odd");
            }
        }
    }
}
