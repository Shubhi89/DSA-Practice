import java.util.*;
public class area_circle {
    public static void main(String args[]) {
        try(Scanner sc = new Scanner(System.in)) {
            System.out.print("enter your radius");
            int r = sc.nextInt();
            float pi = 3.14f;
            float area = pi*r*r;
            System.out.println("Area of Circle is" + area);
        }
    }
}
