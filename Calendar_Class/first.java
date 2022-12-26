package Calendar_Class;

import java.text.DateFormat;
// import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
// import java.util.Locale;
import java.util.Scanner;

public class first {
    public static void main(String[] args) {
        Calendar ca = Calendar.getInstance();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Year-Month-Date: ");
        int year=sc.nextInt(), month=sc.nextInt()-1,date=sc.nextInt(); sc.close();
        ca.set(year, month, date);
        Date str = ca.getTime();
        DateFormat d = new SimpleDateFormat("EEEE"); // Getting Day Name
        System.out.println(d.format(str));
        // NumberFormat ff = NumberFormat.getCurrencyInstance(Locale.CHINA);
    }
}
