package heaps;
import java.util.*;
public class slidingWindowMax {

    static class Pair implements Comparable<Pair> {
        int num;
        int idx;

        public Pair(int num , int idx) {
            this.num = num;
            this.idx = idx;
        }

        @Override
        public int compareTo(Pair p2) {
            return p2.num - this.num; // decending order
        }
    }
    public static void main(String[] args) { //O(n logk)
        int arr[] = {1,3,-1,-3,5,3,6,7};
        int k = 3;
        int ans[] = new int[arr.length-k+1]; // size of ans array

        PriorityQueue<Pair> pq = new PriorityQueue<>();

        for(int i=0;i<k;i++) {
            pq.add(new Pair(arr[i] , i));
        }

        ans[0] = pq.peek().num;

        for(int i=k;i<arr.length;i++) {
            while(pq.size() > 0 && pq.peek().idx <= i-k) {
                pq.remove();
            }

            pq.add(new Pair(arr[i], i));
            ans[i-k+1] = pq.peek().num;
        }
        
        //print result
        for(int i=0;i<ans.length;i++) {
            System.out.print(ans[i]+" ");
        }
    }
}
