package Basics;

public class SumWithoutPlusMinus {

    public static int getSum(int a, int b) {
        while (b != 0) {
            int sum = a ^ b;        // sum without carry
            int carry = (a & b) << 1; // carry
            a = sum;
            b = carry;
        }
        return a;
    }

    public static void main(String[] args) {
        System.out.println(getSum(5, 7));    // 12
        System.out.println(getSum(-3, 9));   // 6
    }
}

