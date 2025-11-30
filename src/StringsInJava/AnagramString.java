package StringsInJava;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class AnagramString {

    public  static boolean isAnagram(String str1 , String str2) {
        if (str1.length() != str2.length())
            return false;
        str1 = str1.replaceAll("\\s", "").toLowerCase();
        str2 = str2.replaceAll("\\s", "").toLowerCase();

        char [] ch1 = str1.toCharArray();
        char [] ch2 = str2.toCharArray();
         Arrays.sort(ch1);
         Arrays.sort(ch2);
         return Arrays.equals(ch1 , ch2);
    }
    //================================================================== //

    public static boolean isAnagram2(String s1 , String s2){
        if (s1.length() != s2.length())
            return false;
        else {
            int i = 0;
            while(i < s1.length()){
                char ch = s1.charAt(i);
                if(getFreq(s1 , ch) != getFreq(s2,ch))
                    return false;
                i++;
            }
        }
        return false;
    }

    private static int getFreq(String s, char ch) {
        int freq = 0;
        int index = s.indexOf(ch);
        while(index != -1){
            freq++;
            index = s.indexOf(ch,index+1);
        }
        return freq;
    }

//======================================================================== //

    public static HashMap<Character , Integer> freqMap(String str){
        HashMap <Character , Integer> mp = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            if(mp.containsKey(str.charAt(i))){
                mp.put(str.charAt(i) , mp.get(str.charAt(i))+1);
            }else{
                mp.put(str.charAt(i) , 1);
            }
        }
        return mp;
    }

    public static boolean checkAnagram(String str1 , String str2 ){
        if (str1.length() != str2.length()) {
            return false;
        }
        HashMap<Character , Integer> mp1 = freqMap(str1);
        HashMap<Character , Integer> mp2 = freqMap(str2);
        return mp1.equals(mp2);
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        System.out.println(isAnagram(str1, str2));
        System.out.println(checkAnagram(str1 , str2));

    }
}

// write a java program to return longest common prefix in given two string //
// Very-Very Important question....
