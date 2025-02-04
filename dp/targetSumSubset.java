package dp;

public class targetSumSubset {
    // tabulation
    public static boolean targetSumSubsetQues(int arr[] , int sum) { // O(n*sum)
        int n = arr.length;
        boolean dp[][] = new boolean[n+1][sum+1];
        // i = items , j = target sum
        for(int i=0;i<n+1;i++) {
            dp[i][0] = true;
        }

        for(int i=1;i<n+1;i++) {
            for(int j=1;j<sum+1;j++) {
                // include
                int val = arr[i-1];
                if(val <= j && dp[i-1][j-val] == true) {
                    dp[i][j] = true;
                }
                // exclude
                else if(dp[i-1][j] == true) {
                    dp[i][j] = true;
                }
            }
        }
        return dp[n][sum];
    }
    public static void main(String[] args) {
        int arr[] = {4,2,7,1,3};
        int sum = 10;

        System.out.println(targetSumSubsetQues(arr, sum));
    }
}
