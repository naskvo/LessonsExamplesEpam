package collections.aboutcollections;

import java.util.*;

public class MapMain {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("T-Shirt", 7);
        map.put("Jeans", 5);
        map.put("Gloves", 11);
        System.out.println(map);
        int value = map.put("Jeans", 4);
        System.out.println(value);
        System.out.println(map);
        Set<String> set = map.keySet();
        System.out.println(set);
        Collection<Integer> collection = map.values();
        System.out.println(collection);
        Set<Map.Entry<String, Integer>> values = map.entrySet();
        System.out.println(values);

        Map<String, Integer> map1 = new HashMap<>();
        map1.put("T-Shirt", 5);
        map1.put("Jeans", 5);
        map1.put("Gloves", 5);
        Collection<Integer> collection1 = map1.values();
        Set<Integer> set1 = new HashSet<>(collection1);
        System.out.println(set1);
    }
}
