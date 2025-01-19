package hashing;
import java.util.*;
public class linkedHashmap {
    public static void main(String[] args) {
        LinkedHashMap<String , Integer> lhm = new LinkedHashMap<>();

        lhm.put("India" , 100);
        lhm.put("china" , 150);
        lhm.put("nepal" , 50);

        System.out.println(lhm);
    }
}
