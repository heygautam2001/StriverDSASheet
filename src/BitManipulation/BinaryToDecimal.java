package BitManipulation;

public class BinaryToDecimal {
    public static int binaryToDecimal(String str){
        int len = str.length();
        int p2 = 1;
        int num = 0;

        for (int i = len-1; i >= 0 ; i--) {
            if (str.charAt(i) == '1')
                num = num + p2;
            p2 = p2 * 2;
        }
        return num;
    }
    public static void main(String[] args) {
        System.out.println(binaryToDecimal("101"));
    }
}
