package Array;

import java.util.Scanner;

public class TakingUserInput {
    public  static  void printArray(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");

        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size : ");
        int size = sc.nextInt();
        int arr[] =  new int[size];
        System.out.println("Enter "+size+" element");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        //Printing the array
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i]+" ");

        }
        System.out.println();
        printArray(arr);


    }
}
