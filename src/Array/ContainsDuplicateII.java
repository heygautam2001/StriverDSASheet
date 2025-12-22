package Array;

import java.util.HashMap;
import java.util.HashSet;

// leet-code 219
public class ContainsDuplicateII {
    // Brute force solution..
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        for(int i = 0; i< nums.length; i++){
            for(int j = i+1; j < nums.length; j++){
                if(nums[i] == nums[j] && Math.abs(i-j) <= k){
                    return true;
                }
            }
        }
        return false;
    }
    // Optimized approach.
    public boolean containsNearbyDuplicates(int [] arr, int k){
        int n = arr.length;
        HashMap<Integer,Integer>map = new HashMap<>();
        for (int i = 0; i < n; i++) {
           if(map.containsKey(arr[i])){
               if(Math.abs(map.get(arr[i]) - i) <= k){
                   return true;
               }
           }
           map.put(arr[i],i);
        }
        return false;
    }
    public static void main(String[] args) {

    }
}
