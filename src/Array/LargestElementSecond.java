package Array;

import java.util.Scanner;

public class LargestElementSecond {
    public  static  int printSecondLargest(int arr[]){
        int n = arr.length;
        int maxEle = arr[0];
        int maxEleIdx = 0;
        for (int i = 0; i < n; i++) {
            if(arr[i] > maxEle) {
                maxEle = arr[i];
                maxEleIdx = i;
            }
        }
        arr[maxEleIdx] = Integer.MIN_VALUE;

        int secondMaxEle = arr[0];
        for (int i = 0; i < n; i++) {
            if (arr[i] > secondMaxEle){
                secondMaxEle = arr[i];
            }

        }
        return secondMaxEle;
    }


    // Second largest element

    public int secondLargest(int[]arr){
        int n = arr.length;

        int largest = arr[0];
        int secondLargest = -1;

        for (int i = 1; i < n; i++) {
            if (arr[i] > largest){
                secondLargest = largest;
                largest = arr[i];
            } else if (arr[i] < largest && arr[i] > secondLargest) {
                secondLargest = arr[i];
            }
        }
        return secondLargest;
    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array : ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter "+size+" element");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(printSecondLargest(arr));
    }
}
