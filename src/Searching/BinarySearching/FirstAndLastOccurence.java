package Searching.BinarySearching;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FirstAndLastOccurence {

    public static int[] firstAndLastOccurence(int[]arr , int target){
        int n = arr.length;
        int first = -1;
        int last = -1;
        for (int i = 0; i < n; i++) {
            if(arr[i] == target){
                if(first == -1) first = i;
                last = i;
            }
        }
        int []ans = {first,last};
        return ans;
    }


    // Binary search for first-Occurence
    public static int binarySearchFirstOccurence(int[] arr , int target){
        int st = 0;
        int en = arr.length-1;
        int idx = -1;
        while(st <= en){
            int mid = st + (en-st)/2;

            if(arr[mid] == target){
                idx = mid;
                en = mid-1;
            } else if (arr[mid] < target) {
                st = mid + 1;
            }else{
                en = mid-1;
            }

        }
        return  idx;
    }

    // Last Occurrence of element
    public static int binarySearchLastOccurence(int arr[] , int target){
        int st = 0;
        int end = arr.length-1;
        int idx = -1;
        while(st <= end){
            int mid = st + (end-st)/2;
            if(arr[mid] == target){
                idx = mid;
                st = mid+1;
            } else if (arr[mid] < target) {
                st = mid + 1;
            }else{
                end = mid -1;
            }
        }
        return idx;
    }

    public static ArrayList<Integer> binarySearchFirstLastOccurence(int arr[] , int target){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(binarySearchFirstOccurence(arr,target));
        list.add(binarySearchLastOccurence(arr,target));
        return list;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,4,4,4,5};
        System.out.println(binarySearchFirstLastOccurence(arr,4));
        System.out.println(Arrays.toString(firstAndLastOccurence(arr,4)));
    }
}
