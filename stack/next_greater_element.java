package stack;
import java.util.*;
public class next_greater_element {
    public static void main(String[] args) {
        int arr[] = {6,8,0,1,3};
        Stack<Integer> s = new Stack<>();
        int nxtGreater[] = new int[arr.length];

        for(int i= arr.length-1;i>=0;i--) {
            // 1st step
            while(!s.isEmpty() && arr[s.peek()] <= arr[i]) {
                s.pop();
            }
            // 2nd step
            if(s.isEmpty()) {
                nxtGreater[i] = -1;
            } else{
                nxtGreater[i] = arr[s.peek()];
            }
            // 3rd step
            s.push(i);
        }

        // print the result array
        for(int i=0;i<nxtGreater.length;i++) {
            System.out.print(nxtGreater[i] + " ");
        }
        System.out.println();
    }
}
