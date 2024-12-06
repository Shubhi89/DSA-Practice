package recursion;

public class binary_strings {
    public static void binaryStrings(int n , int lastPlace , String str) {
        // base case 
        if(n == 0) {
            System.out.println(str);
            return;
        }
        if(lastPlace == 0) {
            // sit 0 on chair n
            binaryStrings(n-1, 0, str+"0");
            binaryStrings(n-1, 1, str+"1");
        } else {
            binaryStrings(n-1, 0, str+"0");
        }
    }
    public static void main(String[] args) {
        binaryStrings(3, 0, "");
    }
}
