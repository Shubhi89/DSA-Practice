package recursion;

public class tiling_problem {
    public static int tiling(int n) { // 2 x n (floor size)
        if(n == 0 || n == 1) {
            return 1;
        }
        // vertical choice 
        int verticalTiles = tiling(n-1);
        // horizontal
        int horizontalTiles = tiling(n-2);

        int totalWays = verticalTiles + horizontalTiles;
        return totalWays;

    }
    public static void main(String[] args) {
        System.out.println(tiling(4));
    }
}
