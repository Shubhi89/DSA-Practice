package hashing;
import java.util.*;
public class iterationOnHashsets {
    public static void main(String[] args) {
        HashSet<String> cities = new HashSet<>();
        cities.add("delhi");
        cities.add("mumbai");
        cities.add("kanpur");
        cities.add("lucknow");
        cities.add("noida");

        @SuppressWarnings("rawtypes")
        Iterator it = cities.iterator();
        while(it.hasNext()) {
            System.out.println(it.next());
        }
        System.out.println();
        for(String city : cities) {
            System.out.println(city);
        }
    }
}
