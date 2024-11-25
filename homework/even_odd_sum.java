package homework;
import java.util.*;
public class even_odd_sum {
    public static void main(String args[]) {
        try(Scanner sc = new Scanner(System.in)) {
            System.out.print("enter your number");
            int num = sc.nextInt();
            int even_sum = 0;
            int odd_sum = 0;
            for(int i =1;i<=num;i++) {
                if(i%2 == 0) {
                    even_sum += i;
                }
                else{
                    odd_sum += i;
                }
            }
            System.out.println("the sum of even numbers is " + even_sum);
            System.out.println("the sum of odd numbers is " + odd_sum);
        }
    }
}
