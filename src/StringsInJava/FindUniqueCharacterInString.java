package StringsInJava;

import java.util.HashMap;

public class FindUniqueCharacterInString {
    public static int firstUniqChar(String s) {
        int n = s.length();
        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        }

        int minIndex = s.length();
        for (char key : map.keySet()) {
            if (map.get(key) == 1) {
                int index = s.indexOf(key);
                minIndex = Math.min(minIndex, index);
            }
        }

        return minIndex == s.length() ? -1 : minIndex;
    }
    public static void main(String[] args) {
        System.out.println(firstUniqChar("aabb"));
    }
}
