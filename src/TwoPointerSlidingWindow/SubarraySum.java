package TwoPointerSlidingWindow;

public class SubarraySum {
    // Brute force solution
    public static int subarraySumLessThanK(int[]arr, int k){
        int n = arr.length;
        int maxLen = 0;
        int maxSum = 0;
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = i; j < n; j++) {
                sum = sum + arr[j];
                if(sum <= k){
                    maxLen = Math.max(maxLen , j-i+1);
                    maxSum = Math.max(sum,maxSum);
                }
                if (sum > k) break;
            }
        }
        System.out.println(maxSum);
        return maxLen;
    }

    //By sliding window optimal approach
    public static int subarraySumLesserThanK(int[]arr, int k){
        int n = arr.length;
        // left pointer
        int l = 0;
        // right pointer
        int r = 0;

        // sum variable to store the sum
        int sum = 0;
        // maxLen variable to store the maximum length of subarray
        int maxLen = 0;
        while (r < n){
            sum = sum + arr[r];
            while(sum > k){
                sum = sum - arr[l];
                l = l+1;
            }
            if (sum <= k){
                maxLen = Math.max(maxLen,r-l+1);
            }
            r++;

        }
        return maxLen;
    }
    public static void main(String[] args) {
        int []arr = {2,5,1,7,10};
        System.out.println(subarraySumLesserThanK(arr,14));
        System.out.println(Integer.toBinaryString(4));
    }
}
