package Searching;

import java.util.Scanner;

public class BinarySearchRecursion {
    public static boolean binarySearch(int arr[] , int st , int end , int target){
        if(st > end)
            return false;
        int mid = st + (end-st)/2;
        if(arr[mid] == target){
            return true;
        } else if (target > arr[mid]) {
          return binarySearch(arr , mid+1 , end , target);
        }else{
           return binarySearch(arr,st,mid-1,target);
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter "+n+" element");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(binarySearch(arr,0, arr.length-1, 2));


    }
}
