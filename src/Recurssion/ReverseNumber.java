package Recurssion;

public class ReverseNumber {
    private static void  reverseDigit(int num , int rev){
        if(num == 0) {
            System.out.println(rev);
            return;
        }
        rev = rev*10 + num%10;
        reverseDigit(num/10 , rev);
    }
    public static void main(String[] args) {
        reverseDigit(2212217 , 0);
    }
}
