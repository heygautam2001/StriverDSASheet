package Basics;

import java.util.Scanner;

public class CheckOddEven {
    public static void main(String[] args) {
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
