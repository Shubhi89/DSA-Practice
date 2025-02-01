package dp;

import java.util.Arrays;

public class climbingStairs {
    // recursion = O(2^n)
    public static int waysRecursion(int n) {
        if(n == 0) {
            return 1;
        }
        if(n < 0) {
            return 0;
        }
        return waysRecursion(n-1) + waysRecursion(n-2);
    }

    // memoization = O(n)
    public static int waysMemoization(int n , int dp[]) {
        if(n == 0) {
            return 1;
        } if(n < 0) {
            return 0;
        }
        if(dp[n] != -1) {
            return dp[n];
        }

        return dp[n] = waysMemoization(n-1, dp) + waysMemoization(n-2, dp);
    }
    public static void main(String[] args) {
        int n = 5;
        int dp[] = new int[n+1];
        Arrays.fill(dp , -1);
        System.out.println(waysRecursion(n));
        System.out.println(waysMemoization(n, dp));
    }
}
