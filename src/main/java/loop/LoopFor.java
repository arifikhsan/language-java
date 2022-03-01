package loop;

import java.util.List;

public class LoopFor {
    public static void main(String[] args) {
        for (int number = 0; number < 5; number++) {
            System.out.println(number);
        }

        List<Integer> numbers = List.of(1, 2, 3);
        for (Integer number : numbers) {
            System.out.println(number);
        }
    }
}
