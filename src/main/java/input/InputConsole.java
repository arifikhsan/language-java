package input;

import java.util.Scanner;

public class InputConsole {
    public static void main(String[] args) {

        System.out.print("Enter age: ");
        byte age = new Scanner(System.in).nextByte();
        System.out.println("You entered: " + age);

        System.out.print("Enter name: ");
        String name = new Scanner(System.in).nextLine();
        System.out.println("You entered: " + name.trim());
    }
}
