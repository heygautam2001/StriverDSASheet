package StringsInJava;

import java.util.Arrays;

public class LongestCommonPrefix {
    public static String longestCommonPrefix(String[]arr){
        Arrays.sort(arr);
        String str1 = arr[0];
        String str2 = arr[arr.length-1];
        String str3 = "";
        int n = Math.min(str1.length(),str2.length());
        for (int i = 0; i < n; i++) {
            if(str1.charAt(i) != str2.charAt(i))
                return str3;
            str3 += str1.charAt(i);
            System.out.println(str3);
        }
        return str3;
    }

    public static void main(String[] args) {
        String [] arr = {"geeks","geeksforgeeks","geeksforreeks"};
        System.out.println(Arrays.toString(arr));
//        Arrays.sort(arr);
//        System.out.println(Arrays.toString(arr));
        System.out.println(longestCommonPrefix(arr));


    }

}
