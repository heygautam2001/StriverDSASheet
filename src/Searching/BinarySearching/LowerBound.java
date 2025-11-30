package Searching.BinarySearching;

public class LowerBound {
    // The lower bound of a number is defined as the
    // smallest index in the sorted array where the element
    // is greater than or equal to the target.
    public static int lowerBound(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;
        int ans = arr.length;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] >= target) {
                ans = mid;
                high = mid - 1;
            } else if (target > arr[mid]) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }

        }
        return ans;
    }

    public static void main(String[] args) {
        int arr[] = {2, 3, 7, 10, 11, 11, 25};
        int target = 9;
        System.out.println(lowerBound(arr, target));
        int[]arr2 = {2, 3, 7, 10, 11, 11, 25};
        System.out.println(lowerBound(arr2,11));
        int []arr3 = {2, 3, 7, 10, 11, 11, 25};
        System.out.println(lowerBound(arr3,100));
    }
}
