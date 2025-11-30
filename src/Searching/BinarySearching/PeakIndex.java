package Searching.BinarySearching;
//leet-code 852
public class PeakIndex {
    public static int findPeakInMountainArray(int[]arr){
        int lo = 1;
        int hi = arr.length-2;
        while(lo <= hi){
            int mid = (lo+hi)/2;
            if(arr[mid] > arr[mid-1] && arr[mid] > arr[mid+1])
                return mid;
            else if (arr[mid] > arr[mid-1] && arr[mid]<arr[mid+1]) lo = mid+1;
            else hi = mid -1;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,7,6,5,4,3,};
        System.out.println(findPeakInMountainArray(arr));
    }
}
