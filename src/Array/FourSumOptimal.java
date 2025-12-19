package Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FourSumOptimal {
    public static List<List<Integer>> fourSum(int[] nums, int target) {
        int n = nums.length;
        List<List<Integer>> ans = new ArrayList<>();

        // 1. Sort the array
        // This is crucial for the two-pointer approach and to easily skip duplicates.
        Arrays.sort(nums);

        // 2. First Pointer (i): Fixed pointer for the first element
        for (int i = 0; i < n; i++) {
            // Avoid duplicates for the first position
            if (i > 0 && nums[i] == nums[i - 1]) continue;

            // 3. Second Pointer (j): Fixed pointer for the second element
            for (int j = i + 1; j < n; j++) {
                // Avoid duplicates for the second position
                if (j > i + 1 && nums[j] == nums[j - 1]) continue;

                // 4. Two-Pointer Approach (k and l)
                // k starts from the left, l starts from the right
                int k = j + 1;
                int l = n - 1;

                while (k < l) {
                    // Use long to prevent integer overflow during addition
                    long sum = (long) nums[i] + nums[j] + nums[k] + nums[l];

                    if (sum == target) {
                        // Found a quadruplet
                        ans.add(Arrays.asList(nums[i], nums[j], nums[k], nums[l]));

                        // Move pointers and skip duplicates for k and l
                        k++;
                        l--;
                        while (k < l && nums[k] == nums[k - 1]) k++;
                        while (k < l && nums[l] == nums[l + 1]) l--;
                    }
                    else if (sum < target) {
                        // If sum is too small, move the left pointer forward to increase sum
                        k++;
                    }
                    else {
                        // If sum is too large, move the right pointer backward to decrease sum
                        l--;
                    }
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int []arr = {-3,4,6,-7,-8,5,6};
        System.out.println(fourSum(arr,9));
    }
}
