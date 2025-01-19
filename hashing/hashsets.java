package hashing;
import java.util.*;
public class hashsets {
    public static void main(String[] args) {
        HashSet<Integer> hs = new HashSet<>();

        hs.add(5);
        hs.add(10);
        hs.add(15);
        hs.add(6);
        hs.add(10);
       System.out.println( hs.contains(15));

       hs.remove(10);
       System.out.println(hs);

       System.out.println(hs.size());
       hs.clear();
       System.out.println(hs);
       System.out.println(hs.isEmpty());

    }
}
