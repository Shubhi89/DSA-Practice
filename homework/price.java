package homework;
import java.util.*;
public class price {
    public static void main(String args[]) {
        try(Scanner sc = new Scanner(System.in)) {
            System.out.print("enter price of pencil");
            float pencil = sc.nextFloat();
            System.out.print("enter price of pen");
            float pen = sc.nextFloat();
            System.out.print("enter price of eraser");
            float eraser = sc.nextFloat();
            float total = (pencil+pencil*0.18f) + (pen+pen*0.18f) + (eraser+eraser*0.18f);
            System.out.println("your total with GST is " + total);
        }
    }
}
