package Basics;
// Leet-code 2520
public class CountsDigitThatDividesNumber {
    public static int countDigits(int num) {
        if(num <= 9) return 1;
        int temp = num;
        int count = 0;
        while (temp != 0){
            int val = temp%10;
            if(num%val == 0)
                count++;
            temp = temp/10;
        }
        return count;
    }
    public static void main(String[] args) {
        System.out.println(countDigits(121));
    }
}
