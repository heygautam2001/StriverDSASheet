package Array;

import java.util.Scanner;

public class SortZeroOne {
    public static void moveOneZero(int arr[]){
        int n = arr.length;
        int i = 0;
        int j = n-1;
        while(i < j){
            if(arr[i] == 1 && arr[j] == 0){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
            if(arr[i] == 0){
                i++;
            }
            if(arr[j] == 1){
                j--;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of the array : ");
        int n = sc.nextInt();
        int [] arr = new int[n];
        System.out.println("Enter "+n+" element ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        moveOneZero(arr);
        for(var ele : arr){
            System.out.print(ele+" ");
        }
     }
}
