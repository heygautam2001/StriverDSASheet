package Basics;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();

        // Counts the number of digit in a number

        int temp = n;
        int digitCount = 0;
        while (temp != 0){
            digitCount++;
            temp = temp/10;
        }
        System.out.println(digitCount);
        temp = n;
        // sum the number by raise to the power of digit count..
        int sum = 0;
        while (temp != 0){
            sum = (int)(sum + Math.pow(temp%10 , digitCount));
            temp = temp/10;
        }

        if(n == sum){
            System.out.println("Yes "+n+" is an Armstrong Number");
        }else{
            System.out.println(n+" is not an Armstrong Number");
        }


    }
}
