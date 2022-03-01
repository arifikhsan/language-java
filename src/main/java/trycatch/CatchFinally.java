package trycatch;

public class CatchFinally {
    public static void main(String[] args) {
        String message = null;

        try {
            System.out.println(message.toString());
        } catch (Exception exception) {
            System.out.println(exception.getMessage());
        } finally {
            System.out.println("That's all.....");
        }

        try {
            System.out.println(message);
        } catch (Exception exception) {
            System.out.println(exception.getMessage());
        } finally {
            System.out.println("That's all.....");
        }
    }
}
