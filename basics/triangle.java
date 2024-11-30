package basics;
import java.util.*;
public class triangle {
    public static void main(String args[]) {
        try(Scanner sc = new Scanner(System.in)) {
            System.out.print("enter no. of lines to print = ");
            int line = sc.nextInt();

            for(int i =0;i<line;i++) {
                for(int j=0;j<=i;j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }
}
