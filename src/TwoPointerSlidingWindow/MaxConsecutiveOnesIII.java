package TwoPointerSlidingWindow;

// Longest subarrays with at most k zeroes
public class MaxConsecutiveOnesIII {
   // Leet-code 1004

    // Brute force solution

    public static int maxConsecutiveOne(int[]nums , int k){
        int maxLen = 0;
        int n = nums.length;
        for (int i = 0; i < n; i++){
            int zeros = 0;
            for (int j = i; j < n; j++) {
                if(nums[j]==0) zeros++;
                if(zeros <= k){
                    int len = j-i+1;
                    maxLen = Math.max(len , maxLen);
                }else{
                    break;
                }
            }
        }
        return maxLen;
    }

    // Optimal solution...
   public static int maxConsecutiveOnes(int[] nums, int k) {
       int n = nums.length;

       // maxLen stores the maximum length of a valid window found so far
       int maxLen = 0;

       // l and r are the left and right pointers of the sliding window
       int l = 0;
       int r = 0;

       // zeros counts the number of 0s in the current window
       int zeros = 0;

       // Expand the window by moving the right pointer
       while (r < n) {

           // If current element is 0, include it in zero count
           if (nums[r] == 0) zeros++;

           // If zero count exceeds k, shrink the window from the left
           while (zeros > k) {
               // If the left element is 0, reduce zero count
               if (nums[l] == 0) zeros--;
               l++; // move left pointer to shrink window
           }

           // At this point, the window has at most k zeros
           // Update the maximum window length
           maxLen = Math.max(maxLen, r - l + 1);

           // Move right pointer to expand window
           r++;
       }
       // Return the maximum length of subarray with at most k zeros
       return maxLen;
   }


}
