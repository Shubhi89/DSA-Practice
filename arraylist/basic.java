package arraylist;
import java.util.ArrayList;

public class basic {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        // add element -> O(1)
        list.add(21);
        list.add(32);
        list.add(43);
        list.add(54);
        list.add(65);

        list.add(3,44); // O(n)

        System.out.println(list);

        // get element -> O(1)
        int ele = list.get(2);
        System.out.println(ele);

        // remove element -> O(n)
        list.remove(3);
        System.out.println(list);

        // set element at index -> O(n)
        list.set(3,89);
        System.out.println(list);

        // contains element -> O(n)
        System.out.println(list.contains(21));
        System.out.println(list.contains(11));

        // size of arraylist 
        System.out.println(list.size());
    }
}
