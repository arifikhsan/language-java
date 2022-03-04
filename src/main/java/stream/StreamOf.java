package stream;

import java.util.stream.Stream;

public class StreamOf {
    public static void main(String[] args) {
        Stream.of("Ali", "Abdul", "Habib").sorted().findFirst().ifPresent(System.out::println); // Abdul
    }
}
