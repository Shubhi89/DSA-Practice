package dp;

public class fibonacci {
    public static int fibMemoization(int n , int f[]) { // now = O(n) , before = exponential
        if(n == 0 || n == 1) {
            return n;
        }
        if(f[n] != 0) {
            return f[n];
        }
        f[n] = fibMemoization(n-1 , f) + fibMemoization(n-2 , f);
        return f[n];
    }

    public static int fibTabulation(int n) {
        int dp[] = new int[n+1];
        dp[0] = 0;
        dp[1] = 1;
        for(int i=2;i<=n;i++) {
            dp[i] = dp[i-2] + dp[i-1];
        }
        return dp[n];
    }
    public static void main(String[] args) {
        int n = 5;
        int f[] = new int[n+1];

        System.out.println(fibMemoization(n, f));
        System.out.println(fibTabulation(n));
    }
}
