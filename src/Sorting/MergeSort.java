package Sorting;
import java.util.*;
import java.util.Scanner;

// Divide and conquer algorithm..
public class MergeSort {
public static void mergeSort(int arr[] , int left , int right){
    if (left >= right)
        return;
    int mid = (left+right)/2;
    mergeSort(arr , left , mid);
    mergeSort(arr , mid+1 ,right);
    merge(arr,left,mid,right);
}

    private static void merge(int[] arr, int left, int mid, int right) {
    int n1 = mid-left+1;
    int n2 = right-mid;
    int [] leftArr = new int[n1];
    int [] rightArr = new int[n2];

    int i , j , k;
    // filling the element in left and right array
        for ( i = 0; i <  n1 ; i++) {
            leftArr[i] = arr[left+i];
        }
        for ( j = 0; j <  n2 ; j++) {
            rightArr[j] = arr[mid+1+j];
        }
        i = 0;
        j = 0;
        k = left;

        while(i < n1 && j < n2){
            if(leftArr[i] < rightArr[i])
                arr[k++] = leftArr[i++];
            else
                arr[k++] = rightArr[j++];
        }

        while (i<n1){
            arr[k++] = leftArr[i++];

        }

        while (j<n2){
            arr[k++] = rightArr[j++];

        }
}

    private static void Merge(int[] arr, int low, int mid, int high) {
        ArrayList<Integer> temp = new ArrayList<>(); // temporary array
        int left = low;      // starting index of left half of arr
        int right = mid + 1;   // starting index of right half of arr

        //storing elements in the temporary array in a sorted manner//

        while (left <= mid && right <= high) {
            if (arr[left] <= arr[right]) {
                temp.add(arr[left]);
                left++;
            } else {
                temp.add(arr[right]);
                right++;
            }
        }

        // if elements on the left half are still left //

        while (left <= mid) {
            temp.add(arr[left]);
            left++;
        }

        //  if elements on the right half are still left //
        while (right <= high) {
            temp.add(arr[right]);
            right++;
        }

        // transfering all elements from temporary to arr //
        for (int i = low; i <= high; i++) {
            arr[i] = temp.get(i - low);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter " +n+" element");
        InputOutput.seekInput(arr);
        InputOutput.printArray(arr);
        mergeSort(arr , 0 , n-1);
        InputOutput.printArray(arr);
    }
}
