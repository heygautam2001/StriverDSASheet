package Searching.BinarySearching;

public class LastOccurence {
    public static int binarySearchLastOccurence(int arr[] , int target){
        int st = 0;
        int end = arr.length-1;
        int idx = -1;
        while(st <= end){
            int mid = st + (end-st)/2;
            if(arr[mid] == target){
                idx = mid;
                st = mid+1;
            } else if (arr[mid] < target) {
                st = mid + 1;
            }else{
                end = mid -1;
            }
        }
        return idx;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,4,4,4,5};
        System.out.println(binarySearchLastOccurence(arr,4));
    }
}
