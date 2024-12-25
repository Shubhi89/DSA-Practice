package stack;
import java.util.*;
public class duplicate_parenthesis {
    public static boolean isDuplicate(String str) {
        Stack<Character> s = new Stack<>();

        for(int i=0;i<str.length();i++) {
            char ch = str.charAt(i);
            // closing 
            if(ch == ')') {
                int count = 0;
                while(!s.isEmpty() && s.peek() != '(') {
                    s.pop();
                    count++;
                }
                if(count < 1) {
                    return true;
                } else {
                    s.pop(); // opening pair
                }
            } else {
                // opening
                s.push(ch);
            }

        }
        return false;
    }
    public static void main(String[] args) {
        String str = "((a+b))"; // true;
        System.out.println(isDuplicate(str));
    }
}
