package datetime;

import java.time.LocalDate;

public class DateHello {
    public static void main(String[] args) {
        var date = LocalDate.now();
        date = date.plusDays(1);

        System.out.println(date);
    }
}
