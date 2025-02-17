package heaps;
import java.util.*;
public class insert {
    static class Heap {
        ArrayList<Integer> arr = new ArrayList<>();

        public void add(int data) { // O(logn)
            arr.add(data);

            int x = arr.size()-1; // x is child index
            int par = (x-1)/2; // parent index

            while(arr.get(x) < arr.get(par)) { //O(logn)
                // swap
                int temp = arr.get(x);
                arr.set(x , arr.get(par));
                arr.set(par , temp);

                x = par;
                par = (x-1)/2;
            }
        }

        public int peek() {
            return arr.get(0);
        }

        private void heapify(int idx) {
            int left = 2*idx+1;
            int right = 2*idx+2;
            int minIdx = idx;

            if(left < arr.size() && arr.get(minIdx) > arr.get(left)) {
                minIdx = left;
            }

            if(right < arr.size() && arr.get(minIdx) > arr.get(right)) {
                minIdx = right;
            }

            if(minIdx != idx) {
                // swap
                int temp = arr.get(idx);
                arr.set(idx , arr.get(minIdx));
                arr.set(minIdx , temp);

                heapify(minIdx);
            }
        }

        public int remove() { // O(log n)
            int data = arr.get(0);

            // step 1 = swap first and last
            int temp = arr.get(0);
            arr.set(0,arr.get(arr.size()-1));
            arr.set(arr.size()-1 , temp);

            // step 2 = delete last
            arr.remove(arr.size()-1);

            // step 3 = heapify
            heapify(0);
            return data;
        }

        public boolean isEmpty() {
            return arr.size() == 0;
        }
    }
    public static void main(String[] args) {
        Heap h = new Heap();
        h.add(3);
        h.add(4);
        h.add(10);
        h.add(0);

        while(!h.isEmpty()) { // heap sort O(nlogn)
            System.out.println(h.peek());
            h.remove();
        }
    }
}
