package util;

import java.util.Currency;
import java.util.Locale;

public class CurrencyDemo {

    private static Currency instance;
    private static String displayName;

    public static void main(String[] args) {
        instance = Currency.getInstance(Locale.US);
        instance.getSymbol();
        displayName = instance.getDisplayName();
        System.out.println(displayName);
    }
}
