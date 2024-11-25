package homework;
public class check_even {
    public static boolean isEven(int a) {
        if(a%2 == 0) {
            return true;
        }
        return false;
    }
    public static void main(String args[]) {
        int num = 53;
        if(isEven(num)) {
            System.out.println(num + " is even");
        } else {
            System.out.println(num + " is odd");
        }
    }
}
