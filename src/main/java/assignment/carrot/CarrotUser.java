package assignment.carrot;

import java.util.ArrayList;
import java.util.List;

// 1. Users contains: Name, ID, Point
// 2. User has a function send and received the point
// 3. Information history send and received point(Date, user sender, point, user receiver)
// 4. Information about List of Users
public class CarrotUser {
    public static void main(String[] args) {
        ArrayList<History> histories = new ArrayList<>();

        // 1 done
        User arif = new User(1, "arif", 100);
        User khafido = new User(2, "khafido", 100);
        ArrayList<User> users = new ArrayList<>(List.of(arif, khafido));
        showUsers(users);

        // 2 done
        arif.sendPoint(histories, khafido, 10);
        khafido.sendPoint(histories, arif, 20);

        arif.askPoint(histories, khafido, 10);
        khafido.askPoint(histories, arif, 20);

        // 3 done
        showUsers(users);
        showHistories(histories);

        // 4 done
        System.out.println("Users " + "(" + users.size() + "): ");
    }

    private static void showHistories(ArrayList<History> histories) {
        System.out.println("History size: " + histories.size());
        histories.forEach(history -> System.out.println(history.toString()));
    }

    public static void showUsers(ArrayList<User> users) {
        System.out.println("------------------------------");
        users.forEach(CarrotUser::showUser);
    }

    public static void showUser(User user) {
        System.out.println("ID: " + user.getId());
        System.out.println("Name: " + user.getName());
        System.out.println("Point: " + user.getPoint());
        System.out.println("------------------------------");
    }
}
