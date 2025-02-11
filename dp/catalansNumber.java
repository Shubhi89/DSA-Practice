package dp;

public class catalansNumber {
    public static int catalanRecursion(int n) {
        if(n == 0 || n == 1) {
            return 1;
        }

        int ans = 0;
        for(int i=0;i<=n-1;i++) {
            ans += catalanRecursion(i) * catalanRecursion(n-i-1);
        }
        return ans;
    }

    public static int catalanMemoization(int n , int dp[]) {
        if(n == 0 || n == 1) {
            return 1;
        }
        if(dp[n] != -1) {
            return dp[n];
        }
        int ans = 0;
        for(int i=0;i<=n-1;i++) {
            ans += catalanMemoization(i, dp) * catalanMemoization(n-i-1, dp);
        }
        return dp[n] = ans;
    }
    public static void main(String[] args) {
        int n = 5;
        int dp[] = new int[n+1];
        for(int i=0;i<dp.length;i++) {
            dp[i] = -1;
        }
        System.out.println(catalanRecursion(n));
        System.out.println(catalanMemoization(n, dp));
    }
}
