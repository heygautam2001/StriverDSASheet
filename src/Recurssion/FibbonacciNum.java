package Recurssion;

public class FibbonacciNum {
    private static int findNthFibbonacci(int n){
        if(n == 0 || n == 1)
            return n;
        return findNthFibbonacci(n-1) + findNthFibbonacci(n-2);
    }
    public static void printFibbonacci(int n){
        for (int i = 1; i <= n ; i++) {
            System.out.println(findNthFibbonacci(i));
        }
    }

    public static void main(String[] args) {
        System.out.println(findNthFibbonacci(8));
        printFibbonacci(10);
    }
}
