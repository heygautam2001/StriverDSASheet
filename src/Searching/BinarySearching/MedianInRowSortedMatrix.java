package Searching.BinarySearching;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MedianInRowSortedMatrix {
    public static int findMedian(int[][]arr){
        int n = arr.length;
        int m = arr[0].length;
        int[] array = new int[n*m];
        int k = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                array[k++] = arr[i][j];
            }
        }
        Arrays.sort(array);
        return array[(m*n)/2];
    }



    public static void main(String[] args) {





















    }
}
