package Array;

import java.util.Arrays;
// leet-code 1480
public class RunningSum {
    public static int[] runningSum(int[] nums) {
        int n = nums.length;
        int sum = 0;
        for(int i = 0; i < n; i++){
            sum = sum+nums[i];
            nums[i] = sum;
        }
        return nums;
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,4};
        runningSum(arr);

    }
}
