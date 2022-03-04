package stream;

import java.util.Arrays;

public class ArrayStreamAverage {
    public static void main(String[] args) {
        Arrays.stream(new int[] {2, 4, 6, 8, 10})
                .map(number -> number * number)
                .average()
                .ifPresent(System.out::println);
    }
}
