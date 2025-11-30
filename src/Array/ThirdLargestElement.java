package Array;

import java.util.Arrays;
import java.util.Scanner;

public class ThirdLargestElement {
    public static int printThirdLargestEle(int arr[]){
     int n = arr.length;
        Arrays.sort(arr);
     return arr[n-3];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter "+n +" element");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();

        }
        System.out.println("The third largest element is : "+printThirdLargestEle(arr));
    }
}
