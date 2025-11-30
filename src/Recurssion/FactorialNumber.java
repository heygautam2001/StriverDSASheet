package Recurssion;

public class FactorialNumber {
    private static int findFactorial(int n){
        if(n == 0)
            return 1;
        return n * findFactorial(n-1);
    }
    private static void printFactorial(int n){
        for (int i = 1; i <= n ; i++) {
            System.out.println(findFactorial(i));
        }
    }

    public static void main(String[] args) {
//        System.out.println( findFactorial(5));
        printFactorial(5);
    }
}
