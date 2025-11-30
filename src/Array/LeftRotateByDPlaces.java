package Array;

import java.util.ArrayList;
import java.util.Arrays;

public class LeftRotateByDPlaces {
    public static void leftRotateByDPlaces(int[]arr,int d){
        int n = arr.length;
        ArrayList <Integer> list = new ArrayList<>();
        d = d%n;
        for (int i = 0; i < d; i++) {
            list.add(arr[i]);
        }

        for (int i = d; i < n ; i++) {
            arr[i-d] = arr[i];
        }

        for (int i = n-d; i < n; i++) {
            arr[i] = list.get(i-(n-d));
        }
    }

    // Second method
    void reverse(int [] arr, int start, int end){
        while (start <= end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    void RotateEleLeft(int[]arr, int k ){
        int n = arr.length;
        // reverse first n-k elements
        reverse(arr,0,n-k);
        // reverse the last k element
        reverse(arr,n-k,n-1);

        // reverse the whole array
        reverse(arr,0,n-1);
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        System.out.println(Arrays.toString(arr));
        leftRotateByDPlaces(arr,2);
        System.out.println(Arrays.toString(arr));
    }
}
