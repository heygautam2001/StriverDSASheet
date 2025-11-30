package StringsInJava;

import java.net.Inet4Address;
import java.util.HashMap;
import java.util.Scanner;

public class FirstNonRepeatingCharacter {
    public static char firstNonRepeatingChar(String str){
        StringBuilder gtr = new StringBuilder(str);
        for (int i = 0; i < gtr.length(); i++) {
            int count = 1;
            if(gtr.charAt(i) == '{')
                continue;
            for (int j = i+1; j < gtr.length(); j++) {
                if(gtr.charAt(i) == gtr.charAt(j)){
                    count ++;
                    gtr.setCharAt(j , '{');
                }
            }
            if(count == 1)
                return gtr.charAt(i);
        }
        return '$';
    }
    public static HashMap<Character , Integer> freqMap(String str){
        int n = str.length();
        HashMap<Character , Integer> mp = new HashMap<>();
        for (int i = 0; i < n; i++) {
            if (mp.containsKey(str.charAt(i))){
                mp.put(str.charAt(i) , mp.get(str.charAt(i))+1);
            }else{
                mp.put(str.charAt(i) , 1);
            }
        }
        return mp;
    }
    public static char firstNonRepeatingCharacter(String str){
        HashMap<Character , Integer> mp = freqMap(str);
        for(var key : mp.keySet()){
           if (mp.get(key) == 1)
               return key;
        }
return '$';
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your String : ");
        String str = sc.nextLine();
        System.out.println(firstNonRepeatingChar(str));
        System.out.println(firstNonRepeatingCharacter(str));

    }
}
