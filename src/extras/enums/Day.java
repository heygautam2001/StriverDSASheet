package extras.enums;

import java.security.PrivateKey;

public enum Day {
//    SUNDAY,
//    MONDAY,
//    TUESDAY,
//    WEDNESDAY,
//    THRUSDAY,
//    FRIDAY,
//    SATURDAY;


    SUNDAY("Sunday"),
    MONDAY("Monday"),
    TUESDAY("Tuesday"),
    WEDNESDAY,
    THRUSDAY,
    FRIDAY,
    SATURDAY;

    private String lower;

    Day() {

    }

    public String display(){
        return "Today is "+ this.name();
    }

    private  Day(String lower){
        System.out.println("our constructor is called");
        this.lower = lower;
    }


}
