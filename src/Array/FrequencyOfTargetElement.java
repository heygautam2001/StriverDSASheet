package Array;

import java.util.Scanner;

public class FrequencyOfTargetElement {
    public static int findFrequency(int arr[] , int target){
        int n = arr.length;
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == target)
                count++;

        }
        return  count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size :");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter "+n+" element");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter element you want to find frequency :");
        int targetFrequency = sc.nextInt();
        System.out.println(findFrequency(arr ,targetFrequency));
    }
}
