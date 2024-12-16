package arraylist;

import java.util.ArrayList;

public class pair_sum2 {
    public static boolean pairSum(ArrayList<Integer> list , int target) { // O(n)
        int bp = -1; int n = list.size();
        for(int i=0;i<n;i++) {
            if(list.get(i) > list.get(i+1)) { // breaking point
                bp = 1;
                break;
            }
        }

        int lp = bp+1; // smallest
        int rp = bp; // larget

        while(lp != rp) {
            // case 1
            if(list.get(lp) + list.get(rp) == target) {
                return true;
            }
            // case 2
            if(list.get(lp) + list.get(rp) < target) {
                lp = (lp+1)%n;
            }
            // case 3
            else {
                rp = (n+rp-1)%n;
            }
        }

        return false;
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(11);
        list.add(15);
        list.add(6);
        list.add(8);
        list.add(9);
        list.add(10);

        int target = 100;

        System.out.println(pairSum(list, target));
    }
}
