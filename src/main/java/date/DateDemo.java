package date;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;

public class DateDemo {

    public static void main(String[] args) {
        Date currentDate = new Date();
//        currentDate.setHours(15);
        DateFormat df;
        SimpleDateFormat sdf;

        df = DateFormat.getTimeInstance(DateFormat.FULL, Locale.UK);
        System.out.println("UK " + df.format(currentDate));

        df = DateFormat.getDateTimeInstance(DateFormat.FULL, 0);
        System.out.println("DateTimeInstance: " + df.format(currentDate));

        sdf = new SimpleDateFormat("dd MMM yyyy HH:mm:ss zzz");
        System.out.println(sdf.format(currentDate));

        sdf = new SimpleDateFormat("dd MMM yyyy hh:mm:ss aa zzz");
        System.out.println(sdf.format(currentDate));
    }
}
