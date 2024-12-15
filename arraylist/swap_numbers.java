package arraylist;

import java.util.ArrayList;

public class swap_numbers {
    public static void swap(ArrayList<Integer> list, int idx1, int idx2) {
        int temp = list.get(idx1);
        list.set(idx1, list.get(idx2));
        list.set(idx2, temp);
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(23);
        list.add(53);
        list.add(83);
        list.add(13);
        list.add(93);
        list.add(43);

        int idx1 = 2, idx2 = 0;
        swap(list, idx1, idx2);
        System.out.println(list);
    }
}
