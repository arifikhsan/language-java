package stream;

import java.util.ArrayList;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamToSet {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);

        Set<Integer> result = numbers.stream().filter(y -> y > 10).collect(Collectors.toSet());
        System.out.println(result);
    }
}
