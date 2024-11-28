public class odd_even {
    public static void oddEven(int n) {
        int bitMask = 1;
        if((n & bitMask) == 0) {
            System.out.println("even number");
        } else {
            System.out.println("odd number");
        }
    }
    public static void main(String[] args) {
        oddEven(12);
    }
}
