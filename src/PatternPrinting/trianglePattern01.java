package PatternPrinting;

import java.util.Scanner;

public class trianglePattern01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows");
        int x = sc.nextInt();
        System.out.println("Enter number of cols");
        int y = sc.nextInt();
        // * triangle
        for (int i = 1; i <= x; i++) {
            for (int j = 1; j <= i ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

//        *
//        * *
//        * * *
//        * * * *

        System.out.println();

        // With Numbers
        for (int i = 1; i <= x; i++) {
            for (int j = 1; j <= i ; j++) {
                System.out.print(i+" ");
            }
            System.out.println();
        }

//        1
//        2 2
//        3 3 3
//        4 4 4 4

        System.out.println();

        for (int i = 1; i <= x; i++) {
            for (int j = 1; j <= i ; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }

//        1
//        1 2
//        1 2 3
//        1 2 3 4

        System.out.println();

        // with alphabet
        for (int i = 1; i <= x; i++) {
            for (int j = 1; j <= i ; j++) {
                System.out.print((char)(i+64)+" ");
            }
            System.out.println();
        }

//        A
//        B B
//        C C C
//        D D D D
        System.out.println();

        // with alphabet
        for (int i = 1; i <= x; i++) {
            for (int j = 1; j <= i ; j++) {
                System.out.print((char)(j+64)+" ");
            }
            System.out.println();
        }
        System.out.println();

//        A
//        A B
//        A B C
//        A B C D

        int c = 65;
        int d = 97;
        for (int i = 1; i <= x ; i++) {
            for (int j = 1; j <= i ; j++) {
                if(i % 2 == 0) {
                    System.out.print((char) c + " ");
                    c++;
                }else{
                    System.out.print((char)d+" ");
                    d++;
                }
            }
            System.out.println();
        }

//        A
//        B C
//        D E F
//        G H I J

//        ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
           int a;
        for (int i = 1; i <= x ; i++) {
            if (i%2 != 0) a = 1;
            else a = 0;
            for (int j = 1; j <= i ; j++) {
                System.out.print(a+" ");
                if (a==0) a = 1;
                else a = 0;
            }
            System.out.println();
        }

//        1
//        0 1
//        1 0 1
//        0 1 0 1

        System.out.println();

        for (int i = 1; i <= x ; i++) {
            for (int j = 1; j <= i ; j++) {
                if ((i+j) % 2 == 0)
                    System.out.print("1 ");
                else
                    System.out.print("0 ");
            }
            System.out.println();

        }

//        1
//        0 1
//        1 0 1
//        0 1 0 1
//        1 0 1 0 1

//    ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++






    }
}
