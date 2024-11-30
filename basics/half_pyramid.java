package basics;
import java.util.*;
public class half_pyramid {
    public static void main(String args[]) {
        try(Scanner sc = new Scanner(System.in)) {
            System.out.print("enter number of lines = ");
            int line = sc.nextInt();

            for(int i =1;i<=line;i++) {
                for(int j = 1;j<=i;j++) {
                    System.out.print(j);
                }
                System.out.println();
            }
        }
    }
}
