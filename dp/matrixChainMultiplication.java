package dp;

public class matrixChainMultiplication {
    public static int mcmRecursion(int arr[] , int i , int j) {
        if(i == j) {
            return 0; // single matrix case
        }

        int ans = Integer.MAX_VALUE;
        for(int k=i;k<=j-1;k++) {
            int cost1 = mcmRecursion(arr, i, k); // Ai ----Ak = arr[i-1] x arr[k]
            int cost2 = mcmRecursion(arr, k+1, j); //Ak+1 ---Aj = arr[k] x arr[j]
            int cost3 = arr[i-1] * arr[k] * arr[j];
            int finalCost = cost1+cost2+cost3;
            ans = Math.min(ans , finalCost);
        }
        return ans; // mincost
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,3};
        int n = arr.length;

        System.out.println(mcmRecursion(arr, 1, n-1));
    }
}
