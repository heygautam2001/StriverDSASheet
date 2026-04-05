package Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class IntersectionOfArray {
//    public static ArrayList<Integer>  findIntersection(int arr1[] , int arr2[]){
//        int n = arr1.length;
//        int m = arr2.length;
//        ArrayList<Integer> list = new ArrayList<>();
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < m; j++) {
//                if (arr1[i] == arr2[j] ) {
//                    list.add(arr1[i]);
//                    break;
//                }
//            }
//
//        }
//        return list;
//    }

    // Intersection of sorted array -> Array must be sorted.
    public static List<Integer> findIntersection(int[]arr,int[]brr){
        int n1 = arr.length;
        int n2 = brr.length;
        int []visited = new int[n2];
        List<Integer>ans = new ArrayList<>();

        for (int i = 0; i < n1; i++) {
            for (int j = 0; j < n2; j++) {
                if(arr[i] == brr[j] && visited[j] == 0){
                    ans.add(arr[i]);
                    visited[j]=1;
                    break;
                }
                if (brr[j] > arr[i])break;
            }
        }
        return ans;
    }

    public static List<Integer> findIntersectionArr(int [] arr , int[]brr){
        int i = 0;
        int j = 0;
        List<Integer>ans = new ArrayList<>();
        while (i < arr.length && j < brr.length ){
            if (arr[i] < brr[j])
                i++;
            else if (brr[j] < arr[i])
                j++;
            else{
                ans.add(arr[i]);
                i++;
                j++;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of first array : ");
        int n = sc.nextInt();
        int []arr1 = new int[n];
        System.out.println("Enter "+n +" element : ");
        for (int i = 0; i < n; i++) {
            arr1[i] = sc.nextInt();
        }

        System.out.println("Enter size of second array : ");
        int m = sc.nextInt();
        int arr2[] = new int[m];
        System.out.println("Enter "+m +" element : ");
        for (int i = 0; i < m; i++) {
            arr2[i] = sc.nextInt();
        }
          List<Integer> list = findIntersection(arr1 , arr2);
        for (int ele : list){
            System.out.print(ele+" ");
        }
    }
}
