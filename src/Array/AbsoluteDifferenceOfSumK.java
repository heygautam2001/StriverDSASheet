package Array;

import java.util.Arrays;

public class AbsoluteDifferenceOfSumK {
    public int absDifference(int[]nums, int k) {
        int n = nums.length;
        Arrays.sort(nums);
        int kSmallestSum = 0;
        int kLargestSum = 0;
        if (n == 1)
            return 0;

        for (int i = 0; i < k; i++) {
            kSmallestSum += nums[i];
        }

        for (int i = 1; i <= k; i++) {
            kLargestSum += nums[n - i];
        }

        return Math.abs(kLargestSum - kSmallestSum);

    }

    public static void main(String[] args) {

    }
}
