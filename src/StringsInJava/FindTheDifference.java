package StringsInJava;

import java.util.Arrays;

public class FindTheDifference {
    // leet-code 389
    public static char findTheDifference(String s, String t) {
        if(s.length() == 0)
            return t.charAt(0);
        for(int i = 0; i < t.length(); i++){
            char ch = t.charAt(i);
            if(!s.contains(String.valueOf(ch))){
                return ch;
            }
        }
        return ' ';
    }
    public static void main(String[] args) {

        System.out.println(findTheDifference("adcb" , "abecd"));
    }
}
