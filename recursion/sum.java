package recursion;

public class sum {
    public static int sumNum(int n) {
        if(n == 0) {
            return n;
        }
        int s = n + sumNum(n-1);
        return s;
    }
    public static void main(String[] args) {
        System.out.println(sumNum(10));
    }
}
