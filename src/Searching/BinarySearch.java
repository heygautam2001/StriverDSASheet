package Searching;

import java.util.Scanner;

public class BinarySearch {
    public static boolean binarySearch(int[] arr , int target){
        int left = 0;
        int right = arr.length-1;
        while(left <= right){

            int mid = left + (right-left)/2;
            if(target == arr[mid]){
                return true;
            } else if (target < arr[mid]) {
                right = mid - 1;
            }else {
                left = mid +1;
            }

        }
        return false;
    }
    public static int binarySearch1(int arr[] , int target){;

        int n = arr.length;;
        int st = 0;
        int end = n-1;
        while(st<=end){
            int mid = st + (end-st)/2;
            if(arr[mid] == target){
                return  mid;
            } else if (target > arr[mid]) {
                st = mid+1;
            }else{
                end = mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size");
        int n = sc.nextInt();
        int [] arr = new int[n];
        System.out.println("Enter "+n+" element");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.println(binarySearch1(arr,2));

    }
}
