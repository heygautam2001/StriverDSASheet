package Basics;

import java.util.Scanner;

public class CheckOddEven {
    public static boolean checkEvenOdd(int n)
    {
        while (n != 0 && n != 1){
            n = n-2;
        }
        return n == 0; // true → even, false → odd
    }

    public static boolean checkEvenOddNum(int n) {
        return (n & 1) == 0;
    }


    public static void main(String[] args) {
        System.out.println(checkEvenOdd(4));
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Number");
        int n = sc.nextInt();
        if(n%2 == 0){
            System.out.println(n+" is an Even Number");
        }else{
            System.out.println(n+" is an Odd Number");
        }
    }
}
