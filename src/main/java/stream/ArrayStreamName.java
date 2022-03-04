package stream;

import java.util.Arrays;

public class ArrayStreamName {
    public static void main(String[] args) {
        String[] names = {"Abdul", "Siti", "Slamet"};
        Arrays.stream(names)
                .filter(name -> name.startsWith("S"))
                .sorted()
                .forEach(System.out::println);
    }
}
