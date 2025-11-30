package Recurssion;

public class SumOfDigit {
    public static int sumOfDigit(int digit){
        if(digit  == 0)
            return 0;
       return digit % 10 + sumOfDigit(digit/10);

    }
    public static void main(String[] args) {
        System.out.println(sumOfDigit(12345));
    }
}
