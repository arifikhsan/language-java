package assignment.carrot;

import java.util.ArrayList;
import java.util.List;

// 1. Users contains: Name, ID, Point
// 2. User has a function send and received the point
// 3. Information history send and received point(Date, user sender, point, user receiver)
// 4. Information about List of Users
public class CarrotUser {
    public static void main(String[] args) {
        ArrayList<Transaction> transactions = new ArrayList<>();

        // 1 done
        User arif = new User(1, "Arif", 10);
        User udin = new User(2, "Udin", 10);
        ArrayList<User> users = new ArrayList<>(List.of(arif, udin));

        // 2 done
        arif.sendPoint(transactions, udin, 2);
        arif.askPoint(transactions, udin, 2);

        // 3 done
        System.out.println(arif.getPoint());
        System.out.println(udin.getPoint());

        System.out.println(transactions.size());

        // 4 done
        System.out.println(users);
    }
}
