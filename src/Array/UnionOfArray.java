package Array;

import java.util.*;

public class UnionOfArray {

    public static HashSet<Integer> unionArray(int arr1[] , int[]arr2){
             int  n = arr1.length;;
             int m = arr2.length;
             HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < n; i++) {
            set.add(arr1[i]);
        }
        for (int i = 0; i < m; i++) {
            set.add(arr2[i]);
        }

        return set;

    }
    static ArrayList<Integer> FindUnion(int arr1[], int arr2[]) {
            int n = arr1.length;
            int m = arr2.length;
            int i = 0, j = 0; // pointers

            ArrayList<Integer > Union=new ArrayList<>(); // Uninon vector
            while (i < n && j < m) {
                if (arr1[i] <= arr2[j]) // Case 1 and 2
                {
                    if (Union.size() == 0 || Union.get(Union.size()-1) != arr1[i])
                        Union.add(arr1[i]);
                    i++;
                } else // case 3
                {
                    if (Union.size() == 0 || Union.get(Union.size()-1) != arr2[j])
                        Union.add(arr2[j]);
                    j++;
                }
            }
            while (i < n) // IF any element left in arr1
            {
                if (Union.get(Union.size()-1) != arr1[i])
                    Union.add(arr1[i]);
                i++;
            }
            while (j < m) // If any elements left in arr2
            {
                if (Union.get(Union.size()-1) != arr2[j])
                    Union.add(arr2[j]);
                j++;
            }
            return Union;
        }
        public static void main(String args[]) {
            int n = 10, m = 7;
            int arr1[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
            int arr2[] = {2, 3, 4, 4, 5, 11, 12};
            ArrayList<Integer> Union = FindUnion(arr1, arr2);
            System.out.println("Union of arr1 and arr2 is ");
            for (int val: Union)
                System.out.print(val+" ");
        }
    }
