package PatternPrinting;

import java.util.Scanner;

public class trianglePattern04{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = i; j <= n; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
//        *
//       * *
//      * * *
//     * * * *
// =================================================================================
        // numbers
        for (int i = 1; i <= n; i++) {
            for (int j = i; j <= n; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
//         1
//        2 2
//       3 3 3
//      4 4 4 4
//     5 5 5 5 5

        for (int i = 1; i <= n; i++) {
            for (int j = i; j <= n; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
//        1
//       1 2
//      1 2 3
//     1 2 3 4
//    1 2 3 4 5

// =============================================================================
        // with Alphabet
        for (int i = 1; i <= n; i++) {
            for (int j = i; j <= n; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print((char) (i + 64) + " ");
            }
            System.out.println();
        }
//         A
//        B B
//       C C C
//      D D D D
//     E E E E E

// ======================================================================================

        for (int i = 1; i <= n; i++) {
            for (int j = i; j <= n; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print((char) (j + 64) + " ");
            }
            System.out.println();
        }

//        A
//       A B
//      A B C
//     A B C D
//    A B C D E

// ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

        int nsp = n - 1;
        int nst = 1;

        for (int i = 1; i <= n; i++) {
            //Printing the number of spaces
            for (int j = 1; j <= nsp; j++) {
                System.out.print("#");
            }
            nsp--;
            //printing the stars
            for (int j = 1; j <= nst; j++) {
                System.out.print("*");
            }
            nst = nst + 2;
            System.out.println();
        }

// =====================================================
        // Star paramid with the help of ap formula
        for (int i = 1; i <= n; i++) {
            // Print the spaces first;
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");

            }
            // print the starts
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("* ");

            }
            System.out.println();

        }


        //=============================================================

        int nspp = n - 1;
        for (int i = 1; i <= n; i++) {
            int a = i - 1;
            // Print the spaces
            for (int j = 1; j <= nspp; j++) {
                System.out.print(" ");

            }
            nspp--;

            // print the first half traingle
            for (int k = 1; k <= i; k++) {
                System.out.print(k);
            }

            // Print the second half of the traingle
            for (int k = 1; k <= i - 1; k++) {
                System.out.print(a);
                a--;
            }
            System.out.println();

        }
/*
     1
    121
   12321
  1234321
 123454321
12345654321


 */

    }
}
