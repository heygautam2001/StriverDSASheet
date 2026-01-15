package Basics;

import java.util.Collections;
import java.util.logging.LogManager;

public class AddBinary {
    // LEET-CODE 67
    // Cannot be able to handle all leet-code testcases.
    public static String add(String a , String b){
//       int num1 = Integer.parseInt(a,2);
//       int num2 = Integer.parseInt(b,2);
//       int sum = num1 + num2;
//       return Integer.toBinaryString(sum);
        long num1 = Long.parseLong(a,2);
        long num2 = Long.parseLong(b,2);
        long sum = num1 + num2;
        return Long.toBinaryString(sum);
    }
    public static void main(String[] args) {



    }
}
