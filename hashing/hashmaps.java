package hashing;
import java.util.*;
public class hashmaps {
    public static void main(String[] args) {
        // create
        HashMap<String , Integer> hm = new HashMap<>();

        // insert
        hm.put("India", 100);
        hm.put("China", 150);
        hm.put("US" , 50);

        System.out.println(hm);

        // get  (returns null if key does not exist)
        int value = hm.get("India");
        System.out.println(value);

        // contains key
        System.out.println(hm.containsKey("India"));

        // remove (return null if not exist)
        System.out.println(hm.remove("China"));
        System.out.println(hm);

        // size
        System.out.println(hm.size());

        // is empty
        System.out.println(hm.isEmpty());

        // clear 
        hm.clear();
        System.out.println(hm);
    }
}
