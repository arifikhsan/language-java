package datetime;

import java.time.LocalTime;

public class TimeHello {
    public static void main(String[] args) {
        var time = LocalTime.now();
        System.out.println(time);
    }
}
