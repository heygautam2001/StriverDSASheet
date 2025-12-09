package Recurssion;

import java.util.ArrayList;
import java.util.List;

public class SubsequnceSum {
    private static void printSubsequenceSum(int idx, int sum, int[] arr, List<Integer> list, int k) {
        int n = arr.length;

        // Base condition
        if (idx == n) {
            if (sum == k) {
                for (int ele : list) {
                    System.out.print(ele + " ");
                }
                System.out.println();
            }
            return; // Must return in every case
        }

        // Pick the element
        list.add(arr[idx]);
        printSubsequenceSum(idx + 1, sum + arr[idx], arr, list, k);

        // Not pick
        list.remove(list.size() - 1);
        printSubsequenceSum(idx + 1, sum, arr, list, k);
    }


    public static void main(String[] args) {
        int []arr = {1,2,1};
        int k = 2;
        List<Integer> list = new ArrayList<>();
        printSubsequenceSum(0,0,arr,list , k);
    }


}
