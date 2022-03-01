package conditional;

public class ConditionSwitch {
    public static void main(String[] args) {
        int number = 10;

        switch (number) {
            case 1:
                System.out.println("one");
                break;
            case 2:
                System.out.println("two");
                break;
            default:
                System.out.println("anything");
        }
    }
}
