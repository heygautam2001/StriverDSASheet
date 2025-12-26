package Basics;
//leet-code 191
public class NumberOfOneBit {
    public static int hammingWeight(int n) {
        int setBits = 0;
        String binaryNumber = Integer.toBinaryString(n);
        for (int i = 0; i < binaryNumber.length(); i++) {
            if(binaryNumber.charAt(i) == '1'){
                setBits++;
            }
        }
//        System.out.println(binaryNumber);
        return setBits;
    }
    public static void main(String[] args) {
        System.out.println(hammingWeight(21));
    }
}
