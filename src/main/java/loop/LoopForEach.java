package loop;

import java.util.List;

public class LoopForEach {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3);
//        numbers.forEach((n) -> System.out.println(n));
        numbers.forEach(System.out::println);
    }
}
