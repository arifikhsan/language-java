package trycatch;

public class CatchIndexOutOfBound {
    public static void main(String[] args) {
        try {
            int[] numbers = {1, 2, 3};
            System.out.println(numbers[10]);
        } catch (Exception e) {
            assert System.out != null;
            System.out.println("Something went wrong.");
        }
    }
}
