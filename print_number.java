import java.util.*;

public class print_number {
    public static void main(String args[]) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("enter the n = ");
            int num = sc.nextInt();
            int i = 1;
            while (i <= num) {
                System.out.println(i);
                i++;
            }
        }
    }
}
