package trycatch;

public class CatchNull {
    public static void main(String[] args) {
        String message = null;

        try {
            System.out.println(message.toString());
        } catch (NullPointerException exception) {
            System.out.println(exception.getMessage());
            exception.printStackTrace();
        }
    }
}
