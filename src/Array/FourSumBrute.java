package Array;

import java.util.*;

public class FourSumBrute {
    public static List<List<Integer>> fourSum(int[] nums, int target) {

        int n = nums.length;

        // Set to store unique quadruplets
        Set<List<Integer>> st = new HashSet<>();

        // 4 nested loops to check all combinations
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int k = j + 1; k < n; k++) {
                    for (int l = k + 1; l < n; l++) {

                        long sum = 0;
                        sum += nums[i];
                        sum += nums[j];
                        sum += nums[k];
                        sum += nums[l];

                        // If sum equals target, store the quadruplet
                        if (sum == target) {
                            List<Integer> temp = Arrays.asList(
                                    nums[i], nums[j], nums[k], nums[l]
                            );

                            // Sort to handle duplicates
                            Collections.sort(temp);
                            st.add(temp);
                        }
                    }
                }
            }
        }

        // Convert set to list
        return new ArrayList<>(st);
    }

    public static void main(String[] args) {
        int []arr = {-3,4,6,-7,-8,5,6};
        System.out.println(fourSum(arr,9));

    }
}
