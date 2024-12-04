package recursion;


public class x_power_n {
    public static int powerCalc(int x, int n) { // time= O(n) 
        if(n == 1) {
            return x;
        }
        int ans = x * powerCalc(x, n-1);
        return ans;
    }
    public static void main(String[] args) {
        System.out.println(powerCalc(2, 3));
    }
}
