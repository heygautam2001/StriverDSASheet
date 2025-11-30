package Array;

import java.util.Scanner;

public class ArraySortedCheck {

    public static  boolean isSorted(int []arr){
        int n = arr.length;
        boolean flag = true;
        for (int i = 0; i < n-1; i++) {
            if(arr[i] > arr[i+1]){
               flag = false;
               return flag;
            }
        }
        return flag;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size : ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter "+n+" element : ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(isSorted(arr));
    }
}
