package StringsInJava;

import java.util.Arrays;

public class FindTheDifference {
    // leet-code 389
    public static char findTheDifference(String s, String t) {
      char[]str = s.toCharArray();
      Arrays.sort(str);
      char[] gtr = t.toCharArray();
      Arrays.sort(gtr);



      return gtr[gtr.length-1];

    }
    public static void main(String[] args) {
        System.out.println(findTheDifference("adcb" , "abcde"));
    }
}
