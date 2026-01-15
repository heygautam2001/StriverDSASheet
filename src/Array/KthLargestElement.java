package Array;

import java.util.Arrays;
import java.util.PriorityQueue;

//Leet-code 215
public class KthLargestElement {
    public static int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);
        return nums[nums.length-k];
    }

    public static int findKthLargestElement(int[] nums, int k) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        for (int num : nums) {
            minHeap.offer(num);
            if (minHeap.size() > k) {
                minHeap.poll();
            }
        }
        return minHeap.peek();
    }


    public static void main(String[] args) {
        int [] arr = {4,5,1,7,9,3,1};
        System.out.println(findKthLargest(arr,4));
    }
}
