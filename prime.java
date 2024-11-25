import java.util.*;
public class prime {
    public static void main(String args[]) {
        try(Scanner sc = new Scanner(System.in)) {
            System.out.print("enter your number(should be greater then 2) = ");
            int num = sc.nextInt();
            int count = 0;
            for(int i = 2;i<Math.sqrt(num);i++) {
                if(num%i == 0) {
                    count = 1;
                }
            }
            if(count == 1) {
                System.out.println("Number is not prime ");
            }
            else{
                System.out.println("Number is prime");
            }
        }
    }
}

