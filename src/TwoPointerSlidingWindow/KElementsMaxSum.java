package TwoPointerSlidingWindow;

public class KElementsMaxSum {
    public static int maxSumFourElements(int []arr , int k){
        int n = arr.length;
        int l = 0;
        int r = k-1;
        int maxSum = Integer.MIN_VALUE;
        int sum =  0;
        while (r < n-1){
             sum = sum - arr[l];
             l++;
             r++;
             sum = sum + arr[r];
             maxSum = Math.max(maxSum,sum);
        }
       return maxSum;
    }
    public static void main(String[] args) {
      int []arr = {-1,2,3,3,4,5-1};
        System.out.println(maxSumFourElements(arr,4));
    }
}
