package dp;
// 0-1 knapsack
public class knapsack {
    public static int knapsackQues(int val[] , int wt[] , int W , int n) { // O(2^n)
        if(W == 0 || n == 0) {
            return 0;
        }

        if(wt[n-1] <= W) { // valid
            int ans1 = val[n-1] + knapsackQues(val, wt, W-wt[n-1], n-1); // include
            int ans2 = knapsackQues(val, wt, W, n-1); // exclude

            return Math.max(ans1 , ans2);
        } else {
            return knapsackQues(val, wt, W, n-1);
        }
    }

    public static int knapsackQuesMemoization(int val[] , int wt[] , int W , int n , int dp[][]) { // O(n*W)
        if(W == 0 || n == 0) {
            return 0;
        }

        if(dp[n][W] != -1) {
            return dp[n][W];
        }

        if(wt[n-1] <= W) { // valid
            int ans1 = val[n-1] + knapsackQuesMemoization(val, wt, W-wt[n-1], n-1 , dp); // include
            int ans2 = knapsackQuesMemoization(val, wt, W, n-1 , dp); // exclude

            dp[n][W] =  Math.max(ans1 , ans2);
            return dp[n][W];
        } else {
            dp[n][W] =  knapsackQues(val, wt, W, n-1);
            return dp[n][W];
        }
    }
    public static void main(String[] args) {
        int val[] = {5,14,10,45,30};
        int wt[] = {2,5,1,3,4};
        int W = 7;
        int dp[][] = new int[val.length+1][W+1];
        for(int i=0;i<dp.length;i++) {
            for(int j=0;j<dp[0].length;j++) {
                dp[i][j] = -1;
            }
        }

        System.out.println(knapsackQues(val, wt, W, val.length));
        System.out.println(knapsackQuesMemoization(val, wt, W, val.length, dp));
    }
} 
