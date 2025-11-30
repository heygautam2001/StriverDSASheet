package Array;

import java.util.Scanner;

public class MaxSortedSubstring {
    public static  int maxSubsting(int[] arr){
        int n = arr.length;
        int maxlen = 0;
        int len = 1;
        for (int i = 0; i < n-1; i++) {
            if (arr[i] < arr[i+1]){
                len++;
                maxlen = Math.max(len , maxlen);
            }else{
                len = 1;
            }
        }
        return maxlen;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.println(maxSubsting(arr));

    }
}
