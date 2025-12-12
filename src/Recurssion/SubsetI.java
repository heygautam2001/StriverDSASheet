package Recurssion;

import java.util.ArrayList;
import java.util.List;
// leet-code 78
public class SubsetI {
    public static void main(String[] args) {

    }

    public List<List<Integer>> printSubsequence(int idx, int[] arr, List<Integer> list) {
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

    public List<List<Integer>> subsets(int[] nums) {
        List<Integer> list = new ArrayList<>();
        List<List<Integer>> ansList = printSubsequence(0, nums, list);
        return ansList;

    }
}
