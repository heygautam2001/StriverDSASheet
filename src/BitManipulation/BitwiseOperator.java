package BitManipulation;

public class BitwiseOperator {
    public static void main(String[] args) {
        // Bitwise and(&) operator
        int num1 = 13;
        System.out.println("Number is "+num1);
        System.out.println("Equivalent binary :"+Integer.toBinaryString(num1));
        int num2 = 7;
        System.out.println("Number is "+num2);
        System.out.println("Equivalent binary :"+Integer.toBinaryString(num2));


       int x = num1 & num2;
       System.out.println("Equivalent number after bitwise AND(&) operation is :"+x);

        int y = num1 | num2;
        System.out.println("Equivalent number after bitwise OR(|) operation is :"+y);

        int z = num1 ^ num2;
        System.out.println("Equivalent number after bitwise XOR(^) operation is :"+z);

    }
}
