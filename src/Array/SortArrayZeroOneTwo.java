package Array;

import javax.swing.plaf.synth.SynthLookAndFeel;
import java.util.Scanner;

public class SortArrayZeroOneTwo {
    //TC : O(n) , sc : 0(1)
        public static void sortArray(int []arr){
        int n = arr.length;
        int count0 = 0;
        int count1 = 0;
        int count2 = 0;
        int sortedArray[] = new int[n];
        for (int i = 0; i < n; i++) {
            if(arr[i] == 0)count0++;
            else if(arr[i] == 1) count1++;
            else count2++;
        }
        int k = 0;
        while(k < count0){
            arr[k++] = 0;
        }
        while(k< count0+count1){
            arr[k++] = 1;
        }
        while(k< count0+count1+count2){
            arr[k++] = 2;
        }


    }
// tc : O(n) , space - O(n)
    public static int[] sortArrayMethod2(int []arr){
        int n = arr.length;
        int count0 = 0;
        int count1 = 0;
        int count2 = 0;
        int sortedArray[] = new int[n];
        for (int i = 0; i < n; i++) {
            if(arr[i] == 0)count0++;
            else if(arr[i] == 1) count1++;
            else count2++;
        }
        int k = 0;
        while(k < count0){
            sortedArray[k++] = 0;
        }
        while(k< count0+count1){
            sortedArray[k++] = 1;
        }
        while(k< count0+count1+count2){
            sortedArray[k++] = 2;
        }

        return sortedArray;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size : ");
        int n = sc.nextInt();;
        int arr[] = new int[n];
        System.out.println("Enter "+n +" element : ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        sortArray(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }

    }
}

//Gautam kumar
