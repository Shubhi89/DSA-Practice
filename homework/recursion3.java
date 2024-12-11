package homework;

public class recursion3 {
    public static int stringLength(String s) {
       if(s.length() == 0) {
        return 0;
       }
       return stringLength(s.substring(1)) + 1;
    }
    public static void main(String[] args) {
        String name = "shubhi";
        System.out.println(stringLength(name));

    }
    
}
