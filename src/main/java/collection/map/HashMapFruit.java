package collection.map;

import java.util.HashMap;

public class HashMapFruit {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "apple");
        map.put(2, "banana");
        map.put(3, "orange");
        map.put(4, "grape");

        map.remove(2);

        System.out.println(map);
    }
}
