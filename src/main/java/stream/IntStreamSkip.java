package stream;

import java.util.stream.IntStream;

public class IntStreamSkip {
    public static void main(String[] args) {
        IntStream.range(1, 10).skip(5).forEach(System.out::println); // 6 to 9
    }
}
