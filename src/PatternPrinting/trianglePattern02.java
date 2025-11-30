package PatternPrinting;

import javax.sound.sampled.AudioSystem;
import java.util.Scanner;

public class trianglePattern02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows : ");
        int x = sc.nextInt();

        // * pattern printing
        for (int i = 1; i <= x ; i++) {
            for (int j = i; j <= x ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        // number pattern
        for (int i = 1; i <= x ; i++) {
            for (int j = i; j <= x ; j++) {
                System.out.print(i+" ");
            }
            System.out.println();
        }
// ========================================================================================
        for (int i = 1; i <= x ; i++) {
            for (int j = i; j <= x ; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
//        1 2 3 4
//        2 3 4
//        3 4
//        4
// ===================================================================================
//        1 2 3 4
//        1 2 3
//        1 2
//        1
        for (int i = 1; i <= x ; i++) {
            for (int j = i; j <= x ; j++) {
                if (j-i > 0){
                    System.out.print(j-i+" ");
                }

            }
            System.out.println();
        }
// =========================================================================================
// Alphabet
        for (int i = 1; i <= x ; i++) {
            for (int j = i; j <= x ; j++) {
                int ascii = (char)(i+64);
                if(ascii >= 65 && ascii <= 90) {
                    System.out.print((char) (i + 64)+" ");
                }
            }
            System.out.println();
        }

//        A A A A A
//        B B B B
//        C C C
//        D D
//        E
// ============================================================================================
        for (int i = 1; i <= x ; i++) {
            for (int j = i; j <= x ; j++) {
                int ascii = (char)(i+64);
                if(ascii >= 65 && ascii <= 90) {
                    if (j-i > 0) {
                        System.out.print((char) (j - i + 64) + " ");
                    }
                }
            }
            System.out.println();
        }

//        A B C D
//        A B C
//        A B
//        A
//===================================================================================

        for (int i = 1; i <= x ; i++) {
            for (int j = i; j <= x ; j++) {
                int ascii = (char)(i+64);
                if(ascii >= 65 && ascii <= 90) {
                    System.out.print((char) (j+ 64) + " ");
                }
            }
            System.out.println();
        }

//        A B C D E
//        B C D E
//        C D E
//        D E
//        E
//==========================================================================================

    }
}
