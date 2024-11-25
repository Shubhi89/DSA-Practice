package arrays;

import java.util.*;

public class twoD_arrays {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {
            int arr[][] = new int[3][4];
            int n = arr.length , m = arr[0].length;
            for(int i=0;i<n;i++) {
                for(int j=0;j<m;j++) {
                    arr[i][j] = sc.nextInt();
                }
            }
            System.out.println();
            
            for(int i=0;i<n;i++) {
                for(int j=0;j<m;j++) {
                    System.out.print(arr[i][j] + " ");
                }
                System.out.println();
            }
        }
    }

}
