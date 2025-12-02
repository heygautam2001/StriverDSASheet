package Basics;

import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();

        int temp = n;
        int revNum = 0;
        while (temp != 0){
            revNum = revNum*10 + temp%10;
            temp = temp/10;
        }

        if(n == revNum){
            System.out.println("Yes "+n+" is Palindrome");
        }else{
            System.out.println(n+" is not a Palindrome");
        }


    }
}
