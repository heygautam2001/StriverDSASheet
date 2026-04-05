package StringsInJava;

import java.util.Arrays;

public class MaximumSubstringWithDistinctStart {
    public static int maxDistinct(String []s) {
        int x = 0;
        for (int i = 0; i < s.length; i++) {
            if (s[i].contains("++")){
                x = x+1;
            }else{
                x = x-1;
            }

            Character.toString('X');

        }
        return x;
//          return (int)s.chars().distinct().count();
    }

    public static void main(String[] args) {
        
    }
}
