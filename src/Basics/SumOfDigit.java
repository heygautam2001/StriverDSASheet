package Basics;

import java.util.Scanner;

public class SumOfDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();

        // Logic for sum
        int temp = n;
        int sum = 0;
        while (temp != 0){
            sum = sum + temp%10;
            temp = temp/10;
        }
        System.out.println("sum of digits in "+n+" is "+sum);
    }
}
