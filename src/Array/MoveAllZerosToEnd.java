package Array;

import java.util.Arrays;
import java.util.Scanner;

public class MoveAllZerosToEnd {
    public static int[] moveZeroEnd(int[]arr) {
        int n = arr.length;
        int helper[] = new int[n];
        int j = 0;
        int countZero = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == 0)
                countZero++;
        }
        for (int i = 0; i < n; i++) {
            if (arr[i] > 0)
                helper[j++] = arr[i];
        }
        for (int i = j; i <= countZero; i++) {
            helper[j++] = 0;
        }

        return helper;

    }

    // Striver solution...
    public  static void moveZeroToEnd(int []arr){
        int idx = 0;
        for (int i = 0; i < arr.length ; i++) {
            if(arr[i] == 0)
                continue;
            else{
                int temp = arr[i];
                arr[i] = arr[idx];
                arr[idx] = temp;
                idx++;

            }

        }
    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size : ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter "+n +" element : ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

//        int arr2[] = moveZeroEnd(arr);
//        for (int i = 0; i < arr2.length; i++) {
//            System.out.print(arr2[i]+" ");
//        }
        moveZeroToEnd(arr);

        for (int ele : arr){
            System.out.print(ele+" ");
        }



    }
}
