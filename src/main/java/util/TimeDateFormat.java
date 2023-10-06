package util;

import java.util.Calendar;
import java.util.Formatter;

public class TimeDateFormat {

    public static void main(String[] args) {
        Formatter formatter = new Formatter();
        Calendar calendar = Calendar.getInstance();

//        display 12 hours format
        formatter.format("%tr", calendar);
        System.out.println(formatter);
        formatter.close();

//        display full date and hour
        formatter = new Formatter();
        formatter.format("%tc", calendar);
        System.out.println(formatter);
        formatter.close();

//        display hour and minutes
        formatter = new Formatter();
        formatter.format("%tl:%<tM", calendar);
        System.out.println(formatter);
        formatter.close();

//        display name and number of the month
        formatter = new Formatter();
        formatter.format("%tB %tb %1$tm", calendar, calendar);
        System.out.println(formatter);
        formatter.close();
    }
}
