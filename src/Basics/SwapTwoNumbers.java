package Basics;

import java.awt.desktop.SystemEventListener;
import java.util.Scanner;

public class SwapTwoNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number");
        int a = sc.nextInt();
        System.out.println("Enter second number");
        int b = sc.nextInt();
        System.out.println("Before swap");
        System.out.println("A is "+a);
        System.out.println("B is "+b);

        int temp = a;
        a = b;
        b = temp;

        System.out.println("After swap");
        System.out.println("A is "+a);
        System.out.println("B is "+b);




    }
}
