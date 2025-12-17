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

    // passes all leet-code cases
    public String reverseWordInString(String str) {
        str = str.trim();
        String[]words = str.split("\\s+");
        String result = ""; // stores the answer
        for(int i = words.length-1; i>=0; i--){
            result = result + words[i];
            if(i > 0){
                result = result + " ";
            }
        }
        return result;
    }

    public String reverseWordsInString(String str) {
        str = str.trim();
        String[]words = str.split("\\s+");
        StringBuilder result = new StringBuilder(); // stores the answer
        for(int i = words.length-1; i>=0; i--){
            result.append(words[i]);
            if(i > 0){
                result = result.append(" ");
            }
        }
        return result.toString();
    }

    // =============================================================
    // Optimal solutions....
    public String reverseWordsOfString(String s) {
        int i = s.length()-1;
        StringBuilder sb = new StringBuilder();
        while(i>=0){
            while(i>=0 && s.charAt(i)==' '){
                i--; // skip the spaces last and first

            }

            if(i<0)break;

            int end = i;
            while(i >= 0 && s.charAt(i) != ' '){
                i--;
            }

            if(sb.length()>0){
                sb.append(" ");
            }


            String word = s.substring(i+1 , end+1);
            sb.append(word);

        }
        return sb.toString();
    }


    public static void main(String[] args) {

//      System.out.println(reverseWord("a good example"));
        System.out.println(reverseWords("I am Gautam"));

    }
}
