package Array;

import java.util.Scanner;

public class FindTargetElement {
    public static int findTargetElement(int arr[] , int target){
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            if(arr[i] == target)
                return i;
        }
        return -1;
    }

    public static boolean isElementExist(int arr[] , int target){
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            if (arr[i] == target)
                return true;

        }
        return false;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of the array : ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter "+size +" element");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the element you want to search : ");
        int target = sc.nextInt();
        System.out.println("The element "+target+" present at index "+findTargetElement(arr , target));
        System.out.println(isElementExist(arr , target));


    }
}

