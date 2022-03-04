package stream;

import java.util.Arrays;
import java.util.List;

public class ListStream {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Slamet", "Sarman", "Siti", "Abdullah");
        names.stream()
                .map(String::toLowerCase)
                .filter(name -> name.startsWith("s"))
                .forEach(System.out::println);
    }
}
