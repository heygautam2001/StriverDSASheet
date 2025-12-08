package Basics;

public class UglyNumberII {
    // Brute force approach
    public static boolean isUgly(int n) {
        if (n <= 0) return false;
        int[] factors = {2, 3, 5};
        for (int f : factors) {
            while (n % f == 0) {
                n /= f;
            }
        }
        return n == 1;
    }
    public static int nthUglyNumber(int n) {
        int count = 0;
        int i = 1;
        while(count != n){
            if(isUgly(i)){
                count++;
            }
            i++;
        }
        return i-1;
    }
    public static void main(String[] args) {
        System.out.println(nthUglyNumber(1352));
    }
}
