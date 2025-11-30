package StringsInJava;

import java.util.Arrays;

public class ReverseWordInSentence {
    //=============== Reverse a word in string.....==============================//
    public static String reverseWord(String str){
        String[] arr = str.split(" ");
        int i = 0;
        int j = arr.length-1;
        while(i < j){
            String temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        return String.join(" ",arr).trim();
    }
    // This method is not removing the space between the string if two or three spaces are comes together
    // Not able to run the leet-code all test cases.
    //=========================================================================//
    public static String reverseWords(String str){
        String [] arr = str.split(" ");
        String gtr = "";
        for (int i = arr.length-1; i >= 0; i--) {
            if (arr[i] == " ")
                continue;
            gtr += arr[i]+" ";
        }

        return gtr.trim();

    }
    public static void main(String[] args) {

//        System.out.println(reverseWord("a good example"));
        System.out.println(reverseWords("I am Gautam"));

    }
}
