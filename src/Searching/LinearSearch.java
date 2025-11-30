package Searching;

import java.util.Scanner;

public class LinearSearch {
    public static boolean linearSearch(int arr[] , int target){
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            if(arr[i] == target)
                return true;
        }
        return false;
    }
    public static int linearSearch( int target , int [] arr){
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            if(arr[i] == target)
                return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of an array :" );
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
        System.out.println("Element in array : "+linearSearch(arr,5));
    }
}
