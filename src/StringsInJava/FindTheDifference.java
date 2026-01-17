package StringsInJava;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class FindTheDifference {
    // leet-code 389
    public static char findTheDifferences(String s, String t) {
        if(s.isEmpty()) return t.charAt(0);

       char [] str = s.toCharArray();
       char [] gtr = t.toCharArray();
        for (int i = 0; i < str.length; i++) {
            for (int j = 0; j < gtr.length; j++) {
                if(str[i] == gtr[j]){
                    gtr[j] = '*';
                    break; // mandatory
                }
            }
        }
        for (char c : gtr) {
            if (c != '*')
                return c;
        }
        return ' ';
    }


    public char findDifferences(String str, String gtr) {
//        optimal approach
        if(str.isEmpty()) return gtr.charAt(0);
        Map<Character, Integer> map = new HashMap<>();

        // Step 1: frequency map of str
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        // Step 2: subtract using gtr
        for (int i = 0; i < gtr.length(); i++) {
            char ch = gtr.charAt(i);

            if (!map.containsKey(ch)) {
                return ch; // extra character
            }

            map.put(ch, map.get(ch) - 1);

            if (map.get(ch) == 0) {
                map.remove(ch);
            }
        }

        return ' '; // logically unreachable

    }
    public static void main(String[] args) {
//        System.out.println(findDifference("adcb" , "abecd"));
    }
}
