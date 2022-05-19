package format;

import java.text.NumberFormat;

public class FormattingCurrency {
    public static void main(String[] args) {
        var currency = NumberFormat.getCurrencyInstance().format(10000.00);
        System.out.println(currency);
    }
}
