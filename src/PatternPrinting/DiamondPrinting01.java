package PatternPrinting;

import java.util.Scanner;

public class DiamondPrinting01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows");
        int n = sc.nextInt();
        int nsp = n/2; // Spaces
        int nst = 1;  //Stars
        int midLine = n/2 + 1; // middle line of diamond.
        for (int i = 1; i <= n ; i++) {
            // Print the spaces
            for (int j = 1; j <= nsp ; j++) {
                System.out.print(" ");
            }
            // Print no. of stars
            for (int j = 1; j <= nst ; j++) {
                System.out.print("*");
            }
            // Check for increment and decrement of stars.
            if (i < midLine){
                nsp--;
                nst+=2;
            }else{
                nsp++;
                nst-=2;
            }
            System.out.println();
        }
    }
}
