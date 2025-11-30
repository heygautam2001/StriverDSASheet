package Array;

import java.util.HashSet;
import java.util.Scanner;

public class RemoveDuplicateFromArray {
    public static HashSet<Integer> removeDuplicate(int []arr){
        int n = arr.length;
        HashSet <Integer> set = new HashSet<>();
        for (int i = 0; i < n; i++) {
            set.add(arr[i]);

        }


       return set;
    }
    public static int removeDuplicate(int arr[],int n)
    {
       int i = 0;
        for (int j = 1; j < n; j++) {
            if (arr[i] != arr[j]){
              arr[i+1] = arr[j];
              i++;
            }
        }
        return  i+1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size : ");
        int n = sc.nextInt();
        int []arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();

        }

//        HashSet <Integer> set = removeDuplicate(arr);
//        for(var ele : set){
//            System.out.print(ele+" ");
//        }
        System.out.println();
        System.out.println(removeDuplicate(arr,n));
        for(var ele:arr){
            System.out.print(ele+" ");
        }
    }
}
