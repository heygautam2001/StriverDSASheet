package Basics;

import java.util.Arrays;
// Leet-code 628
public class MaximumProductOfThreeNum {
    public static int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int product1 = nums[n-1] * nums[n-2] * nums[n-3];
        int product2 = nums[0] * nums[1] * nums[n-1];
        return Math.max(product1, product2);
    }

    public static void main(String[] args) {
        System.out.println(maximumProduct(new int[]{-100,-2,-3,1}));
        System.out.println(maximumProduct(new int[]{-100,-98,-1,2,3,4}));

    }
}
