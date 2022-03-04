package stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamMap {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.stream().map(number -> number.toString()).collect(Collectors.toList());
    }
}
