package Searching.BinarySearching;

import java.util.Scanner;

public class RowMaxNumberOfOnes {
    public static int maximumOnes(int[][] arr) {
        int idx = -1;
        int maxCnt = 0;
        for (int i = 0; i < arr.length; i++) {
            int cntRow = 0;
            for (int j = 0; j < arr[i].length; j++) {
                cntRow += arr[i][j];
            }
            if (cntRow > maxCnt) {
                maxCnt = cntRow;
                idx = i;
            }
        }
        return idx;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
    }
}
