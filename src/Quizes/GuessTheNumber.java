package Quizes;

import java.util.Scanner;

public class GuessTheNumber {
    public static void guessTheNumber(){
        Scanner sc = new Scanner(System.in);
//        Generate a random Number and Store it in a variable.
        int randomNum = (int)(Math.random()*100)+1;
//        System.out.println(randomNum);
//        specify the number of attempts
        int noOfAttempts = 10;
        System.out.println("you have "+noOfAttempts+" attempts");
        while(noOfAttempts > 0) {
            System.out.println("Enter your number");
            int num = sc.nextInt();
            if (num < randomNum) {
                System.out.println("Guessed number is less than the actual number");
            } else if (num > randomNum) {
                System.out.println("Guessed number is bigger than the actual number");
            } else {
                System.out.println("Congratulations you won the game !");
                return;

            }
            noOfAttempts--;
            System.out.println("No of attempts left :  "+noOfAttempts);
        }
    }
    public static void main(String[] args) {
        guessTheNumber();
    }
}
