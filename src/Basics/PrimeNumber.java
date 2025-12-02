package Basics;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();

        // Prime number check
        if(n < 2){
            System.out.println(n+" is not a prime number");
        }
        int factorCount = 0;
        for (int i = 2; i <= n/2 ; i++) {
            if(n%i == 0) {
                factorCount++;
                break;
            }
        }
        if (factorCount == 0){
            System.out.println(n+" is a prime number");
        }else{
            System.out.println(n+" is not a prime number");
        }


    }
}
