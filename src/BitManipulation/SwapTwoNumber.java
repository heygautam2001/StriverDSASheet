package BitManipulation;

public class SwapTwoNumber {
    public static void main(String[] args) {
        int num1 = 8;
        int num2= 9;
        System.out.println("num1 : "+num1);
        System.out.println("num2 : "+num2);
        num1 = num1 ^ num2;
        num2 = num1 ^ num2;
        num1 = num1 ^ num2;
        System.out.println("num1 : "+num1);
        System.out.println("num2 : "+num2);
    }
}
