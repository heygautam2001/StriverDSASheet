package Recurssion;

import java.util.Arrays;

public class ReverseArray {
    // Recurssion 1
    public static void reverseArray(int[] arr , int left , int right){
        if(left >= right)
            return;
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
        reverseArray(arr,left+1,right-1);
    }

    // Recursion 2
    public static void reverseArray(int []arr, int left){
        int n = arr.length;
        if(left >= n/2)
            return;

        int temp = arr[left];
        arr[left] = arr[n-left-1];
        arr[n-left-1] =temp;
        reverseArray(arr,left+1);

    }
    public static void main(String[] args) {
        int[]arr = {1,2,3,4,5};
        System.out.println(Arrays.toString(arr));
        reverseArray(arr,0, arr.length-1);
        System.out.println(Arrays.toString(arr));
        reverseArray(arr,0);
        System.out.println(Arrays.toString(arr));
    }
}
