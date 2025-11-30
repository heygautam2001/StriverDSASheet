package Array;

import java.util.Arrays;

public class BuildArrayFromPermutation {
    public static int[] buildArray(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        int k = 0;

        for(int i = 0; i < n;i++){
            ans[i] = nums[nums[i]];
        }

        return ans;
    }

    public static void main(String[] args) {
        int[] nums1 = {0,2,1,5,3,4};
        int[] nums2 = {5,0,1,2,3,4};


        int arr[] = buildArray(nums1);
        System.out.println(Arrays.toString(arr));

        

    }
}
