package datetime;

import java.time.LocalDateTime;

public class DateTimeHello {
    public static void main(String[] args) {
        var dateTime = LocalDateTime.now();

        System.out.println(dateTime.getYear());
        System.out.println(dateTime.getMonth());
        System.out.println(dateTime.getDayOfMonth());
    }
}
