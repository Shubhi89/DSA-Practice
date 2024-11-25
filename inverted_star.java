import java.util.*;
public class inverted_star {
    public static void main(String args[]) {
        try(Scanner sc = new Scanner(System.in)) {
            System.out.print("enter number of lines to print");
            int line = sc.nextInt();

            for(int i =line;i>0;i--) {
                for(int j =i;j>0;j--) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }
}
