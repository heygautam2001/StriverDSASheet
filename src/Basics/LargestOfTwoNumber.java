package Basics;

import com.sun.security.jgss.GSSUtil;

import java.awt.desktop.SystemEventListener;
import java.util.Scanner;

public class LargestOfTwoNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number");
        int n = sc.nextInt();
        System.out.println("Enter second number");
        int m = sc.nextInt();
        if(n > m){
            System.out.println(n+" is greater than "+m);
        }else{
            System.out.println(m+" is greater than "+n);
        }
    }
}
