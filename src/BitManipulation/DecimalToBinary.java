package BitManipulation;

public class DecimalToBinary {
    public static StringBuilder integerToBinary(int num ){
        String res = "";
        int temp = num;
        while(temp != 0){
            if (temp % 2 == 1){
                res += '1';
            }else {
                res += '0';
            }
            temp = temp/2;
//            System.out.println(res);
        }

        StringBuilder gtr = new StringBuilder(res);
        return gtr.reverse();
    }
    public static String integerToBinaryValue(int num){
        return Integer.toBinaryString(num);
    }


    public static void main(String[] args) {
        System.out.println(integerToBinary(1));
        System.out.println(integerToBinaryValue(15));
    }
}
