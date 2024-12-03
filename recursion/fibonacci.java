package recursion;

public class fibonacci {
    public static int fib(int n) {
        if(n == 1) {
            return n;
        } else if(n == 0) {
            return n;
        }
        int f1 = fib(n-1);
        int f2 = fib(n-2);
        int f = f1 + f2;
        return f;
    }
    public static void main(String[] args) {
        System.out.println(fib(8));
    }
}
