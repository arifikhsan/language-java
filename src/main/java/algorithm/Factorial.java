package algorithm;

import java.util.List;

public class Factorial {
    public static void main(String[] args) {
        // 4! = 24
        // 5! = 120;
        List<Integer> numbers = List.of(4, 5, 6, 7, 8, 9, 10);
        numbers.forEach(Factorial::factorialWithMessage);
    }

    private static void factorialWithMessage(int number) {
        String result = message(number) + " is " + factorial(number);
        System.out.println(result);
    }

    private static int factorial(int number) {
        if (number == 1) return 1;

        return number * factorial(number - 1);
    }

    private static String message(int number) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Factorial of ").append(number).append("! (");
        for (int i = number; i > 0; i--) {
            if (i == 1) {
                stringBuilder.append(i);
            } else {
                stringBuilder.append(i).append(" x ");
            }
        }
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}
