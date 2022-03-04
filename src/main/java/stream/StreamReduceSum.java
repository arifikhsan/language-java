package stream;

import java.util.ArrayList;

public class StreamReduceSum {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(5);

//        int total = numbers.stream().reduce(0, (a, b) -> a + b);
        int total = numbers.stream().reduce(0, Integer::sum);
        System.out.println(total);
    }

}
