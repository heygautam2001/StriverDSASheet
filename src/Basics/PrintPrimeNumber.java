package Basics;

import java.util.Scanner;

public class PrintPrimeNumber {
    public static boolean isPrime(int number){
        boolean isPrime = true;
        for (int i = 2; i*i <= number ; i++) {
            if(number%i == 0)
                isPrime = false;
        }
        return isPrime;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();

        // print the prime number in range b/w 1 To N

        for (int i = 2 ; i <= n; i++){
            if(isPrime(i)){
                System.out.print(i+" ");
            }
        }

}
}
