package PatternPrinting;

import java.util.Scanner;

public class squarePattern01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows");
        int x = sc.nextInt();
        System.out.println("Enter number of cols");
        int y = sc.nextInt();
        // With Start
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
//* * * *
//* * * *
//* * * *
//* * * *
        // With numbers
        System.out.println();
        for (int i = 1; i <= x; i++) {
            for (int j = 1; j <= y; j++) {
                System.out.print(i+" ");
            }
            System.out.println();
        }

//        1 1 1 1
//        2 2 2 2
//        3 3 3 3
//        4 4 4 4



        System.out.println();
        for (int i = 1; i <= x; i++) {
            for (int j = 1; j <= y; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }

//        1 2 3 4
//        1 2 3 4
//        1 2 3 4
//        1 2 3 4


        // With alphabet
        System.out.println();
        for (int i = 1; i <= x; i++) {
            for (int j = 1; j <= y; j++) {
                System.out.print((char)(i+64)+" ");
            }
            System.out.println();
        }

//        A A A A
//        B B B B
//        C C C C
//        D D D D

        System.out.println();
        for (int i = 1; i <= x; i++) {
            for (int j = 1; j <= y; j++) {

                    System.out.print((char)(j+64)+" ");

            }
            System.out.println();
        }

//        A B C D
//        A B C D
//        A B C D
//        A B C D

        System.out.println();

        int a = 65;
        for(int i = 1 ; i <= x; i++){
            for (int j = 1; j <= y ; j++) {
                System.out.print((char)a+" ");
                a++;
            }
            System.out.println();
        }

//        A B C D
//        E F G H
//        I J K L
//        M N O P


    }
}
