public class factorial {
    public static int fac(int n) {
        int fac = 1;
        for(int i =1;i<=n;i++) {
            fac *= i;
        }
        return fac;
    }
    // binomial calculation
    public static void main(String args[]) {
        int n_fac = fac(5);
        int r_fac = fac(2);
        int n_rfac = fac(5-2);
        int ans = n_fac/(r_fac * n_rfac);
        System.out.println("value of binomial cofficient " + ans);
    }
}
