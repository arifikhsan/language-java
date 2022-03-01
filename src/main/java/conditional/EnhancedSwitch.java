package conditional;

public class EnhancedSwitch {
    public static void main(String[] args) {
        int number = 2;

        switch (number) {
            case 1 -> System.out.println("one");
            case 2 -> System.out.println("two");
            default -> System.out.println("anything");
        }
    }
}
