package extras.enums;

import com.sun.security.jgss.GSSUtil;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Vector;

public class EnumInJava {
    // Enumeration means list of things...
    // Months in a Year
    // departments in college
    // Days in a week
    // etc... these are list of things

    public static void main(String[] args) {
//        System.out.println("SUNDAY");
//        System.out.println("MONDAY");
//        System.out.println("SUNDAY");
//        System.out.println("MONDAY");
//        System.out.println("SUNDAY");
//        System.out.println("SUNDAY");
//        System.out.println("SUNDAY");
//        System.out.println("SUNDAY");
//        System.out.println("SUNDAY");

        System.out.println(DayClass.MONDAY);
        System.out.println(DayClass.MONDAY);
        System.out.println(DayClass.SATURDAY);

        System.out.println(Day.SUNDAY);
        System.out.println(Day.THRUSDAY);

        Day tuesday = Day.TUESDAY;
        int x  = tuesday.ordinal();
        System.out.println(x);

        String name = tuesday.name();
        System.out.println(name);

        Day enumDay = Day.valueOf("MONDAY");
        System.out.println(enumDay);

        Day[] Values = Day.values();
        System.out.println(Arrays.toString(Values));

        System.out.println(tuesday.display());


    }

}
