package Searching.BinarySearching;

public class SearchInRotatedSortedArray {
    public static int search(int []arr, int target){
        int low = 0;
        int high = arr.length -1;

        while (low <= high){
            int mid = low + (high-low)/2;   // avoid overflow

            if (arr[mid] == target){        // found target
                return mid;
            }

            // Identify the sorted half of the array
            if (arr[low] <= arr[mid]){      // Left half is sorted
                // Check if target lies in this left sorted half
                if (arr[low] <= target && target <= arr[mid]){
                    high = mid - 1;         // search left side
                }else{
                    low = mid + 1;          // search right side
                }

            }else{                          // Right half is sorted
                // Check if target lies in this right sorted half
                if (arr[mid] <= target && target <= arr[high]){
                    low = mid + 1;          // search right side
                }else{
                    high = mid - 1;         // search left side
                }
            }
        }
        return -1; // not found
    }

    public static void main(String[] args) {
        int []arr1 = {4, 5, 6, 7, 1, 2, 3};
        System.out.println(search(arr1,5));


    }
}
