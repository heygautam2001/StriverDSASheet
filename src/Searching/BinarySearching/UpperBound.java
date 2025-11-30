package Searching.BinarySearching;

public class UpperBound {
    /*
    Given a sorted array arr[] and a number target, find the upper bound of the
    target in this given array. The upper bound of a number is defined as the
    smallest index in the sorted array where the element is greater than the given
    number/target.

     */
    public static int upperBound(int[]arr,int target){
        int n = arr.length;
        int lo = 0;
        int hi = n-1;
        int res = arr.length;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;

            // If arr[mid] > target, then arr[mid] can be
            // the upper bound so store mid in result and
            // search in left half, i.e. arr[lo...mid-1]
            if (arr[mid] > target) {
                res = mid;
                hi = mid - 1;
            }

            // If arr[mid] <= target, then upper bound
            // cannot lie in the range [lo...mid], so
            // search in right half, i.e. arr[mid+1...hi]
            else {
                lo = mid + 1;
            }
        }
        return res;

    }
    public static void main(String[] args) {
        int [] arr1 ={2, 3, 7, 10, 11, 11, 25};
        System.out.println(upperBound(arr1,7));
        int []arr2 = {2, 3, 7, 10, 11, 11, 25};
        System.out.println(upperBound(arr2,11));
        int []arr3 = {2, 3, 7, 10, 11, 11, 25};
        System.out.println(upperBound(arr3,100));
    }
}
