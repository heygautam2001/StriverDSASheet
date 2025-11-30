package StringsInJava;

import java.util.HashMap;

public class LongestSubstringWithoutRepeatingCharacter {
    public static int longestSubstringWithoutRepeatingCharacter(String str){
        HashMap<Character , Integer> mp = new HashMap<>();
        int n = str.length();
        int right = 0;
        int left = 0;
        int len = 0;
        while(right < n){
            if(mp.containsKey(str.charAt(right))) {
                left = Math.max(mp.get(str.charAt(right)) + 1, left);
            }

            mp.put(str.charAt(right) , right);
            len = Math.max(len , right-left +1);
            right++;
        }
        return len;
    }

    public static String longestSubstringWithoutRepeatingCharacter(String str , int n){
        HashMap<Character , Integer> mp = new HashMap<>();
        int right = 0;
        int left = 0;
        int len = 0;
        while(right < n){
            if(mp.containsKey(str.charAt(right))) {
                left = Math.max(mp.get(str.charAt(right)) + 1, left);

            }

            mp.put(str.charAt(right) , right);
            len = Math.max(len , right-left +1);
            right++;

        }
        return str.substring(left , right);
    }
    public static void main(String[] args) {
        String str = "geeksforgeeks";
        System.out.println(longestSubstringWithoutRepeatingCharacter(str));
        System.out.println(longestSubstringWithoutRepeatingCharacter(str ,str.length()));
    }
}
