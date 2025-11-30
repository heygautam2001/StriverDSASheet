package Array;

import java.util.Arrays;
import java.util.Scanner;

public class ArraySum {
    public static int sum(int arr[]){
        int n = arr.length;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
        }
        return sum;
    }

    public  static int arrayProduct(int arr[]){
        int product = 1;

        for (int i = 0; i < arr.length; i++) {
            product *= arr[i];

        }
        return product;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter "+size +" Element" );
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        int sum = sum(arr);
        System.out.println("Sum of array is "+sum);

        System.out.println("Product of array is "+arrayProduct(arr));
    }





}
