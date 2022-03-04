package stream;

import java.util.stream.IntStream;

public class SummaryStatistic {
    public static void main(String[] args) {
        var summary = IntStream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10).summaryStatistics();
        System.out.println(summary);
    }
}
