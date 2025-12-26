package Basics;

public class PowerOfFour {
    public static boolean isPowerOfFour(int n) {
        if (n <= 0) return false;  // negative or zero can't be powers
        while (n % 4 == 0) {
            n /= 4;  // keep dividing by 3 as long as divisible
        }
        return n == 1;  // if you reach 1, it’s a power of 3
    }
    public static void main(String[] args) {

    }
}
