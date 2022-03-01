package collection.map;

import java.util.TreeMap;

public class TreeMapName {
    public static void main(String[] args) {
        TreeMap<Integer, String> names = new TreeMap<>();
        names.put(1, "yunomi");
        names.put(2, "yui");
        names.put(3, "yuna");

        System.out.println(names);
    }
}
