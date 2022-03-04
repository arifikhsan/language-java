package stream;

import java.util.stream.IntStream;

public class IntStreamSum {
    public static void main(String[] args) {
        System.out.println(IntStream.range(1, 10).sum()); // 45
    }
}
