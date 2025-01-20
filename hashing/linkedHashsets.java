package hashing;
import java.util.*;
public class linkedHashsets {
    public static void main(String[] args) {
        LinkedHashSet<String> cities = new LinkedHashSet<>();

        cities.add("delhi");
        cities.add("mumbai");
        cities.add("kanpur");
        cities.add("lucknow");
        cities.add("noida");

        System.out.println(cities);
    }
}
