package shortcuts;

public class ShortcutsHelloWorld {
    public static void main(String[] args) {
        // ctrl + w untuk memilih kata
        // ctrl alt v untuk ekstrak variabel
        // ctrl alt m untuk ekstrak method
        // ctrl alt p untuk ekstrak parameter
        printMessage("Hello World");
        printMessage("I am fine");
    }

    private static void printMessage(String message) {
        System.out.println(message);
    }
}
