package Recurssion;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SubsetSums {
    public static void func(int idx , int sum , ArrayList<Integer> arr, ArrayList<Integer> sumSubset){
        int n = arr.size();
        if(idx == n){
            sumSubset.add(sum);
            return;
        }

        // pick the element
        func(idx+1, sum+arr.get(idx) , arr , sumSubset);

        // Don't pick the element
        func(idx+1, sum , arr , sumSubset);


    }

    public static ArrayList<Integer> subsetSums(ArrayList<Integer> arr){
        ArrayList<Integer> sumSubset = new ArrayList<>();
        func(0,0,arr,sumSubset);
        Collections.sort(sumSubset);
        return sumSubset;
    }

    public static void main(String[] args) {
        ArrayList<Integer>list = new ArrayList<>();
        list.add(1);
        list.add(3);
        list.add(4);

        ArrayList<Integer>ans = subsetSums(list);
        System.out.println(ans);
    }
}
