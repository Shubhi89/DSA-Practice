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

    public static int knapsackQuesTabulation(int val[] , int wt[] , int W) {
        int n = val.length;
        int dp[][] = new int[n+1][W+1];

        for(int i=0;i<dp.length;i++) {
            dp[i][0] = 0;
        }
        for(int j=0;j<dp[0].length;j++) {
            dp[0][j] = 0;
        }

        for(int i=1;i<n+1;i++) {
            for(int j=1;j<W+1;j++) {
                int value = val[i-1];
                int weight = wt[i-1]; 

                if(weight <= j) { // valid
                    int incProfit = value + dp[i-1][j-weight];
                    int excProfit = dp[i-1][j];

                    dp[i][j] = Math.max(incProfit , excProfit);
                } else { // invalid
                    int excProfit = dp[i-1][j];
                    dp[i][j] = excProfit;
                }
            }
        }
        return dp[n][W];
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
        System.out.println(knapsackQuesTabulation(val, wt, W));
    }
} 
