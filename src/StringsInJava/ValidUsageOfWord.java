package StringsInJava;

import java.util.HashMap;
import java.util.Map;

// leet-code 520
public class ValidUsageOfWord {
    // Algorithm
    // 1. Make the frequency map  of uppercase and lowercase string
    public static boolean isValid(String str){
        if(str.length() == 1)
            return true;
        //HashMap to store the frequency of uppercase and lowercase letter.
        Map<String , Integer> map = new HashMap<>();
        // put the initial value of uppercase and lowercase as 0
        map.put("uppercase",0);
        map.put("lowercase",0);
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) >= 'A' && str.charAt(i) <= 'Z'){
                map.put("uppercase" , map.getOrDefault("uppercase",0)+1);
            }
            if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z'){
                map.put("lowercase" , map.getOrDefault("lowercase",0)+1);
            }
        }
        // check if the condition is satisfying for the valid words
        if (map.get("uppercase") == str.length())
            return true;
        if(map.get("lowercase") == str.length())
            return true;
        if (map.get("uppercase") == 1 && map.get("lowercase") == str.length()-1){
            if(str.charAt(0) >= 'A' && str.charAt(0) <= 'Z'){
                return true;
            }
        }
        // if not return false;
        return false;
    }

    // More optimized solution
    public static boolean detectCapitalUse(String word) {

        int c = 0;

        for (char ch : word.toCharArray())
            if (ch >= 'A' && ch <= 'Z')
                c++;

        if (c < 1 || c == word.length())
            return true;
        else if (c == 1) {
            return word.charAt(0) >= 'A' && word.charAt(0) <= 'Z';
        } else
            return false;
    }
    public static void main(String[] args) {
        System.out.println(isValid("AAA"));
    }
}
