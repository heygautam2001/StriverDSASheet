package Array;

import java.util.HashSet;
import java.util.Set;
// leetcode 217
public class ContainsDuplicate {
    //Brute force solution
    //TLE
    public static boolean containsDuplicate(int[] nums) {
        int n = nums.length;
        //  boolean flag = true;
        for(int i = 0; i < n; i++){
            for(int j = i+1; j < n; j++){
                if(nums[i] == nums[j])
                    return true;
            }

        }
        return false;
    }
    public static boolean containsDuplicates(int []nums){
        Set<Integer> seen = new HashSet<>();
        int n = nums.length;
        for(int i=0; i<n; i++){
            if(!seen.add(nums[i])){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {

    }
}
