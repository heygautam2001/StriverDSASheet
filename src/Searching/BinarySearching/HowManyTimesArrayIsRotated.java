package Searching.BinarySearching;

public class HowManyTimesArrayIsRotated {
    public int findKRotation(int arr[]) {
        // Code here
        int low = 0;
        int high = arr.length-1;
        int ans = Integer.MAX_VALUE;
        int index = -1;
        while(low <= high){
            int mid = (low+high)/2;
            // Search space is already sorted
            // then always arr[low] will be smaller
            // in that search space

            if(arr[low] <= arr[high]){
                if(arr[low] < ans){
                    index = low;
                    ans = arr[low];
                }
                break;
            }
            if(arr[low] <= arr[mid]){
                if(arr[low] < ans){
                    index = low;
                    ans = arr[low];
                }
                low = mid+1;
            }
            else{
                high = mid-1;
                if(arr[mid] < ans){
                    index = mid;
                    ans = arr[mid];
                }
            }
        }
        return index;
    }
    public static void main(String[] args) {

    }
}
