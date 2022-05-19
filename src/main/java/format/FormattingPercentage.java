package format;

import java.text.NumberFormat;

public class FormattingPercentage {
    public static void main(String[] args) {
        var percentage = NumberFormat.getPercentInstance().format(0.5);
        System.out.println(percentage);
    }
}
