package StreamAPI;

import java.time.Clock;
import java.time.LocalDate;
import java.util.Date;

public class DateAndTimeApi {
    public static void main(String[] args) {
        // LocalDate
        //LocalTime
        // LocalDateAndTime


        // LocalDate
        LocalDate date = LocalDate.now();
        System.out.println(LocalDate.now());
        System.out.println(LocalDate.now(Clock.systemDefaultZone()));
        System.out.println(LocalDate.now(Clock.systemUTC()));

        System.out.println(date.getDayOfWeek()); // Monday
        System.out.println(date.getMonth()); // May
        System.out.println(date.getYear()); // 2026
        System.out.println(date.isLeapYear());

        System.out.println(date.getDayOfMonth()); // 11
        System.out.println(date.getDayOfYear()); // 131
        System.out.println(date.getDayOfWeek()); // Monday
        System.out.println(date.getEra()); // CE


        LocalDate date2 = LocalDate.of(2026,4,30);
        System.out.println(date2.minusDays(5).getDayOfWeek());






    }
}
