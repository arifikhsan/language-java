package algorithm;

public class Factorial {
    public static void main(String[] args) {
        // 4! = 24
        // 5! = 120;
        System.out.println("Factorial of 4 is: " + factorial(4));
        System.out.println("Factorial of 4 is: " + factorial(5));
    }

    private static int factorial(int number) {
        if (number == 1) return 1;

        return number * factorial(number - 1);
    }
}
