package extras.javafeatures;

import java.time.LocalDate;
import java.time.LocalTime;

public class DateAndTimeApi {
    public static void main(String[] args) {
        // New Date and time classes
        // 1. Local Date
        // 2. Local Time
        // 3. LocalDateTime
        // 4. ZonedDateTime
        // 5. Instant
        // 6. Duration
        // 7. Period
        // 8. DateTimeFormatter

        // 1. LocalDate -> Represent Local Date

//        LocalDate now = LocalDate.now(); // current date
//        System.out.println(now);
//
//        LocalDate myDate = LocalDate.of(1990,2,7);
//        System.out.println(myDate);

       /* System.out.println(now.getMonth());
        System.out.println(now.getDayOfWeek());
        System.out.println(now.getYear());
        System.out.println(now.getDayOfYear());*/

//        System.out.println("day before Yesterday "+now.minusDays(2));
//        System.out.println("Past Month"+now.minusMonths(1));
//        System.out.println("Past week "+now.minusWeeks(2));
//        System.out.println("Past year "+now.minusYears(1));

//        if(now.isAfter(now.minusDays(1))){
//            System.out.println("Ha Bhai");
//        }

        // Local Time
        LocalTime now = LocalTime.now();
        long getSecond = now.getSecond();
        System.out.println(getSecond);

        LocalTime time =  LocalTime.of(LocalTime.now().getHour(), LocalTime.now().getMinute() , LocalTime.now().getSecond());
        System.out.println(time);

//        while (true){
//            LocalTime time1 =  LocalTime.of(LocalTime.now().getHour(), LocalTime.now().getMinute() , LocalTime.now().getSecond());
//            System.out.println(time1);
//        }



    }
}
