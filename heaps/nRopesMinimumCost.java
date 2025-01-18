package heaps;
import java.util.*;
public class nRopesMinimumCost {
    public static void main(String[] args) {
        int ropes[] = {2,3,3,4,6};

        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i=0;i<ropes.length;i++) {
            pq.add(ropes[i]);
        }

        int cost = 0;
        while(pq.size() > 1) {
            int twoMin = pq.remove() + pq.remove();
            pq.add(twoMin);
            cost = cost+twoMin;
        }

        System.out.println("cost = "+ cost);
    }
}
