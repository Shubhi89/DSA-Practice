import java.util.*;
public class fun_product {
    public static int product(int x , int y) {
        int ans = x*y;
        return ans;
    }
    public static void main(String args[]) {
        try(Scanner sc = new Scanner(System.in)) {
            System.out.print("enter your first number");
            int a = sc.nextInt();
            System.out.print("enter your second number");
            int b = sc.nextInt();

            int ans = product(a,b);
            System.out.println("the product of numbers is " + ans);
        }
    }
}
