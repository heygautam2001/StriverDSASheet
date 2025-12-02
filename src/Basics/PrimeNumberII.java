package Basics;

import java.util.Scanner;

public class PrimeNumberII {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();

        // Checking prime number

        for (int i = 2; i*i <= n ; i++) {
            System.out.println(n%i == 0 ? n +" Not a Prime Number" : n+" Prime Number");
        }

    }
}
