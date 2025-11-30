package Array;

import java.util.Scanner;

public class LargestElement {
    public static int printLargestElement(int arr[]){
        int n = arr.length;
        int maxEle = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] > maxEle)
                maxEle = arr[i];
        }
        return maxEle;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size: ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter "+size +" element");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("The largest element in array is : "+printLargestElement(arr));

    }
}
