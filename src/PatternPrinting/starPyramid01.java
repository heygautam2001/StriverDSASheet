package PatternPrinting;

public class starPyramid01 {
    public static void main(String[] args) {
     int n = 5;
     int spaces = n-1;
        for (int i = 1; i <= n ; i++) {
            // print the spaces
            for (int j = 1; j <= spaces  ; j++) {
                System.out.print(" ");
            }
            spaces--;
            // print the stars
            for (int j = 1; j <= i ; j++) {
                System.out.print(j);
            }

            int a = i-1;
            for (int j = 1; j <= i-1 ; j++) {
                System.out.print(a);
                a--;
            }
            System.out.println();
        }
    }
}
