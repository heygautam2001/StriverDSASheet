package Basics;


// Leet-code 29.....
public class DivideTwoIntegers {
    public static int divide(int dividend, int divisor) {

        if (dividend == Integer.MIN_VALUE  && divisor == -1) {
            return Integer.MAX_VALUE;
        }

        return dividend / divisor;
    }

    public static void main(String[] args) {
        System.out.println(divide(Integer.MIN_VALUE , -1));
    }

}
