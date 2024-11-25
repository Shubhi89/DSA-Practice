package homework;

public class Sum_digit {
    public static int sumOfDigits(int n) {
        int num = 0;
        while (n > 0) {
            int rem = n % 10;
            num += rem;
            n /= 10;
        }
        return num;
    }

    public static void main(String args[]) {
        System.out.println(sumOfDigits(127));
    }
}
