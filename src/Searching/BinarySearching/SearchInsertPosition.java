package Searching.BinarySearching;

public class SearchInsertPosition {
    public static int searchInsert(int[] nums, int target) {
        int st = 0;
        int end = nums.length -1;
        while(st <= end){
            int mid = st + (end-st)/2;
            if(target == nums[mid]){
                return mid;
            }else if(target < nums[mid]){
                end = mid-1;

            }else{
                st = mid+1;

            }
        }
        return st;
    }
    public static void main(String[] args) {
      int [] arr1 = {1,3,5,6};
        System.out.println(searchInsert(arr1,5));
        System.out.println(searchInsert(arr1,2));
        System.out.println(searchInsert(arr1,7));
    }
}
