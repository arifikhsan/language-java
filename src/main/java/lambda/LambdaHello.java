package lambda;

import java.util.function.Function;

public class LambdaHello {
    public static void main(String[] args) {
        Runnable hello = () -> System.out.println("Hello");
        hello.run();
    }
}
