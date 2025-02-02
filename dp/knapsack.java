package dp;
// 0-1 knapsack
public class knapsack {
    public static int knapsackQues(int val[] , int wt[] , int W , int n) {
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
    public static void main(String[] args) {
        int val[] = {5,14,10,45,30};
        int wt[] = {2,5,1,3,4};
        int W = 7;

        System.out.println(knapsackQues(val, wt, W, val.length));
    }
} 
