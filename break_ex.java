import java.util.*;

public class break_ex {
    public static void main(String args[]) {
        try (Scanner sc = new Scanner(System.in)) {

            do {
                System.out.print("enter your number = ");
                int num = sc.nextInt();
                if (num % 10 == 0) {
                    break;
                }
                System.out.println(num);
            } while (true);
        }
    }
}