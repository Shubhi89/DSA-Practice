package homework;
import java.util.*;
public class if_else {
    public static void main(String args[]) {
        try(Scanner sc = new Scanner(System.in)) {
            System.out.print("enter your number");
            int num = sc.nextInt();

            if(num>0) {
                System.out.println("number is positive");
            }
            else{
                System.out.println("number is negative");
            }
        }
    }
}
