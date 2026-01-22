package StringsInJava;

import java.util.*;
// 49
public class GroupAnagram {
    public static List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> map = new HashMap<>();
        for (String str : strs){
            char[]chars = str.toCharArray();
            Arrays.sort(chars);

            String key = new String(chars);

            List<String>list = map.get(key);

            if(list == null){
                list = new ArrayList<>();
                map.put(key, list);
            }
            list.add(str);
        }
    return new ArrayList<>(map.values());

    }

    public static void main(String[] args) {
    String [] strs = {"eat","tea","tan","ate","nat","bat"};
        System.out.println(groupAnagrams(strs));

    }
}

