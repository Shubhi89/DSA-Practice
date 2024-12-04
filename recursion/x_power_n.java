package recursion;


public class x_power_n {
    public static int powerCalc(int x, int n) { // time= O(n) 
        if(n == 1) {
            return x;
        }
        int ans = x * powerCalc(x, n-1);
        return ans;
    }
    // optimized code 
    public static int pow(int x , int n) { // time = O(log n)
        if(n == 0) {
            return 1;
        }
        int halfPow = pow(x, n/2);
        int halfPowSq = halfPow*halfPow;
        // odd power
        if(n%2 != 0) {
            halfPowSq = x * halfPowSq;
        } 
        return halfPowSq;
    }
    public static void main(String[] args) {
        System.out.println(pow(2, 3));
    }
}
