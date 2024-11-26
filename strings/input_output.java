package strings;
import java.util.*;
public class input_output {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {
            String name = sc.next(); // takes one word
            String fullName = sc.nextLine();// takes whole line
            int len = fullName.length(); // length of string
            System.out.println(name);
            System.out.println(fullName);
            System.out.println(len);
        }
    }
}
