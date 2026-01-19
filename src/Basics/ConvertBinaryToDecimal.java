package Basics;

public class ConvertBinaryToDecimal {
    public static int convertToDecimal(String x){
        int n = x.length();
        int num = 0 , pow = 1;
        for (int i = n-1; i >= 0 ; i--) {
            if(x.charAt(i) == '1'){
                num = num+ pow;
            }
            pow = pow*2;
        }
        return num;
    }
    public static void main(String[] args) {
        System.out.println(convertToDecimal("10101"));
    }
}
