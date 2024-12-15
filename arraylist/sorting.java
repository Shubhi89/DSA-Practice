package arraylist;

import java.util.ArrayList;
import java.util.Collections;

public class sorting {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(23);
        list.add(53);
        list.add(83);
        list.add(13);
        list.add(93);
        list.add(43);

        System.out.println(list);

        Collections.sort(list); //  ascending sorting 

        System.out.println(list);

        Collections.sort(list , Collections.reverseOrder()); // descending sorting

        System.out.println(list);
    }
}
