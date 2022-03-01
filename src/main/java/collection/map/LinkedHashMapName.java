package collection.map;

import java.util.LinkedHashMap;

public class LinkedHashMapName {
    public static void main(String[] args) {
        LinkedHashMap<Integer, String> names = new LinkedHashMap<>();
        names.put(1, "yoshi");
        names.put(2, "mario");
        names.put(3, "luigi");

        System.out.println(names);
    }
}
