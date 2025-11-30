package Searching.BinarySearching;

public class SearchMinimumInRotatedSortedArray {
    public static int findMin(int [] arr){
        int ans = Integer.MAX_VALUE;
        int low = 0;
        int high = arr.length-1;
        while (low <= high){
            int mid = (low+high)/2;
            if (arr[low] <= arr[mid]){
                ans = Math.min(ans,arr[low]);
                low = mid+1;
            }
            else{
                high = mid-1;
                ans = Math.min(ans,arr[mid]);
            }
        }
        return ans;
    }
    public static void main(String[] args) {

    }
}
