package type;

public class CompareInstanceOf {
    public static void main(String[] args) {
        String messageOne = "Hello";
        String messageTwo = "World";

        int result = messageOne.compareTo(messageTwo);

        System.out.println(result == 0);
    }
}
