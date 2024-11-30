package basics;
import java.util.*;
public class sum_natural {
    public static void main(String args[]) {
        try(Scanner sc = new Scanner(System.in)) {
            System.out.print("enter your n = ");
            int num = sc.nextInt();
            int sum = 0;
            int i = 1;

            while(i<=num) {
                sum += i;
                i++;
            }
            System.out.println("the sum is " + sum);
        }
    }
}

