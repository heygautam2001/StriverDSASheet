package Searching.BinarySearching;

public class FirstOccurence {
    public static int binarySearchFirstOccurence(int[] arr , int target){
        int st = 0;
        int en = arr.length-1;
        int idx = -1;
        while(st <= en){
            int mid = st + (en-st)/2;

            if(arr[mid] == target){
                idx = mid;
                en = mid-1;
            } else if (arr[mid] < target) {
                st = mid + 1;
            }else{
                en = mid-1;
            }

        }
       return  idx;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,4,4,4,5};
        System.out.println(binarySearchFirstOccurence(arr,4));
    }
}
