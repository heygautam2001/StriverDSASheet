package Basics;

import java.util.Arrays;

public class NeitherMinimumNorMaximum {
    // Brute Force
    public static int findNonMinOrMaximum(int[] nums) {
        if (nums.length == 1 || nums.length == 2)
            return -1;
        Arrays.sort(nums);
        return nums[1];
    }

    // Optimal

    public static int findNonMinOrMax(int []nums){
        if (nums.length == 1 || nums.length == 2)
            return -1;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int num : nums){
            if(num > max) max = num;
            if(num < min) min = num;
        }
        for(int num : nums){
            if(num != min && num != max)
                return num;
        }
        return -1;
    }


    public static void main(String[] args) {

    }
}
