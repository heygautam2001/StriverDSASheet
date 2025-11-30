package Searching.BinarySearching;

public class FloorAndCeilInArray {
    // floor = largest number in an array less than or equals to x
    // ceil = largest number in an array greater than or equals to x
    public static int floor(int[] arr ,int target){
        int ans = -1;
        int low = 0;
        int high = arr.length-1;
        while(low <= high){
            int mid = low +( high-low )/2;
            if (arr[mid] <= target){
                ans = arr[mid];
                low = mid +1;
            }else{
                high = mid-1;
            }
        }
        return ans;
    }
    public static int findCeil(int[] arr, int n, int x) {
        int low = 0, high = n - 1;
        int ans = -1;

        while (low <= high) {
            int mid = (low + high) / 2;
            // maybe an answer
            if (arr[mid] >= x) {
                ans = arr[mid];
                //look for smaller index on the left
                high = mid - 1;
            } else {
                low = mid + 1; // look on the right
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[]arr1 = {3, 4, 4, 7, 8, 10};
        System.out.println(floor(arr1,5));

    }

}
