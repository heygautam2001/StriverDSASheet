package Array;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
//leet-code = 1207
public class UniqueNumberOfOccurrences {
    public static boolean uniqueOccurrences(int[] arr) {
        Map<Integer,Integer> freq = new HashMap<>();
        for(int num : arr){
            freq.put(num , freq.getOrDefault(num,0)+1);
        }

        Set<Integer> set = new HashSet<>(freq.values());
        return set.size() == freq.size();
    }
    public static void main(String[] args) {
        int[]arr = {-3,0,1,-3,1,1,1,-3,10,0};
        int[]brr = {1,2};
        System.out.println(uniqueOccurrences(brr));
    }

}
