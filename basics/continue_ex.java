package basics;
import java.util.*;

public class continue_ex {
    public static void main(String args[]) {
        try (Scanner sc = new Scanner(System.in)) {
            do {
                System.out.print("enter your number = ");
                int num = sc.nextInt();
                if (num % 10 == 0) {
                    continue;
                }
                System.out.println(num);
            } while (true);
        }
    }
}
