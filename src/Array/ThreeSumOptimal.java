package Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSumOptimal {
    public static List<List<Integer>> triplet(int n, int[] nums) {

        // This list will store all unique triplets whose sum is 0
        List<List<Integer>> ans = new ArrayList<>();

        // Step 1: Sort the array to use two-pointer technique
        Arrays.sort(nums);

        // Step 2: Fix the first element of the triplet one by one
        for (int i = 0; i < n; i++) {

            // Step 3: Skip duplicate elements to avoid repeating triplets
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }

            // Step 4: Initialize two pointers
            int j = i + 1;      // Left pointer
            int k = n - 1;      // Right pointer

            // Step 5: Move the two pointers to find valid triplets
            while (j < k) {

                // Step 6: Calculate the sum of three numbers
                int sum = nums[i] + nums[j] + nums[k];

                // Step 7: If sum is less than 0, move left pointer forward
                if (sum < 0) {
                    j++;

                    // Step 8: If sum is greater than 0, move right pointer backward
                } else if (sum > 0) {
                    k--;

                    // Step 9: If sum is exactly 0, we found a valid triplet
                } else {
                    ans.add(Arrays.asList(nums[i], nums[j], nums[k]));

                    // Step 10: Move both pointers after finding a triplet
                    j++;
                    k--;

                    // Step 11: Skip duplicate values for j pointer
                    while (j < k && nums[j] == nums[j - 1]) {
                        j++;
                    }

                    // Step 12: Skip duplicate values for k pointer
                    while (j < k && nums[k] == nums[k + 1]) {
                        k--;
                    }
                }
            }
        }
        // Step 13: Return the list of all unique triplets
        return ans;
    }

    public static void main(String[] args) {

    }
}
