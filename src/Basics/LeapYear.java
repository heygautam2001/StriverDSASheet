package Basics;

import com.sun.security.jgss.GSSUtil;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Year YYYY : ");
        int year = sc.nextInt();

        boolean leap = (year % 400 == 0 || year % 4 == 0 && year % 100 != 0);
        System.out.println(leap ? "true(Leap Year)" : "false(Normal Year)");



    }
}
