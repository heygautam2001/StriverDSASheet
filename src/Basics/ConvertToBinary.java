package Basics;

public class ConvertToBinary {
    public static String convertToBinary(int num){
        StringBuilder binary = new StringBuilder("");
        while (num != 0){
            if (num % 2 == 1)
               binary.append(1);
            else
                binary.append(0);
            num = num/2;
        }
        return binary.reverse().toString();
    }
    public static void main(String[] args) {
        System.out.println(convertToBinary(4));
    }
}
