package stream;

import java.util.ArrayList;
import java.util.List;

public class StreamParallel {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);

        List<Integer> result = numbers.stream().parallel().filter(number -> number > 1).toList();
    }
}
