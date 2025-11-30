package StringsInJava;

import java.util.Scanner;

public class ReverseWordInASentence {

    // A function for reversing a string
    public static String reverseStr(String str){
        StringBuilder gtr = new StringBuilder(str);
        int i = 0;
        int j = str.length()-1;
        while(i<=j){
            char ch = gtr.charAt(i);
            gtr.setCharAt(i,gtr.charAt(j));
            gtr.setCharAt(j,ch);
            i++;
            j--;
        }
       return gtr.toString();
    }

    // Function for reverse each word in a string

    public static String reverseWord(String str){
        int i = 0;
        int j = 0;
        String gtr = "";
        while(j < str.length()){
            if (str.charAt(j) == ' '){
             gtr += reverseStr(str.substring(i,j+1));
             i = j;
            }
            j++;
            if (j == str.length()-1 && str.charAt(j) != ' '){
                gtr += " "+ reverseStr(str.substring(i,j+1));
            }
        }
        return gtr.trim();
    }

    public static String reverseWords(String str){
        String[]arr= str.split(" ");
        String gtr = "";
        for(String ele : arr){
          gtr+= " "+ reverseStr(ele);
        }
        return gtr.trim();
    }

    public static void main(String[] args) {
//       Scanner sc = new Scanner(System.in);
//       System.out.println("Enter your sentence");
//       String str = sc.nextLine();
//        System.out.println(reverseWord(str));
//        System.out.println(reverseWord(str).length());
        System.out.println(reverseWords("Gautam Jove Mino "));
    }
}
