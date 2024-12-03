package recursion;

public class print_decreasing_numbers {
    public static void print_dec(int n) {
        if(n == 1) {
            System.out.print(n);
            return;
        }
        System.out.print(n +" ");
        print_dec(n-1);
    }
    public static void main(String[] args) {
        print_dec(10);
    }
}
