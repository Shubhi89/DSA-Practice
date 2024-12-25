package stack;
import java.util.*;
public class maxAreaInHistogram {
    public static void maxArea(int arr[]) {
        int maxArea = 0;
        int nxtSmallLeft[] = new int[arr.length];
        int nxtSmallRight[] = new int[arr.length];

        // next smaller right
        Stack<Integer> s = new Stack<>();
        for(int i=arr.length-1;i>=0;i--) {
            while(!s.isEmpty() && arr[s.peek()] >= arr[i]) {
                s.pop();
            }
            if(s.isEmpty()) {
                nxtSmallRight[i] = arr.length;
            } else {
                nxtSmallRight[i] = s.peek();
            }
            s.push(i);
        }
        // next smaller left
        s = new Stack<>();
        for(int i=0;i< arr.length;i++) {
            while(!s.isEmpty() && arr[s.peek()] >= arr[i]) {
                s.pop();
            }
            if(s.isEmpty()) {
                nxtSmallLeft[i] = -1;
            } else {
                nxtSmallLeft[i] = s.peek();
            }
            s.push(i);
        }

        // current area
        for(int i=0;i<arr.length;i++) {
            int height = arr[i];
            int width = nxtSmallRight[i] - nxtSmallLeft[i] -1;
            int currArea = height*width;
            maxArea = Math.max(maxArea, currArea);
        }
        System.out.println(maxArea);
    }
    public static void main(String[] args) {
        int arr[] = {2,1,5,6,2,3};
        maxArea(arr);
    }
}
