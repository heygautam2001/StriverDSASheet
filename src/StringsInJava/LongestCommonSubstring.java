package StringsInJava;

import java.util.Scanner;

public class LongestCommonSubstring {
    public static int longestCommonSubstring(String str , String gtr){
        int i = 0;
        int max = 0;
        while(i < str.length()){
            boolean flag = false;
            int j = 0;
            int len = 0;
            while(j < gtr.length() && i < str.length()){
                if (str.charAt(i) == gtr.charAt(j)){
                    len++;
                    i++;
                    flag = true;
                }
                else{
                    if (flag)
                        break;
                }
                j++;
            }
            if(len > max)
                max = len;

            if (!flag)
              i++;
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(longestCommonSubstring("hellonx" , "hellon"));

    }
}
