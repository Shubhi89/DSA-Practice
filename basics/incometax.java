package basics;
import java.util.*;
public class incometax {
    public static void main(String args[]) {
        try(Scanner sc = new Scanner(System.in)) {
            System.out.print("enter your income in lakhs");
            int income = sc.nextInt();
            float tax;

            if(income<5) {
                tax = income*0;
                System.out.println("given tax is "+ tax +" lakhs");
            }
            else if(5<income && income<10) {
                tax = income*0.2f;
                System.out.println("given tax is "+ tax +" lakhs");
            }
            else if(income>10) {
                tax = income*0.3f;
                System.out.println("given tax is "+ tax+ " lakhs");
            }
        }
    }
}
