package stream;

import java.util.stream.IntStream;

public class IntStreamNumber {
    public static void main(String[] args) {
        IntStream.range(1, 10).forEach(System.out::println);
    }
}
