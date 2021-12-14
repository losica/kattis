import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Datum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int date = input.nextInt();
        int month = input.nextInt();

        Date d = new Date(2009, month-1, date-1);
        DateFormat format2=new SimpleDateFormat("EEEE", Locale.ENGLISH);
        String finalDay=format2.format(d);
        System.out.println(finalDay);
    }

}
