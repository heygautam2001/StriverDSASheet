package Array;

import java.util.*;

public class SortArraysByIncreasingFrequency {
    public int[] frequencySort(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        // make the frequency Map
        for(int num : nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        List<Integer> list = new ArrayList<>(map.keySet());
        // first sort by increasing frequency
        // if frequency are equal then sort by decreasing value
        Collections.sort(list,(a, b)->{
            if(map.get(a)!= map.get(b)){
                return map.get(a) - map.get(b);
            }
            return b-a;
        });

        int res[] = new int[nums.length];
        int index = 0;
        for(int key:list){
            int freq = map.get(key);
            for(int i = 0; i < freq; i++){
                res[index++] = key;
            }
        }
        return res;
    }
    public static void main(String[] args) {
        int[]nums = {-1,1,-6,4,5,-6,1,4,1};
    }
}
