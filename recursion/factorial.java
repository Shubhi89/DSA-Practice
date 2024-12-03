package recursion;

public class factorial {
    public static int fac(int n) {
        if(n == 0 || n==1) {
            return 1;
        }
        int fb = fac(n-1);
        int f = n*fac(n-1);
        return f;
        
    }
    public static void main(String[] args) {
        System.out.println(fac(10));
    }
}
