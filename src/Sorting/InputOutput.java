package Sorting;

import java.util.Scanner;

public class InputOutput {

    public static void printArray(int arr[]){
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void seekInput(int arr[]){
        Scanner sc = new Scanner(System.in);
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
    }
}
