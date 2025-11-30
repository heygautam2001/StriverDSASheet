package Array;

import java.util.ArrayList;
import java.util.Scanner;

public class IntersectionOfArray {
    public static ArrayList<Integer>  findIntersection(int arr1[] , int arr2[]){
        int n = arr1.length;
        int m = arr2.length;
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (arr1[i] == arr2[j] ) {
                    list.add(arr1[i]);
                    break;
                }
            }

        }
        return list;
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
          ArrayList<Integer> list = findIntersection(arr1 , arr2);
        for (int ele : list){
            System.out.print(ele+" ");
        }
    }
}
