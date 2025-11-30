package StringsInJava;

import java.util.Scanner;

public class ReverseString {
    public static String reverseString(String str){
        int n = str.length();
        int i = 0;
        int j = str.length() - 1;
        StringBuilder str1 = new StringBuilder(str);
        while (i <= j) {
            char temp = str1.charAt(i);
            str1.setCharAt(i, str.charAt(j));
            str1.setCharAt(j,temp);
            i++;
            j--;
        }
        return str1.toString();
    }

    public static String reverseString1(String str){
        String rev =  "";
        for (int i = str.length()-1; i >= 0 ; i--) {
            rev = rev+str.charAt(i);
        }
        return rev;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(str);
        //System.out.println(reverseString(str));
        //System.out.println(reverseString(str,str.length()));
        System.out.println(reverseString1(str));
    }
}
