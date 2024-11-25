import java.util.*;
public class calculator {
    public static void main(String args[]) {
        try(Scanner sc = new Scanner(System.in)) {
            System.out.print("enter your first number = ");
            int a = sc.nextInt();
            System.out.print("enter your second number = ");
            int b = sc.nextInt();
            System.out.print("enter your operation = ");
            char sign = sc.next().charAt(0);

            switch (sign) {
                case '+' : System.out.println(a+b);
                    break;
                case '-' : System.out.println(a-b);
                    break;
                case '*' : System.out.println(a*b);
                    break;
                case '/' : System.out.println(a/b);
                    break;
                default: System.out.println("invalid");
                    break;
            }
        }
    }
}
