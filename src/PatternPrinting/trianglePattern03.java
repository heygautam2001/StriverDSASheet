package PatternPrinting;

import java.util.Scanner;

public class trianglePattern03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows : ");
        int x = sc.nextInt();
        // With star
        for (int i = 1 ; i <= x ; i++) {
            for (int j = i; j <= x ; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i  ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

//    *
//   **
//  ***
// ****
        // with numbers
        for (int i = 1 ; i <= x ; i++) {
            for (int j = i; j <= x ; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i  ; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
//         1
//        22
//       333
//      4444
//     55555
//====================================================================================
        for (int i = 1 ; i <= x ; i++) {
            for (int j = i; j <= x ; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i  ; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
//        1
//       12
//      123
//     1234
//    12345
//======================================================================================
        // with alphabet
        for (int i = 1; i <= x ; i++) {
            for (int j = i; j <= x; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print((char) (i + 64));
            }
            System.out.println();
        }
// ===================================================================================
        // with alphabet
        for (int i = 1; i <= x ; i++) {
            for (int j = i; j <= x; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print((char) (j + 64));
            }
            System.out.println();
        }

        //=======================================================

        for (int i = 1; i <= x; i++) {
            // Print for spaces
            for (int j = 1; j <= x-i ; j++) {
                System.out.print("#");
            }
            // print the stars
            for (int j = 1; j <= i ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
