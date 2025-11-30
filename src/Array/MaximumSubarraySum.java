package Array;

public class MaximumSubarraySum {
    // Brute force approach
    public int maxSubArray(int[] nums) {
        int n = nums.length;
        int overallMaxSum = Integer.MIN_VALUE;
        for(int i = 0 ; i < n; i++){
            for(int j = i; j < n; j++){
                int currSum = 0;
                for(int k = i; k <= j; k++){
                    currSum += nums[k];

                }
                if(currSum > overallMaxSum){
                    overallMaxSum = currSum;
                }
            }
        }
        return overallMaxSum;

    }

    // Better solution
    public int maxSubArraySum(int[] arr) {
        int n = arr.length;
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < n; i++){
            int sum = 0;
            for(int j = i; j < n; j++){
                sum = sum + arr[j];
                max = Math.max(sum,max);
            }

        }
        return max;
    }

    // Optimal solution

    public static long maxSubarraySum(int[] arr, int n) {
        long maxi = Long.MIN_VALUE; // maximum sum
        long sum = 0;

        for (int i = 0; i < n; i++) {
            sum += arr[i];
            if (sum > maxi) {
                maxi = sum;
            }

            // If sum < 0: discard the sum calculated
            if (sum < 0) {
                sum = 0;
            }
        }

        // To consider the sum of the empty subarray
        // uncomment the following check:

        //if (maxi < 0) maxi = 0;

        return maxi;
    }
    // print Any of the  subarray

    public static void main(String[] args) {

    }
}
