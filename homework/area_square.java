package homework;
import java.util.*;
public class area_square {
    public static void main(String args[]) {
        try(Scanner sc = new Scanner(System.in)) {
            System.out.print("enter side of square");
            int side = sc.nextInt();
            int area = side*side;
            System.out.println("Area of square is " + area);
        }
    }
}