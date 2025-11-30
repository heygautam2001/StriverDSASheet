package GeeksForGeeks;

public class LeapYear {
    public static boolean leapYear(int year){
        boolean isLeapYear = false;
        // if Year is divisible by 4 then it is a leap Year
        if(year % 4 == 0){
            isLeapYear = true;
            if(year % 100 == 0){
                if(year % 400 == 0){
                    isLeapYear = true;
                }else{
                    isLeapYear = false;
                }
            }
        }else{
            isLeapYear = false;
        }

        return isLeapYear;
    }
    public static boolean isLeapYear(int year){
        boolean leapYear = false;
        if((year % 4 == 0) && (year % 400 == 0 || year % 100 != 0) ){
            leapYear = true;

        }
        return leapYear;
    }
    public static void main(String[] args) {
        System.out.println(leapYear(100));
        System.out.println(isLeapYear(1994));
    }
}
