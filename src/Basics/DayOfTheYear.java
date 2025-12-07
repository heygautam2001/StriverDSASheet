package Basics;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DayOfTheYear {
    public static int dayOfYear(String date) {
       String dateString = date;
       String pattern = "YYYY-MM-DD";

        SimpleDateFormat dateFormat = new SimpleDateFormat(pattern);
        try {
            Date date1 = dateFormat.parse(dateString);
            System.out.println(date1);
            return date1.getDate();
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }


    }
    public static void main(String[] args) {
        System.out.println(dayOfYear("2019-01-09"));;
    }
}
