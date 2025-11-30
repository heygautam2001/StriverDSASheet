package PatternPrinting;

import java.util.Scanner;

public class trianglePattern05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows");
        int n = sc.nextInt();

        int nsp = 0;
        int nst = n;
        for (int i = 1; i <= n ; i++) {
            // Print the spaces
            for (int j = 1; j <= nsp ; j++) {
                System.out.print(" ");
            }
            nsp++;
            for (int j = i; j <= n ; j++) {
                System.out.print("*");
            }
            nst--;

            System.out.println( );

        }

    }
}
