package collection.set;

import java.util.HashSet;

public class HashSetNumber {
    public static void main(String[] args) {
        HashSet<Integer> numbers = new HashSet<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.remove(3);

        System.out.println(numbers);
    }
}
