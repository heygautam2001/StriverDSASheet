package StringsInJava;

import java.util.Scanner;

public class RemoveOutmostParenthesis {
    public static String removeOutmostParenthesis(String str){
        String str1 = "";
        for (int i = 1; i < str.length()-1 ; i++) {
            str1 += str.charAt(i);
        }
        return str1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(str);
        System.out.println(removeOutmostParenthesis(str));

    }
}
/*Not correct solution*/