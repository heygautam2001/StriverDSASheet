package Searching.BinarySearching;

public class FloorInSortedArray {
    // find x se just chhota number
    public static int floorInSortedArray(int[]arr ,int x){
        int left = 0;
        int right = arr.length-1;
        int idx = -1;
        while(left <= right){
            int mid = left + (right-left)/2;
            if(arr[mid] > x)right = mid-1;
            else if (arr[mid] < x) left = mid+1;
            else {
                idx = mid;
                left = mid+1;
            }
        }
       return idx;
    }
    public static void main(String[] args) {

    }
}
