package Recurssion;

import java.util.ArrayList;
import java.util.List;

public class Subsequences {
    public static void printSubsequence(int idx , List<Integer> list, int[]arr){
        int n = arr.length;
        if(idx == n){
            System.out.println(list);
            for(var ele : list){
//                System.out.print(ele+" ");
            }
            if (list.isEmpty()){
                System.out.print(list);
            }
            System.out.println();
            return;
        }

        // Take or pick the particular index into the subsequences
        list.add(arr[idx]);
        printSubsequence(idx+1,list,arr);
        list.removeLast();

        // not pick , or not take condition , this element is not added to your subsequence.
        printSubsequence(idx+1,list,arr);

    }

    public static List<List<Integer>> printSubsequence(int idx, int[] arr, List<Integer> list) {
        int n = arr.length;
        List<List<Integer>> anslist = new ArrayList<>();

        // base condition
        if (idx == n) {
            anslist.add(new ArrayList<>(list));  // add a copy
            return anslist;
        }

        // take current element
        list.add(arr[idx]);
        anslist.addAll(printSubsequence(idx + 1, arr, list));
        list.remove(list.size() - 1);  // correct way to remove last element

        // do not take current element
        anslist.addAll(printSubsequence(idx + 1, arr, list));

        return anslist;
    }



    public static void main(String[] args) {
        int []arr = {1,2,3,4};
        List<Integer> list = new ArrayList<>();
        printSubsequence(0,list,arr);

        List<List<Integer>> ansList = printSubsequence(0,arr,list);
        System.out.println(ansList);
    }
}
