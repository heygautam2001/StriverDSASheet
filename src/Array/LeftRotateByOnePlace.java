package Array;

import java.util.Arrays;

public class LeftRotateByOnePlace {
    public static void leftRotateByOnePlace(int[]arr){
        int n = arr.length;
        int temp = arr[0];
        for (int i = 1; i < n; i++) {
            arr[i-1] = arr[i];
        }
        arr[n-1] = temp;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        System.out.println(Arrays.toString(arr));
        leftRotateByOnePlace(arr);
        System.out.println(Arrays.toString(arr));
    }
}
